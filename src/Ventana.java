import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Ventana extends JFrame{
    PanelPrincipal panelPrincipal;

    public Ventana() {
         initComponents(); 
    }

    private void initComponents() {
        panelPrincipal = new PanelPrincipal();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, -1, -1, 3000)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, -1, -1, 3000)
        );

        pack();
        this.setLocationRelativeTo(null);
        setVisible(true);
       
    }
}


