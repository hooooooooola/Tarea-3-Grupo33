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
    
    GroupLayout panelExpendedorLayout;

    /**
     * Inicializa los componentes del panel.
     */
    public PanelExpendedor() {
        super();
        initCompoents();    
    }

    /**
     * Método que inicializa cada componente del panel, la disposición en pantalla de estos, y sus características propias.
     */
    private void initCompoents() {

        this.setBackground(new java.awt.Color(247, 153, 180));
        this.setPreferredSize(new java.awt.Dimension(600, 345));
        panelExpendedorLayout = new GroupLayout(this);
        this.setLayout(panelExpendedorLayout);

    }

    /**
     * El método paintComponent "pinta" cada producto con su imagen dentro del panel expendedor. para esto crea un PanelProducto por cada uno.
     * @see PanelProducto
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        /**
         * Deja el fondo del panel a su representación gráfica.
         */
        ImageIcon i = new ImageIcon("src\\main\\java\\imagenes\\expendedor.png");
        i.paintIcon(this,g,0,0);
        
        /**
         * Inicializa cada producto con su iamgen correspondiente y las pinta.
         */
        PanelProducto super8 = new PanelProducto(DatosProducto.SUPER8.getCualProducto(), "super8.png");
        PanelProducto snickers = new PanelProducto(DatosProducto.SNICKERS.getCualProducto(), "snickers.png");
        PanelProducto cocacola = new PanelProducto(DatosProducto.COCACOLA.getCualProducto(), "cocacola.png");
        PanelProducto sprite = new PanelProducto(DatosProducto.SPRITE.getCualProducto(), "sprite.png");
        PanelProducto fanta = new PanelProducto(DatosProducto.FANTA.getCualProducto(), "fanta.png");

        super8.paintComponent(g);
        snickers.paintComponent(g);
        cocacola.paintComponent(g);
        sprite.paintComponent(g);
        fanta.paintComponent(g);

        

    }
}
