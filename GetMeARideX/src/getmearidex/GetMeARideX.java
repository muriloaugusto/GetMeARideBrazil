/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package getmearidex;

import ui.CadastroTaxista;
import ui.Principal;

/**
 *
 * @author SYSTEM
 */
public class GetMeARideX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
}
