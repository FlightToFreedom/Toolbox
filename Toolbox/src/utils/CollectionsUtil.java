package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CollectionsUtil
{
  private static final String ALPHABET="ABCDEFGHJILMNOPQRSTUVWYZabcdefghijlmnopqrstuwyz1234567890";

  public static List<Double> listOfTenDoubles(){
    List<Double> list = new ArrayList<Double>();
    for(int i=1; i<=10; i++){
      list.add(ThreadLocalRandom.current().nextDouble(1, 99 + 1));
    }
    return list;
  }

  public static List<Double> listOfTenSmallDoubles(){
    List<Double> list = new ArrayList<>();
    for(int i=1; i<=10; i++){
      list.add(ThreadLocalRandom.current().nextDouble(1, 10 + 1));
    }
    return list;
  }

  /**
   * Generate a list containing 'n' strings of a random size (max 30), of size 
   * @param amountOfStrings
   * @return
   */
  public static List<String> listOfStrings(int n){
    Random random = new Random();
    List<String> words = new ArrayList<>();
    for(int i=0; i <= n; i++){
      StringBuilder sb = new StringBuilder();
      for(int z = 0; z <= random.nextInt(30); z++){
        char c = ALPHABET.charAt(random.nextInt(ALPHABET.length()));
        sb.append(c);
      }
      words.add(sb.toString());
    }
    return words;
  }
}
