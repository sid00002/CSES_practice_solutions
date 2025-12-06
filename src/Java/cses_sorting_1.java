import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		Set<Long> st = new HashSet<>();
		for(int i = 0; i<n; i++){
		    long x = sc.nextLong();
		    st.add(x);
		}
		System.out.println(st.size());

	}
}
