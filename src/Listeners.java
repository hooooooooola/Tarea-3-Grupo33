import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Listeners {
    

    public class Boton100 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            PanelComprador.Saldo += 100;
            PanelComprador.setlabelSaldoValor(PanelComprador.Saldo);
        }
    }
    public ActionListener Boton100() {
        return new Boton100();
    }

    public class Boton500 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            PanelComprador.Saldo += 500;
            PanelComprador.setlabelSaldoValor(PanelComprador.Saldo);
        }
    }
    public ActionListener Boton500() {
        return new Boton500();
    }

    public class Boton1000 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            PanelComprador.Saldo += 1000;
            PanelComprador.setlabelSaldoValor(PanelComprador.Saldo);
        }
    }
    public ActionListener Boton1000() {
        return new Boton1000();
    }

    public class BotonComprar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (PanelComprador.Saldo - PanelComprador.Precio > 0) {
                PanelComprador.Saldo -= PanelComprador.Precio;
                PanelComprador.setlabelSaldoValor(PanelComprador.Saldo);
            } else {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
            }
            
        }
    }
    public ActionListener BotonComprar() { 
        return new BotonComprar();
    }
}