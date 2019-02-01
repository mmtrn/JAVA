public class Main {
    public static void main(String[] args){
        Personal mehmet=new Personal("mehmet","Turan",28);
        System.out.println(mehmet.getKimlikBilgileri());
        System.out.println(mehmet.toString());
        Ogrenci gozde = new Ogrenci("gozde","Kasikci", 2013131720,25);
        System.out.println(gozde.getKimlikBilgileri());
        System.out.println(gozde.toString());
    }
}
