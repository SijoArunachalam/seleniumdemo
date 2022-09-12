import java.util.ArrayList;
import java.util.stream.IntStream;



import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class javalearning {
	
	public static int[] a={1,4,3,23,6};
	public static int[] b= {1,5,7,23,9};	
	
	public static void main(String[] args) {

			
		int sum=IntStream.of(a).sum();
		int mul=multiple(5,10);
		System.out.println(mul);
		System.out.println(sum);
		int difference=diff(a);
		System.out.println(difference);
		
		comparearray();
		
		
		
			
		}
		


	private static void comparearray() {
		// TODO Auto-generated method stub	
		
ArrayList<Integer> a1=new ArrayList<Integer>();
		
		for(int m=0;m<a.length;m++)
		{   
		
			if(a[m]==b[m])
			{

			 a1.add(a[m]);	
			 
			 System.out.println(a[m]);	
			}			
			}
		
	}

	private static int diff(int[] a) {
		// TODO Auto-generated method stub
	    int dif=0;
		for(int i=0;i<a.length-1;i++)
			
		{
		if((a[i+1]-a[i])>dif)
		{
			
		dif=a[i+1]-a[i];
		}
			
		}
	return dif;	
	}

	private static int multiple(int i, int j) {
		// TODO Auto-generated method stub
		int k=1;
		int summ=0;
		while(k<=j)
		{
		summ=summ+i;
		k++;
		}
		return summ;
	}
}