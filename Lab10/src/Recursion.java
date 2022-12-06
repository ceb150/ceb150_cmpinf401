
public class Recursion {

	int sumOfDigits(int x){
		if (x==0){
			return 0;
		}
		else{
			int lastDigit = x % 10;
			int restOfNum = x / 10;
			return lastDigit + sumOfDigits(restOfNum);
		}

	}
	void printArray(int[] arr, int n){
		if (n == arr.length){
			return;
		}
		System.out.println(arr[n] + " ");
		printArray(arr,n-1);
	}

	void printCombos(int[] arr, String out, int startIndex, int k) {
		if (k==0) {
			return;
		}
		else {
			System.out.println(arr);
			printCombos(arr,out,startIndex+1,k);
		}
	}
	
}
