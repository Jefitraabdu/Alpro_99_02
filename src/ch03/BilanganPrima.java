package ch03;
import java.util.Scanner;
public class BilanganPrima{
	public static void main (String[]args){
	Scanner input = new Scanner(System.in);
	System.out.print("Masukkan Bilangan : ");
	int bil = input.nextInt();
	
	if (bil == 1){
		System.out.println(bil + " Bukan Bilangan Prima");
	}
	else if(bil == 2 || bil == 3 || bil == 3 || bil == 5 || bil == 7){
		System.out.println(bil + " Adalah Bilangan Prima");
	}
	else if(bil % 2 == 0 || bil % 3 == 0 || bil % 5 == 0 || bil % 7 == 0){
		System.out.println(bil + " Bukan Bilangan Prima");
	}
	else{
		System.out.println(bil + " Adalah Bilangan Prima");
	}
}
}