import java.awt.Graphics;
import javax.swing.*;

/**
 * PanelComprador se encarga de la interfaz gráfica que contiene el intercambio de monedas entre el comprador y la máquina.
 * 
 * @author Darío Sepúlveda, Felipe Tillería
 * @since 29 de mayo de 2024
 * @param boton100 el botón en la interfaz gráfica correspondiente a insertar 100 pesos a la máquina.
 * @param boton500 el botón en la interfaz gráfica correspondiente a insertar 500 pesos a la máquina.
 * @param boton1000 el botón en la interfaz gráfica correspondiente a insertar 1000 pesos a la máquina.
 * @param botonComprar el botón que confirma la compra del producto seleccionado.
 * @param botonVuelto el botón de la interfaz que devuelve las monedas que haya insertado el comprador en el expendedor, o el vuelto que haya sobrado.
 *
 * 
 * @param labelMonedas texto que aparece con "Monedas" en pantalla.
 * @param labelPrecio texto que aparece con "Precio" en pantalla.
 * @param labelSaldo texto que aparece con "Saldo" en pantalla.
 * 
 * 
 * @param labelPrecioValor texto que contiene el número con el precio del producto seleccionado.
 * @param labelSaldoValor texto que contiene el número con el saldo disponible.
 * @param labelVuelto texto que contiene el número con el vuelto que se entrega.
 * 
 * 
 * @param Precio el costo del producto que se va a comprar
 * @param Saldo el presupuesto que tiene el comprador dentro de la máquina
 * @param Vuelto el vuelto que se planea devolver al comprador cuando presione el botón para este.
 * 
 * 
 * @param panelCompradorLayout Disposición de los botones dentro del panel gráfico. Con esto se puede configurar correctamente dónde va cada componente.
 * @param listeners referencia a la clase Listeners que contiene las reacciones de presionar cada botón dentro de la ventana.
 */

public class PanelComprador extends JPanel {
    
    private JButton boton100;    
    private JButton boton500;
    private JButton boton1000;
    private JButton botonComprar;
    private JButton botonVuelto;
    private JLabel labelMonedas;
    private JLabel labelPrecio;
    private JLabel labelSaldo;
    private static JLabel labelPrecioValor;
    private static JLabel labelSaldoValor;
    private static JLabel labelVuelto;
    static int Precio = 300;
    static int Saldo = 0;
    static int Vuelto = 0;
    GroupLayout panelCompradorLayout;
    Listeners listeners;

    Expendedor expendedor;

    public PanelComprador() {
        // preguntara por cuantos productos poner en el expendedor
        this.expendedor = new Expendedor(PanelPrincipal.CANTIDAD_DE_PRODUCTOS);
        initComponents();
    } 
    
    
    /**
     * El método initComponents define todas las variables que el panel necesita para ser correctamente visualizado en pantalla.
     * @param moneda100 ImageIcon que contiene la imagen de la moneda de 100
     * @param moneda500 ImageIcon que contiene la imagen de la moneda de 500
     * @param moneda1000 ImageIcon que contiene la imagen de la moneda de 1000
     * 
     * @param boton100 Botón dentro del panel que puedes presionar para insertar una moneda de 100 a la máquina
     * @param boton500 Botón dentro del panel que puedes presionar para insertar una moneda de 500 a la máquina
     * @param boton1000 Botón dentro del panel que puedes presionar para insertar una moneda de 1000 a la máquina
     * 
     * 
     */
    private void initComponents() {
        /**
         * Añade la capacidad de los botones para "escuchar" los clicks del usuario.
         */
        listeners = new Listeners();

        /**
         * Inicializa las imágenes de cada botón para insertar monedas.
         */
        ImageIcon moneda100 = new ImageIcon("src\\main\\java\\imagenes\\moneda100.png");
        ImageIcon moneda500 = new ImageIcon("src\\main\\java\\imagenes\\moneda500.png");
        ImageIcon moneda1000 = new ImageIcon("src\\main\\java\\imagenes\\moneda1000.png");

        /**
         * Crea las instancias de cada botón.
         */
        boton100 = new JButton(moneda100);
        boton100.setFocusable(false);
        boton100.setToolTipText("Insertar 100 pesos a la máquina");
        boton100.setSize(100,100);
        boton100.setOpaque(false);
        boton100.setContentAreaFilled(false);
        boton100.setBorderPainted(false);
        boton100.addActionListener(listeners.Boton100());

        boton500 = new JButton(moneda500);
        boton500.setFocusable(false);
        boton500.setToolTipText("Insertar 500 pesos a la máquina");
        boton500.setOpaque(false);
        boton500.setContentAreaFilled(false);
        boton500.setBorderPainted(false);
        boton500.addActionListener(listeners.Boton500());
        

        boton1000 = new JButton(moneda1000);
        boton1000.setFocusable(false);
        boton1000.setToolTipText("Insertar 1000 pesos a la máquina");
        boton1000.setOpaque(false);
        boton1000.setContentAreaFilled(false);
        boton1000.setBorderPainted(false);
        boton1000.addActionListener(listeners.Boton1000());

        
        botonComprar = new JButton("Comprar");
        botonComprar.setFocusable(false);
        botonComprar.addActionListener(listeners.BotonComprar(expendedor));

        botonVuelto = new JButton("Obtener Vuelto");
        botonVuelto.setFocusable(false);
        botonVuelto.addActionListener(listeners.BotonVuelto(expendedor)); 

        /**
         * Crea las instancias de cada título que se muestra en pantalla.
         */
        labelMonedas = new JLabel("Monedas");
        labelPrecio = new JLabel("Precio:");
        labelSaldo = new JLabel("Saldo:");
        labelSaldoValor = new JLabel("$" + Saldo);
        labelPrecioValor = new JLabel("$" + Precio); 
        labelVuelto = new JLabel("Vuelto: $" + Vuelto);

        /**
         * Se configuran las variables del panel en sí.
         */
        this.setBackground(new java.awt.Color(200, 200, 200));
        this.setPreferredSize(new java.awt.Dimension(120, 500));
        panelCompradorLayout = new GroupLayout(this);
        this.setLayout(panelCompradorLayout);

        // GroupLayout horizontal
        panelCompradorLayout.setHorizontalGroup(
            panelCompradorLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
            .addGroup(panelCompradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMonedas)
                .addContainerGap())
            .addGroup(panelCompradorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCompradorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(labelSaldoValor)
                    .addComponent(boton100, -1, -1, 3000)
                    .addComponent(boton500, -1, -1, 3000)
                    .addComponent(boton1000, -1, -1, 3000)
                    .addComponent(labelPrecio)
                    .addComponent(labelSaldo)
                    .addComponent(labelPrecioValor, -1, -1, 3000)
                    .addComponent(labelSaldoValor, -1, -1, 3000)
                    .addComponent(botonComprar, -1, -1, 3000)
                    .addComponent(botonVuelto, -1, -1, 3000))
                .addContainerGap()));

        // GroupLayout vertical
        panelCompradorLayout.setVerticalGroup(
            panelCompradorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup (panelCompradorLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(labelMonedas)
                .addGap(30, 30, 30)
                .addComponent(boton100, -1, 30, -1)
                .addGap(18, 18, 18)
                .addComponent(boton500, -1, 30, -1)
                .addGap(20, 20, 20)
                .addComponent(boton1000, -1, 30, -1)
                .addGap(20, 20, 20)
                .addComponent(labelPrecio)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPrecioValor, -1, -1, -1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSaldo)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSaldoValor, -1, -1, -1)
                .addGap(30,30,30)
                .addComponent(botonComprar, 30, 30, 30)
                .addGap(15, 15, 15)
                .addComponent(botonVuelto, 30, 30, 30)
                .addContainerGap(166, 3000)));   
    }


    /**
     * Método setter para el texto en pantalla del saldo disponible.
     * @param Saldo el saldo actual del comprador.
     */
    public static void setlabelSaldoValor(int Saldo) {
        labelSaldoValor.setText("$" + Saldo);
    }    

    /**
     * Método setter para el texto en pantalla del precio del producto que se vaya a comprar.
     * @param Precio el precio del producto que se va a comprar.
     */
    public static void setlabelPrecioValor(int Precio) {
        labelPrecioValor.setText("$" + Precio);
    }

    @Override
    protected void paintComponent(Graphics g) {
         super.paintComponent(g);
    }
} 
