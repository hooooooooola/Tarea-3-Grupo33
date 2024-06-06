import javax.swing.*;

/** 
 * La clase Expendedor se encarga principalmente de dos cosas: 
 * recibir una referencia a Moneda y entregar un producto a traves de el metodo comprarProducto() y
 * entregar el PanelComprador.saldo gracias al metodo getPanelComprador.saldo()
 * 
 * @author Joseph Matamala
 * @author Felipe Tilleria
 * @author Dario Sepulveda
 * @since 18 de abril de 2024
 * 
 * 
 * 
 */
public class Expendedor{
    public static Deposito<Producto> coca, sprite, fanta, super8, snickers;
    private Deposito<Moneda> monVu;
    private String sabor;
    private Producto productoComprado = null;
    public static boolean espacioDisponible = true;

    public Producto getProductoComprado() {
        return productoComprado;
    }

    public void setProductoComprado(Producto productoComprado) {
        this.productoComprado = productoComprado;
    }

    //private static JLabel labelCompra;
    public static int intCompra;


    //public static  JLabel getLabelCompra() {
    //    return labelCompra;
    //}

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
     * @return retorna el producto si todo sale bien, en caso contrario lanza una excepcion
     * 
    */


    public void comprarProducto(int tipo) { // tipo de producto segun el producto seleccionado con MouseListener    

        Producto p = null;
        if (tipo == DatosProducto.COCACOLA.getCualProducto()) {
            p = coca.getObj();
            intCompra = 1;
            System.out.println("quedan: " + coca.size() + " cocas");
        } else if (tipo == DatosProducto.SPRITE.getCualProducto()) {
            p = sprite.getObj();
            intCompra = 3;
            System.out.println("quedan: " + sprite.size() + " sprites");
        } else if (tipo == DatosProducto.FANTA.getCualProducto()) {
            p = fanta.getObj();
            intCompra = 2;
            System.out.println("quedan: " + fanta.size() + " fantas");
        } else if (tipo == DatosProducto.SUPER8.getCualProducto()) {
            p = super8.getObj();
            intCompra = 5;

            System.out.println("quedan: " + super8.size() + " super8s");
        } else if (tipo == DatosProducto.SNICKERS.getCualProducto()) {
            p = snickers.getObj();
            intCompra = 4;
            System.out.println("quedan: " + snickers.size() + " snickers");
        }


        if (p == null) {
            intCompra = 0;
            JOptionPane.showMessageDialog(null, "No quedan productos");
            sabor = null; 
        } else {
            productoComprado = p;
            espacioDisponible = false;
            sabor = p.sabor();
            System.out.println("Producto comprado: " + sabor + ", valor: " + PanelComprador.precio + ", Saldo: " + PanelComprador.saldo);
            PanelComprador.saldo -=  PanelComprador.precio;
            System.out.println("Saldo despues de comprar: " + PanelComprador.saldo);
            System.out.println("");
            
        }
    }

    public Deposito getVuelto(){    

        monVu.clear();
        while (PanelComprador.saldo > 0) {
            if (PanelComprador.saldo >= 1000) {
                monVu.addObj(new Moneda1000());
                PanelComprador.saldo -= 1000;           
            } else if (PanelComprador.saldo >= 500) {
                monVu.addObj(new Moneda500());
                PanelComprador.saldo -= 500;
            } else if (PanelComprador.saldo >= 100){
                monVu.addObj(new Moneda100());
                PanelComprador.saldo -= 100;
            }

        }
        int vuelto = 0;
        for(int i=0;i<monVu.size();i++){
            System.out.println("moneda extraída serie: "+monVu.get(i).getSerie());
            vuelto += monVu.get(i).getValor();
        }
        System.out.println("vuelto: "+ vuelto);
        System.out.println("getVuelto");
        return monVu;
    }

    /**
     * getProducto() simula un deposito de tamaño 1, en el que se almacena el producto comprado
     * 
     * @return el Producto que se devuelve del Deposito
     */
    public Producto getProducto() {
        Producto p = productoComprado;
        System.out.println("getProducto: "+p.sabor()+" serie: "+p.getSerie());
        productoComprado = null;
        espacioDisponible = true;
        return p;
    }

    /**
     * queConsumiste() es un getter del producto que fue elegido
     * @return retorna un String con el nombre del producto
     */
    public String queConsumiste(){
        return sabor;
    }
}