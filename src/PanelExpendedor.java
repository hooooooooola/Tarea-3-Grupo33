import javax.swing.*;

public class PanelExpendedor extends JPanel {
    GroupLayout panelExpendedorLayout;
    JLabel labelExpendedor;

    public PanelExpendedor() {
        initCompoents();    
    }

    private void initCompoents() {

        // labelExpendedor = new JLabel("Expendedor");
        // this.add(labelExpendedor);

        this.setBackground(new java.awt.Color(247, 153, 180));
        this.setPreferredSize(new java.awt.Dimension(240, 345));
        panelExpendedorLayout = new GroupLayout(this);
        this.setLayout(panelExpendedorLayout);

    }

    // @Override
    // protected void paintComponent(Graphics g) {
    //     super.paintComponent(g);
    //     g.drawString("Panel Expendedor", 10, 20);
    // }
}
