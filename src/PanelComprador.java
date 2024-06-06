import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 * PanelComprador se encarga de la interfaz gráfica que contiene el intercambio de monedas entre el comprador y la máquina.
 * 
 * @author Darío Sepúlveda, Felipe Tillería
 * @since 29 de mayo de 2024
 */


public class PanelComprador extends JPanel {
    /**
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
     * @param labelPrecioValor
     * @param labelSaldoValor
     * @param labelVuelto
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
    private JButton boton100;    
    private JButton boton500;
    private JButton boton1000;
    private JButton botonComprar;
    private JButton botonVuelto;
    private JLabel labelMonedas;
    private static JLabel labelPrecio;
    private JLabel labelSaldo;
    private static JLabel labelPrecioValor;
    private static JLabel labelSaldoValor;
    private static JLabel labelVuelto;
    private Repaint repaint;
    
    static int productoElegido = -1;
    static int precio = 0;
    static int saldo = 0;
    static int vuelto = 0;

    private GroupLayout panelCompradorLayout;
    private Listeners listeners;
    private Expendedor expendedor;

    public Expendedor getExpendedor() {
        return expendedor;
    }

    Expendedor expendedor;

    public PanelComprador() {
        this.expendedor = new Expendedor(PanelPrincipal.CANTIDAD_DE_PRODUCTOS);
        initComponents();
        setupLayout();
    }    

    public void setComprarEventListener(Repaint listener) {
        this.repaint = listener;
    }

    private void initComponents() {
        listeners = new Listeners();

        // Botones
        boton100 = createButton("src\\main\\java\\imagenes\\moneda100.png", "Insertar 100 pesos a la máquina", listeners.Boton100());
        boton500 = createButton("src\\main\\java\\imagenes\\moneda500.png", "Insertar 500 pesos a la máquina", listeners.Boton500());
        boton1000 = createButton("src\\main\\java\\imagenes\\moneda1000.png", "Insertar 1000 pesos a la máquina", listeners.Boton1000());

        botonComprar = new JButton("Comprar");
        botonComprar.setFocusable(false);
        botonComprar.addActionListener(listeners.BotonComprar(expendedor));
        botonComprar.addActionListener(e -> {
            // Cuando se hace clic en el botón de comprar, se dispara el evento
            if (repaint != null) {
                repaint.onComprarClicked();
            }
        });

        botonVuelto = new JButton("Obtener Vuelto");
        botonVuelto.setFocusable(false);
        botonVuelto.addActionListener(listeners.BotonVuelto(expendedor)); 

        // Etiquetas
        labelMonedas = new JLabel("Monedas");
        labelPrecio = new JLabel("Precio:");
        labelSaldo = new JLabel("Saldo:");
        labelSaldoValor = new JLabel("$" + saldo);
        labelPrecioValor = new JLabel("$" + precio); 
        labelVuelto = new JLabel("Vuelto: $" + vuelto);

        this.setBackground(new java.awt.Color(200, 200, 200));
        this.setPreferredSize(new java.awt.Dimension(120, 400));
    }

    private JButton createButton(String ruta, String nombre, ActionListener actionListener) {
        ImageIcon icon = new ImageIcon(ruta);
        JButton button = new JButton(icon);
        button.setFocusable(false);
        button.setToolTipText(nombre);
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.addActionListener(actionListener);
        return button;
    }

    private void setupLayout() {
        panelCompradorLayout = new GroupLayout(this);
        this.setLayout(panelCompradorLayout);

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

        panelCompradorLayout.setVerticalGroup(
            panelCompradorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelCompradorLayout.createSequentialGroup()
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
                .addGap(30, 30, 30)
                .addComponent(botonComprar, 30, 30, 30)
                .addGap(15, 15, 15) 
                .addComponent(botonVuelto, 30, 30, 30)
                .addContainerGap(166, 3000)));
    }

    public static void setLabelSaldoValor(int saldo) {
        labelSaldoValor.setText("$" + saldo);
    }    

    public static void setLabelPrecioValor(int precio) {
        labelPrecioValor.setText("$" + precio);
    }

    public static void setLabelPrecio(String texto) {
        labelPrecio.setText(texto);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
