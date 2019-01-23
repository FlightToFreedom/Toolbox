package streams;

import java.util.List;
import java.util.stream.Collectors;

import utils.CollectionsUtil;

public class StreamsTestOne
{

  public static void main(String[] args){
    StreamsTestOne test = new StreamsTestOne();
    test.testFunctionReference();
    System.out.println("-----Calling another function------");
    test.sumNumbersUsingReduce();
  }



  /**
   * Prints the content of a list using function reference and new "forEach()" method
   */
  public void testFunctionReference(){
    List<Double> listOfTenDoubles = CollectionsUtil.listOfTenDoubles();
    listOfTenDoubles.forEach(StreamsTestOne::print);
  }

  /**
   * Syums numbers in a list using a reduce function
   */
  public void sumNumbersUsingReduce(){
    List<Double> listOfTenDoubles = CollectionsUtil.listOfTenSmallDoubles();
    //Alter the value of each double by adding 
    List<Integer> listOfInts = listOfTenDoubles.stream().map(number -> number.intValue()).collect(Collectors.toList());
    //prints all the altered numbers
    listOfInts.forEach(System.out::println);
    System.out.println("Result is: "+listOfInts.stream().reduce((x,y) -> (x+y)).get());
  }

  public static void print(Object o){
    if(o instanceof Double)
      System.out.println(o);
  }
}
