package ch05;
import java.util.Scanner;
public class Euclidean{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		System.out.println("Masukkan M = ");
		int m = in.nextInt();
		System.out.println("Masukkan N = ");
		int n = in.nextInt();
		int r;
		int M = m;
		int N = n;
		if (n==0){
			System.out.println("PBB("+M+","+N+")="+m);
		}
		else{
			while(n!=0){
				r = m%n;
				m=n;
				n=r;
			}
			System.out.println("PBB("+M+","+N+")="+m);
		}
	}
}