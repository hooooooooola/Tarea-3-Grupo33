/** 
 * Subclase de Bebida que se retorna a la hora de comprar el producto
 * 
 * @author Felipe Tilleria
 * @since 22 de abril de 2024
 * 
 * 
 * @see Bebida
 * 
 * 
 * @param serie heredada de Bebida, tiene el fin de distinguir entre cada coca cola
 */
class CocaCola extends Bebida{
    public CocaCola(int serie){
        super(serie);
    }
    public String sabor(){
        return "cocacola";
    }
}