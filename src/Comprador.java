/**
 * La clase Comprador representa una persona que llega al expendedor con una moneda y elige el producto que quiera recibir
 * 
 * @author Joseph Matamala
 * @author Felipe Tilleria
 * @author Dario Sepulveda
 * @since 18 de abril de 2024
 * 
 */
public class Comprador {
    private String sabor;
    private int vuelto = 0;
    /**El metodo constructor Comprador es llamado por Main a la hora de probar su funcionamiento sumado a objetos Moneda y Expendedor
     * @see Moneda
     * @see Expendedor
     * 
     * En este metodo se atrapan todas las excepciones que podrian ocurrir, y finalmente se calcula el vuelto que se tiene que devolver
     * recibiendo cada objeto de Moneda de la ArrayList de monedas en Deposito
     * @see Deposito
     * @throws PagoInsuficienteException
     * @throws NoHayProductoException
     * @throws PagoIncorrectoException
    */
    public Comprador(Moneda m, int cualProducto, Expendedor exp) {
        try{
            
            Producto p = exp.comprarProducto(m, cualProducto);
            if(p != null ){
                sabor = p.sabor();
            }
            else {
                sabor = null;
            }
        }
        catch(NoHayProductoException nhpe){
            System.out.println(nhpe.getMessage());
        }
        catch(PagoIncorrectoException pinc){
            System.out.println(pinc.getMessage());
        }
        catch(PagoInsuficienteException pins){
            System.out.println(pins.getMessage());
        }
        catch(Exception e){
            System.out.println("error generico");
        }
        finally{
            while (true) {
                m = exp.getVuelto();
                if (m != null) {
                    vuelto = vuelto + m.getValor();
                } else {
                    break;
                }
            }
        }
    }
    /**
     * cuantoVuelto() es un getter del dinero que el comprador recibe de vuelta
     * @return retorna un int con el vuelto que previamente fue calculado en el metodo getVuelto()
     */
    public int cuantoVuelto(){
        return vuelto;
    }
    /**
     * queConsumiste() es un getter del producto que fue elegido
     * @return retorna un String con el nombre del producto
     */
    public String queConsumiste(){
        return sabor;
    }
}