package algorithms;

public final class ArraySwapper{



	//Swaps an array

	public static <T> T[] swap(T[] array){

		int size=(array.length-1);

		//determine the half 

		int half=size/2;



		T tmp;

		int i=size;

		while(i>half){

			tmp=array[i];

			//swap

			array[i]=array[size-i];

			array[size-i]=tmp;

			i--;

		}

		return array;

	}

	//1 | 2 | 3 | 4 | 5 | 6

	public static void main(String[] args){

		String[] array=swap(new String[]{"a","f","p","u","y","z"});

		for(String element:array){

			System.out.println(element);

		}

	}

}