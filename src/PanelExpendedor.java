import java.awt.*;
import javax.swing.*;

public class PanelExpendedor extends JPanel {
    GroupLayout panelExpendedorLayout;
    JLabel labelExpendedor;
    //public static final DatosProducto datosProducto;

    public PanelExpendedor() {
        super();
        initCompoents();    
    }

    private void initCompoents() {

        this.setBackground(new java.awt.Color(247, 153, 180));
        this.setPreferredSize(new java.awt.Dimension(600, 550));
        panelExpendedorLayout = new GroupLayout(this);
        this.setLayout(panelExpendedorLayout);

    }

    @Override
    public void paintComponent(Graphics g){
        g.drawString("Panel Expendedor", 10, 20);

        
        super.paintComponent(g);
        ImageIcon i = new ImageIcon("src\\main\\java\\imagenes\\expendedor.png");
        i.paintIcon(this,g,0,0);
        


        PanelProducto super8 = new PanelProducto(DatosProducto.SUPER8.getCualProducto(), "super8.png", 1, PanelProducto.Estante2);
        PanelProducto snickers = new PanelProducto(DatosProducto.SNICKERS.getCualProducto(), "snickers.png", 2 , PanelProducto.Estante2);
        PanelProducto cocacola = new PanelProducto(DatosProducto.COCACOLA.getCualProducto(), "cocacola.png", 1, PanelProducto.Estante1);
        PanelProducto fanta = new PanelProducto(DatosProducto.FANTA.getCualProducto(), "fanta.png", 2, PanelProducto.Estante1);
        PanelProducto sprite = new PanelProducto(DatosProducto.SPRITE.getCualProducto(), "sprite.png", 3, PanelProducto.Estante1);
        
        super8.paintComponent(g);
        snickers.paintComponent(g);
        cocacola.paintComponent(g);
        sprite.paintComponent(g);
        fanta.paintComponent(g);

        

    }
}
