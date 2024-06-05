

import javax.swing.*;
import java.awt.*;
public class PanelProducto extends JPanel{
    private String nombrearchivo;
    private int cualProducto = 0;

    //Posición de los productos con respecto a la imagen del expendedor
    public static final int ALINEACION_Y = 135;
    
    public PanelProducto(int cualProducto, String nombrearchivo){
        super();
        
        
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
            if(i<4){
                imagenproducto.paintIcon(this,g,cualProducto*100,ALINEACION_Y-i*20);
                //this.add(foto);
                //foto.paintImmediately(cualProducto*100,ALINEACION_Y-i*20,100,100);
            }
        }
        
        
    }
    
    






}
