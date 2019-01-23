package functionalprogramming;

import java.util.List;

import utils.CollectionsUtil;

public class FunctionalBoolean
{

  public static void main(String... args){
    Integer one = 1;
    Integer two = 2;
    List<Double> listOfTenDoubles = CollectionsUtil.listOfTenDoubles();
    listOfTenDoubles.stream().filter((x) -> x > 10).forEach(System.out::println);
  }
}
