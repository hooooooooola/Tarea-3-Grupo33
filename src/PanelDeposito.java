import javax.swing.*;

public class PanelDeposito extends JPanel {
    private PanelProducto compra;
    
    public PanelDeposito() {
        initComponents();
    }

    private void initComponents() {
        this.setBackground(new java.awt.Color(195, 236, 247));
        this.setPreferredSize(new java.awt.Dimension(600, 120));
        this.setLayout(null);
    }

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        //this.add(Expendedor.getLabelCompra());
        //repaint();
        
    }
}