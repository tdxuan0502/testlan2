package communityuni.com;

import java.util.Scanner;

public class TestSapXepMang {
	public static void bubbleSort(int M[]) {
		for(int i=0;i<M.length-1;i++) {
			for(int j=M.length-1;j>1;j--) {
				if(M[j]<M[j-1]) {
					int temp=M[j];
					M[j]=M[j-1];
					M[j-1]=temp;
				}
			}
		}
	}
	public static void nhapMang(int M[]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<M.length;i++) {
			System.out.print("M["+i+"]=");
			M[i]=sc.nextInt();
		}
	}
	public static void xuatMang(int M[]) {
		for(int i=0;i<M.length;i++) {
			System.out.print(M[i]+"\t");
		}System.out.println();
	}
	public static void main(String[] args) {
		int []M;
		Scanner sc = new Scanner(System.in);
		System.out.print("nhập số phần tử của mảng: ");
		int n=sc.nextInt();
		M=new int[n];
		System.out.println("nhập số phần tử cho mảng: ");
		nhapMang(M);
		System.out.println("mảng sao khi nhập là: ");
		xuatMang(M);
		bubbleSort(M);
		System.out.println("Mảng sau khi sắp xếp");
		xuatMang(M);
	}

}
