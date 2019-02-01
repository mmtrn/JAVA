import java.util.Scanner;


public class HarfNotuHesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int not;
		Scanner sc = new Scanner(System.in);
		System.out.println("Notunuzu giriniz: ");
		not = sc.nextInt();
		
		if(not > 90) 
			System.out.println("A");
		else if(not > 80)
			System.out.println("B");
		else if(not > 70)
			System.out.println("C");
		else if(not > 60)
			System.out.println("D");
		else
			System.out.println("Kaldýnýz!");

	}

}
