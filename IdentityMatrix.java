package ArrayProblem;

import java.util.Scanner;

public class IdentityMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a =sc.nextInt();
		
		int iden [][] = new int[a][a];
		
		System.out.println("Enter the elements in an array");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				System.out.println("Elements: ["+(i+1)+","+(j+1)+"]");
				iden[i][j]=sc.nextInt();
			}
		}
 		
		System.out.println("The matrix is: ");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				System.out.print(iden[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		//checking for identity matrix
		boolean id = true;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				if(i == j && iden[i][j]!=1)
				{
					id= false;
				}
				else if(i!=j && iden[i][j]!=0)
				{
					id=false;
				}
				else
				{
					id =true;
				}
			}
		}
		
		if(id)
		{
			System.out.println("The matrix is identity");
		}
		else
		{
			System.out.println("The matrix is not identity");
		}
	}

}
