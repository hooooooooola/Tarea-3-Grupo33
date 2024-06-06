<<<<<<< HEAD


import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

public class PanelProducto extends JPanel implements MouseListener {
    private String nombrearchivo;
    private int cualProducto = 0;
    
    public PanelProducto(int cualProducto, String nombrearchivo){
        super();
        
        
        this.nombrearchivo = nombrearchivo;
        this.cualProducto = cualProducto;
        this.setLayout(null);
        
        this.addMouseListener(this);
    }
=======
import javax.swing.*;
import java.awt.*;
public class PanelProducto extends JPanel{
    private String nombrearchivo;
    private int posX = 0;
    private int posY = 0;

    //Posición de los productos con respecto a la imagen del expendedor
    public static final int Estante1 = 135;
    public static final int Estante2 = 300;
    
    public PanelProducto(int cualProducto, String nombrearchivo, int posX, int posY){
        super();
        
        this.posX = posX;
        this.posY = posY;
        this.nombrearchivo = nombrearchivo;
        this.setLayout(null);
    }

>>>>>>> pruebaInterfaz
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
<<<<<<< HEAD
        this.setBackground(new java.awt.Color(255, 0, 0));
        this.setPreferredSize(new java.awt.Dimension(100, 100));
        
        ImageIcon imagenproducto = new ImageIcon("src\\main\\java\\imagenes\\"+nombrearchivo);
        //ImageIcon imagenproducto = new ImageIcon("src\\main\\java\\imagenes\\cuadradoverde.png");
        imagenproducto.paintIcon(this,g,cualProducto*100,100);
        
    }
    
    





    public void mouseClicked(MouseEvent me) {;} // es llamado cuando el press y el release ocurren en el mismo pixel
    public void mousePressed(MouseEvent me) {
        System.out.println("producto presionado"); //se imprimirá press cada vez que se oprima un botón del mouse dentro del área
    }
    public void mouseReleased(MouseEvent me) {;} // el llamado al soltar el botón
    public void mouseEntered(MouseEvent me) {;}  // cursor entra al área
    public void mouseExited(MouseEvent me) {;}   // cursor sale del área 
=======
        this.setPreferredSize(new java.awt.Dimension(100, 100));
        
        ImageIcon imagenproducto = new ImageIcon("src\\main\\java\\imagenes\\"+nombrearchivo);
        ImageIcon compra;
        // JLabel foto = new JLabel(imagenproducto);
        

        if(Expendedor.intCompra == 1){
            Expendedor.intCompra = 0;
            compra = new ImageIcon("src\\main\\java\\imagenes\\cocacola.png");
            compra.paintIcon(this ,g ,50,650);
        }
        else if(Expendedor.intCompra == 2){
            Expendedor.intCompra = 0;
            compra = new ImageIcon("src\\main\\java\\imagenes\\fanta.png");
            compra.paintIcon(this ,g ,50,650);
        }
        else if(Expendedor.intCompra == 3){
            Expendedor.intCompra = 0;
            compra = new ImageIcon("src\\main\\java\\imagenes\\sprite.png");
            compra.paintIcon(this ,g ,50,650);
        }
        else if(Expendedor.intCompra == 4){
            Expendedor.intCompra = 0;
            compra = new ImageIcon("src\\main\\java\\imagenes\\snickers.png");
            compra.paintIcon(this ,g ,50,650);
        }
        else if(Expendedor.intCompra == 5){
            Expendedor.intCompra = 0;
            compra = new ImageIcon("src\\main\\java\\imagenes\\super8.png");
            compra.paintIcon(this ,g ,50,650);
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
>>>>>>> pruebaInterfaz
}
