import java.awt.*;
import javax.swing.*;

/**
 * El panel expendedor muestra gráficamente al expendedor y permite al usuario seleccionar los productos que existen, mostrando también su disponibilidad.
 * 
 * @author Darío Sepúlveda
 * @since 29 de mayo de 2024
 * 
 * @param panelExpendedorLayout Disposición personalizada para el panel, cada componente teniendo su distribución horizontal y vertical.
 */

public class PanelExpendedor extends JPanel {
    private GroupLayout panelExpendedorLayout;
    private JLabel labelExpendedor;
    private ImageIcon expendedorIcon;
    private PanelProducto cocacola;
    private PanelProducto fanta;
    private PanelProducto sprite;
    private PanelProducto super8;
    private PanelProducto snickers;

    /**
     * Inicializa los componentes del panel.
     */
    public PanelExpendedor() {
        super();
        initComponents();
    }

    private void initComponents() {
        this.setBackground(new java.awt.Color(247, 153, 180));
        this.setPreferredSize(new java.awt.Dimension(600, 550));
        panelExpendedorLayout = new GroupLayout(this);
        this.setLayout(panelExpendedorLayout);

        /**
         * Deja el fondo del panel a su representación gráfica.
         */
        expendedorIcon = new ImageIcon("src\\main\\java\\imagenes\\expendedor.png");

        /**
         * Inicializa cada producto con su iamgen correspondiente y las pinta.
         */
        cocacola = new PanelProducto(DatosProducto.COCACOLA.getCualProducto(), "cocacola.png", 1, PanelProducto.Estante1);
        fanta = new PanelProducto(DatosProducto.FANTA.getCualProducto(), "fanta.png", 2, PanelProducto.Estante1);
        sprite = new PanelProducto(DatosProducto.SPRITE.getCualProducto(), "sprite.png", 3, PanelProducto.Estante1);
        super8 = new PanelProducto(DatosProducto.SUPER8.getCualProducto(), "super8.png", 1, PanelProducto.Estante2);
        snickers = new PanelProducto(DatosProducto.SNICKERS.getCualProducto(), "snickers.png", 2 , PanelProducto.Estante2);

        
    }


    /**
     * El método paintComponent "pinta" cada producto con su imagen dentro del panel expendedor. para esto crea un PanelProducto por cada uno.
     * @see PanelProducto
     */
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
