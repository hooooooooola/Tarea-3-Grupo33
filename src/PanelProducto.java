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

    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setPreferredSize(new java.awt.Dimension(100, 100));
        
        ImageIcon imagenproducto = new ImageIcon("src\\main\\java\\imagenes\\"+nombrearchivo);
        // JLabel foto = new JLabel(imagenproducto);
        
                

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
