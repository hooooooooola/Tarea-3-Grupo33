/** 
 * La clase Expendedor se encarga principalmente de dos cosas: 
 * recibir una referencia a Moneda y entregar un producto a traves de el metodo comprarProducto() y
 * entregar el vuelto gracias al metodo getVuelto()
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
     * 
     * Este tambien se encarga de manejar las excepciones que pueden ocurrir en casos particulares:
     * @throws PagoInsuficienteException
     * @throws NoHayProductoException
     * @throws PagoIncorrectoException
     */
    public Producto comprarProducto(Moneda m, int tipo) throws PagoInsuficienteException, NoHayProductoException, PagoIncorrectoException{

        if(tipo>5||tipo<1){
            monVu.addObj(m);
            throw new NoHayProductoException("\033[0;31m" + "El numero de producto no es valido" + "\033[0m");
        }

        DatosProducto[] arrProductos = DatosProducto.values();
        int precio = arrProductos[tipo-1].getPrecioProducto();

        if (m == null) {
            throw new PagoIncorrectoException("\033[0;31m" + "No has insertado monedas en el expendedor" + "\033[0m");
        }

        if (m.getValor() < precio) {
            monVu.addObj(m);
            throw new PagoInsuficienteException("\033[0;31m" + "El saldo es insuficiente para comprar el producto" + "\033[0m");
        }

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
                monVu.addObj(m);
                throw new NoHayProductoException("\033[0;31m" + "No quedan productos en el expendedor" + "\033[0m");
            } 
            
            else {
                int vuelto = m.getValor() - precio;

                while (vuelto > 0) {
                    if (vuelto >= 100) {
                        monVu.addObj(new Moneda100());
                        vuelto -= 100;
                        continue;
                    }
                }
            }
            return p;
        }
    /**
     * getVuelto() tiene una referencia a un objeto Deposito en el que se almacenan las monedas
     * 
     * @return la Moneda que se devuelve del Deposito
     */
    public Moneda getVuelto() {
        return monVu.getObj();
    }
}