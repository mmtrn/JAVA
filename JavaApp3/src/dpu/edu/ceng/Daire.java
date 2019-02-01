package dpu.edu.ceng;

public class Daire {
	
	// deðiþkenler
	public int yariCap = 2;
	int y;
	private int z;
	
	// constructor 1 -- yapýlandýrýcý
	public Daire() {
		System.out.println("Constructor 1 caðrýldý.."
				+ "Yaricapi: " + yariCap);
	}
	
	// constructor 2
	public Daire(int yariCap) {
		// this 07.11 tarihinde
		// anlatilacak
		this.yariCap = yariCap;
		
		System.out.println("Constructor 2 çaðrýldý.." +
		"Yaricapi: " + yariCap);
				
	}
	
	// alan hesaplama
	public double alanHesapla() {
		return Math.PI * Math.pow(yariCap, 2);
	}

}
