import java.awt.event.*;

import javax.swing.*;

public class PanelPrincipal extends JPanel implements MouseListener {
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
        
        this.addMouseListener(this);
    }

    
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
}
        