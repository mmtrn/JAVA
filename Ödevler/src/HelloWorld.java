import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Selam();
        Name();

    }
    private static void Selam(){
        System.out.println("Merhaba");
    }
    private static void Name(){
        String isimsoyad, isim, soyadi;
        System.out.println("İsminizi ve soyadınızı giriniz");
        Scanner name = new Scanner(System.in);
        isimsoyad =name.nextLine();
        System.out.println("Hoşgeldin "+ isimsoyad);
        isim = name.next();
        System.out.println("Hoşgeldiniz "+isim+" Bey" );
        Scanner surname = new Scanner(System.in);
        soyadi = surname.nextLine();
        System.out.println("oooo " +isim + soyadi+" gelmişsiniz?");
        /*
        String isim;
        Scanner name = new Scanner(System.in);
        isim = name.next(); boşluğa kadar alır
                    nextline(); tamamını alır
                    findInLine(".").charAt(0) kalvyeden belirtilen ifadeyi karakterlere böler
                    nextInt() Klavyeden girileni inte cevirir.
         */
//3 sayı giren kullanıcı en büyük en küçük ve ortancayı söylesin

        int sayi1,sayi2,sayi3;
        String maxNumber = "", minNumber="", mediumNumber="";
        Scanner inputNumber = new Scanner(System.in);

        System.out.println("1.Sayıyı giriniz : ");
        sayi1 =inputNumber.nextInt();

        System.out.println("2.Sayıyı giriniz : ");
        sayi2 =inputNumber.nextInt();

        System.out.println("3.Sayıyı giriniz : ");
        sayi3 =inputNumber.nextInt();

        if (sayi1<sayi2&&sayi3<sayi2){
            maxNumber = "En büyük sayı"+sayi2;
            if (sayi3<sayi1){
                minNumber = "En küçük sayı"+sayi3;
                mediumNumber = "Ortanca sayı"+sayi1;
            }

        }else if (sayi2<sayi1&&sayi3<sayi1){
            maxNumber = "En büyük sayı"+ sayi1;
            if (sayi2<sayi3){
                minNumber = "En küçük sayı"+sayi2;
                mediumNumber = "Ortanca sayı"+sayi3;
            }
        }
        else if(sayi1<sayi3&&sayi2<sayi3){
            maxNumber = "En büyük sayı"+sayi3;
            if (sayi2<sayi1){
                minNumber = "En küçük sayı "+sayi2;
                mediumNumber ="ortanca sayı "+sayi1;
            }


        }
        System.out.println(maxNumber);
        System.out.println(minNumber);
        System.out.println(mediumNumber);

        }
//ifade ? sorgu1:sorgu2 = if then else denilen ifin kısaltılmış gösterimi olan yapı




    }
