package prtce;

public class indexno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,4,5,6,7};
		int n=6;
		int index=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				 index=i;
			}
		}
		if(index==-1)
		{
			System.out.println("indexno is "+index);
		}
		else
		{
			System.out.println("indexno is "+index);
		}
	}
}