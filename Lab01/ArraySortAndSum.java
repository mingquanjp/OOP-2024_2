import java.util.Scanner;
public class ArraySortAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so n: ");
		int n = sc.nextInt();
		double[] arr = new double[n];
		System.out.println("Nhap cac phan tu cua mang: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextDouble();
		}
		//sort
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i] > arr[j]) {
					double temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +" ");
		}
		//sum
		double sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.print("\n");
		//Average
		double avg = sum/n;
		System.out.println("Sum of Array is " + sum);
		System.out.print("Average of Array is " + avg);
	
	}

}
