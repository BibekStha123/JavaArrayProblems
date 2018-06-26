package ArrayProblem;

import java.util.Scanner;

public class SparseMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a = sc.nextInt();
		int sp [][] = new int [a][a];

		sprs(sp,a);
	}
	
	public static void sprs(int [][]ary,int a)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the elements in an array");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				System.out.println("["+(i+1)+", "+(j+1)+"]");
				ary[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The matrix is: ");
		
		int c=0;
		
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				System.out.print(ary[i][j]+" \t");
				if(ary[i][j]==0)
				{
					c++;
				}
				
			}
			System.out.println();
		}
		
		if(c>((a*a)/2))
		{
			System.out.println("The matrix is sparse");
		}
		else
		{
			System.out.println("The matrix is not asparse");
		}
		
	}

}
