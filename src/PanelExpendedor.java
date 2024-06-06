import java.awt.*;
import javax.swing.*;

public class PanelExpendedor extends JPanel {
    private GroupLayout panelExpendedorLayout;
    private JLabel labelExpendedor;
    private ImageIcon expendedorIcon;
    private PanelProducto cocacola;
    private PanelProducto fanta;
    private PanelProducto sprite;
    private PanelProducto super8;
    private PanelProducto snickers;

    public PanelExpendedor() {
        super();
        initComponents();
    }

    private void initComponents() {
        this.setBackground(new java.awt.Color(247, 153, 180));
        this.setPreferredSize(new java.awt.Dimension(600, 550));
        panelExpendedorLayout = new GroupLayout(this);
        this.setLayout(panelExpendedorLayout);

        expendedorIcon = new ImageIcon("src\\main\\java\\imagenes\\expendedor.png");


        cocacola = new PanelProducto(DatosProducto.COCACOLA.getCualProducto(), "cocacola.png", 1, PanelProducto.Estante1);
        fanta = new PanelProducto(DatosProducto.FANTA.getCualProducto(), "fanta.png", 2, PanelProducto.Estante1);
        sprite = new PanelProducto(DatosProducto.SPRITE.getCualProducto(), "sprite.png", 3, PanelProducto.Estante1);
        super8 = new PanelProducto(DatosProducto.SUPER8.getCualProducto(), "super8.png", 1, PanelProducto.Estante2);
        snickers = new PanelProducto(DatosProducto.SNICKERS.getCualProducto(), "snickers.png", 2 , PanelProducto.Estante2);

        
    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        expendedorIcon.paintIcon(this, g, 0, 0);
        cocacola.paintComponent(g);
        fanta.paintComponent(g);
        sprite.paintComponent(g);
        super8.paintComponent(g);
        snickers.paintComponent(g);
    }
}
