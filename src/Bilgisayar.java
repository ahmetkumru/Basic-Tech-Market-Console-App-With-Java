
public class Bilgisayar extends Ürünler{
    int ram;
    int hafıza;
    String işlemci;
    String ekranKartı;
    
    public Bilgisayar(String marka, String model, int fiyat,int ram,int hafıza,String işlemci,String ekranKartı) {
        super(marka, model, fiyat);
        this.ekranKartı=ekranKartı;
        this.hafıza=hafıza;
        this.işlemci=işlemci;
        this.ram=ram;
        
    }

    @Override
    void bilgileriGörüntüle() {
        super.bilgileriGörüntüle();
        System.out.println("Ürünün ekran kartı : "+ekranKartı);
        System.out.println("Ürünün hafızası : "+hafıza+" gb");
        System.out.println("Ürünün işlemcisi : "+işlemci);
        System.out.println("Ürünün Ramı : "+ram+" gb");
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
