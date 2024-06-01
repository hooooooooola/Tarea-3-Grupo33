/**
 * El enum DatosProducto representa diferentes productos junto con su
 * numero de producto y precio.
 * 
 * @author Felipe Tilleria
 * @since 22 de abril de 2024
 * 
 *        
 */
public enum DatosProducto {
    COCACOLA(1, 500),
    FANTA(2, 400),
    SPRITE(3, 300),
    SNICKERS(4, 800),
    SUPER8(5, 600);

    private int cualProducto;
    private int precioProducto;

    /**
     * Constructor privado para inicializar los atributos del producto.
     *
     * @param cualProducto   El identificador del producto.
     * @param precioProducto El precio del producto.
     */
    private DatosProducto(int cualProducto, int precioProducto) {
        this.cualProducto = cualProducto;
        this.precioProducto = precioProducto;
    }

    /**
     * Obtiene el numero de producto.
     *
     * @return El numero de producto.
     */
    public int getCualProducto() {
        return cualProducto;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return El precio del producto.
     */
    public int getPrecioProducto() {
        return precioProducto;
    }
}