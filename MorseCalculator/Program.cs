using Antlr4.Runtime;
using System;
using System.IO;
using System.Text;

namespace MorseCalculator
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Input Mores Equation =\t");
            string inputString = Console.ReadLine();

            var inputStream = new AntlrInputStream(inputString);
            var lexer = new MorseCalculatorLexer(inputStream);

            #region Lexer Error
            lexer.RemoveErrorListeners();
            lexer.AddErrorListener(new Error());
            #endregion

            var tokens = new CommonTokenStream(lexer);
            var parser = new MorseCalculatorParser(tokens);

            #region parser Error
            parser.RemoveErrorListeners();
            parser.AddErrorListener(new Error());
            #endregion

            var tree = parser.compileunit();

            var visitor = new MorseCalculatorVisitor();

            if (parser.NumberOfSyntaxErrors == 0)
            {
                var result = visitor.Visit(tree);
                PrintNumberAsMorseCode(result);
            }
        
        }
    

        static void PrintNumberAsMorseCode(string num)
        {
            StringBuilder NumberAsMorseCode = new StringBuilder();

            foreach (char digit in num) switch (digit)
                {
                    case '0': NumberAsMorseCode.Append("-----"); break;
                    case '1': NumberAsMorseCode.Append(".----"); break;
                    case '2': NumberAsMorseCode.Append("..---"); break;
                    case '3': NumberAsMorseCode.Append("...--"); break;
                    case '4': NumberAsMorseCode.Append("....-"); break;
                    case '5': NumberAsMorseCode.Append("....."); break;
                    case '6': NumberAsMorseCode.Append("-...."); break;
                    case '7': NumberAsMorseCode.Append("--..."); break;
                    case '8': NumberAsMorseCode.Append("---.."); break;
                    case '9': NumberAsMorseCode.Append("----."); break;
                    default: NumberAsMorseCode.Append("-....-"); break; // if negative number 
                }

            Console.Write("\t=>\t"+NumberAsMorseCode);
        }
    }
}
