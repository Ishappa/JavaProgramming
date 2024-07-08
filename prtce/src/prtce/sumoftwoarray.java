package prtce;
import java.util.Scanner;
public class sumoftwoarray {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("=============");
	  int row=ip.nextInt();
	  int col=ip.nextInt();
	  
	  int[][] arr1=new int[row][col];
	  int[][] arr2=new int[row][col];
	  int[][] arr3=new int[row][col];
	  
	  for(int i=0;i<row;i++)
	  {
		  for(int j=0;j<col;j++)
		  {
			  arr1[i][j]=ip.nextInt();
		  }
	  }
	  for(int i=0;i<row;i++)
	  {
		  for(int j=0;j<col;j++)
		  {
			  arr2[i][j]=ip.nextInt();
		  }
	  }
	  System.out.println("========================");
	  for(int i=0;i<row;i++)
	  {
		  for(int j=0;j<col;j++)
		  {
			  arr3[i][j]=arr1[i][j]+arr2[i][j];
		  }
	  }
	 
	  for(int i=0;i<row;i++)
	  {
		  for(int j=0;j<col;j++)
		  {
			  System.out.print(arr3[i][j]+"");
		  }
	  }
	  System.out.println();
	}
}
