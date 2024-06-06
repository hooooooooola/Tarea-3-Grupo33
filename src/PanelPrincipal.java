import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.*;

/**
 * Panel en el que se combinan todos los otros subpaneles para ser insertados en la ventana principal que muestra el expendedor con sus componentes.
 * 
 * @author Joseph Matamala, Darío Sepúlveda, Felipe Tillería
 * @since 29 de mayo de 2024
 * 
 * @param com inserción del panel del comprador, el cual contiene el procesamiento de monedas.
 * @param exp inserción del panel del expendedor, el cual muestra los productos denrtro de la máquina expendedora.
 * @param dep inserción del panel a donde caen las monedas de vuelto y el producto comprado.
 * 
 * @see PanelComprador
 * @see PanelExpendedor
 * @see PanelDeposito
 */
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

    /**
     * Método que inicializa cada componente del panel, la disposición en pantalla de estos, y sus características propias.
     */
    private void initComponents() {
        com = new PanelComprador();
        exp = new PanelExpendedor();

        com.setComprarEventListener(() -> {
            /**
             * Cuando se dispara el evento de comprar en PanelComprador,
             * se llama a este código para repintar PanelPrincipal
             */
            if(Expendedor.espacioDisponible == true){
                repaint();
            }
            
            
        });
        /**
         * Ajusta el color del fondo principal y la disposición de la ventana.
         */
        this.setBackground(new java.awt.Color(153, 153, 153));
        this.addMouseListener(this);
    }

    private void setupLayout() {
        panelPrincipalLayout = new GroupLayout(this);
        this.setLayout(panelPrincipalLayout);

        /**
         * Luego de crear la disposición de la ventana, Añade cada componente del panel en forma sequencial a esta,
         * primero según su posición horizontal y luego vertical.
         * Esto nos proporciona una mejor manipulación de la ubicación de cada parte de la ventana.
         */
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
    
    
    /**
     * El método mousePressed recibe una señal cuando el clic izquierdo del mouse es presionado (no necesita ser soltado) dentro de la zona indicada.
     * El resto de acciones del mouse no son utilizadas pero se necesitan instanciar para satisfacer la interface. 
     */
    @Override
    public void mousePressed(MouseEvent me) {
        int x = me.getX();
        int y = me.getY();
        /**
         * Registra en la consola la coordenada que se presionó.
         */
        System.out.println("clic en x:"+me.getX()+" y:"+me.getY());
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
                    
                    
                    if(y >= 670 && y <= 770 && x >= 267 && x <= 367){
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
    
            
            
    public void mouseClicked(MouseEvent me) {;}
    public void mouseReleased(MouseEvent me) {;} 
    public void mouseEntered(MouseEvent me) {;}  
    public void mouseExited(MouseEvent me) {;}   

    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    
}
        