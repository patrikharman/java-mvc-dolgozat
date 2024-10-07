
package modell;

import main.Auto;



public class AutoModell {
    private String rendszam;
    private String szin;
    private boolean extra;
    

    public AutoModell() {
        
    }

    public String getRendszam() {
        return rendszam;
    }

    public String getSzin() {
        return szin;
    }
    
    
    public AutoModell(String rendszam,String szin){
        this("LOF-ABC","fekete",true);
    }
    
    public AutoModell(String rendszam, String szin, boolean extra) {
        this.rendszam = rendszam;
        this.szin = szin;
        this.extra = extra;
    }
    public boolean isExtra(){
        return extra;
    }
    public boolean getExtra() {
        return extra;
    }

    public void setExtra(boolean extra) {
        this.extra = extra;
    }
    
    
}
