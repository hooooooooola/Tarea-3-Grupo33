/** 
 * Excepcion que ocurre en el caso de que no se haya insertado saldo a la maquina expendedora, es decir,
 * no se haya recibido ningun puntero a moneda:
 * 
 * @see Moneda
 * 
 * @author Dario Sepulveda
 * @since 22 de abril de 2024
 * 
 * @param message almacena el mensaje personalizado que la consola va a imprimir cuando la
 * excepcion ocurra
 */
public class PagoIncorrectoException extends Exception {
    public PagoIncorrectoException(String message){
        super(message);
    }
}