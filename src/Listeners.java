import java.awt.event.ActionEvent;
import java.util.EventListener;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Listeners {

    public class Boton100 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Moneda100 moneda100 = new Moneda100();
            PanelComprador.saldo += moneda100.getValor();
            System.out.println("moneda insertada serie: "+moneda100.getSerie());
            PanelComprador.setLabelSaldoValor(PanelComprador.saldo);
        }
    }
    public ActionListener Boton100() {
        return new Boton100();
    }

    public class Boton500 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Moneda500 moneda500 = new Moneda500();
            PanelComprador.saldo += moneda500.getValor();
            System.out.println("moneda insertada serie: "+moneda500.getSerie());
            PanelComprador.setLabelSaldoValor(PanelComprador.saldo);
        }
    }
    public ActionListener Boton500() {
        return new Boton500();
    }

    public class Boton1000 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Moneda1000 moneda1000 = new Moneda1000();
            PanelComprador.saldo += moneda1000.getValor();
            System.out.println("moneda insertada serie: "+moneda1000.getSerie());
            PanelComprador.setLabelSaldoValor(PanelComprador.saldo);
        }
    }
    public ActionListener Boton1000() {
        return new Boton1000();
    }

    public class BotonComprar implements ActionListener {
        Expendedor expendedor;
       
        public BotonComprar(Expendedor expendedor) {
            this.expendedor = expendedor;   
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if (PanelComprador.productoElegido != -1) {
                if (PanelComprador.saldo - PanelComprador.precio >= 0) {
                    expendedor.comprarProducto(PanelComprador.productoElegido); 
                    PanelComprador.setLabelSaldoValor(PanelComprador.saldo);

                } else {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado un producto");
            }
            
        }
    
    }
    public ActionListener BotonComprar(Expendedor expendedor ) { 
        return new BotonComprar(expendedor);
    }

    public class BotonVuelto implements ActionListener {
        Expendedor expendedor;
        public BotonVuelto(Expendedor expendedor) {
            this.expendedor = expendedor;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (PanelComprador.saldo !=0) {
                expendedor.getVuelto(); // deposito de monedas del vuelto hay que mostrarlas de alguna fomra
                PanelComprador.setLabelSaldoValor(PanelComprador.saldo);
                
            } else {
                JOptionPane.showMessageDialog(null, "No hay saldo");
            }
        }
    }

    public ActionListener BotonVuelto(Expendedor expendedor){
        return new BotonVuelto(expendedor);
    }   
}