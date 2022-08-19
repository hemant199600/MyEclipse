/*9. Given a list of non negative integers, arrange them in such a manner that they form the largest number possible.
The result is going to be very large, hence return the result in the form of a string.
Input: 
N = 5
Arr[] = {3, 30, 34, 5, 9}
Output: 9534330
Explanation: Given numbers are {3, 30, 34,
5, 9}, the arrangement 9534330 gives the
largest value.

ij=i+j;
ji=j+i;
compare ji and ij
if big swap
*/
package mixedAssignment9Aug2022;

import java.util.Arrays;

public class Q9_Array_Max_Possible_No_Array {
	int []arr = {3, 30, 34, 5, 9};
	String ij="",ji="";
	 String str[]=new String[arr.length];
	 public Q9_Array_Max_Possible_No_Array()
	 {
	    for (int i = 0; i < arr.length; i++) {
	        str[i] = String.valueOf(arr[i]);
	    }
	 }
	 public void form() {
		 for(int i=0;i<str.length;i++)
		 {
			 for(int j=i+1;j<str.length;j++)
			 {
				 ij=str[i]+str[j];
				 ji=str[j]+str[i];
				 if(Integer.parseInt(ji)>Integer.parseInt(ij))
				 {
					 String temp=str[j];
					 str[j]=str[i];
					 str[i]=temp;
				 }//upto swapping
			 }
		 }
		 System.out.print("Biggest No from given array: ");
		 for(int i=0;i<str.length;i++)
		 {
			 System.out.print(str[i]);
		 }
	 }
	 
	public void disp()
	{
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Q9_Array_Max_Possible_No_Array obj=new Q9_Array_Max_Possible_No_Array();
		System.out.println("Given Array");
		obj.disp();
		System.out.println("After finding");
		obj.form();

	}

}
