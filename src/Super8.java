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
 * @param serie heredada de Dulce, tiene el fin de distinguir entre cada super 8
 */
class Super8 extends Dulce {
    public Super8(int serie) {
        super(serie);
    }
    public String sabor() {
        return "super8";
    }
}