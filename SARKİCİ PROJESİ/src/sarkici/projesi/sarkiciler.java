
package sarkici.projesi;

import java.util.ArrayList;

public class sarkiciler {
    
    private ArrayList<String> sarkici_Listesi= new ArrayList<String>();
    
    public void sarkicileri_bastir(){
        System.out.println("sarkici listesinde "+sarkici_Listesi.size()+" kadar sarkici var");
        
        for (int i = 0; i < sarkici_Listesi.size(); i++) {
            System.out.println((i+1)+" sarkici :"+sarkici_Listesi.get(i));
            
        }
    }
    public void sarkici_Ekle(String isim){
        sarkici_Listesi.add(isim);
        
        System.out.println("sarkici listesi guncellendi...");
    }
    public void sarkici_guncelle(String yeni_Isim,int pozisyon){
        sarkici_Listesi.set(pozisyon, yeni_Isim);
        System.out.println("sarkici listesi guncellendi...");
    }
    public void sarkici_sil(int pozisyon){
        String isim=sarkici_Listesi.get(pozisyon);
        sarkici_Listesi.remove(pozisyon);
        System.out.println(isim+" isimli sarkici listeden silindi...");
    }
    public void sarkici_ara(String sarkici_Ismi){
        int pozisyon = sarkici_Listesi.indexOf(sarkici_Ismi);
        if (pozisyon >=0) {
            System.out.println("sarkici bulundu.");
            System.out.println(sarkici_Ismi+" isimli sarkici "+(pozisyon+1)+" pozisyonda");
            
        }else{
            System.out.println("sarkici bulunamadı...");
        }
    }
    
}
