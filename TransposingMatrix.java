package ArrayProblem;

import java.util.Scanner;

public class TransposingMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of row");
		int r =sc.nextInt();
		System.out.println("Enter the size of column");
		int c =sc.nextInt();
		
		int [][] mat = new int [r][c];
		System.out.println("Enter the elements in an matrix");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("["+(i+1)+", "+(j+1)+"]");
				mat[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The matrix is: ");
		for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.print("\n"); 
        }
		
		
		System.out.println("The transpose matrix is: ");
		for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                System.out.print(mat[j][i] + "\t");
            }
            System.out.print("\n"); 
        }
         
	}

}
