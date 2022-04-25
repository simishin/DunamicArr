package qwr;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[]{1,2,3,4,5,6};
        Arr arr1 = new Arr(arr);
        arr1.printArr();
        arr1.push(9);
        arr1.printArr();
    }
}
