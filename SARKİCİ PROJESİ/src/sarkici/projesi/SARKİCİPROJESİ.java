
package sarkici.projesi;

import java.util.Scanner;


public class SARKİCİPROJESİ {

    private static sarkiciler sarkiciler= new sarkiciler();
    private static Scanner input=new Scanner(System.in);
    public static void islemleri_Bastir(){
        System.out.println("\t 0-islemleri goruntule");
        System.out.println("\t 1-sarkicileri goruntule");
        System.out.println("\t 2-sarkici ekle");
        System.out.println("\t 3-sarkici sil");
        System.out.println("\t 4-sarkici ara");
        System.out.println("\t 5-sarkici guncelle");
        System.out.println("\t 6-uygulamadan cik");

    }
    public static void sarkici_goruntule(){
        
        sarkiciler.sarkicileri_bastir();
    }
    public static void sarkici_ekle(){
        
        System.out.println("eklemek istediginiz ismi giriniz :");
        String isim=input.nextLine();
        sarkiciler.sarkici_Ekle(isim);
    }
    public static void sarkici_guncelle(){
        System.out.println("guncellemek istediginiz pozisyon(1,2,3)");
        int pozisyon=input.nextInt();
        input.nextLine();
        String yeni_Isim=input.nextLine();
        sarkiciler.sarkici_guncelle(yeni_Isim, pozisyon-1);
    }
    public static void sil(){
        System.out.println("silmek istediginiz pozisyon(1,2,3..)");
        int pozisyon=input.nextInt();
        sarkiciler.sarkici_sil(pozisyon);
    }
    public static void ara(){
        System.out.println("aramak istediginiz sarkici :");
        String isim=input.nextLine();
        sarkiciler.sarkici_ara(isim);
    }
    public static void main(String[] args) {
        
        System.out.println("\t sarkici uygulamasina hos geldiniz!");
         
        islemleri_Bastir();
        
        boolean cikis= false;
        int islem;
        while(!cikis){
            System.out.println("bir islem seciniz:");
            islem=input.nextInt();
            input.nextLine();
            switch(islem){
                case 0:
                    islemleri_Bastir();
                    break;
                case 1:
                    sarkici_goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sil();
                    break;
                case 4:
                    sarkici_guncelle();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis=true;
                    System.out.println("uygulamadan cıkılıyor...");
                    break;
            }
        }
        
    }
    
}
