import java.util.ArrayList;

/**
 * La clase Deposito representa un deposito que almacena productos y
 * monedas.
 * @author Felipe Tilleria
 * @author Joseph Matamala
 * @since 22 de abril de 2024
 */
public class Deposito<T> {
    private ArrayList<T> t; // Lista de objetos

    /**
     * Constructor de la clase Deposito.
     * Inicializa las listas de objetos como vacias.
     */
    public Deposito() {
        t = new ArrayList<>();
    }

    /**
     * Agrega un objeto al deposito.
     *
     * @param t El objeto a agregar.
     */
    public void addObj(T t) {
        this.t.add(t);
    }

    /**
     * Obtiene el primer objeto del deposito y lo elimina de la lista.
     *
     * @return El objeto obtenido o null si la lista esta vacia.
     */
    public T getObj() {
        if (t.isEmpty()) {
            return null;
        }
        return t.remove(0);
    }
}
