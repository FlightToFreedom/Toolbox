package math;

public class Simplepercentage
{

  public static void main(String[] args){
    simplePercentage();
    calcGivenPercentage(300,55);
  }

  /**
   * Calculate the 10 procent of a number
   */
  private static void simplePercentage(){
    int i = 10;
    double perc = 0.1;
    System.out.println(i * perc);
  }

  /**
   * Calculates the given percentage(percentage) of a number(dividend)
   * @param percentage
   */
  private static void calcGivenPercentage(double dividend, int percentage){
    System.out.println((percentage/dividend)*100);
  }
}
