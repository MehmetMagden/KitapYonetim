import java.util.Scanner;

public class Kitapci_Main {


    /*
     * ==================== PROJE==============================
     * bir kitapci icin program yazalim kitap no 1000'den baslayacak sirali no olsun program
     * baslayinca menu isminde bir method calissin
     * 1-kitap ekle
     * 2-numara ile kitap goruntule
     * 3-bilgi ile kitap goruntule
     * 4-numara ile kitap sil
     * 5-tum kitaplari listele
     * 6-cikis
     ************************************
     * 1.olarak her kitaba ait kitap no olacak, sonra kitap adi olacak, buna ait
     * yazar adi olacak ve kitap fiyati olacak bu bilgilerin tutulacagi bir yer
     * olmali yani bir list'te tutmamiz gerek
     * 2-kitap numarasi 1000'den
     * baslamali,her kitap eklendiginde bir artacagi icin sayac gibi dusunulebilinir
     * count=1000; menu isminde bir method olusturmaliyim,
     * 3-kitap ekle diye bir
     * method olusturmliyim,bu method farkli bir classda
     * 4-kullanicidn kitap adi
     * yazar adi ve fiyat bilgileri istenmeli
     */
    // Kitapcı_KitapEkle kitap = new Kitapcı_KitapEkle();


    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        giris112();
    }

    private static void giris112() {


        System.out.println("Kitapcı\nLütfen yapmak istediğiniz işlemi seçiniz\n1- kitapekle\n2- numara ile kitap görüntüle" +
                "\n3- bilgi ile kitap görüntüle\n4- numara ile kitap sil\n5- tüm kitapları listele\n6- cıkıs");


        int secim = scan.nextInt();

        switch (secim) {

            case 1:
                KitapEkleme.kitapEkleme();
                giris112();
                break;
            case 2:
                NoIleKitapGoruntule();
                giris112();
                break;
            case 3:
                //bilgiIleKitapGoruntule();
                giris112();
                break;
            case 4:
                //numaraIleKitapSil();
                giris112();
                break;
            case 5:
                //tümKitaplariListele();
                giris112();
                break;

            case 6:
                //Cikis();
                giris112();
                break;


        }
    }

    private static void NoIleKitapGoruntule() {

        
    }

}















