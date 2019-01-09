package generics;

public class Stack<E>
{

  private  E[] container;
  private  int totalElements = 0;

  public Stack(){
    this.container = (E[]) new Object[0];
  }

  public void push(E element){
    totalElements++;
    container= newArray(element, container);
  }

  public E pop(){
    E obj = container[(container.length-1)];
    container=reduceArrayAfterPop();
    return obj;
  }

  /**
   * Reduces the array, it actually creates a new array with the exact same items as the current status of 'container' except the last one.
   * @return
   */
  private E[] reduceArrayAfterPop()
  {
    E[] newArray = (E[])new Object[(container.length-1)];
    for(int i=0; i<container.length-1;i++){
      newArray[i]=container[i];
    }
    return newArray;
  }

  /**
   * Pushes a new element into a new array and adds all the elements from the old array into the new one
   * @param newElement
   * @param preViousArray
   * @return
   */
  private E[] newArray(E newElement, E[] previousArray){
    E[] newArray = (E[]) new Object[(previousArray.length+1)];
    newArray[0]=newElement; 
    for(int i=0; i<newArray.length; i++){
      if(i==0)
        continue;
      newArray[i]=previousArray[i-1];
    }
    return newArray;
  }

  /**
   * Returns the amount of elements in the stack, not the actual size of the array. 
   * @return
   */
  public int size(){
    return totalElements;
  }
}
