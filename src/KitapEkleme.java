import java.util.Scanner;

public class KitapEkleme {




  static  void kitapEkleme() {

        Scanner scan =new Scanner(System.in);

        System.out.println("kitap adı giriniz");
        String kitapAdi=scan.nextLine();
        System.out.println("Yazar adı giriniz");
        String yazarAdi=scan.nextLine();
        System.out.println("Fiyat giriniz");
        int fiyat =scan.nextInt();

        Kütüphane kitaplar = new Kütüphane(kitapAdi,yazarAdi,fiyat);
        Kütüphane.kitapListe.add(kitaplar);
        System.out.println(kitapListe);




    }









}
