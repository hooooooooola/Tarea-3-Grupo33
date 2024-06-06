import javax.swing.*;

/**
 * La ventana es el JFrame principal con el cual el usuario interactúa.
 * 
 * @author Joseph Matamala, Darío Sepúlveda, Felipe Sepúlveda
 * @since 29 de mayo de 2024
 * 
 * @param panelPrincipal el panel en el que son colocados el resto de componentes, esto con el fin de simplificar la implementación en la ventana.
 * @see PanelPrincipal
 * 
 */
public class Ventana extends JFrame{
    PanelPrincipal panelPrincipal;

    public Ventana() {
         initComponents(); 
    }
    /**
     * El método initComponents configura todas las características iniciales más básicas de la ventana, tales como el título, sus botones y su tamaño.
     */
    private void initComponents() {
        /**
         * Añade el panel principal a la ventana.
         */
        panelPrincipal = new PanelPrincipal();
        this.add(panelPrincipal);

        /**
         * Habilita el botón "x" para que pueda cerrar la ventana.  
         */
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        
        /**
         * Añade un título a la ventana.
         */
        this.setTitle("Máquina Expendedora");


        /**
         * Muestra la ventana en pantalla.
         */
        this.setVisible(true);
        

        
        /**
         * Deja todos los componentes de la ventana en sus tamaños preferidos.
         */
        pack();
        
        /**
         * Hace que la ventana se inicie en el centro de la pantalla.
         */
        this.setLocationRelativeTo(null);
        
        
        /**
         * Configura la resolución de la pantalla y hace que no se pueda cambiar de tamaño por el usuario.
         */
        setResizable(false);
        this.setSize(800,900);
    }
}


