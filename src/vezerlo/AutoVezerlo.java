
package vezerlo;

import javax.swing.JOptionPane;
import modell.AutoModell;
import nezet.AutoNezet;


public class AutoVezerlo {
    private AutoModell modell;
    private AutoNezet nezet;
    
    public AutoVezerlo(AutoModell modell,AutoNezet nezet){
        this.modell = modell;
        this.nezet = nezet;
        
    }
    
    
    public int bekeres() {
        String v = JOptionPane.showInputDialog( "Adja meg az autóját!");
        
        return Integer.parseInt(v) -1;
    }
    
    
}
