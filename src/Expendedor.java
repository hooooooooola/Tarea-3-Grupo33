import javax.swing.*;

/** 
 * La clase Expendedor se encarga principalmente de dos cosas: 
 * recibir una referencia a Moneda y entregar un producto a traves de el metodo comprarProducto() y
 * entregar el PanelComprador.Saldo gracias al metodo getPanelComprador.Saldo()
 * 
 * @author Joseph Matamala
 * @author Felipe Tilleria
 * @author Dario Sepulveda
 * @since 18 de abril de 2024
 * 
 * 
 * 
 */
public class Expendedor {
    private Deposito<Producto> coca, sprite, fanta, super8, snickers;
    private Deposito<Moneda> monVu;
    private String sabor;
    private Producto productoComprado = null;
    

    /**El metodo constructor Expendedor es llamado por Main a la hora de probar su funcionamiento sumado a objetos Moneda y Comprador
     * @see Moneda
     * @see Comprador
     * Este metodo hace uso de la variable numProductos la cual, en un ciclo for, agrega dicha cantidad de productos a cada deposito de dulces o bebidas.
    */
    public Expendedor(int numProductos) { 

        coca = new Deposito<>();
        sprite = new Deposito<>();
        fanta = new Deposito<>();
        super8 = new Deposito<>();
        snickers = new Deposito<>();
        monVu = new Deposito<>();

        System.out.println("se creo un expendedor");

        for (int i = 0; i < numProductos; i++) {
            coca.addObj(new CocaCola(i));
            sprite.addObj(new Sprite(i));
            fanta.addObj(new Fanta(i));
            super8.addObj(new Super8(i));
            snickers.addObj(new Snickers(i));
        }
    }

    /**
     * El metodo comprarProducto recibe un objeto Moneda y el tipo de producto que se va a comprar,
     * 
     * @param m es la Moneda insertada a la maquina
     * @param tipo el tipo de producto (dulce o bebida) que se va a comprar
     * @return no retorna nada, es de tipo void
    */


    public void comprarProducto(int tipo) { // tipo de producto segun el producto seleccionado con MouseListener    
        Producto p = null;
        if (tipo == DatosProducto.COCACOLA.getCualProducto()) {
            p = coca.getObj();
        } else if (tipo == DatosProducto.SPRITE.getCualProducto()) {
            p = sprite.getObj();
        } else if (tipo == DatosProducto.FANTA.getCualProducto()) {
            p = fanta.getObj();
        } else if (tipo == DatosProducto.SUPER8.getCualProducto()) {
            p = super8.getObj();
        } else if (tipo == DatosProducto.SNICKERS.getCualProducto()) {
            p = snickers.getObj();
        }

        if (p == null) {
            JOptionPane.showMessageDialog(null, "No quedan productos");
            sabor = null; 
        } else {
            productoComprado = p;
            System.out.println("comprarProducto: " + PanelComprador.Saldo + " " + PanelComprador.Precio);
            PanelComprador.Saldo -=  PanelComprador.Precio;
            System.out.println("Saldo: " + PanelComprador.Saldo);
            sabor = p.sabor();
            System.err.println("Producto comprado: " + sabor);
        }
    }

    public Deposito getVuelto(){    
        while (PanelComprador.Saldo > 0) {
            if (PanelComprador.Saldo >= 1000) {
                monVu.addObj(new Moneda1000());
                PanelComprador.Saldo -= 1000;           
            } else if (PanelComprador.Saldo >= 500) {
                monVu.addObj(new Moneda500());
                PanelComprador.Saldo -= 500;
            } else if (PanelComprador.Saldo >= 100){
                monVu.addObj(new Moneda100());
                PanelComprador.Saldo -= 100;
            }
        }
        for(int i=0;i<monVu.size();i++){
            System.out.println("moneda extraída serie: "+monVu.get(i).getSerie());
        }
        System.out.println("getVuelto");
        return monVu;
    }

    /**
     * queConsumiste() es un getter del producto que fue elegido
     * @return retorna un String con el nombre del producto
     */
    public String queConsumiste(){
        return sabor;
    }
    
    /**
     * getProductoo() simula un deposito de tamaño 1, en el que se almacena el producto comprado
     * 
     * @return el Producto que se devuelve del Deposito
     */
    public Producto getProducto() {
        Producto p = productoComprado;
        productoComprado = null;
        return p;
    }
    
}