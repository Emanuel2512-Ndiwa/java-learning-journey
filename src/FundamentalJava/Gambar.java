package FundamentalJava;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class TurtlePanel extends JPanel {
    private double x, y;        // posisi turtle
    private double angle;       // arah turtle (derajat)
    private List<Line2D> lines; // daftar garis yang digambar

    public TurtlePanel() {
        x = 200;  // posisi awal turtle
        y = 200;
        angle = 0; // 0 derajat = ke kanan
        lines = new ArrayList<>();
    }

    // jalan maju
    public void move(double distance) {
        double rad = Math.toRadians(angle);
        double newX = x + distance * Math.cos(rad);
        double newY = y - distance * Math.sin(rad);

        lines.add(new Line2D((int)x, (int)y, (int)newX, (int)newY));

        x = newX;
        y = newY;
        repaint();
    }

    // putar kiri/kanan
    public void turn(double degrees) {
        angle += degrees;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        for (Line2D line : lines) {
            g.drawLine(line.x1, line.y1, line.x2, line.y2);
        }
    }

    // inner class untuk garis
    private static class Line2D {
        int x1, y1, x2, y2;
        public Line2D(int x1, int y1, int x2, int y2) {
            this.x1 = x1; this.y1 = y1;
            this.x2 = x2; this.y2 = y2;
        }
    }
}

public class Gambar {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Turtle Graphics");
        TurtlePanel turtle = new TurtlePanel();

        frame.add(turtle);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // contoh menggambar persegi
        new Thread(() -> {
            try {
                for (int i = 0; i < 4; i++) {
                    turtle.move(100);
                    Thread.sleep(500); // delay biar kelihatan proses
                    turtle.turn(90);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
