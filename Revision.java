package ArrayProblem;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Revision {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a =sc.nextInt();
		
	    int [][] ary = new int[a][a];
	    
	    
	    
	    int n = 2;
	    for(int i=0;i<a;i++)
	    {
	    	for(int j = 0;j<a;)
	    	{
	    		if(prime(n))
	    		{
	    		ary[i][j]=n;
	    		n++;
	    		j++;
	    		}
	    		else
	    		{
	    			n++;
	    		}
	    	}
	    	
	    }
	    
	    System.out.println("The matrix with prime number is: ");
	    for(int i=0;i<a;i++)
	    {
	    	for(int j=0;j<a;j++)
	    	{
	    		System.out.print(ary[i][j]+" \t");
	    	}
	    	System.out.println();
	    }
	    		
	}
	
	public static boolean prime(int a)
	{
		boolean p =true;
	for(int i=2;i<=a/2;i++)
	{
		if(a%i==0)
		{
			p=false;
			break;
		}
	}
	return p;
	
	}
}
