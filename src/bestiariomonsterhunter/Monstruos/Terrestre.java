
package bestiariomonsterhunter.Monstruos;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Víctor Arroyo
 */
public class Terrestre extends Monstruo {
    int numPatas;

    public Terrestre(int numPatas, String nombre, String descripción, Elemento elemento, Elemento debilidad, ImageIcon imagen) {
        super(nombre, descripción, elemento, debilidad, imagen);
        this.numPatas = numPatas;
    }
}
