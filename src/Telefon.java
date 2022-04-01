
public class Telefon extends Ürünler{
    
    int boyut;
    int ram;
    int hafıza;
    
    
    public Telefon(String marka, String model, int fiyat,int boyut, int ram,int hafıza) {
        super(marka, model, fiyat);
        this.boyut=boyut;
        this.hafıza=hafıza;
        this.ram=ram;
        
    }

    @Override
    void taksitYap(int taksitSayısı) {
        super.taksitYap(taksitSayısı); 
    }

    @Override
    void bilgileriGörüntüle() {
        super.bilgileriGörüntüle(); 
        System.out.println("Ürünün Boyutu : "+boyut+" Inch");
        System.out.println("Ürünün Hafızası : "+hafıza+" gb");
        System.out.println("Ürünün ramı : "+ram+" gb");
        
    }

    @Override
    void taksitYap(int kaçTaksit, int aylıkÖdeme) {
        super.taksitYap(kaçTaksit, aylıkÖdeme);
    }

    
    
    
}
