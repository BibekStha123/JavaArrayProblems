package ArrayProblem;
import java.util.Scanner;

public class Multidimension {

	public static void main(String[] args) {
		 
		int size;
        
        Scanner sc=new Scanner(System.in);
         
        //Read number of rows and cols
        System.out.print("Input the size: ");
        size=sc.nextInt();
       
         
        //declare two dimensional array (matrices)
        int a[][]=new int[size][size];    //for matrix 1
        int b[][]=new int[size][size];    //for matrix 2
        int c[][]=new int[size][size];    //for matrix 3
        int d[][]=new int[size][size];
         
        //Read elements of Matrix a
        System.out.println("Enter elements of matrix a:");
        for(int i=0; i<size; i++)
        {
            for(int j=0; j<size; j++)
            {
                System.out.print("Element [" + (i+1) + "," + (j+1) + "] ? ");
                a[i][j]=sc.nextInt();
            }
        }
        //Read elements of Matrix b
        System.out.println("Enter elements of matrix b:");
        for(int i=0; i<size; i++)
        {
            for(int j=0; j<size; j++)
            {
                System.out.print("Element [" + (i+1) + "," + (j+1) + "] ? ");
                b[i][j]=sc.nextInt();
            }
        }
         
         
        //print matrix a
        System.out.println("Matrix a:");
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }
         
        //print matrix b
        System.out.println("Matrix b:");
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(b[i][j] + "\t");
            }
            System.out.print("\n"); 
        }
         
        //adding matrices
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
         
        //print matrix b
        System.out.println(":: Final Matrix:");
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(c[i][j] + "\t");
            }
            System.out.print("\n"); 
        }
        
        //multiplying matrix
        //if size of matrix is 2*3 and 3*2, k will count upto 3.
        for(int i=0;i<size;i++)
        {
        	for(int j=0;j<size;j++)
        	{
        		for(int k=0;k<size;k++)
        		{
        			d[i][j]=d[i][j]+a[i][k]*b[k][i]; //only k will change while miltiplying
        			
        		}
        	}
        }
        
        System.out.println("the multiplication of matrix is: ");
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(d[i][j] + "\t");
            }
            System.out.print("\n"); 
        }
	}

}
