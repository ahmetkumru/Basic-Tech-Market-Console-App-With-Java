
import java.util.Scanner;

public class Main {

    public static void işlemBastır() {
        System.out.print("İŞLEMLER:\n"
                + "1.Ürün Kataloğu\n"
                + "2.Taksit Takibi\n"
                + "Çıkmak için q ya basınız.");
    }

    public static void main(String[] args) {
        String ürünÇeşitleri = "-Bilgisayar\n"
                + "-Telefon\n"
                + "-Televizyon)";

        Kasa kasa = new Kasa();

        kasa.müşteriEkle("Ahmet Cemalettin Kumru", 6500, "Ahmet.amal17@gmail.com", 9, 0);
        kasa.müşteriEkle("Furkan  Gündoğan", 6500, "Furkangundogan@gmail.com", 9, 1);
        kasa.müşteriEkle("Muhammed Yusuf Sözen", 6500, "Yusufsözen@gmail.com", 9, 2);
        kasa.müşteriEkle("Uğur Salih Çelik", 6500, "Uğurcelik@gmail.com", 9, 3);
        kasa.müşteriEkle("Mehmet Alperen Kurt", 6500, "Mehmetkurt@gmail.com", 9, 4);

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

        Scanner scanner = new Scanner(System.in);

        System.out.println("************************************************************************");
        System.out.println("MAĞZAMIZA HOŞGELDİNİZ");

        while (true) {
            işlemBastır();
            System.out.println("Lütfen İşlem Seçiniz");
            String işlem;
            işlem = scanner.nextLine();

            if (işlem.equals("1")) {

                while (true) {
                    System.out.println("Almak istediğiniz ürün türünü seçiniz : ");
                    System.out.println(ürünÇeşitleri);
                    System.out.println("Çıkmak için q ya basınız");

                    String seç;
                    seç = scanner.nextLine();

                    if (seç.equals("q")) {
                        break;
                    } else if (seç.equals("Bilgisayar")) {

                        System.out.println("********************************************************77");
                        System.out.print("Satın Almak İstediğiniz Bilgisayarı Seçiniz : ");
                        System.out.println("1.");
                        bilgisayar1.bilgileriGörüntüle();
                        System.out.println("2.");
                        bilgisayar2.bilgileriGörüntüle();
                        System.out.println("3.");
                        bilgisayar3.bilgileriGörüntüle();
                        System.out.println("4.");
                        bilgisayar4.bilgileriGörüntüle();
                        String bilgisayarSeç;
                        bilgisayarSeç = scanner.nextLine();
                        if (bilgisayarSeç.equals("1")) {
                            System.out.print("Yapmak İstediğiniz Taksit Sayısını Giriniz : ");
                            int taksit;
                            taksit = scanner.nextInt();

                            bilgisayar1.taksitYap(taksit, 0);

                        } else if (bilgisayarSeç.equals("2")) {
                            System.out.print("Yapmak İstediğiniz Taksit Sayısını Giriniz : ");
                            int taksit;
                            taksit = scanner.nextInt();

                            bilgisayar2.taksitYap(taksit, 0);

                        } else if (bilgisayarSeç.equals("3")) {
                            System.out.print("Yapmak İstediğiniz Taksit Sayısını Giriniz : ");
                            int taksit;
                            taksit = scanner.nextInt();

                            bilgisayar3.taksitYap(taksit, 0);

                        } else if (bilgisayarSeç.equals("4")) {
                            System.out.print("Yapmak İstediğiniz Taksit Sayısını Giriniz : ");
                            int taksit;
                            taksit = scanner.nextInt();

                            bilgisayar4.taksitYap(taksit, 0);

                        }

                    } else if (seç.equals("Telefon")) {

                        System.out.println("Satın Almak İstedğiniz Telefonu Seçiniz : ");
                        System.out.println("1.");
                        telefon1.bilgileriGörüntüle();
                        System.out.println("2.");
                        telefon2.bilgileriGörüntüle();
                        System.out.println("3.");
                        telefon3.bilgileriGörüntüle();
                        String telefonSeç;
                        telefonSeç = scanner.nextLine();

                        if (telefonSeç.equals("1")) {
                            System.out.print("Yapmak İstediğiniz Taksit Sayısını Giriniz : ");
                            int taksit;
                            taksit = scanner.nextInt();

                            telefon1.taksitYap(taksit, 0);

                        } else if (telefonSeç.equals("2")) {
                            System.out.print("Yapmak İstediğiniz Taksit Sayısını Giriniz : ");
                            int taksit;
                            taksit = scanner.nextInt();

                            telefon2.taksitYap(taksit, 0);

                        } else if (telefonSeç.equals("3")) {
                            System.out.print("Yapmak İstediğiniz Taksit Sayısını Giriniz : ");
                            int taksit;
                            taksit = scanner.nextInt();

                            telefon3.taksitYap(taksit, 0);

                        }

                    } else if (seç.equals("Televizyon")) {
                        System.out.println("Satın Almak İstedğiniz Televizyonu Seçiniz : ");

                        System.out.println("1.");
                        televizyon1.bilgileriGörüntüle();
                        System.out.println("2.");
                        televizyon2.bilgileriGörüntüle();
                        System.out.println("3.");
                        televizyon3.bilgileriGörüntüle();
                        String televizyonSeç;
                        televizyonSeç = scanner.nextLine();

                        if (televizyonSeç.equals("1")) {
                            System.out.print("Yapmak İstediğiniz Taksit Sayısını Giriniz : ");
                            int taksit;
                            taksit = scanner.nextInt();

                            televizyon1.taksitYap(taksit, 0);

                        } else if (televizyonSeç.equals("2")) {
                            System.out.print("Yapmak İstediğiniz Taksit Sayısını Giriniz : ");
                            int taksit;
                            taksit = scanner.nextInt();

                            televizyon2.taksitYap(taksit, 0);

                        } else if (televizyonSeç.equals("3")) {
                            System.out.print("Yapmak İstediğiniz Taksit Sayısını Giriniz : ");

                            int taksit;
                            taksit = scanner.nextInt();

                            televizyon3.taksitYap(taksit, 0);

                        }
                    }
                }

            } else if (işlem.equals("2")) {
                
                while(true) {
                String işlemler = "1.Müşteri Bilgileri\n"
                        + "2.Taksit Ödeme";
                System.out.println(işlemler);
                    System.out.println("Geriye dönmek için q ya basınız");
                System.out.println("İşlem seçiniz : ");
                String müşteriİşlem = scanner.nextLine();

                if (müşteriİşlem.equals("1")) {
                    System.out.println("Geri çımak için (-1) e basınız");

                    kasa.müşteriİsimler(kasa.müşteriler);
                    System.out.println("Müşteri Seçiniz : ");
                    int müşteriSeç = scanner.nextInt();
                    if (müşteriSeç == -1) {
                        break;
                    } 
                    else {
                        kasa.müşteriler[müşteriSeç - 1].müşteriBilgileri();
                        System.out.println("**********************************************************************");

                    }
                }
                else if(müşteriİşlem.equals("2"))    {
                    kasa.müşteriİsimler(kasa.müşteriler);
                     System.out.println("Ödeme Gerçekleştireceğiniz Müşteriyi Seçiniz : ");
                     int müşteriTaksit=scanner.nextInt();
                     System.out.println("Kaç Taksit Ödeneceğini Seçiniz : ");
                     int ödenecekTaksit=scanner.nextInt();
                     kasa.taksitÖde(müşteriTaksit-1,ödenecekTaksit);
                      kasa.müşteriler[müşteriTaksit - 1].müşteriBilgileri();
                      System.out.println("**********************************************************************");
                     
                    
                }
                else if(müşteriİşlem.contentEquals("q"))
                    break;
                }
            } else if (işlem.equals("q")) {
                System.out.println("Uygulamadan Çıkılıyor.Bizi tercih ettiğiniz için teşekkür ederiz...");
                break;

            }

        }
    }
}
