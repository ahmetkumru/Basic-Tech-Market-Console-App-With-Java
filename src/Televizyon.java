
public class Televizyon extends Ürünler {
    int boyut;
    String tip;
    String panelTürü;
    
    
    public Televizyon(String marka, String model, int fiyat,int boyut,String tip,String panelTürü) {
        super(marka, model, fiyat);
        this.tip=tip;
        this.boyut=boyut;
        this.panelTürü=panelTürü;
        
        
    }

    @Override
    void bilgileriGörüntüle() {
        super.bilgileriGörüntüle();
        System.out.println("Ürünün tipi : "+tip);
        System.out.println("Ürünün boyutu "+boyut+" Inch");
        System.out.println("Ürünün Panel Türü :"+panelTürü);
    }

    @Override
    void taksitYap(int taksitSayısı) {
        super.taksitYap(taksitSayısı); 
    }

    @Override
    void taksitYap(int kaçTaksit, int aylıkÖdeme) {
        super.taksitYap(kaçTaksit, aylıkÖdeme); 
    }

    
    
    
}
