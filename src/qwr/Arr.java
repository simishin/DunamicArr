package qwr;

import java.util.Arrays;

public class Arr {
	private int[] arr;
	private int length;

	public Arr(int[] arr, int length) {
		this.arr = arr;
		this.length = length;
	}

	public Arr(int[] arr) {
		this.arr = arr;
		this.length =arr.length;
	}
	public void push(int vavue){
		int[] arr1 = new int[length+1];
		for (int i = 0; i < length; i++) {
			arr1[i]=arr[i];
		}
		arr1[length]=vavue;
		length++;
		arr=arr1;
	}
	public void printArr(){
		//for (int i = 0; i < length; i++) { System.out.print(arr[i]); }
		System.out.print(Arrays.toString(arr)+"  ");
		System.out.println("");
	}
}
