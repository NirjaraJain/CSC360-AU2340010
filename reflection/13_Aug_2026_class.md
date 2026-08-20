# Reflection — 13 August 2026

## Topic: Drawing a Square with Java Swing and Java2D

In this class, I learned how to create a simple graphical application using **Java Swing** and **Java2D**. We created a window and used a custom `JPanel` to draw a square inside it.

### What I learned

- Learned how to create a window using **JFrame**.
- Understood how **JPanel** can be used as a drawing surface.
- Learned how to override `paintComponent(Graphics g)` for custom drawing.
- Understood the difference between `Graphics` and `Graphics2D`.
- Learned how to draw a square using `drawRect()`.
- Understood that a square needs the **same width and height**.
- Learned how to calculate the `x` and `y` coordinates to keep the square **centered in the window**.
- Understood how the square automatically stays centered when the window is resized.
- Learned about **Color** and **BasicStroke** to change the appearance and thickness of the square.
- Learned how **RenderingHints** and anti-aliasing can make the edges of the drawing smoother.
- Understood why `super.paintComponent(g)` should be called before doing custom drawing.
- Learned why a separate `Graphics2D` object is created and why it should be released using `dispose()`.
- Understood the importance of the **Event Dispatch Thread (EDT)** when creating Swing applications.
- Practiced compiling and running the project using **Maven**.

### Reflection

This class helped me understand the basic process of creating graphics in Java. I learned that **Swing is mainly responsible for the user interface**, while **Java2D provides the tools for drawing shapes**. The most useful part for me was understanding how the square can be centered using the current width and height of the panel. This also showed me how graphical applications can respond to window resizing instead of using fixed positions.

Overall, I now have a better understanding of how Java handles GUI applications, custom painting, and basic 2D graphics.