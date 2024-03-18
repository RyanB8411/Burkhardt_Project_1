/**
 * UMGC CMSC 330
 * Project 1
 * Token Class added appropriate labels to be parsed from the parser class. Kept them
 * seperate from provided code.
 * @author Ryan Burkhardt
 * Date: 17Mar2024
 * Java 21
*/

// Enumerated type that defines the list of tokens

enum Token {AT, COLOR, END,	HEIGHT, RECTANGLE, RIGHT_TRIANGLE, SCENE, WIDTH, COMMA, SEMICOLON, PERIOD, LEFT_PAREN,
    RIGHT_PAREN, IDENTIFIER, NUMBER, EOF,

//Added Tokens below to be parsed in the parser class
TEXT, QUOTATION,
PARALLELOGRAM, OFFSET, SPACE,
ISOSCELES_TRIANGLE,
REGULAR_POLYGON, RADIUS, SIDES
}