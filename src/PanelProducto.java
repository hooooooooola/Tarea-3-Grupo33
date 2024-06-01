

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
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
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
}
