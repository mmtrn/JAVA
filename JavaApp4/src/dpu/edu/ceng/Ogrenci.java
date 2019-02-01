package dpu.edu.ceng;

public class Ogrenci {
	
	public String ad;
	public String soyad;
	public static int ogrenciSayisi = 0;
	
	// constructor
	public Ogrenci() {
		ad = "Hakan";
		soyad = "Silek";
		ogrenciSayisi++;
		System.out.println("Constructor 1 calýþtýrýldý...");
	}
	
	public Ogrenci(String ad, String soyad) {
		this.ad = ad;
		this.soyad = soyad;
		
		ogrenciSayisi++;
		System.out.println("Constructor 2 çalýþtýrýldý...");
	}
	
	// statik metot
	
	/*
	 * Statik metotlar içerisinden
	 * sadece statik deðiþkenleri ve
	 * statik fonksiyonlarý çaðýrabilirsiniz
	 * */
	public static int ogrenciSayisiDondur() {
		return ogrenciSayisi;
	}
	
	/*
	 * Statik metotlar içerisinden
	 * sadece statik deðiþkenleri ve
	 * statik fonksiyonlarý çaðýrabilirsiniz
	 * */
	public static void _ogrenciSayisi() {
		ogrenciSayisiDondur();
	}
	

}
