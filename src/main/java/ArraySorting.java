
public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4,3,1,5};
        int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
				
			{
				if(a[i]>a[j])
				{
					//swap
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
      System.out.println(a[i]);
		}
	
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("*");	
			System.out.print("\t");	
			}
			
			System.out.println();
			}
	
	}

}
