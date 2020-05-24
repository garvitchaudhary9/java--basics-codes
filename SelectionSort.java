package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {1,-5,6,-9,9,4,8};
		int minIndex,temp;
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			minIndex=i;
			for(int j=i;j<n;j++) {
				if(a[j]<a[minIndex]) {
					minIndex=j;
				}
			}
			temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
			
		}
		for(int i:a) {
			System.out.print(i+" ");
		}

	}

}
