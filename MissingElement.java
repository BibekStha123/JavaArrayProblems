package ArrayProblem;

public class MissingElement {

	public static void main(String[] args) {
		
		int ary [] = {1,2,3,5,6};	
		int ms = number(ary, 6);
		System.out.println("The missing number was:" +ms);
	}

	public static int number(int ary [], int n)
	{
		
		int axsum=0;
		int exsum=(n*(n+1)/2);
		for(int i: ary)
		{
			axsum+=i;
		}
		int diff =exsum-axsum;
		return diff;
	}
}
