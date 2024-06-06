import javax.swing.*;
import java.awt.*;

/**
 * Panel que nos permite "pintar" las imágenes de cada producto en pantalla.
 * 
 * @author Darío Sepúlveda
 * @since 01 de junio de 2024
 * 
 * @param nombreArchivo el nombre que tiene el archivo que contiene la imagen del producto.
 * @param cualProducto el producto que se va a pintar en el expendedor.
 * @param ALINEACION_Y Número estático y fijo que representa la posición de los productos con respecto a la imagen del expendedor.
 */

public class PanelProducto extends JPanel{
    private String nombreArchivo;
    private int cualProducto = 0;


    public static final int ALINEACION_Y = 135;
    
    /**
     * Constructor del PanelProducto: les da un valor a las variables necesarias y quita el layout de este agregando un puntero nulo, ya que no es utilizado.
     */
    public PanelProducto(int cualProducto, String nombreArchivo){
        super();
        
        this.nombreArchivo = nombreArchivo;
        this.cualProducto = cualProducto;
        this.setLayout(null);
    }
    
    /**
     * El método paintComponent "pinta" el producto en la coordenada deseada para que se vea de forma correcta dentro del panel principal (sobre el expendedor).
     * Coloca un número máximo de productos por cada tipo de estos, de acuerdo al espacio que hay en pantalla para mostrarlos.
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(new java.awt.Color(255, 0, 0));
        this.setPreferredSize(new java.awt.Dimension(100, 100));
        
        ImageIcon imagenproducto = new ImageIcon("src\\main\\java\\imagenes\\"+nombreArchivo);
        for(int i=0;i<PanelPrincipal.CANTIDAD_DE_PRODUCTOS;i++){
            if(i<4){
                imagenproducto.paintIcon(this,g,cualProducto*100,ALINEACION_Y-i*20);
            }
        }
        
        
    }
    
    






}
