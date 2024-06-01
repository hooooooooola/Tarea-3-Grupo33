import javax.swing.*;

public class PanelPrincipal extends JPanel {
    PanelComprador com;
    PanelExpendedor exp;
    PanelDeposito dep;

    public PanelPrincipal() {
        initComponents();   
    } 
    
    private void initComponents() {
        com = new PanelComprador();
        exp = new PanelExpendedor();
        dep = new PanelDeposito();

        this.setBackground(new java.awt.Color(153, 153, 153));
        GroupLayout panelPrincipalLayout = new GroupLayout(this);
        this.setLayout(panelPrincipalLayout);

         panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(15, 3000)
                .addGroup(panelPrincipalLayout.createParallelGroup()
                    .addComponent(exp, -1, -1, 3000)
                    .addComponent(dep, -1, -1, 3000))
                .addGap(15, 15, 15)    
                .addComponent(com, -1, -1, 3000)
                .addContainerGap(15, 3000)));

        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(panelPrincipalLayout.createSequentialGroup()
                    .addContainerGap(20, 20)
                    .addComponent(exp, -1, -1, 3000)
                    .addGap(15, 15, 15)
                    .addComponent(dep, -1, -1, 3000)
                    .addContainerGap(20, 20))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap(20, 20)
                        .addComponent(com, -1, -1, 3000)
                        .addContainerGap(20, 20)));
    }

    // @Override
    // public void paintComponent (Graphics g) { 
    //     super.paintComponent(g);
    //     com.paintComponent(g); 
    //     exp.paintComponent(g);
    // }
}
        