package ArrayProblem;

import java.util.Scanner;

public class PrimeMatrix {

	public static void main(String[] args) {
		
		
		System.out.println(prime(2));
		
		
		System.out.println("Enter the size of row and col");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int [][]  mat= new int [r][c];
		
		
		
		
		
		int k=2;
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;)
			{
				if(prime(k))
				{
					mat[i][j]=k;
					k++;
					j++;
				//System.out.println(k);
				}
				else
				{
					k++;
								
				}
			}
		}	
			
		for(int i=0;i<r;i++)
		{
			for(int j =0;j<c;j++)
			{
				System.out.print(mat[i][j]+" \t");
		}
			System.out.println();
			
		}
		
		
		}
		
	
	
	public static boolean prime(int a)
	
	{
		boolean p = true;
		
		for(int i =2;i<=a/2;i++)
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
