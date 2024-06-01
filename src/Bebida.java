/** 
 * Subclase de Producto, la cual sirve de plantilla para insertar nuevas bebidas a la maquina y que la implementacion de mas sea sencilla,
 * en nuestro caso usamos tres:
 * 
 * @author Joseph Matamala
 * @since 22 de abril de 2024
 * 
 * 
 * @see CocaCola
 * @see Fanta
 * @see Sprite
 * 
 * @see Producto
 * 
 * 
 * 
 * @param serie la serie es para diferenciar entre cada bebida
 */
abstract class Bebida extends Producto{
    public Bebida(int serie){
        super(serie);
    }
    public abstract String sabor();
}