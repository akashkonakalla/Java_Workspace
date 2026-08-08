package com.dsa;

public class TargetSum {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5, 6, 6, 7 };
		int left = 0;
		int target=12;
		int right = arr.length - 1;
		int sum=0;
		boolean found=false;
		while (left < right) {
		sum=arr[left]+arr[right];
		if(sum==target)
		{
			 found = true;
			 break;
		}
		else if(sum < target) {
			left++;
		}
		else
			right--;
		
		}
		if(found==true)
			System.out.println("The sum of "+arr[left]+" + "+ arr[right] + " = "+sum );
		else
			System.out.println("element not found");
	}
}
