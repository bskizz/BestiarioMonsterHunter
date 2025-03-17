package bestiariomonsterhunter.Monstruos;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Víctor Arroyo
 */
public class Volador extends Monstruo {

    int numAlas;

    public Volador(int numAlas, String nombre, String descripción, Elemento elemento, Elemento debilidad, ImageIcon imagen) {
        super(nombre, descripción, elemento, debilidad, imagen);
        this.numAlas = numAlas;
    }
}
