/* Questions 3-6 ask to find out what happens when certain keywords or 
statements are changes or misspelled in the code.

Q3 Describe what happens if, in HelloWorld.java, you omit
- main -> raises syntax error on token void
- String -> cannot parse the strings in the function because the String class won't be present
- HelloWorld -> raises expected identifier error (after token class)
- System.out -> raises syntax error 
- println -> expects a constructor call 

Q4 Describe what happens if, in HelloWorld.java, you omit
- the ;
- the first "
- the second "
- the first {
- the second {
- the first }
- the second }

In all of these cases it raises a syntax error due to 
expecting an EOS token or unclosed string literal.

Q5 Describe what happens if, in HelloWorld.java, you misspell 
(by, say, omitting the second letter)
- main -> creates a class but doesn't run because there is no main anymore
- String -> same as Q3
- HelloWorld -> public type error
- System.out -> same as Q3
- println -> raises undefined method error

Q6 I typed in the following program. It compiles fine, but when I execute it, 
I get the error java.lang.NoSuchMethodError: main. What am I doing wrong?*/

public class Hello {
   public static void main() {
      System.out.println("Doesn't execute");   
   }
}

// String[] args is not included therefore the function is not fully defined and cannot execute.