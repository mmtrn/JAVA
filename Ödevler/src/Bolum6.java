import java.util.Scanner;

public class Bolum6 {
    public static void main(String[] args){
        int kullaniciSecimi=0;
        while(kullaniciSecimi!=5){
        kullaniciSecimi = menuGoster();}
        menuGoster();
        odev();
        math();

    }
    private static void math(){
        System.out.println("pi sayısı = "+Math.PI);
        System.out.println("E sayısı = "+Math.E);
        System.out.println("Mutlak değer = "+Math.abs(-123));//mutlak değer
        System.out.println(Math.ceil(9.3));//bi üst sayıya yuvarlama
        System.out.println(Math.floor(9.6));//bi alt sayıya yuvarlar
        System.out.println(Math.pow(2,4));//kuvvet bulma
        System.out.println(Math.sqrt(16));
        System.out.println(Math.max(12,13));
        System.out.println(Math.min(14,15));
        System.out.println((int) (Math.random()*50));//50 ye kadar random sayı üret
    }
    private static void odev(){
        System.out.println("İkizkenar uzunluğunu giriniz");
        int x ,y,z;
        Scanner data = new Scanner(System.in);
        x = data.nextInt();
        System.out.println("alanımız "+Math.pow(x,2)/2+"'dır");

        System.out.println("---------");

        y = (int)(Math.random()*50);
        z = (int)(Math.random()*50);
        System.out.println("küçük olan sayı "+Math.min(y,z));
        System.out.println("Büyük olan sayı "+Math.max(y,z));


    }
    public static int menuGoster(){
        int a;
        System.out.println("**********Menü*********");
        System.out.println("1-Toplamını bul");
        System.out.println("2-Farkını bul");
        System.out.println("3-Çarpımını bul");
        System.out.println("4-Bölümünü bul");
        System.out.println("5-Çıkış");
        System.out.println("\n İşlemin Numarasını giriniz");

        Scanner data = new Scanner(System.in);
        a = data.nextInt();
        if (a==1){
            System.out.println("Toplama işlemi yapacağım.");

        }else if (a==2){
            System.out.println("Çıkarma işlemi yapacağım.");
        }else if(a==3){
            System.out.println("çarpma işlemi yapacağım.");
        }else if(a==4){
            System.out.println("Bölme işlemi yapacağım.");
        }
        return a;




    }

}
