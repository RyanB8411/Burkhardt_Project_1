/**
 * UMGC CMSC 330
 * Project 1
 * For this class I added an escape character to include quotation marks
 * Also, I added the Token.Quotation to build my string quotation mark
 * and the parser to pick it up.
 * @author Ryan Burkhardt
 * Date: 17Mar2024
 * Java 21
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

// This class provides the lexical analyzer for project 1

class Lexer {

    private StreamTokenizer tokenizer;


    
    //Added the quotation mark with the escape character to include quotation marks
    private String punctuation = ",;.()\"";


    //Added Token Quotation to the Token list
    private Token[] punctuationTokens = {Token.COMMA, Token.SEMICOLON, Token.PERIOD, Token.LEFT_PAREN, Token.RIGHT_PAREN, Token.QUOTATION };



    
    // Constructor that creates a lexical analyzer object given the source file

    public Lexer(File file) throws FileNotFoundException {
        tokenizer = new StreamTokenizer(new FileReader(file));
        tokenizer.ordinaryChar('.');
        tokenizer.quoteChar('"');
    }

    // Returns the next token in the input stream

    public Token getNextToken() throws LexicalError, IOException {
        int token = tokenizer.nextToken();
        switch (token) {
            case StreamTokenizer.TT_NUMBER:
                return Token.NUMBER;
            case StreamTokenizer.TT_WORD:
                for (Token aToken : Token.values())
                    if (aToken.name().replace("_","").equals(tokenizer.sval.toUpperCase()))
                        return aToken;
                return Token.IDENTIFIER;
            case StreamTokenizer.TT_EOF:
                return Token.EOF;
            default:
                for (int i = 0; i < punctuation.length(); i++)
                    if (token == punctuation.charAt(i))
                        return punctuationTokens[i];
        }
        return Token.EOF;
    }

    // Returns the lexeme associated with the current token

    public String getLexeme() {
        return tokenizer.sval;
    }

    // Returns the numeric value of the current token for numeric tokens

    public int getNumber() {
        return (int) tokenizer.nval;
    }

    // Returns the current line of the input file

    public int getLineNo() {
        return tokenizer.lineno();
    }
}
