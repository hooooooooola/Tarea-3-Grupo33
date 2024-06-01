/** 
 * Subclase de Dulce que se retorna a la hora de comprar el producto
 * 
 * @author Felipe Tilleria
 * @since 22 de abril de 2024
 * 
 * 
 * @see Dulce
 * 
 * 
 * @param serie heredada de Dulce, tiene el fin de distinguir entre cada snickers
 */

class Snickers extends Dulce {
    public Snickers(int serie) {
        super(serie);
    }
    public String sabor() {
        return "snickers";
    }
}