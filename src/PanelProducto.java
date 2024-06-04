

import javax.swing.*;
import java.awt.*;
public class PanelProducto extends JPanel{
    private String nombrearchivo;
    private int cualProducto = 0;
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
        this.cualProducto = cualProducto;
        this.setLayout(null);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(new java.awt.Color(255, 0, 0));
        this.setPreferredSize(new java.awt.Dimension(100, 100));
        
        ImageIcon imagenproducto = new ImageIcon("src\\main\\java\\imagenes\\"+nombrearchivo);
        //JLabel foto = new JLabel(imagenproducto);


        for(int i=0;i<PanelPrincipal.CANTIDAD_DE_PRODUCTOS;i++){
            if(i<5){
                imagenproducto.paintIcon(this ,g , posX*140-i*15, posY);
                //this.add(foto);
                //foto.paintImmediately(cualProducto*100,ALINEACION_Y-i*20,100,100);
            }
        }
        
        
    }
    
    






}
