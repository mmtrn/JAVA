import java.io.IOException;
import java.util.Scanner;


public class TemelIslemler {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int sayi1, sayi2;
		char op;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sayilari giriniz: ");
		sayi1 = sc.nextInt();
		sayi2 = sc.nextInt();
		System.out.println("Hangi iþlemi yapmak istiyorsunuz: ");
		op = (char) System.in.read();
		
		switch(op) {
		case '+':
			System.out.println("Sonuc: " + (sayi1 + sayi2));
			
		case '-':
			System.out.println("Sonuc: " + (sayi1 - sayi2));
			
		case '*':
			System.out.println("Sonuc: " + (sayi1 * sayi2));
			break;
		case '/':
			System.out.println("Sonuc: " + (sayi1 / sayi2));
			break;
		default:
			System.out.println("Yanlýþ operatör");
				
		}

	}

}
