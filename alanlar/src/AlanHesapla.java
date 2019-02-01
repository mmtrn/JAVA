import java.util.Scanner;

public class AlanHesapla {
    public static void main(String[]args){
        Kare k1=new Kare();
        k1.setKenar(3);
        Dikdortgen d1 =new Dikdortgen();
        d1.setBoy(10);
        d1.setEn(5);
        Daire da1 =new Daire();
        da1.setR(5);
        System.out.println("Oluşturulan Daire Sayisi "+Daire.getOlusturulanNesneSayisi());
        int secim;
        System.out.println("Lütfen hesaplanacak şekili seçiniz!..");
        System.out.println("1-Dikdortgen" );
        System.out.println("2-Kare");
        System.out.println("3-Daire");
        Scanner data =new Scanner(System.in);
        secim=data.nextInt();
        switch (secim){
            case (1):
                int soru1;
                System.out.println("Lütfen çevre veya alan hesaplamak için tuşlayın");
                System.out.println("1-Çevre Hesapla");
                System.out.println("2-Alan Hesapla");
                Scanner data1 =new Scanner(System.in);
                soru1=data1.nextInt();
                if (soru1==1){
                    System.out.println(d1.cevreHesapla());

                }
                else if (soru1==2){
                    System.out.println(d1.alanHesapla());
                }else break;
            case (2):
                int soru2;
                System.out.println("Lütfen çevre veya alan hesaplamak için tuşlayın");
                System.out.println("1-Çevre Hesapla");
                System.out.println("2-Alan Hesapla");
                Scanner data2 =new Scanner(System.in);
                soru2 = data2.nextInt();
                if (soru2 ==1){
                    System.out.println(k1.cevreHesapla());
                }else if (soru2 ==2){
                    System.out.println(k1.alanHesapla());
                }else break;
            case (3):
                int soru3;
                System.out.println("Lütfen çevre veya alan hesaplamak için tuşlayın");
                System.out.println("1-Çevre Hesapla");
                System.out.println("2-Alan Hesapla");
                Scanner data3 = new Scanner(System.in);
                soru3=data3.nextInt();
                if (soru3 ==1){
                    System.out.println(da1.cevreHesapla());
                }else if (soru3 ==2){
                    System.out.println(da1.alanHesapla());
                }else break;




        }



    }
}
