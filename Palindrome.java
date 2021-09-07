package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
				int no=454;
				int tempvar =no;//creating copy of no
				int sum =0;
				while(no>0)
				{
		//reversing number
				sum=sum*10;
				sum=sum+(no % 10);
				no=no/10;
		}
		if(tempvar ==sum)
			System.out.println("palindrome of the given number is:"+tempvar );
		
	
	}

}
