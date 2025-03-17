package bestiariomonsterhunter.Monstruos;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Víctor Arroyo
 */
public class Acuatico extends Monstruo {

    boolean isPuedeFueraDelAgua; //Algunos monstruos nadadores pueden combatir fuera del agua

    public Acuatico(boolean isPuedeFueraDelAgua, String nombre, String descripción, Elemento elemento, Elemento debilidad, ImageIcon imagen) {
        super(nombre, descripción, elemento, debilidad, imagen);
        this.isPuedeFueraDelAgua = isPuedeFueraDelAgua;
    }
}
