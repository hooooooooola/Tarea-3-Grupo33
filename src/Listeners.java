import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * La clase Listeners contiene todos los receptores de cada acción que haga el usuario. Se ocupan en los botones y ejecuciones del mouse.
 * 
 * @author Felipe Tillería
 * @since 1 de junio de 2024
 * 
 */
public class Listeners {
    
    /**
     * La clase Boton100 ejecuta la acción de insertar una moneda de 100 a la máquina.
     * @see Moneda100
     */
    public class Boton100 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Moneda100 moneda100 = new Moneda100();
            PanelComprador.Saldo += moneda100.getValor();
            System.out.println("moneda insertada serie: "+moneda100.getSerie());
            PanelComprador.setlabelSaldoValor(PanelComprador.Saldo);
        }
    }
    public ActionListener Boton100() {
        return new Boton100();
    }

    /**
     * La clase Boton500 ejecuta la acción de insertar una moneda de 500 a la máquina.
     * @see Moneda500
     */
    public class Boton500 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Moneda500 moneda500 = new Moneda500();
            PanelComprador.Saldo += moneda500.getValor();
            System.out.println("moneda insertada serie: "+moneda500.getSerie());
            PanelComprador.setlabelSaldoValor(PanelComprador.Saldo);
        }
    }
    public ActionListener Boton500() {
        return new Boton500();
    }

    /**
     * La clase Boton1000 ejecuta la acción de insertar una moneda de 1000 a la máquina.
     * @see Moneda1000
     */
    public class Boton1000 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Moneda1000 moneda1000 = new Moneda1000();
            PanelComprador.Saldo += moneda1000.getValor();
            System.out.println("moneda insertada serie: "+moneda1000.getSerie());
            PanelComprador.setlabelSaldoValor(PanelComprador.Saldo);
        }
    }
    public ActionListener Boton1000() {
        return new Boton1000();
    }


    /**
     * La clase BotonComprar ejecuta la lógica de comprar un producto, haciendo que este baje al depósito para que el usuario lo reciba.
     * 
     * @param expendedor el expendedor del que se compró el producto
     * @param productoElegido el tipo de producto que se compró
     */
    public class BotonComprar implements ActionListener {
        private Expendedor expendedor;
        static int productoElegido;
        public BotonComprar(Expendedor expendedor) {
            this.expendedor = expendedor;   
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            /**
             * Sólo se compra un producto si es que el saldo del usuario es suficiente para este, en caso contrario no ocurre nada dentro del expendedor.
             */
            if (PanelComprador.Saldo - PanelComprador.Precio >= 0) {
                expendedor.comprarProducto(productoElegido); 
                PanelComprador.setlabelSaldoValor(PanelComprador.Saldo);
            } else {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
            }
            
        }
        /**
         * Método getter para el producto que se compró.
         * @return el producto elegido.
         */
        public static int getProductoElegido() {
            return productoElegido;
        }
    
    }
    public ActionListener BotonComprar(Expendedor expendedor) { 
        return new BotonComprar(expendedor);
    }


    /**
     * La clase BotonVuelto recibe la acción de presionar el botón de vuelto del expendedor, ejecutando su lógica correspondiente.
     * @param expendedor el expendedor del que se compró el producto
     * 
     */
    public class BotonVuelto implements ActionListener {
        Expendedor expendedor;
        public BotonVuelto(Expendedor expendedor) {
            this.expendedor = expendedor;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            /**
             * Devuelve el saldo que se había insertado, en caso de no tener muestra un mensaje en pantalla con el aviso de que no hay.
             */
            if (PanelComprador.Saldo !=0) {
                /**
                 * Acceso al depósito de monedas del vuelto
                 */
                expendedor.getVuelto(); 
                PanelComprador.setlabelSaldoValor(PanelComprador.Saldo);
            } else {
                JOptionPane.showMessageDialog(null, "No hay saldo");
            }
        }
    }

    public ActionListener BotonVuelto(Expendedor expendedor){
        return new BotonVuelto(expendedor);
    }   
}