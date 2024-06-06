import javax.swing.*;

/**
 * El panel del depósito nos muestra gráficamente las monedas que caen como vuelto y el producto que se compró por el usuario.
 * 
 * @author Felipe Tillería
 * @since 2 de junio de 2024
 * 
 */
public class PanelDeposito extends JPanel {

    public PanelDeposito() {
        initComponents();
    }
    /**
     * Configura el tamaño inicial del depósito.
     */
    private void initComponents() {
        this.setBackground(new java.awt.Color(195, 236, 247));
        this.setPreferredSize(new java.awt.Dimension(600, 120));
    }
}