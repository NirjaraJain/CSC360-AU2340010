# Reflection — 18 August 2026

## Topics Covered

In this class, I learned about the **Java graphics coordinate system**, how to calculate coordinates for drawing a square, the structure of a **Maven project**, the purpose of `pom.xml`, and the basic roles of **AWT, Swing, Java2D, and JavaFX**.

## Drawing a Square

I learned that a square has four equal sides, so its width and height must be the same. If the side length is `s` and the center is `(cx, cy)`, the top-left corner can be calculated as:

```text
x = cx - s / 2
y = cy - s / 2
```

In Java2D, the square can then be drawn using:

```java
g2d.drawRect(x, y, s, s);
```

A filled square can be created using:

```java
g2d.fillRect(x, y, s, s);
```

## Java Coordinate System

In Java graphics, `(0, 0)` is located at the **top-left corner**. The x-coordinate increases toward the right, while the y-coordinate increases downward.

This is different from the usual mathematical coordinate system, where the positive y-axis normally points upward.

To keep a square centered inside a `JPanel`, we can use:

```java
int side = 200;

int x = (getWidth() - side) / 2;
int y = (getHeight() - side) / 2;

g2d.drawRect(x, y, side, side);
```

This allows the square to remain centered even when the window is resized.

## Maven Project Structure

I also learned about the standard structure of a Maven project:

```text
project/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
│       ├── java/
│       └── resources/
└── target/
```

The important directories are:

- `src/main/java` contains the main source code.
- `src/main/resources` contains application resources.
- `src/test/java` contains test code.
- `src/test/resources` contains resources used for testing.
- `target` contains files generated during the Maven build.

## `pom.xml`

The `pom.xml` file stands for **Project Object Model**. It is the main configuration file of a Maven project.

It is used to manage:

- Project information and version.
- Java version.
- Dependencies.
- Build plugins.
- Build configuration.

Some common Maven commands are:

```bash
mvn clean
mvn compile
mvn test
mvn package
```

Maven makes it easier to manage dependencies and build Java projects in a consistent way.

## Java Graphics Frameworks

### AWT

**AWT (Abstract Window Toolkit)** is one of Java's original GUI frameworks. It provides basic GUI components, event handling, and drawing functionality.

### Swing

**Swing** is built on top of AWT and provides components such as:

```text
JFrame
JPanel
JButton
JLabel
JTextField
```

Swing is commonly used for creating desktop GUI applications.

### Java2D

**Java2D** provides drawing capabilities for Java applications. It can be used to draw:

- Lines
- Rectangles
- Circles
- Curves
- Text
- Other graphical shapes

It also supports colors, strokes, transformations, and anti-aliasing.

### JavaFX

**JavaFX** is another Java framework for creating desktop graphical applications. It provides features such as:

- CSS styling
- Animations
- Visual effects
- Modern user interfaces
- Scene graph-based graphics

## Key Takeaways

- Learned how to calculate coordinates for drawing a square.
- Understood the **Java graphics coordinate system**.
- Learned how to center a square dynamically inside a `JPanel`.
- Understood the standard structure of a **Maven project**.
- Learned the purpose of the `pom.xml` file.
- Learned some commonly used Maven commands.
- Understood the basic roles of **AWT, Swing, Java2D, and JavaFX**.
- Learned how Java2D can be used with Swing to create custom graphics.

## Reflection

This class helped me understand how **geometry and programming work together in computer graphics**. I found the coordinate calculations especially useful because they showed me how mathematical concepts can be directly applied to drawing shapes on a screen.

I also gained a better understanding of how Maven organizes a Java project and how `pom.xml` helps manage the project configuration and dependencies. Overall, the class gave me a clearer understanding of the tools and concepts used to create graphical applications in Java.