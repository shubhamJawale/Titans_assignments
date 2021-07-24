//count.java
import java.io.*;
import java.util.*;
class count
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);	
	int count =0;
	String str = sc.next();
	char arr[]= str.toCharArray();
	Stack<Character> carr = new Stack<Character>();
	int length = str.length();
		for (int i=0;i<length;i++)
		{
			if(carr.search(arr[i])==-1)
					{
						carr.push(arr[i]);
					}
		}

		while(!(carr.empty()))
		{
			char key = carr.pop();
			for (int i=0;i<length;i++)
			 {
			 	if(key==arr[i])
			 	{
			 		count+=1;
			 	}
		     } 
		     System.out.println(key+ " : " +count);	
		     count = 0;
		}




	}
}