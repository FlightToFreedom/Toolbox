package functionalprogramming;

import java.util.function.Function;

public class ReturnableFunctions
{

  /**
   * Two ways of using the standard Function interface, in 'alteringFunctions' method we create the function's logic in the method, 
   * we then create an object of type Function.
   * In the second approach: 'functionConsumption' the function is expected as parameter.   
   * @param args
   */
  public static void main(String[] args){
    ReturnableFunctions obj = new ReturnableFunctions();
    String test = "CIAO";
    String result = obj.functionConsumption(test, (s) -> s.toLowerCase());

    Function<String,String> function = obj.alteringFunctions();
    //XXX here we pass the argument to the function, so 'test' in this method call is basically the 'r' variable we see in 'alteringFunctions' 
    String result2 = function.apply(test);
    System.out.println(result);
    System.out.println(result2);
  }

  /**
   * A function, the type parameters for the implementation of 'apply' and the return type, are Strings.
   * @return A function 
   */
  public Function<String,String> alteringFunctions(){
    return r -> {
      if(r == null)
        return null;
      else
        return r.toLowerCase()+" second version";
    };
  }

  /**
   * Consumes the function
   * @param function
   */
  public String functionConsumption(String string, Function<String,String> function){
    return function.apply(string);
  }
}
