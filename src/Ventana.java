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
        

        this.setTitle("Touhou");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(panelPrincipal);
        setResizable(false);
        
        pack();
        this.setLocationRelativeTo(null);
        this.setSize(800,900 );
       
    }
}


