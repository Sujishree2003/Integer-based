import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int reverse=0;
	    while(n!=0){   // run until n becomes 0
	        int remainder=n%10; // used to find the last digit
	        reverse=reverse*10+remainder;  
	        n/=10;  // used to remove the last digit
	    }
		System.out.println(reverse);
	}
}










sample input = 25794
sample output = 49752
