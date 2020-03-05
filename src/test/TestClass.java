
package test;

import hayvanlar.Baliklar;
import hayvanlar.Kuslar;
import hayvanlar.Memeliler;


public class TestClass {
    public static void main(String[] args) {
        
        Memeliler aslan = new Memeliler();
        
        aslan.setHayvanAdi("Hayvan Adi : Aslan");
        aslan.setAgirlik("Ortalama Agirlik: 240 KG");
        aslan.setTur("Tur: Memeli");
        aslan.setYasamSuresi("Ortalama Yasam Suresi: 12 Sene");
        
        aslan.setBeslenmeSekli("Beslenme Sekli: Etcil");
        aslan.setAile("Aile : Felidae (Kedigiller)");
        aslan.setMaxYavru("Ortalama Yavru Sayisi: 4");
        
        
        
        
        System.out.println(aslan.getHayvanAdi());
        System.out.println(aslan.getAgirlik());
        System.out.println(aslan.getTur()); 
        System.out.println(aslan.getYasamSuresi());
        
                System.out.println(Memeliler.getUremeSekli());
        
        System.out.println(aslan.getBeslenmeSekli());
        System.out.println(aslan.getAile());
        System.out.println(aslan.getMaxYavru());
        
        System.out.println("---------------------------------\n");
        
   //----------------------------------------------
   
       Memeliler Ayi = new Memeliler();
        
        Ayi.setHayvanAdi("Hayvan Adi: Ayi");
        Ayi.setAgirlik("Agirlik: 400 KG");
        Ayi.setTur("Tur: Memeli");
        Ayi.setYasamSuresi("Ortalama Yasam Suresi: 30 Sene");
        
        Ayi.setBeslenmeSekli("Beslenme Sekli: Hepcil");
        Ayi.setAile("Aile: Ursidae (Ayigiller)");
        Ayi.setMaxYavru("Ortalama Yavru Sayisi: 3");
        
        
        
        System.out.println(Ayi.getHayvanAdi());
        System.out.println(Ayi.getAgirlik());
        System.out.println(Ayi.getTur());
        System.out.println(Ayi.getYasamSuresi());
        
                System.out.println(Memeliler.getUremeSekli());
        
        System.out.println(Ayi.getBeslenmeSekli());
        System.out.println(Ayi.getAile());
        System.out.println(Ayi.getMaxYavru());
        
        System.out.println("---------------------------------\n");
   //------------------------------
   
   
    Memeliler Zurafa = new Memeliler();
        
        Zurafa.setHayvanAdi("Hayvan Adi: Zurafa");
        Zurafa.setAgirlik("Agirlik: 1 TON");
        Zurafa.setTur("Tur: Memeli");
        Zurafa.setYasamSuresi("Yasam Suresi: 27 Yil");
        
        Zurafa.setBeslenmeSekli("Beslenme Sekli: Otcul");
        Zurafa.setAile("Aile : Giraffidae (Zurafagiller)");
        Zurafa.setMaxYavru("Ortalama Yavru Sayisi: 3");
        
        
        System.out.println(Zurafa.getHayvanAdi());
        System.out.println(Zurafa.getAgirlik());
        System.out.println(Zurafa.getTur());
        System.out.println(Zurafa.getYasamSuresi());
        
                System.out.println(Memeliler.getUremeSekli());
        
        System.out.println(Zurafa.getBeslenmeSekli());
        System.out.println(Zurafa.getAile());
        System.out.println(Zurafa.getMaxYavru());
        
        System.out.println("---------------------------------\n");
   //------------------------------
   
   Baliklar AynaliSazan = new Baliklar();
        
        AynaliSazan.setHayvanAdi("Hayvan Adi: Aynali Sazan");
        AynaliSazan.setAgirlik("Agirlik: 15 KG");
        AynaliSazan.setTur("Tur: Balik");
        AynaliSazan.setYasamSuresi("Yasam Suresi: 35 Yil");
        
        AynaliSazan.setBeslenmeSekli("Beslenme Sekli: Hepcil");
        AynaliSazan.setAile("Aile: Cyprinidae (Sazangiller)");
        AynaliSazan.setYavruSayisi("Yavru Sayisi: 100");
        
       
        System.out.println(AynaliSazan.getHayvanAdi());
        System.out.println(AynaliSazan.getAgirlik());
        System.out.println(AynaliSazan.getTur());
        System.out.println(AynaliSazan.getYasamSuresi());
        
                System.out.println(Baliklar.getUremeSekli());
        
        System.out.println(AynaliSazan.getBeslenmeSekli());
        System.out.println(AynaliSazan.getAile());
        System.out.println(AynaliSazan.getYavruSayisi());
        
         System.out.println("---------------------------------\n");
   //----------------------------------------
   
   Kuslar DeveKusu = new Kuslar();
        
        DeveKusu.setHayvanAdi("Hayvan Adi: Deve Kusu");
        DeveKusu.setAgirlik("Agirlik: 100 KG");
        DeveKusu.setTur("Tur: Kus");
        DeveKusu.setYasamSuresi("Yasam Suresi: 40 Yil");
        
        DeveKusu.setBeslenmeSekli("Beslenme Sekli: Hepcil");
        DeveKusu.setAile("Aile: Struthionidae (Deve Kusugiller)");
        DeveKusu.setMaxYavru("Yavru Sayisi: 5");
        
        
        System.out.println(DeveKusu.getHayvanAdi());
        System.out.println(DeveKusu.getAgirlik());
        System.out.println(DeveKusu.getTur());
        System.out.println(DeveKusu.getYasamSuresi());
        
                        System.out.println(Kuslar.getUremeSekli());

        System.out.println(DeveKusu.getBeslenmeSekli());
        System.out.println(DeveKusu.getAile());
        System.out.println(DeveKusu.getMaxYavru());
        
        System.out.println("---------------------------------\n");
  //-----------------------------------
  
      Kuslar KayaKartali = new Kuslar();
        
        KayaKartali.setHayvanAdi("Hayvan Adi : Kaya Kartali");
        KayaKartali.setAgirlik("Agirlik: 4 KG");
        KayaKartali.setTur("Tur: Kus");
        KayaKartali.setYasamSuresi("Yasam Suresi: 44 Yil");
        
        KayaKartali.setBeslenmeSekli("Beslenme Sekli: Etcil");
        KayaKartali.setAile("Aile : Accipitridae (Atmacagiller)");
        KayaKartali.setMaxYavru("Yavru Sayisi: 5");
        
        
        System.out.println(KayaKartali.getHayvanAdi());
        System.out.println(KayaKartali.getAgirlik());
        System.out.println(KayaKartali.getTur());
        System.out.println(KayaKartali.getYasamSuresi());
        
                System.out.println(Kuslar.getUremeSekli());

        
        System.out.println(KayaKartali.getBeslenmeSekli());
        System.out.println(KayaKartali.getAile());
        System.out.println(KayaKartali.getMaxYavru());
        
        System.out.println("---------------------------------\n");
    //---------------------------------------------
    
    Kuslar Penguen = new Kuslar();
        
        Penguen.setHayvanAdi("Hayvan Adi: Penguen");
        Penguen.setAgirlik("Agirlik : 35 KG");
        Penguen.setTur("Tur: Kus");
        Penguen.setYasamSuresi("Yasam Suresi: 8 Yil");
        
        Penguen.setBeslenmeSekli("Beslenme Sekli: Etcil");
        Penguen.setAile("Aile : Penguengiller (Spheniscidae)");
        Penguen.setMaxYavru("Yavru Sayisi: 10");
        
        
        System.out.println(Penguen.getHayvanAdi());
        System.out.println(Penguen.getAgirlik());
        System.out.println(Penguen.getTur());
        System.out.println(Penguen.getYasamSuresi());
        
                System.out.println(Kuslar.getUremeSekli());

        
        System.out.println(Penguen.getBeslenmeSekli());
        System.out.println(Penguen.getAile());
        System.out.println(Penguen.getMaxYavru());
        
        System.out.println("---------------------------------\n");
   //--------------------------
  
        
        
        
        
    }
    
}
