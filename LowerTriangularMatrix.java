package ArrayProblem;

import java.util.Scanner;

public class LowerTriangularMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of matrix");
		int m= sc.nextInt();
		
		int mat[][]=new int[m][m];
    	for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.println("Element: ["+(i+1)+","+(j+1)+"]");
				mat[i][j]=sc.nextInt();
				}
		}
    	
    	for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(mat[i][j]+" \t");
				
				
				}
			System.out.println();
		}
    	
    	
    	//testing  the lower triangular matrix,,,,
    	boolean tri = true;                     //boolean tri =false;
    	for(int i=0;i<m;i++)                    //for(int i=1;i<m;i++) 
    	{                                       //{
    		for(int j=i+1;j<m;j++)              //for(int j=0;j<i;j++)
                                                //{   
    	{                                       //if(mat[i][j]==0)
    			if(mat[i][j]!=0)                //{
    			{                               //tri=true;
    				tri=false;                  //}}} 
    				break;
    				
    			}
    	}
    } 	
    	if(tri)
			System.out.println("The matrix is Lower Triangular");
		else
			
			System.out.println("The matrix is not Lower Triangular");
    	
    	//for upper triangular
//    	for(int i=1;i<m;i++)
//    	{
//    		for(int j=0;j<i;j++)
//    		{
//    			if(mat[i][j]!=0)
//    			{
//    				tri=false;
//    				break;
//    			}
//    		}
//    	}
}

}
