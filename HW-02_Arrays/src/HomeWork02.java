import java.util.Arrays;

public class HomeWork02 {
	
public static int[] removeNumber(int[] array, int index) {
	int [] res = new int[array.length - 1];
	System.arraycopy(array, 0, res, 0, index);
	System.arraycopy(array, index + 1, res, index, array.length - (index + 1));
	return res;
}

public static int[] insertNumberSorted(int[] arraySorted, int number) {
	
	int index = 0;
	int numPosition = Arrays.binarySearch(arraySorted, number);
	
	if(numPosition < 0) {	
		index = - (numPosition +1);
	} else 
		index = numPosition;
	
	
	int [] res = new int[arraySorted.length + 1];
	System.arraycopy(arraySorted, 0, res, 0, index);
	res[index] = number;
	System.arraycopy(arraySorted, index, res, index + 1, arraySorted.length - index);
	return res;

}
}
