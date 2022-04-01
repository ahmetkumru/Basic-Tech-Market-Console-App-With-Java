
import java.util.ArrayList;


public class Kasa {
    ArrayList<Ürünler> satılanÜrünlerListesi=new ArrayList<>();
    Müşteri [] müşteriler=new Müşteri[5];
    
    public void müşteriİsimler(Müşteri[] müşteriler) {
        for (int i = 0; i < müşteriler.length; i++) {
        
            System.out.println("-"+müşteriler[i].isim);
          
        }
        
       
    }
    
  void ürünSatışOluştur(Ürünler ürün,int taksitSayısı){
    ürün.taksitYap(taksitSayısı);  
    
    satılanÜrünlerListesi.add(ürün);
    }
    
    void ürünSatışKaldır(Ürünler ürün){     
    satılanÜrünlerListesi.remove(ürün);
    }
    
    
    
    void satışDurumu(){
           int sıra=1;
        for (Ürünler s : satılanÜrünlerListesi) {
         
            System.out.println(sıra+". Ürün");
            s.bilgileriGörüntüle();
            System.out.println("Taksitli Satış Fiyatı : "+s.getFiyat()+"("+s.taksit+ " ay"+ ")");
            System.out.println("Aylık Ödemeniz : "+(s.getFiyat()/s.taksit));
            System.out.println("");
            sıra++;
        }
    }
    
    public void müşteriEkle(String isim,int tutar,String eMail,int taksitSayısı,int sıra)   {
       
       müşteriler[sıra]=new Müşteri(isim, tutar,eMail, taksitSayısı);
        
    }
    public void müşteriSil(int sıra)   {
       
       müşteriler[sıra]=null;
    }
  
    public void müşteriyeÜrünEkle(int sıra,Ürünler ürün) {
        müşteriler[sıra].müşteriÜrünü=ürün;
        müşteriler[sıra].tutar+=ürün.eskiFiyat;
        System.out.println("Müşteriye eklenen ürün : "+ürün.getMarka()+" "+ürün.getModel());
        System.out.println("Müşterinin güncel tutarı : "+müşteriler[sıra].tutar+" tl");
        System.out.println("Müşterinin güncel aylık taksidi : "+müşteriler[sıra].tutar/müşteriler[1].taksitSayısı+" tl");
       
        
    }
    public void taksitÖde(int sıra,int ödenenTaksitSayısı)  {
        müşteriler[sıra].taksitSayısı-=ödenenTaksitSayısı;
        if( müşteriler[sıra].taksitSayısı==0)   {
            System.out.println("Borcunuz bitmiştir...");           
        }
        else if( müşteriler[sıra].taksitSayısı>=1) {System.out.println("Ödenen Taksit Sayısı : "+ödenenTaksitSayısı);
        System.out.println("Kalan Taksit Sayısı : "+müşteriler[sıra].taksitSayısı);
            
        
    }
        else    {
            System.out.println("Taksit Sayısını Aştınız...");
        }
   
   
}
}
