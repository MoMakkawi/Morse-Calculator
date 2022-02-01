grammar MorseCalculator;

/* 
parser grammar MorseCalculatorParser;
*/
compileunit : equation EOF;

equation:arithoperation+;

arithoperation:
    Left= arithoperation ArithmeticOperations=('.-.-.'|'-..-'|'-....-'|'-..-.') Right = arithoperation #Operation
    |Number = number #Constant
    ;

number : digit+;
digit : ZERO|ONE|TWO|THREE|FOUR|FIVE|SIX|SEVEN|EIGHT|NINE;

/*
lexer grammar MorseCalculatorLexer;
 */

ZERO: '-----';
ONE: '.----';
TWO: '..---';
THREE: '...--';
FOUR: '....-';
FIVE : '.....';
SIX: '-....';
SEVEN: '--...';
EIGHT: '---..';
NINE : '----.';

PLUS: '.-.-.';
MULTIPLY: '-..-';
MINUS: '-....-';
DIVIDE: '-..-.';

WS : [ \t\r\n] -> channel(HIDDEN);