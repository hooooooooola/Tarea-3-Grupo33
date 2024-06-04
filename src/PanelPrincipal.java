import java.awt.event.*;

import javax.swing.*;

public class PanelPrincipal extends JPanel implements MouseListener {

    public static int CANTIDAD_DE_PRODUCTOS = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el Stock de productos", JOptionPane.QUESTION_MESSAGE));
    
    

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
                .addContainerGap(40, 40)
                // .addGroup(panelPrincipalLayout.createParallelGroup()
                .addComponent(exp, -1, -1, 3000)
                // .addComponent(dep, -1, -1, 3000)
                .addGap(15, 15, 15)    
                .addComponent(com, -1, -1, 3000)
                .addContainerGap(40, 40)));

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
                    .addContainerGap(20, 20)));
        
        this.addMouseListener(this);
    }

    
    public void mouseClicked(MouseEvent me) {;} // es llamado cuando el press y el release ocurren en el mismo pixel
    @Override
    public void mousePressed(MouseEvent me) {
        if(true){
            System.out.println("clic en x:"+me.getX()+" y:"+me.getY()); //se imprimirá press cada vez que se oprima un botón del mouse dentro del área
        }
        if(me.getY()>=PanelProducto.Estante1 + 22 && me.getY()<=PanelProducto.Estante1 + 122){
            if(me.getX()>=132 && me.getX()<=223){
                System.out.println("cocacola");
                Listeners.BotonComprar.productoElegido = DatosProducto.COCACOLA.getCualProducto();
                PanelComprador.Precio = DatosProducto.COCACOLA.getPrecioProducto();
                PanelComprador.setLabelPrecioValor(PanelComprador.Precio);
                PanelComprador.setLabelPrecio("Precio CocaCola:");
            }
            if(me.getX()>=268 && me.getX()<= 368){
                System.out.println("fanta");
                Listeners.BotonComprar.productoElegido = DatosProducto.FANTA.getCualProducto();
                PanelComprador.Precio = DatosProducto.FANTA.getPrecioProducto();
                PanelComprador.setLabelPrecioValor(PanelComprador.Precio);
                PanelComprador.setLabelPrecio("Precio Fanta:");
            }
            if(me.getX()>=412 && me.getX()<= 500){
                System.out.println("sprite");   
                Listeners.BotonComprar.productoElegido = DatosProducto.SPRITE.getCualProducto();
                PanelComprador.Precio = DatosProducto.SPRITE.getPrecioProducto();
                PanelComprador.setLabelPrecioValor(PanelComprador.Precio);
                PanelComprador.setLabelPrecio("Precio Sprite:");
            }
            
        } else if (me.getY()>=PanelProducto.Estante2 + 20 && me.getY()<=PanelProducto.Estante2 + 120){
            if(me.getX()>=98 && me.getX()<=244){
                System.out.println("snickers");
                Listeners.BotonComprar.productoElegido = DatosProducto.SNICKERS.getCualProducto();
                PanelComprador.Precio = DatosProducto.SNICKERS.getPrecioProducto();
                PanelComprador.setLabelPrecioValor(PanelComprador.Precio);
                PanelComprador.setLabelPrecio("Precio Snickers:");
            }
            if(me.getX()>=246 && me.getX()<= 395){
                System.out.println("super8");
                Listeners.BotonComprar.productoElegido = DatosProducto.SUPER8.getCualProducto();
                PanelComprador.Precio = DatosProducto.SUPER8.getPrecioProducto();
                PanelComprador.setLabelPrecioValor(PanelComprador.Precio);
                PanelComprador.setLabelPrecio("Precio Super8:");
            }
        }
    }
    public void mouseReleased(MouseEvent me) {;} // el llamado al soltar el botón
    public void mouseEntered(MouseEvent me) {;}  // cursor entra al área
    public void mouseExited(MouseEvent me) {;}   // cursor sale del área
    
    
    
}
        