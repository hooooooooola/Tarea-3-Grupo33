/** 
 * Subclase de Moneda que tiene el fin de instanciar el metodo getValor() con una tasa definida
 * en este caso, con un valor de 500
 * 
 * @author Joseph Matamala
 * @since 18 de abril de 2024
 * 
 * @see Moneda
 * 
 * @param serie heredada de Moneda, tiene el fin de distinguir entre cada moneda
 */
class Moneda500 extends Moneda{
    public Moneda500(){
        super();
    }
    public int getValor(){
        return 500;
    }
}