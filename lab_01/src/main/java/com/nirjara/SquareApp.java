package com.nirjara;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

public class SquareApp extends JFrame {

    public SquareApp(int squareSize) {

        setTitle("CSC360 - Square");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SquarePanel panel = new SquarePanel(squareSize);
        add(panel);

        pack();
        setLocationRelativeTo(null);
    }

    public static class SquarePanel extends JPanel {

        private final int squareSize;

        public SquarePanel(int squareSize) {

            this.squareSize = squareSize;

            setPreferredSize(new Dimension(500, 500));
            setBackground(Color.WHITE);
        }

        @Override
        protected void paintComponent(Graphics g) {

            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;

            // Set square color
            g2d.setColor(Color.RED);

            // Set line thickness
            g2d.setStroke(new BasicStroke(3));

            // Calculate position to center the square
            int x = (getWidth() - squareSize) / 2;
            int y = (getHeight() - squareSize) / 2;

            // Draw square
            g2d.drawRect(x, y, squareSize, squareSize);
        }
    }

    public static void main(String[] args) {

        int size = 200;

        // Get square size from command line
        if (args.length > 0) {

            try {

                size = Integer.parseInt(args[0]);

                if (size <= 0) {
                    System.out.println("Size must be greater than 0.");
                    return;
                }

            } catch (NumberFormatException e) {

                System.out.println("Please enter a valid number.");
                return;
            }
        }

        final int finalSize = size;

        SwingUtilities.invokeLater(() -> {

            SquareApp app = new SquareApp(finalSize);
            app.setVisible(true);

        });
    }
}