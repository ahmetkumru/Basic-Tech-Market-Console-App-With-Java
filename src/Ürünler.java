
public class Ürünler {
  
   private String marka;
   private String model;
   private int fiyat;
   int taksit;
   //ilk fiyat:
   int eskiFiyat;

    public int getEskiFiyat() {
        return eskiFiyat;
    }

    public void setEskiFiyat(int eskiFiyat) {
        this.eskiFiyat = eskiFiyat;
    }

    public Ürünler(String marka, String model, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
    
    void bilgileriGörüntüle()    {
        System.out.println("Ürünün markası : "+getMarka());
        System.out.println("Ürünün modeli : "+getModel());
        
        System.out.println("Ürünün fiyatı : "+getFiyat()+" tl");
        
        
    }
    void taksitYap(int taksitSayısı) {
        this.taksit=taksitSayısı;
        this.eskiFiyat=fiyat;
        fiyat+=((fiyat/100)*(taksit*5));
        
    }
    void taksitYap(int kaçTaksit,int aylıkÖdeme) {
        aylıkÖdeme=fiyat/kaçTaksit;
        this.eskiFiyat=fiyat;
         if (fiyat <= 5000 && kaçTaksit > 12) {
            System.out.println("5000 tl den aşşağı alışverişlerinizde 12 taksitten fazla yapamazsınız... ");
            

        }
         else if(kaçTaksit>24)  {
             System.out.println("24 aydan fazla taksit yapamazsınız.");
         }
         else {
            fiyat += ((fiyat / 100) * (kaçTaksit * 5));
            System.out.println("Ürünün " + kaçTaksit + " taksitli fiyatı " + getFiyat() + "tl");
             System.out.println("Aylık Ödemeniz : "+(fiyat/kaçTaksit)+" tl dir.");
             System.out.println("***************************************************************************");
        }
        
    }
    
    
   
   
   
    
}
