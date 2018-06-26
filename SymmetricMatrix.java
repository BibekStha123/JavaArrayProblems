package ArrayProblem;

import java.util.Scanner;

public class SymmetricMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a =sc.nextInt();
		
		int ary[][] = new int [a][a];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				System.out.println("Elements: ["+(i+1)+","+(j+1)+"]");
				ary[i][j] =sc.nextInt();
			}
		}
		
		System.out.println("The matrix is: ");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				System.out.print(ary[i][j]+" \t");
			}
			System.out.println();
		}
		
		boolean sym = true;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				if(ary[i][j]!=ary[j][i])
				{
					sym = false;
				}
			}
		}
		
		if(sym)
		{
			System.out.println("symmetric");
		}
		else
		{
			System.out.println("not symmetric");
		}
		
		//to calculate the sum of diagonals,,,
		int rd=0,ld=0;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				if(i==j)//for left diagonal
				{
					ld+=ary[i][j];
				}
				//for right diagonal
				if((i+j)==(a-1))
				{
					rd+=ary[i][j];
				}
			}
		}
		
		System.out.println("The sum of left diagonal is: "+ld);
		System.out.println("The sum of right diagonal is: "+rd);
	}

}
