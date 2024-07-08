 package prtce;

import java.util.Scanner;

public class Anagram {
	
	static String ssort(String s)
	{
		char [] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		String ans=new String(arr);
		return ans;
				
	}
	 public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("---------------------------------");
		String s1=ip.nextLine();
		String s2=ip.nextLine();
		
		String ans1=ssort(s1);
		String ans2=ssort(s2);
		
		if(ans1.equals(ans2))
		{
			System.out.println("anagram");
			
		}
		else
		{
			System.out.println("not a anagram");
		}
	}

}
 