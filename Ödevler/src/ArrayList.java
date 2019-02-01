public class ArrayList {
    public static void main(String[]args){
    odev2();
    odev1();
    odev();
    }



    

    private static void odev2() {
        String takim = "Fenerbahçe";
        String takim2 = new String("Fenerbahçe");
        System.out.println(takim+" "+takim2);
        System.out.println("Fenerbahçe'nin harf sayısı : "+takim.length());
        System.out.println(takim.charAt(4));
        System.out.println(takim.substring(2,5));

    }

    private static void odev() {
        int [][] tablo= new int[5][4];
        for(int satir = 0;satir<tablo.length;satir++){
            for(int sutun=0;sutun<tablo[satir].length;sutun++){
                tablo[satir][sutun] = (int)((Math.random())*100);

            }
        }
        for (int satir=0; satir<tablo.length;satir++){
            for (int sutun=0;sutun<tablo[satir].length;sutun++){
                System.out.print(tablo[satir][sutun]+"      ");
            }
            System.out.println( );
        }


    }
    private static void odev1() {
        int[] dizi1 = {1, 3, 4, 5, 6};
        int[] dizi2 =new int [dizi1.length];


        System.arraycopy(dizi1,0,dizi2,0,5);
        for (int a :dizi2){
            System.out.println(a);}

        for (int b :dizi1){
            System.out.println(b);
    }

}}
