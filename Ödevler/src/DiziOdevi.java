public class DiziOdevi {
    public static void main(String[] args){
        String[] ad = {"Mehmet","Gözde","Esra"};
        String[] soyad = {"Turan","Kaşıkçı","Güneş"};

        birlestir(ad,soyad);
    }

    public static void birlestir(String[] isim,String [] soyisim ) {


        for(int i=0;i<isim.length;i++){
            int yas =(int) (Math.random()*50);
            System.out.println(isim[i] + " " + soyisim[i] +" "+ yas + " yaşındadır." );
            String birlesenIsim = isim[i] +" "+ soyisim[i]+" "+yas;
        }

    }
}



