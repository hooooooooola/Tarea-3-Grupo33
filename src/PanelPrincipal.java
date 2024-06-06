<<<<<<< HEAD
=======
import java.awt.Graphics;
>>>>>>> pruebaInterfaz
import java.awt.event.*;

import javax.swing.*;

public class PanelPrincipal extends JPanel implements MouseListener {
<<<<<<< HEAD
    PanelComprador com;
    PanelExpendedor exp;
    PanelDeposito dep;
=======

    public static int CANTIDAD_DE_PRODUCTOS = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el Stock de productos", JOptionPane.QUESTION_MESSAGE));
    
    private PanelComprador com;
    private PanelExpendedor exp;
    // private PanelDeposito dep;
    private GroupLayout panelPrincipalLayout;

>>>>>>> pruebaInterfaz

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
<<<<<<< HEAD
                .addContainerGap(15, 3000)
                .addGroup(panelPrincipalLayout.createParallelGroup()
                .addComponent(exp, -1, -1, 3000)
                .addComponent(dep, -1, -1, 3000))
=======
                .addContainerGap(40, 40)
                // .addGroup(panelPrincipalLayout.createParallelGroup()
                .addComponent(exp, -1, -1, 3000)
                // .addComponent(dep, -1, -1, 3000)
>>>>>>> pruebaInterfaz
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
<<<<<<< HEAD
                .addGroup(panelPrincipalLayout.createSequentialGroup()
                    .addContainerGap(20, 20)
                    .addComponent(com, -1, -1, 3000)
                    .addContainerGap(20, 20)));
        
        this.addMouseListener(this);
=======
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                    .addContainerGap(20, 20)
                    .addComponent(com, -1, -1, 3000)
                    .addContainerGap(20, 20))
        );
>>>>>>> pruebaInterfaz
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
            if(Expendedor.espacioDisponible == false){
                JOptionPane.showMessageDialog(null, "Retira tu producto antes de comprar otro ");
            }
            productosClick(x, DatosProducto.COCACOLA, 132, 223);
            productosClick(x, DatosProducto.FANTA, 268, 368);
            productosClick(x, DatosProducto.SPRITE, 412, 500);
        } else if (y >= PanelProducto.Estante2 + 20 && y <= PanelProducto.Estante2 + 120) {
            if(Expendedor.espacioDisponible == false){
                JOptionPane.showMessageDialog(null, "Retira tu producto antes de comprar otro ");
            }
            productosClick(x, DatosProducto.SUPER8, 98, 244);
            productosClick(x, DatosProducto.SNICKERS, 246, 395 );
        }
        

<<<<<<< HEAD
    
    public void mouseClicked(MouseEvent me) {;} // es llamado cuando el press y el release ocurren en el mismo pixel
    @Override
    public void mousePressed(MouseEvent me) {
        if(true){
            System.out.println("clic en x:"+me.getX()+" y:"+me.getY()); //se imprimirá press cada vez que se oprima un botón del mouse dentro del área
        }
        if(me.getY()>=120&&me.getY()<=220){
            if(me.getX()>=130+(100*DatosProducto.COCACOLA.getCualProducto())&&me.getX()<=230+(100*DatosProducto.COCACOLA.getCualProducto())){
                System.out.println("cocacola");
            }
        }
        if(me.getY()>=120&&me.getY()<=220){
            if(me.getX()>=130+(100*DatosProducto.FANTA.getCualProducto())&&me.getX()<=230+(100*DatosProducto.FANTA.getCualProducto())){
                System.out.println("fanta");
            }
        }
        if(me.getY()>=120&&me.getY()<=220){
            if(me.getX()>=130+(100*DatosProducto.SPRITE.getCualProducto())&&me.getX()<=230+(100*DatosProducto.SPRITE.getCualProducto())){
                System.out.println("sprite");
            }
        }
        if(me.getY()>=120&&me.getY()<=220){
            if(me.getX()>=130+(100*DatosProducto.SNICKERS.getCualProducto())&&me.getX()<=230+(100*DatosProducto.SNICKERS.getCualProducto())){
                System.out.println("snickers");
            }
        }
        if(me.getY()>=120&&me.getY()<=220){
            if(me.getX()>=130+(100*DatosProducto.SUPER8.getCualProducto())&&me.getX()<=230+(100*DatosProducto.SUPER8.getCualProducto())){
                System.out.println("super8");
            }
        }
        
    }
    public void mouseReleased(MouseEvent me) {;} // el llamado al soltar el botón
    public void mouseEntered(MouseEvent me) {;}  // cursor entra al área
    public void mouseExited(MouseEvent me) {;}   // cursor sale del área
=======
        if(y >= 670 && y <= 770 && x >= 67 && x <= 167){
            if(com.getExpendedor().getProductoComprado() == null){
                JOptionPane.showMessageDialog(null, "Aún no has comprado un producto para retirar");
            }
            else{
                com.getExpendedor().getProducto();
                repaint();
                }
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
    
>>>>>>> pruebaInterfaz
}
        