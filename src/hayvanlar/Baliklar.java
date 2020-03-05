package hayvanlar;


public class Baliklar extends Hayvan{
    
    public static String uremeSekli;
    private String beslenmeSekli;
    private String aile;
    private String YavruSayisi;
    
    
    static{
        uremeSekli=("Baliklar cok sayida yumurta birakarak uremelerini gerceklestirirler.");
    }
    
    public Baliklar(){
        super();    
        beslenmeSekli="";
        aile="";
        YavruSayisi="";
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

    
    public String getYavruSayisi() {
        return YavruSayisi;
    }

    
    public void setYavruSayisi(String YavruSayisi) {
        this.YavruSayisi = YavruSayisi;
    }
    
    
    @Override
    protected void finalize() throws Throwable{
        super.finalize();}
    
    
}

