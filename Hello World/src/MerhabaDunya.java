import javax.sound.midi.Soundbank;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class MerhabaDunya {
    public static void  main(String[] args){
        System.out.println("Merhaba \n" +
                "Dünya");
        int a = 5, b=10;
        int toplam = a + b;
        System.out.println(toplam);
        System.out.println(Byte.MAX_VALUE);                     /*
        İlkel Veri Tipleri: (Primitive veri tipleri)

        byte
        short
        int
        long
        float
        double
        char
        boolean





        */
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        int mt = 90;
        int hg = 60;
        int gk = 100;
        String ra = String.valueOf(mt); //çeviri yapar intten stringe dönüş
        String tt = String.valueOf(hg);
        System.out.println(mt+ hg);
        System.out.println(gk);

        System.out.println();
        System.out.println(ra+tt);

        String ad = "Mehmet";
        String soyad = "Turan";
        System.out.println(ad+" "+soyad);
        System.out.println();
        Zero();
        Toplam();
        Aritmetik_Operatorler();
        Iliskisel_Operatorler();
        Lojik();
        MilCevir();





    }
    private static void Zero(){
        System.out.println("Mezun ve işsiz");
    }
    private static void Toplam(){
        int a = 15 ;
        int b = 4 ;
        int d= a%b;
        System.out.println("modumuz " +d );
        int e = 15;
        e=e+1;
        e++;
        System.out.println("\n" +e);

    }
    private static  void Aritmetik_Operatorler(){
        /*
        += :
        -= :
        *= :
        /= :

         */
        int a  = 40 ,b = 20 ;
        ++b;
        a+=b;//a=a+b
        System.out.println("a'nın değieri"+a +"b nin değeri"+b);

    }
    private static void Iliskisel_Operatorler(){
        // == , < , > , <= ,>= , !=
        int x = 10;
        int y = 7;
        System.out.println(x>y);
        System.out.println(x<y);
        System.out.println(x>=y);
        System.out.println(x<=y);
        System.out.println(x!=y);
    }
    private static void Lojik(){
        boolean x = true;
        boolean y = false;
        boolean z = true;
        boolean t = false;
        /*
        and : && x ve y 1 iken 1 geri kalan 0
        or : || x ve y 0 iken 0 geri kalan 1
        xor: ^
        not: !x
         */
        System.out.println("x ve y" + (x && y));
        System.out.printf("x veya y%s%n", x || y);
        System.out.println("x xor y"+(x ^ t));
        System.out.println("x'in tersi" + !z);

    }
    private static void MilCevir(){
        double km = 100*1.609; //=> statement tamamı double yokken experiant
        //if then else yapısı;
        int s1 = 5 , s2 = 3;
        System.out.println(s1 < s2 ?"küçük":"büyük");
        int gun = 4;
        switch(gun){
                case 1 : System.out.println("pazartesi");
                break;
                case 2 : System.out.println("Salı");
                break;
                case 3 : System.out.println("Çarşamba");
                break;
                case 4 :
                System.out.println("Perşembe");
                break;
                case 5 :
                System.out.println("Perşembe");
                break;
                case 6 :
                System.out.println("Perşembe");
                break;
                case 7 :
                System.out.println("Perşembe");
                break;
                default:
                    System.out.println("Lütfen Gün sayınızı düzgün giriniz!");


        }
    }


}
