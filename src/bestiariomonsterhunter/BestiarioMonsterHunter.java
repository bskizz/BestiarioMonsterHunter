package bestiariomonsterhunter;

import javax.swing.SwingUtilities;

/**
 *
 * @author Víctor Arroyo
 */
public class BestiarioMonsterHunter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaPrincipal ventana = new VentanaPrincipal();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
        });
    }
}
