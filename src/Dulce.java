/** 
 * Subclase de Producto, la cual sirve de plantilla para insertar nuevos dulces a la maquina y que la implementacion de mas sea sencilla,
 * en nuestro caso usamos dos:
 * @author Felipe Tilleria
 * @since 22 de abril de 2024
 * 
 * @see Snickers
 * @see Super8
 * 
 * @see Producto
 * 
 * 
 * @param serie la serie es para diferenciar entre cada dulce
 */
abstract class Dulce extends Producto {
    public Dulce(int serie) {
        super(serie);
    }
    public abstract String sabor();
}