using Antlr4.Runtime;
using System;

namespace MorseCalculator
{
    class Error : BaseErrorListener , IAntlrErrorListener<int>
    {
        public static int NumberOfErrors;

        //BaseErrorListener implementation
        public override void SyntaxError(IRecognizer recognizer, IToken offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
        {
            NumberOfErrors++;

            Console.WriteLine($"Error line = {line} column = {charPositionInLine} : {msg}");
        }

        //IAntlrErrorListener<int> implementation
        public void SyntaxError(IRecognizer recognizer, int offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
        {
            NumberOfErrors++;

            Console.WriteLine($"Error line = {line} column = {charPositionInLine} : {msg}");
        }
    }
    
}
