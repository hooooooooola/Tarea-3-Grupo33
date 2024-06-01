/** 
 * Excepcion que ocurre en el caso de que se agoten los productos en la maquina expendedora, 
 * o en el caso de que se ingrese un codigo invalido de producto, dados por la enumeracion:
 * 
 * @author Dario Sepulveda
 * @since 22 de abril de 2024
 * 
 * @see DatosProducto
 * 
 * 
 * @param message almacena el mensaje personalizado que la consola va a imprimir cuando la
 * excepcion ocurra.
 */
public class NoHayProductoException extends Exception {
    public NoHayProductoException(String message){
        super(message);
    }
}