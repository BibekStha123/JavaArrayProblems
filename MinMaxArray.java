package ArrayProblem;

import java.util.Scanner;

public class MinMaxArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a =sc.nextInt();
		int ary[] = new int [a];
		int s=0;
		System.out.println("Enter the elements in an array");
		for(int i=0;i<a;i++)
		{
			ary[i]=sc.nextInt();
			//s+=ary[i];
		}
		//System.out.println(s);
		System.out.println("the elements are: ");
		for(int i=0;i<a;i++)
		{
			System.out.println(ary[i]);
		}
		
		
		//for minimum
		int min = ary[0];
		for(int i=1;i<a;i++)
		{
			if(min>ary[i])
			{
				min=ary[i];
			}
		}
		
		System.out.println("The minimum one is: "+min);
		
		//for maximum ,,
		int max = ary[0];
		for(int i=1;i<a;i++)
		{
			if(max<ary[i])
			{
				max=ary[i];
			}
		}
		System.out.println("The maximum is: "+max);
		
		int diff = (max-min);
		System.out.println("the difference is: "+diff);
	}

}
