import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    int sum=0;
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	        sum+=arr[i];
	    }
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
	}
}



5
1 3 5 7 0
[1,3,5,7,0]
16
