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
 * 
 * @param Estante1 Posición de los productos con respecto a la imagen del expendedor
 * @param Estante2 Posición de los productos con respecto a la imagen del expendedor
 */


public class PanelProducto extends JPanel{
    private String nombrearchivo;
    private int posX = 0;
    private int posY = 0;


    public static final int Estante1 = 135;
    public static final int Estante2 = 300;
    
    /**
     * Constructor del PanelProducto: les da un valor a las variables necesarias y quita el layout de este agregando un puntero nulo, ya que no es utilizado.
     */
    public PanelProducto(int cualProducto, String nombrearchivo, int posX, int posY){
        super();
        
        this.posX = posX;
        this.posY = posY;
        this.nombrearchivo = nombrearchivo;
        this.setLayout(null);
    }

    
    /**
     * El método paintComponent "pinta" el producto en la coordenada deseada para que se vea de forma correcta dentro del panel principal (sobre el expendedor).
     * Coloca un número máximo de productos por cada tipo de estos, de acuerdo al espacio que hay en pantalla para mostrarlos.
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setPreferredSize(new java.awt.Dimension(100, 100));
        
        ImageIcon imagenproducto = new ImageIcon("src\\main\\java\\imagenes\\"+nombrearchivo);
        ImageIcon compra;
        // JLabel foto = new JLabel(imagenproducto);
        

        if(Expendedor.intCompra == 1){
            Expendedor.intCompra = 0;
            compra = new ImageIcon("src\\main\\java\\imagenes\\cocacola.png");
            compra.paintIcon(this ,g ,250,650);
        }
        else if(Expendedor.intCompra == 2){
            Expendedor.intCompra = 0;
            compra = new ImageIcon("src\\main\\java\\imagenes\\fanta.png");
            compra.paintIcon(this ,g ,250,650);
        }
        else if(Expendedor.intCompra == 3){
            Expendedor.intCompra = 0;
            compra = new ImageIcon("src\\main\\java\\imagenes\\sprite.png");
            compra.paintIcon(this ,g ,250,650);
        }
        else if(Expendedor.intCompra == 4){
            Expendedor.intCompra = 0;
            compra = new ImageIcon("src\\main\\java\\imagenes\\snickers.png");
            compra.paintIcon(this ,g ,250,650);
        }
        else if(Expendedor.intCompra == 5){
            Expendedor.intCompra = 0;
            compra = new ImageIcon("src\\main\\java\\imagenes\\super8.png");
            compra.paintIcon(this ,g ,250,650);
        }
        
        if (nombrearchivo == "cocacola.png"){
            for(int i=0;i<Expendedor.coca.size();i++){
                if(i<5){
                    imagenproducto.paintIcon(this ,g , posX*140-i*15, posY);
                }
            }  
        } else if (nombrearchivo == "fanta.png"){
            for(int i=0;i<Expendedor.fanta.size();i++){
                if(i<5){
                    imagenproducto.paintIcon(this ,g , posX*140-i*15, posY);
                }
            }  
        } else if (nombrearchivo == "sprite.png"){
            for(int i=0;i<Expendedor.sprite.size();i++){
                if(i<5){
                    imagenproducto.paintIcon(this ,g , posX*140-i*15, posY);
                }
            }  
        } else if (nombrearchivo == "super8.png"){
            for(int i=0;i<Expendedor.super8.size();i++){
                if(i<5){
                    imagenproducto.paintIcon(this ,g , posX*140-i*15, posY);
                }
            }  
        } else if (nombrearchivo == "snickers.png"){
            for(int i=0;i<Expendedor.snickers.size();i++){
                if(i<5){
                    imagenproducto.paintIcon(this ,g , posX*140-i*15, posY);
                }
            }  
        }

    }
}
