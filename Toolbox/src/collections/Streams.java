package collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Streams
{

  public static void main(String[] args){
    simpleStream();
  }

  /**
   * A simple method to play with Stream interface
   */
  private static void simpleStream(){
    List<Integer> integers = new ArrayList<>(); 
    integers.add(1);
    integers.add(13);
    integers.add(2315);
    integers.add(4);

    Integer sum = integers.stream().filter(i -> i > 0).mapToInt(i -> i).sum();
    System.out.println(sum);


    List<BigDecimal> bigDecimals = new ArrayList<>(); 
    bigDecimals.add(new BigDecimal("1"));
    bigDecimals.add(new BigDecimal("13"));
    bigDecimals.add(new BigDecimal("2315"));
    bigDecimals.add(new BigDecimal("4"));

    BigDecimal result = bigDecimals.stream().filter(i -> i.compareTo(BigDecimal.ZERO) > 0).map(i -> i.multiply(BigDecimal.valueOf(0.9))).reduce(BigDecimal.ZERO,BigDecimal::add);
    System.out.println(result);
  }
}
