public class Kare {
    private double kenar;



    public void setKenar(double kenar) {
        this.kenar = kenar;
    }

    public double getKenar() {
        return this.kenar;
    }
    public double alanHesapla(){
        return (kenar*kenar);
    }
    public double cevreHesapla(){
        return (4*kenar);
    }
}
