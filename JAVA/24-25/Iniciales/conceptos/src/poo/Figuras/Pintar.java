import javax.swing.*;
import java.awt.*;

public class Pintar extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibujar un cuadrado
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 100, 100);

        // Dibujar un círculo
        g.setColor(Color.RED);
        g.fillOval(200, 50, 100, 100);

        // Dibujar texto al lado de las figuras
        g.setColor(Color.BLACK); // Color del texto
        g.drawString("Cuadrado Azul", 50, 170); // Texto cerca del cuadrado
        g.drawString("Círculo Rojo", 220, 170); // Texto cerca del círculo

        // Dibujar texto en una posición específica
        g.drawString("Texto en posición (300, 250)", 300, 250);
    }

    public static void main(String[] args) {
        // Crear la ventana
        JFrame frame = new JFrame("Dibujando Figuras con Texto");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Añadir el panel personalizado
        Pintar panel = new Pintar();
        frame.add(panel);

        // Mostrar la ventana
        frame.setVisible(true);
    }
}