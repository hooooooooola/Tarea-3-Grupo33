import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    PanelComprador com;

    public PanelPrincipal() {
        initComponents();
    } 
    
    private void initComponents() {
        com = new PanelComprador();
        this.setBackground(new java.awt.Color(153, 153, 153));

        GroupLayout panelPrincipalLayout = new GroupLayout(this);
        this.setLayout(panelPrincipalLayout);

         panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(247, 3000)
                .addComponent(com, -1, -1, -1)
                .addGap(15, 15, 15))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(com, -1, -1, -1)
                .addContainerGap(16, 3000))
        );
        
        this.add(com);
    }
}