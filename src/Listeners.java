import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listeners {

    public class CocaCola implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("CocaCola presionado");
        }
    }
    public ActionListener CocaCola() {
        return new CocaCola();
    }


    public class Fanta implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Fanta presionado");
        }
    }
    public ActionListener Fanta() {
        return new Fanta();
    }

    public class Sprite implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Sprite presionado");
        }
    }
    public ActionListener Sprite() {
        return new Sprite();
    }

    public class Otros implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Otra wea presionado");
        }
    }
    public ActionListener Otros() {
        return new Otros();
    }

}