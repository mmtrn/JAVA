import java.util.Scanner;

public class Odev16 {
    public static void main(String[] args){
        odev10();
        odev9();
        odev8();
        odev7();
        odev6();
        odev5();
        odev4();
        odev3();
        odev2();
        odev1();

    }
    private static void odev1(){// 3 sayının ortalamasını bulma
        double sayi1,sayi2,sayi3;
        double ort;
        Scanner data = new Scanner(System.in);
        System.out.println("1.Sayıyı giriniz");
        sayi1 = data.nextInt();
        System.out.println("2.Sayıyı giriniz");
        sayi2 = data.nextInt();
        System.out.println("3.Sayıyı giriniz");
        sayi3 = data.nextInt();
        ort  = (sayi1+sayi2+sayi3)/3;
        System.out.println("ortalamamız : " +ort);
    }
    private static void odev2(){//kenar ölçüleri verilen üçgenin ne çeşit üçgen olduğunu bulma
        int a;
        int b ;
        int c;
        Scanner data = new Scanner(System.in);
        System.out.println("1.kenarı giriniz");
        a = data.nextInt();
        System.out.println("2.kenarı giriniz");
        b = data.nextInt();
        System.out.println("3.kenarı giriniz");
        c = data.nextInt();
        if (a==b && b==c && a==c){
            System.out.println("Eşkenar Üçgendir");

        }else if (a==b||b==c||a==c){
            System.out.println("ikizkenar üçgendir");

        }else {
            System.out.println("Çeşitkenar üçgendir");
        }


        }
        private static void odev3(){//vize final ortalamasını bulma
            int vizenot,finalnot;
            double ortalama;
            System.out.println("Vize notunu giriniz");
            Scanner note = new Scanner(System.in);
            vizenot=note.nextInt();
            System.out.println("Final Notunu giriniz.");
            Scanner finalnotu = new Scanner(System.in);
            finalnot=finalnotu.nextInt();
            ortalama = (vizenot*0.4)+(finalnot*0.6);
            if (ortalama>=50){
                System.out.println("Dersi geçtiniz");
            }else {
                System.out.println("kaldınız bi sonraki sınava inş");
            }

        }
        private static void odev4(){//5 kez ismini yazdırma
        int i = 0;
        while (i < 5){
            System.out.println("Mehmet Turan");
            i++;

        }

        }
        private static void odev5(){//1'den 100'e ve 100den 1'e sayma
        int i = 0;
        int toplam = 0;
        while (i<101){
            toplam = toplam+i;
            i++;
        }
            System.out.println(toplam);
        }
        private static void odev6(){
        int i = 1;
        int t = 101;
        while (i<100){
            System.out.println(i);
            i++;
        }while (t>=0){
                System.out.println(t);
                t--;
            }
        }
        private static  void odev7(){//faktoriyel bulma
        int fact;
        int i=1 ;
        int sonuc=1;
        System.out.println("sayıyı girin");
        Scanner data = new Scanner(System.in);
        fact = data.nextInt();
        while (i < fact){
            i++;
            sonuc = i*sonuc;
        }
            System.out.println(sonuc);
        }
        private static void odev8(){//formülü verilen işlemini yapma
        int x,y,sonuc =0;
        System.out.println("x değerini giriniz");
        Scanner dataa = new Scanner(System.in);
        x=dataa.nextInt();

        System.out.println("y değerini giriniz");
        Scanner datab = new Scanner(System.in);
        y=datab.nextInt();
        if (x>0 &&y<0){
            sonuc =4*x + 2*y +4;
        }else if (x>0&& y==0){
            sonuc = 2*x-y+3;
        }else if (x<0&&y>0){
            sonuc =3*x+4*y+3;
        }
            System.out.println(sonuc);

        }
        private static void odev9(){//harf notu hesaplama
        int not;
            System.out.println("Not değerini giriniz");
        Scanner note = new Scanner(System.in);
        not = note.nextInt();
        if (not<=100&&not>85){
            System.out.println("Notunuz:AA");
        }
        else if(not<=85&&not>70){
            System.out.println("Notunuz:BB");
        }
        else if(not<=70&&not>55){
            System.out.println("Notunuz:CC");
        }
        else if(not<=55&&not>=51){
            System.out.println("Notunuz:DD");
        }
        else {
            System.out.println("Notunuz:FF");
        }
        }
        private static void odev10(){//çarpım tablosu yazdırma
        for (int i=1;i<=10;i++){
            for (int j=1; j<10;j++){
                System.out.println(i+"x"+j+"="+(i*j));
            }

        }
        }
    }

