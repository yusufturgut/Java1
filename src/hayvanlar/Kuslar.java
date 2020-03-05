
package hayvanlar;


public class Kuslar extends Hayvan{
    
    public static String uremeSekli;
    private String beslenmeSekli;
    private String aile;
    private String maxYavru;


static {
    uremeSekli="Kuslar yumurtlayarak uremelerini gerceklestiriler.";
    
}

    
    public static String getUremeSekli() {
        return uremeSekli;
    }

    
    public String getBeslenmeSekli() {
        return beslenmeSekli;
    }

    
    public void setBeslenmeSekli(String beslenmeSekli) {
        this.beslenmeSekli = beslenmeSekli;
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