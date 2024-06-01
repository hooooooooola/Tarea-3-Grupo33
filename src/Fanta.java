/** 
 * Subclase de bebida que se retorna a la hora de comprar el producto
 * 
 * @author Felipe Tilleria
 * @since 22 de abril de 2024
 * 
 * 
 * @see Bebida
 * 
 * 
 * @param serie heredada de bebida, tiene el fin de distinguir entre cada fanta
 */
class Fanta extends Bebida{
    public Fanta(int serie){
        super(serie);
    }
    public String sabor(){
        return "fanta";
    }
}