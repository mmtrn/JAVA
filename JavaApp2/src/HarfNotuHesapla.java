import java.util.Scanner;


public class HarfNotuHesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int not;
		Scanner sc = new Scanner(System.in);
		System.out.println("Notunuzu giriniz: ");
		not = sc.nextInt();
		
		if(not <= 100 && not >= 90) 
			System.out.println("A");
		if(not < 90 && not > 80) 
			System.out.println("B");
		if(not <= 80 && not >= 70) 
			System.out.println("C");
		if(not < 70 && not >= 60) 
			System.out.println("D");
		if(not < 60)
			System.out.println("Kaldýnýz!");

	}

}
