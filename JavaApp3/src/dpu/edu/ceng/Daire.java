package dpu.edu.ceng;

public class Daire {
	
	// de�i�kenler
	public int yariCap = 2;
	int y;
	private int z;
	
	// constructor 1 -- yap�land�r�c�
	public Daire() {
		System.out.println("Constructor 1 ca�r�ld�.."
				+ "Yaricapi: " + yariCap);
	}
	
	// constructor 2
	public Daire(int yariCap) {
		// this 07.11 tarihinde
		// anlatilacak
		this.yariCap = yariCap;
		
		System.out.println("Constructor 2 �a�r�ld�.." +
		"Yaricapi: " + yariCap);
				
	}
	
	// alan hesaplama
	public double alanHesapla() {
		return Math.PI * Math.pow(yariCap, 2);
	}

}
