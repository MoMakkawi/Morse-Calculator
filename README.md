# Morse-Calculator By [Mohamad Farag F. Makkawi](https://github.com/Makkawi011)

## This project falls under DSL (Domain Specific Language) .
### the **input** is an equation in which simple arithmetic operations such as addition, subtraction, multiplication, division, written in Morse code .
### the **output** is the output of this equation, but with Morse code, of course the Syntax and Semantic errors of the inputs will be explored .

> Arithmetic operationsin morse code  : 
>> plus =  .-.-.                                                                                                                                                                       >> multiply =  -..-
>> minus =  -....-
>> divide =  -..-.
          
> Numbers in morse code  :       
>> 0 = -----
>> 1 = .----
>> 2 = ..---
>> 3 = ...--
>> 4 = ....-
>> 5 = .....
>> 6 = -....
>> 7 = --...
>> 8 = ---..
>> 9 = ----.
 
For example, if you wanted to calculate 1 + 9 using this program, you would write:      **.---- .-.-. ----.**

The result, which is of course 10, will look like this:    **.---------**

And suppose you made a mistake by entering the equation by entering 9 incorrectly like this :     **.---- .-.-. ----**
The result :
- Error line = 1 column = 12 : token recognition error at: '----'
- Error line = 1 column = 16 : mismatched input '<EOF>' expecting {'-----', '.----', '..---', '...--', '....-', '.....', '-....', '--...', '---..', '----.'}
