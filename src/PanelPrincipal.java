import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.*;

public class PanelPrincipal extends JPanel implements MouseListener {

    public static int CANTIDAD_DE_PRODUCTOS = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el Stock de productos", JOptionPane.QUESTION_MESSAGE));
    
    private PanelComprador com;
    private PanelExpendedor exp;
    // private PanelDeposito dep;
    private GroupLayout panelPrincipalLayout;


    public PanelPrincipal() {
        initComponents();   
        setupLayout();
    } 

    



    private void initComponents() {
        com = new PanelComprador();
        exp = new PanelExpendedor();

        com.setComprarEventListener(() -> {
            // Cuando se dispara el evento de comprar en PanelComprador,
            // se llama a este código para repintar PanelPrincipal
            repaint();
        });
        // dep = new PanelDeposito();

        this.setBackground(new java.awt.Color(153, 153, 153));
        this.addMouseListener(this);
    }

    private void setupLayout() {
        panelPrincipalLayout = new GroupLayout(this);
        this.setLayout(panelPrincipalLayout);

         panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(40, 40)
                // .addGroup(panelPrincipalLayout.createParallelGroup()
                .addComponent(exp, -1, -1, 3000)
                // .addComponent(dep, -1, -1, 3000)
                .addGap(15, 15, 15)    
                .addComponent(com, -1, -1, 3000)
                .addContainerGap(40, 40))
        );

        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(panelPrincipalLayout.createSequentialGroup()
                    .addContainerGap(20, 20)
                    .addComponent(exp, -1, -1, 3000)
                    // .addGap(15, 15, 15)
                    // .addComponent(dep, -1, -1, 3000)
                    .addContainerGap(20, 20))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                    .addContainerGap(20, 20)
                    .addComponent(com, -1, -1, 3000)
                    .addContainerGap(20, 20))
        );
    }


    

    
    public void mouseClicked(MouseEvent me) {;} // es llamado cuando el press y el release ocurren en el mismo pixel
    
    @Override
    public void mousePressed(MouseEvent me) {
        int x = me.getX();
        int y = me.getY();
        if(true){
            System.out.println("clic en x:"+me.getX()+" y:"+me.getY()); //se imprimirá press cada vez que se oprima un botón del mouse dentro del área
        }
        if (y >= PanelProducto.Estante1 + 22 && y <= PanelProducto.Estante1 + 122) {
            productosClick(x, DatosProducto.COCACOLA, 132, 223);
            productosClick(x, DatosProducto.FANTA, 268, 368);
            productosClick(x, DatosProducto.SPRITE, 412, 500);
        } else if (y >= PanelProducto.Estante2 + 20 && y <= PanelProducto.Estante2 + 120) {
            productosClick(x, DatosProducto.SUPER8, 98, 244);
            productosClick(x, DatosProducto.SNICKERS, 246, 395 );
        }
    }
    

    private void productosClick(int x, DatosProducto producto, int min, int max) {
        if (x >= min && x <= max) {
            System.out.println(producto.name().toLowerCase());
            PanelComprador.productoElegido = producto.getCualProducto();
            PanelComprador.precio = producto.getPrecioProducto();
            PanelComprador.setLabelPrecioValor(PanelComprador.precio);
            PanelComprador.setLabelPrecio("Precio " + producto.name() + ":");
        }
    }
    


    public void mouseReleased(MouseEvent me) {;} // el llamado al soltar el botón
    public void mouseEntered(MouseEvent me) {;}  // cursor entra al área
    public void mouseExited(MouseEvent me) {;}   // cursor sale del área

    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    
}
        