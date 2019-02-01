import java.util.Scanner;

public class Dikdortgen {
    private double en;
    private double boy;
    public Dikdortgen(){//constructor hepsinde aynı değer çıkartıyorsa 10 tane eni 11 dikdörtgen
        en=11;
        /*System.out.println("Kısa Kenar Bilgisini Giriniz");
        Scanner data =new Scanner(System.in);
        en=data.nextDouble();
        System.out.println("Uzun kenar Bilgisini Giriniz");
        Scanner data2 =new Scanner(System.in);
        boy =data2.nextDouble();
*/
    }

    public double getBoy() {
        return this.boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public double getEn() {
        return this.en;
    }

    public void setEn(double en) {
        this.en = en;
    }
    public double alanHesapla(){

        return en*boy;
    }
    public double cevreHesapla(){
        return (en+boy)*2;
    }
}
