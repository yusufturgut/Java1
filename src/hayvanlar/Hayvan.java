
package hayvanlar;


public class Hayvan {
    protected String hayvanAdi;
    protected String agirlik;
    protected String tur;
    protected String yasamSuresi;
    
    public Hayvan(){
        hayvanAdi="";
        agirlik="";
        tur="";
    }

  
    public String getHayvanAdi() {
        return hayvanAdi;
    }

   
    public void setHayvanAdi(String hayvanAdi) {
        this.hayvanAdi = hayvanAdi;
    }

    
    public String getAgirlik() {
        return agirlik;
    }

    
    public void setAgirlik(String agirlik) {
        this.agirlik = agirlik;
    }

    
    public String getTur() {
        return tur;
    }

    
    public void setTur(String tur) {
        this.tur = tur;
    }
    
   
    public String getYasamSuresi() {
        return yasamSuresi;
    }

    
    public void setYasamSuresi(String yasamSuresi) {
        this.yasamSuresi = yasamSuresi;
    }
    
    
     @Override
    protected void finalize() throws Throwable{
        super.finalize();
    }
    
}
