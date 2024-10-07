
package nezet;

import javax.swing.JOptionPane;
import modell.AutoModell;


public class AutoNezet {

    public AutoNezet(AutoModell modell, AutoNezet nezet) {
        
    }
     public void megjelenit(String uzenet) {
        JOptionPane.showMessageDialog(null, uzenet);
    }
    
    
    public int bekeres() {
        String v = JOptionPane.showInputDialog( "Adja meg az autót!");
        
        return Integer.parseInt(v) -1;
    }
    
}
