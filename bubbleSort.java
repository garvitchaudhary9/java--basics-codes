package arrays;



public class bubbleSort {

	public static void main(String[] args) {
		int a[]= {5,4,3,2,1};
		int temp;
		int n =a.length;
			
		for(int i =0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		System.out.println("sorted array is:");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
