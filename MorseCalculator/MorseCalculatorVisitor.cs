using Antlr4.Runtime.Misc;
using System.Linq;
using System.Text;
using static MorseCalculator.MorseCalculatorParser;

namespace MorseCalculator
{
    public class MorseCalculatorVisitor : MorseCalculatorBaseVisitor<string>
    {
        public override string VisitCompileunit([NotNull] MorseCalculatorParser.CompileunitContext context)
        {
            return Visit(context.equation());
        }

        public override string VisitConstant([NotNull] MorseCalculatorParser.ConstantContext context)
        {
            var morseNumber = context.Number;

            //if morseNumber = "...... ....." => ConvertToInt function will return "55"
            return ConvertToInt(morseNumber).ToString();
        }

        public override string VisitOperation([NotNull] MorseCalculatorParser.OperationContext context)
        {
            var LeftMorseNumber = Visit(context.Left);
            //here antlr will call VisitConstant so if context.left = "......" => LeftMorseNumber = "5"
            int left = int.Parse(LeftMorseNumber);
            //here we convert LeftMorseNumber = "5" => left = 5 

            var RightMorseNumber = Visit(context.Right);
            int right = int.Parse(RightMorseNumber);

            return context.ArithmeticOperations.Type switch
            {
                MorseCalculatorLexer.PLUS => $"{left + right}",
                MorseCalculatorLexer.MINUS => $"{left - right}",
                MorseCalculatorLexer.MULTIPLY => $"{left * right}",
                _ => (right != 0) ? $"{left / right}" : "You Cannot Divide On Zero ",// in case MorseCalculatorLexer.DIVIDE 
            };
        }

        private static int ConvertToInt(NumberContext MorseNumber)
        {
            StringBuilder numberAsString = new StringBuilder();
            MorseNumber
                .digit() // Morse Digits of MorseNumber like array
                .ToList() // Morse Digits of MorseNumber like List
                .ForEach(d => numberAsString.Append(ConvertToIntAsChar(d.GetText())));

            return int.Parse(numberAsString.ToString());
        }
        private static char ConvertToIntAsChar(string digit) => digit switch
        {
            ".----" => '1',
            "..---" => '2',
            "...--" => '3',
            "....-" => '4',
            "....." => '5',
            "-...." => '6',
            "--..." => '7',
            "---.." => '8',
            "----." => '9',
            _ => '0',//in case "-----":
        };
    }
}
