

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
        //ImageIcon imagenproducto = new ImageIcon("src\\main\\java\\imagenes\\cuadradoverde.png");
        imagenproducto.paintIcon(this,g,cualProducto*100,ALINEACION_Y);
        
    }
    
    






}
