import java.sql.SQLOutput;
import java.util.Scanner;

public class BubbleSort {
    public static void main (String[] args){
        int[] sayilar = {1,4,5,6,1};
        elemanlarinToplamınıBul(sayilar);
        ekranaYazdir(sayilar[2]);
        gelismis();
        soru4();
        soru3();
        soru2();
        soru1();
        elemanReq();

        }

    private static void elemanlarinToplamınıBul(int[] gelenDizi){
        int toplam=0;
        for (int i : gelenDizi){
            toplam = toplam+i;
        }System.out.println(toplam);
    }


    private static void ekranaYazdir(int i) {
        System.out.println(i);
    }


    private static void elemanReq(){
          System.out.println("Eleman sayısını giriniz!..");
        int a,b,istek;
        Scanner data = new Scanner(System.in);
        a=data.nextInt();
        int[] sayilar = new int[a];
          System.out.println("Dizi boyutu : "+a);

          for (int i = 0;i<sayilar.length;i++){
              System.out.println((i+1)+". elamanı giriniz.");
              Scanner data1 = new Scanner(System.in);
              b=data1.nextInt();
              sayilar[i] = b;

          }
          System.out.println("Dizi oluşturuldu");
          System.out.println("Kaçıncı dizi elemanı istersiniz?");
          Scanner j = new Scanner(System.in);
          istek = j.nextInt();
          System.out.println(sayilar[istek-1]);






      }
      private static  void soru1(){
        //10 Elemanlı bir diziye eleman olarak dizi indexlerinin karelerini atayan uygulama
          int[] dizi = new int[10];
          for(int index=0; index<dizi.length;index++){
              dizi[index]=(index*index);
              System.out.println("index sayımız ="+index+ "değeri : " +dizi[index]);
          }
      }
      private static void soru2(){
        int[] dizi = new int[5];
        int b;
        for (int i=0;i<dizi.length;i++){
            Scanner data = new Scanner(System.in);
            b = data.nextInt();
            dizi[i]=b;

        }
        for (int j=0; j<dizi.length;j++){
          System.out.println(dizi[j] );}


      }
      private static void soru3(){
          System.out.println("Ay değerini giriniz!..");
        int month;
        Scanner sorgu = new Scanner(System.in);
        month =sorgu.nextInt();
        if (month>0&&month<13){
            switch (month){
                case 1 :
                    System.out.println("Ocak");
                    break;
                case 2 :
                    System.out.println("Şubat");
                    break;
                case 3 :
                    System.out.println("Mart");
                    break;
                case 4 :
                    System.out.println("Nisan");
                    break;
                case 5 :
                    System.out.println("Mayıs");
                    break;
                case 6 :
                    System.out.println("Haziran");
                    break;
                case 7 :
                    System.out.println("Temmuz");
                    break;
                case 8 :
                    System.out.println("Ağustos");
                    break;
                case 9 :
                    System.out.println("Eylül");
                    break;
                case 10 :
                    System.out.println("Ekim");
                    break;
                case 11 :
                    System.out.println("Kasım");
                    break;
                case 12 :
                    System.out.println("Aralık");
                    break;

            }

        }else {
            System.err.println("1 ile 12 arasında değer girin!");
            soru3();
        }


      }
      private static void soru4(){
        /*int diziBoyutu;
        int toplam;
        System.out.println("Dizi değerini giriniz");
          Scanner data = new Scanner(System.in);
          diziBoyutu = data.nextInt();
          int[] dizi = new int[diziBoyutu];
          for(int i =0;i<dizi.length;i++){
              int eleman;
              Scanner data1 = new Scanner(System.in);
              eleman = data1.nextInt();
              dizi[i]=dizi[eleman];

          }
          for (int j = 0 ;j<dizi.length;j++){
              dizi[j] = dizi[j+1];
          */
        int diziElamanSayisi,toplam=0;
          System.out.println("Kaç elemanlı dizi?");
        Scanner tara = new Scanner(System.in);
        diziElamanSayisi = tara.nextInt();
        int[] diziler=new int[diziElamanSayisi];

        for (int i = 0;i<diziler.length;i++){
            System.out.println("Bir sayı girin");
            diziler[i] =tara.nextInt();
            toplam = toplam+diziler[i];

        }
          System.out.println(toplam);


          }
      private static void gelismis(){
        int toplam=0;
        int[] sayilar = {1,2,6,7,9,1};
        for (int i=0 ;i<sayilar.length;i++){
            System.out.println(sayilar[i]);
        }
        for (int gecici :sayilar){
            System.out.println(gecici);
        }
        for(int j:sayilar){
            toplam = toplam+ j;
        }
          System.out.println("elemanların Toplamı"+toplam);
          String[] gunler= {"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
          for (String s : gunler )  {
              System.out.println(s);}

    }
}








