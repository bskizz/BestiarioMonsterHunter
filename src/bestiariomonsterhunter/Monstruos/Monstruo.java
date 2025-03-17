package bestiariomonsterhunter.Monstruos;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Víctor Arroyo
 */
public abstract class Monstruo {

    private String nombre, descripcion;
    private ImageIcon iconoElemento, iconoDebilidad;
    private ImageIcon imagen;
    private Elemento elemento, debilidad;

    public Elemento getDebilidad() {
        return debilidad;
    }

    public enum Elemento {
        FUEGO, HIELO, AGUA, RAYO, DRACO, NINGUNO;
    }

    public Monstruo(String nombre, String descripcion, Elemento elemento, Elemento debilidad, ImageIcon imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.elemento = elemento;
        this.debilidad = debilidad;
        this.imagen = imagen;

        asignarElemento();
        asignarDebilidad();
    }

    public Elemento getElemento() {
        return elemento;
    }

    private void asignarDebilidad() {
        if (null != debilidad) {
            switch (debilidad) {
                case FUEGO:
                    this.iconoDebilidad = new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/elementos/fuego.png"));
                    break;
                case AGUA:
                    this.iconoDebilidad = new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/elementos/agua.png"));
                    break;
                case HIELO:
                    this.iconoDebilidad = new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/elementos/hielo.png"));
                    break;
                case RAYO:
                    this.iconoDebilidad = new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/elementos/electrico.png"));
                    break;
                case DRACO:
                    this.iconoDebilidad = new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/elementos/dragon.png"));
                    break;
                case NINGUNO:
                    this.iconoDebilidad = new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/elementos/fisico.png"));
                    break;
                default:
                    break;
            }
        }
    }

    private void asignarElemento() {
        if (null != elemento) {
            switch (elemento) {
                case FUEGO:
                    this.iconoElemento = new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/elementos/fuego.png"));
                    break;
                case AGUA:
                    this.iconoElemento = new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/elementos/agua.png"));
                    break;
                case HIELO:
                    this.iconoElemento = new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/elementos/hielo.png"));
                    break;
                case RAYO:
                    this.iconoElemento = new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/elementos/electrico.png"));
                    break;
                case DRACO:
                    this.iconoElemento = new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/elementos/dragon.png"));
                    break;
                case NINGUNO:
                    this.iconoElemento = new ImageIcon(getClass().getResource("/bestiariomonsterhunter/img/elementos/fisico.png"));
                    break;
                default:
                    break;
            }
        }
    }

    //al agregar un mouse linsener para detectar clics en las filas
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ImageIcon getIconoElemento() {
        return iconoElemento;
    }

    public ImageIcon getIconoDebilidad() {
        return iconoDebilidad;
    }

    public ImageIcon getImagen() {
        return imagen;
    }
}
