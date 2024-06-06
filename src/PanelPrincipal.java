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
    public static final int CANTIDAD_DE_PRODUCTOS = 13;

    PanelComprador com;
    PanelExpendedor exp;
    PanelDeposito dep;

    

    
    public PanelPrincipal() {
        initComponents();   
    } 
    
    /**
     * Método que inicializa cada componente del panel, la disposición en pantalla de estos, y sus características propias.
     */
    private void initComponents() {
        com = new PanelComprador();
        exp = new PanelExpendedor();
        dep = new PanelDeposito();

        /**
         * Ajusta el color del fondo principal y la disposición de la ventana.
         */
        this.setBackground(new java.awt.Color(153, 153, 153));
        GroupLayout panelPrincipalLayout = new GroupLayout(this);
        this.setLayout(panelPrincipalLayout);

        /**
         * Luego de crear la disposición de la ventana, Añade cada componente del panel en forma sequencial a esta,
         * primero según su posición horizontal y luego vertical.
         * Esto nos proporciona una mejor manipulación de la ubicación de cada parte de la ventana.
         */
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
        
        this.addMouseListener(this);
    }

    
    /**
     * El método mousePressed recibe una señal cuando el clic izquierdo del mouse es presionado (no necesita ser soltado) dentro de la zona indicada.
     * El resto de acciones del mouse no son utilizadas pero se necesitan instanciar para satisfacer la interface. 
     */
    @Override
    public void mousePressed(MouseEvent me) {
        /**
         * Registra en la consola la coordenada que se presionó.
         */
        System.out.println("clic en x:"+me.getX()+" y:"+me.getY());

        /**
         * Detecta qué producto se seleccionó para ser comprado indicando esto como acción de BotonComprar, esto la hace según su posición por coordenadas dentro del panel.
         */
        if(me.getY()>=PanelProducto.ALINEACION_Y + 20&&me.getY()<=PanelProducto.ALINEACION_Y + 100 + 20){
            if(me.getX()>=130+(100*DatosProducto.COCACOLA.getCualProducto())&&me.getX()<=230+(100*DatosProducto.COCACOLA.getCualProducto())){
                System.out.println("cocacola");
                Listeners.BotonComprar.productoElegido = DatosProducto.COCACOLA.getCualProducto();
            }
            if(me.getX()>=130+(100*DatosProducto.FANTA.getCualProducto())&&me.getX()<=230+(100*DatosProducto.FANTA.getCualProducto())){
                System.out.println("fanta");
                Listeners.BotonComprar.productoElegido = DatosProducto.FANTA.getCualProducto();
            }
            if(me.getX()>=130+(100*DatosProducto.SPRITE.getCualProducto())&&me.getX()<=230+(100*DatosProducto.SPRITE.getCualProducto())){
                System.out.println("sprite");
                Listeners.BotonComprar.productoElegido = DatosProducto.SPRITE.getCualProducto();
            }
            if(me.getX()>=130+(100*DatosProducto.SNICKERS.getCualProducto())&&me.getX()<=230+(100*DatosProducto.SNICKERS.getCualProducto())){
                System.out.println("snickers");
                Listeners.BotonComprar.productoElegido = DatosProducto.SNICKERS.getCualProducto();
            }
            if(me.getX()>=130+(100*DatosProducto.SUPER8.getCualProducto())&&me.getX()<=230+(100*DatosProducto.SUPER8.getCualProducto())){
                System.out.println("super8");
                Listeners.BotonComprar.productoElegido = DatosProducto.SUPER8.getCualProducto();
            }
        }
    }

    public void mouseClicked(MouseEvent me) {;}
    public void mouseReleased(MouseEvent me) {;}
    public void mouseEntered(MouseEvent me) {;}
    public void mouseExited(MouseEvent me) {;}
}
        