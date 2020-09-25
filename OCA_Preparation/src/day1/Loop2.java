package day1;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(5);
		String s= "";
		//String s1= " ";
		
		if(sb.equals(s))
		{
			System.out.println("Match 1");
			
		}
		else if(sb.toString().equals(s.toString()))
		{
			System.out.println("Match 2");
		}
		else
		{
			System.out.println("No Match");
		}

	}

}
