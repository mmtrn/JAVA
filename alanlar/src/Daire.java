public class Daire {
    private double r;
    private static int olusturulanNesneSayisi;
    public Daire(){
        System.out.println("Daire nesnesi oluşturuldu.");
        olusturulanNesneSayisi++;
    }

    public static void setOlusturulanNesneSayisi(int olusturulanNesneSayisi) {
        Daire.olusturulanNesneSayisi = olusturulanNesneSayisi;
    }

    public static int getOlusturulanNesneSayisi() {
        return olusturulanNesneSayisi;
    }

    public void setR(double r) {
        if (r>=1){
            this.r =r;
        }else this.r=1;
    }

    public double getR() {
        return this.r;
    }
    public double alanHesapla(){
        return r*r*(Math.PI);
    }
    public double cevreHesapla(){
        return 2*r*(Math.PI);
    }
}
