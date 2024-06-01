/** 
 * Excepcion que ocurre en el caso de que se el saldo necesario para comprar un producto sea mayor
 * que el insertado en la maquina expendedora, es decir, que el int retornado por el getValor() de moneda,
 * sea menor al de precioProducto dado por la enumeracion de la clase DatosProducto.
 * 
 * @see DatosProducto
 * @see Moneda
 * 
 * @author Dario Sepulveda
 * @since 22 de abril de 2024
 * 
 * @param message almacena el mensaje personalizado que la consola va a imprimir cuando la
 * excepcion ocurra
 */
public class PagoInsuficienteException extends Exception {
    public PagoInsuficienteException(String message){
        super(message);
    }
}