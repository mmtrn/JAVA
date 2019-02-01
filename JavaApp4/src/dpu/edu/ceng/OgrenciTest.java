package dpu.edu.ceng;

public class OgrenciTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ogrenci sayisini ekrana yazdir
		System.out.println("Baþlangýçtaki öðrenci sayýsý: " +
		Ogrenci.ogrenciSayisi);
		System.out.println("Baþlangýçtaki öðrenci sayýsý: " +
				Ogrenci.ogrenciSayisiDondur());
		
		Ogrenci ogrenci1 = new Ogrenci();
		System.out.println("Baþlangýçtaki öðrenci sayýsý: " +
				Ogrenci.ogrenciSayisi);
		System.out.println("Baþlangýçtaki öðrenci sayýsý: " +
				ogrenci1.ogrenciSayisi);
		System.out.println("Ogrenci ad: " + ogrenci1.ad
				+ "\nOgrenci soyad: " + ogrenci1.soyad);
		
		Ogrenci ogrenci2 = new Ogrenci("Burak", "Memis");
		System.out.println("Baþlangýçtaki öðrenci sayýsý: " +
				Ogrenci.ogrenciSayisi);
		System.out.println("Baþlangýçtaki öðrenci sayýsý: " +
				ogrenci1.ogrenciSayisi);
		System.out.println("Baþlangýçtaki öðrenci sayýsý: " +
				ogrenci2.ogrenciSayisi);
		System.out.println("Ogrenci ad: " + ogrenci2.ad
				+ "\nOgrenci soyad: " + ogrenci2.soyad);
		
		System.out.println(Ogrenci.ogrenciSayisiDondur());
		
		
		

	}

}
