import javax.swing.*;

public class PanelComprador extends JPanel {
    JButton boton100;    
    JButton boton500;
    JButton boton1000;
    JButton botonComprar;
    JLabel labelMonedas;
    JLabel labelPrecio;
    JLabel labelTotal;
    JLabel labelPrecioValor;
    JLabel labelTotalValor;
    GroupLayout panelCompradorLayout;

    public PanelComprador() {
        initCompoents();
    }    
    private void initCompoents() {

        // Botones
        boton100 = new JButton("100$");
        boton100.setFocusable(false);

        boton500 = new JButton("500$");
        boton500.setFocusable(false);
        
        boton1000 = new JButton("1000$");
        boton1000.setFocusable(false);
        
        botonComprar = new JButton("Comprar");
        botonComprar.setFocusable(false);

        // Etiquetas
        labelMonedas = new JLabel("Monedas");
        labelPrecio = new JLabel("Precio:");
        labelTotal = new JLabel("Total:");
        labelPrecioValor = new JLabel("0$"); 
        labelTotalValor = new JLabel("0$");

        // Configuración del panel
        this.setBackground(new java.awt.Color(200, 200, 200));
        this.setPreferredSize(new java.awt.Dimension(120, 570));
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
                    .addComponent(labelTotalValor)
                    .addComponent(boton100, -1, -1, 3000)
                    .addComponent(boton500, -1, -1, 3000)
                    .addComponent(boton1000, -1, -1, 3000)
                    .addGroup(panelCompradorLayout.createSequentialGroup()
                        .addGroup(panelCompradorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(labelPrecio)
                            .addComponent(labelTotal)))
                    .addComponent(labelPrecioValor, -1, -1, 3000)
                    .addComponent(labelTotalValor, -1, -1, 3000)
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
                .addComponent(labelTotal)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTotalValor, -1, -1, -1)
                .addGap(15,15,15)
                .addComponent(botonComprar, 30, 30, 30)
                .addContainerGap(166, 3000)));
    }
}   
