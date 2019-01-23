package functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;

import utils.CollectionsUtil;

public class StringConsumer
{


  public static void main(String[] args){

    List<String> listOfStrings = CollectionsUtil.listOfStrings(20);
    listOfStrings = listOfStrings.stream().map((s) -> s.toLowerCase()).collect(Collectors.toList());
    listOfStrings.forEach(System.out::println);
  }
}
