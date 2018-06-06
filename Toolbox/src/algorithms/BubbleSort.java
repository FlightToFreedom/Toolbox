package algorithms;

import org.apache.commons.lang3.StringUtils;

public class BubbleSort
{

  /**
   * Bubble sort, the outer while loop looks scary but it actually works quite well. 
   * @param args
   */
  public static void main(String[] args){

    Integer[] arr = {21,12,36,65,33,11,9,3};
    int arrlength = arr.length;
    outer:while(true){
      for(int leftPosition=0; leftPosition < arrlength; leftPosition++){
        int next = (leftPosition+1);
        if(next < arrlength){
          int left = arr[leftPosition];
          int right = arr[next];
          if(left>right){
            arr[leftPosition]=right;
            arr[next]=left;
            continue outer;
          }
        }
      }
      break outer;
    }
    String result = StringUtils.join(arr, ",");
    System.out.println(result);
  }
}
