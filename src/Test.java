
public class Test {
    public static void main(String[] args) {
         Ürünler bilgisayar1 = new Bilgisayar("HP", "Pavilion", 5899, 16, 1000, "i5 8300H", "GTX 1050 Ti");
        Ürünler bilgisayar2 = new Bilgisayar("Lenovo", "IDEAPAD", 7457, 16, 1000, "İ7 8750H", "GTX 1060");
        Ürünler bilgisayar3 = new Bilgisayar("ASUS", "FX504GD", 6386, 8, 1000, "İ7 7700HQ", "GTX 1050");
        Ürünler bilgisayar4 = new Bilgisayar("Apple", "MacBook Pro", 9498, 8, 2000, "i5 7267U", "MX 150");
        Ürünler telefon1 = new Telefon("Apple", "Iphone X", 8299, 5, 2, 64);
        Ürünler telefon2 = new Telefon("Samsung", "Glaxy S9 Plus", 4699, 6, 6, 128);
        Ürünler telefon3 = new Telefon("Huawei", "P Smart", 1499, 5, 3, 32);

        Ürünler televizyon1 = new Televizyon("LG", "49LK5900", 3799, 49, "WEB OS SMART TV", "LED");
        Ürünler televizyon2 = new Televizyon("Samsung", "40N5300", 2599, 40, "SMART TV", "LCD");
        Ürünler televizyon3 = new Televizyon("VESTEL", "55UD8350", 3299, 55, "CURVED SMART TV", "IPS LED");
        
        System.out.println("**********************************************************************************");
        
        bilgisayar1.bilgileriGörüntüle();
        
        System.out.println("***********************************************************************************");
        telefon1.bilgileriGörüntüle();
        System.out.println("************************************************************************************");
        televizyon1.bilgileriGörüntüle();
        
        
        System.out.println("**********************************************************************************");
        
        
        Kasa kasa=new Kasa();
        kasa.ürünSatışOluştur(bilgisayar2, 6);
        kasa.ürünSatışOluştur(telefon2, 9);
        kasa.ürünSatışOluştur(televizyon2, 12);
        kasa.ürünSatışOluştur(telefon3, 7);
        
        kasa.ürünSatışKaldır(telefon3);
        kasa.satışDurumu();
        
       
        System.out.println("************************************************************************************");
        
       kasa.müşteriEkle("Ahmet Cemalettin Kumru",6500, "Ahmet.amal17@gmail.com", 9, 1);
       
        System.out.println("*************************************************************************************");
        
        
       kasa.müşteriEkle("Furkan Gündoğan", 7000, "Furkangündogan@gmail.com", 6, 2);
       kasa.müşteriSil(2);
        System.out.println("*******************************");
       kasa.müşteriler[1].müşteriBilgileri();
        System.out.println("********************************");
       
        System.out.println("*************************************************************************************");
        
       kasa.müşteriyeÜrünEkle(1, telefon3);
       
        System.out.println("***************************************************************************************");
       kasa.taksitÖde(1,8);
      
        System.out.println("***************************************************************************************");
     
       
        
        
        
    
    
   
        
}
}
