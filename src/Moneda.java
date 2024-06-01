/**
 * La clase Moneda representa el dinero con el que el Comprador va a adquirir un Producto del Expendedor
 * 
 * @author Joseph Matamala
 * @since 18 de abril de 2024
 * 
 * @see Comprador
 * @see Producto
 * @see Expendedor
 * 
 * @param serie la serie es para diferenciar entre cada moneda
 * 
 * el metodo abstracto getValor() es una plantilla para poder sobrescribrir con la tasacion de cada Moneda (100, 500 o 1000)
 */

abstract class Moneda{
    private int serie;
    public Moneda(){
    }
    public int getSerie(){
        return serie;
    }
    public abstract int getValor();
}