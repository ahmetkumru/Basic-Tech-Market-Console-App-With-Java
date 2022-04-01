
import java.util.ArrayList;





public class Müşteri {
  String isim;
  int tutar;
  String eMail;
  int taksitSayısı;
  Ürünler müşteriÜrünü;

    public Müşteri(String isim, int tutar, String eMail, int taksitSayısı) {
        this.isim = isim;
        this.tutar = tutar;
        this.eMail = eMail;
        this.taksitSayısı = taksitSayısı;
    }

public void müşteriBilgileri() {
    System.out.println(("Müşterinin adı = ")+isim);
    System.out.println(" Müşterinin toplam tutarı = "+tutar);
    System.out.println("Müşterinin e mail = "+eMail);
    System.out.println("Müşterinin Taksit Sayısı = "+taksitSayısı);
   
   
    
}

    
}

