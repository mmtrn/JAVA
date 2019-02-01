import java.io.IOException;
import java.util.Scanner;


public class TemelIslemler {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int sayi1, sayi2, sonuc;
		char op;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sayilari giriniz: ");
		sayi1 = sc.nextInt();
		sayi2 = sc.nextInt();
		System.out.println("Hangi iþlemi yapmak istiyorsunuz: ");
		op = (char) System.in.read();  // tek bir karakter okunuyor
		
		if(op == '+') {
			sonuc = sayi1 + sayi2;
			System.out.println("Sonuc: " + sonuc);
		} else if(op == '-') {
			sonuc = sayi1 - sayi2;
			System.out.println("Sonuc: " + sonuc);
		} else if(op == '*') {
			sonuc = sayi1 * sayi2;
			System.out.println("Sonuc: " + sonuc);
		} else if(op == '/') {
			sonuc = sayi1 / sayi2;
			System.out.println("Sonuc: " + sonuc);
		} else 
			System.out.println("Yanlýþ operatör");
		

	}

}
