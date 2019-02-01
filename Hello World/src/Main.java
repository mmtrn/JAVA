import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Merhaba");
        int sayi = 0;
        int sum=0 , s = 0;
        while (sayi<10){

                System.out.println("Sayıyorum.. "+sayi);
                sayi++;
                sum = sum +s;
                System.out.println("bu "+sayi + "'ya kadar olanların toplamı"+sum +"'dır");
                s++;
            }
        Donguler();
        Oku();
        }
        private static void Donguler() {
            int s = 0;
            do {
                System.out.println("Zorunlu çalışırım");
                s++;
            } while (s < 3);
            for (int i = 1; i < 100; i++) {
                System.out.println(i + " Sayarım Bilirsin");
            }


        }
        private static void Oku(){
            String ad;
            Scanner bak = new Scanner(System.in);
            ad = bak.nextLine();
            System.out.println("Adını gir"+ad);

        }

        }



