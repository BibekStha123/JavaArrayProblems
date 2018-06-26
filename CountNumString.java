package ArrayProblem;

public class CountNumString {

	public static void main(String[] args) {
		
		String[] st = {"tree","herbs","23","44","12","apple","grapes"};
		int n=0;
		int s=0;
		System.out.println("The elements in array are: ");
		for(String a: st)
		{
			System.out.println(a);
		}
		
		for(int i=0;i<st.length;i++)
		{
			try
			{
			int j = Integer.parseInt(st[i]);
			n++;
			}
			catch(NumberFormatException e)
			{
				s++;
			}
		}
		System.out.println("Number: "+n);
		System.out.println("String: "+s);
	}
}
