import java.awt.*;
import javax.swing.*;

public class PanelExpendedor extends JPanel {
    GroupLayout panelExpendedorLayout;
    JLabel labelExpendedor;

    public PanelExpendedor() {
        initCompoents();    
    }

    private void initCompoents() {

        this.setBackground(new java.awt.Color(247, 153, 180));
        this.setPreferredSize(new java.awt.Dimension(240, 500));
        panelExpendedorLayout = new GroupLayout(this);
        this.setLayout(panelExpendedorLayout);

    }

    // @Override
    // protected void paintComponent(Graphics g) {
    //     super.paintComponent(g);
    //     g.drawString("Panel Expendedor", 10, 20);
    // }
}
