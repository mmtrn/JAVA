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
		System.out.println("Constructor 1 cal��t�r�ld�...");
	}
	
	public Ogrenci(String ad, String soyad) {
		this.ad = ad;
		this.soyad = soyad;
		
		ogrenciSayisi++;
		System.out.println("Constructor 2 �al��t�r�ld�...");
	}
	
	// statik metot
	
	/*
	 * Statik metotlar i�erisinden
	 * sadece statik de�i�kenleri ve
	 * statik fonksiyonlar� �a��rabilirsiniz
	 * */
	public static int ogrenciSayisiDondur() {
		return ogrenciSayisi;
	}
	
	/*
	 * Statik metotlar i�erisinden
	 * sadece statik de�i�kenleri ve
	 * statik fonksiyonlar� �a��rabilirsiniz
	 * */
	public static void _ogrenciSayisi() {
		ogrenciSayisiDondur();
	}
	

}
