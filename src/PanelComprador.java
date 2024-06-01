import java.awt.Graphics;
import javax.swing.*;

public class PanelComprador extends JPanel {
    private JButton boton100;    
    private JButton boton500;
    private JButton boton1000;
    private JButton botonComprar;
    private JLabel labelMonedas;
    private JLabel labelPrecio;
    private JLabel labelSaldo;
    private JLabel labelPrecioValor;
    private static JLabel labelSaldoValor;
    static int Saldo = 0;
    static int Precio = 1000;
    GroupLayout panelCompradorLayout;
    Listeners listeners;

    public PanelComprador() {
        initCompoents();
    }    
    private void initCompoents() {

        listeners = new Listeners();

        // Botones
        boton100 = new JButton("100$");
        boton100.setFocusable(false);
        boton100.addActionListener(listeners.Boton100());

        boton500 = new JButton("500$");
        boton500.setFocusable(false);
        boton500.addActionListener(listeners.Boton500());
        
        boton1000 = new JButton("1000$");
        boton1000.setFocusable(false);
        boton1000.addActionListener(listeners.Boton1000());
        
        botonComprar = new JButton("Comprar");
        botonComprar.setFocusable(false);
        botonComprar.addActionListener(listeners.BotonComprar());

        // Etiquetas
        labelMonedas = new JLabel("Monedas");
        labelPrecio = new JLabel("Precio:");
        labelSaldo = new JLabel("Saldo:");
        labelSaldoValor = new JLabel(Saldo + "$");
        labelPrecioValor = new JLabel( Precio + "$"); 

        // Configuración del panel
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
                    .addGroup(panelCompradorLayout.createSequentialGroup()
                        .addGroup(panelCompradorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(labelPrecio)
                            .addComponent(labelSaldo)))
                    .addComponent(labelPrecioValor, -1, -1, 3000)
                    .addComponent(labelSaldoValor, -1, -1, 3000)
                    .addComponent(botonComprar, -1, -1, 3000))
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
                .addGap(15,15,15)
                .addComponent(botonComprar, 30, 30, 30)
                .addContainerGap(166, 3000)));    
    }

    public static void setlabelSaldoValor(int Saldo) {
        labelSaldoValor.setText(Saldo + "$");
    }    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}   
