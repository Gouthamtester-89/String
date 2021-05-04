package org.string;

public class StringConsanants {
	
		public static void main(String[] args) {
		int arr[] = {20, 32, 43, 54, 66};
		int n = arr.length;
		for (int i=0; i<n-1; i++)
		{
		int curr = arr[i];
		arr[i] = curr / 2;
		System.out.println(arr[i]);
		}
		}
		}


