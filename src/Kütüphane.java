import java.util.ArrayList;
import java.util.List;

public class Kütüphane {

   private static int kitapNo=1000;
   private String kitapAdi;
   private String yazar ;
   private double fiyat;


   static List<Kütüphane> kitapListe = new ArrayList<Kütüphane>();

    public Kütüphane() {
    }

    public Kütüphane(String kitapAdi, String yazar, double fiyat) {
        kitapNo++;
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        this.fiyat = fiyat;
    }

    public int getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(int kitapNo) {
        this.kitapNo = kitapNo++;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Kütüphane{" +
                "kitapNo=" + kitapNo +
                ", kitapAdi='" + kitapAdi + '\'' +
                ", yazar='" + yazar + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }
}
