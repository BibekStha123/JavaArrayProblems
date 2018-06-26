package ArrayProblem;

import java.util.Scanner;

public class ArrayBoundryElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of row and column");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ary [][] = new int [a][b];
		System.out.println("Enter the elements in an array");
		for(int i =0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.println("Elements: ["+(i+1)+","+(j+1)+"]");
				ary[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println("The matrix is: ");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(ary[i][j]+" \t");
			}
			System.out.println();
		}
		
		System.out.println("The boundary elements are: ");
		for(int i =0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				
				
				
				if(i==0 || j==0 || i==a-1 || j ==b-1)
				{
					System.out.print(ary[i][j]+" \t");
				}
				
				else
				{
					System.out.print(" \t");
				}
				
			}
			System.out.println();
			
		}
		
	}

}
