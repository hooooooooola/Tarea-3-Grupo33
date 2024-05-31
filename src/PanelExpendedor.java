import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    public PanelExpendedor() {
        // Inicializa componentes del PanelExpendedor
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibujar el contenido específico del PanelExpendedor
        g.drawString("Panel Expendedor", 10, 20);
    }
}
