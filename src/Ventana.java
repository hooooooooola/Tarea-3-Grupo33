import javax.swing.*;

public class Ventana extends JFrame{
    PanelPrincipal panelPrincipal;

    public Ventana() {
         initComponents(); 
    }

    private void initComponents() {
        panelPrincipal = new PanelPrincipal();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(panelPrincipal);
        

        pack();
        this.setLocationRelativeTo(null);
        setVisible(true);
       
    }
}


