public class Sample {
   
   public static void main(String[] args) {

      String exp; 
      String postfix, prefix;

      exp = "a+b*(c^d-e)^(f+g*h)-i";
      System.out.println("infix exp. : " + exp);
      
      postfix = Convert.infixToPostfixString(exp);
      System.out.println("postfix exp. : " + postfix);
      System.out.println();
      
      exp = "x+y*z/w+u";
      System.out.println("infix exp. : " + exp);
      
      prefix = Convert.infixToPrefixString(exp);
      System.out.println("prefix exp. : " + prefix);
      System.out.println();

      exp = "(A-B/C)*(D/E-F)";
      System.out.println("infix exp. : " + exp);
      
      postfix = Convert.infixToPostfixString(exp);
      System.out.println("postfix exp. : " + postfix);

      prefix = Convert.infixToPrefixString(exp);
      System.out.println("prefix exp. : " + prefix);

   }
}
