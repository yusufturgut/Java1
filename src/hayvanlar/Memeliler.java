
package hayvanlar;


public class Memeliler extends Hayvan{
    
    public static String uremeSekli;
    private String beslenmeSekli;
    private String aile;
    private String maxYavru;
   
    
   static {
        uremeSekli =("Memeliler dogum yaparak nesillerinin devamini saglarlar.");
    }
    
    public Memeliler(){
        super();
        beslenmeSekli="";
        aile="";
        maxYavru="";
        
    }

    
    public String getBeslenmeSekli() {
        return beslenmeSekli;
    }

    
    public void setBeslenmeSekli(String beslenmeSekli) {
        this.beslenmeSekli = beslenmeSekli;
    }

    
    public static String getUremeSekli() {
        return uremeSekli;
    }

    

   
    public String getAile() {
        return aile;
    }

    
    public void setAile(String aile) {
        this.aile = aile;
    }

    
    public String getMaxYavru() {
        return maxYavru;
    }

    
    public void setMaxYavru(String maxYavru) {
        this.maxYavru = maxYavru;
    }
    
    @Override
    protected void finalize() throws Throwable{
        super.finalize();
    }
}