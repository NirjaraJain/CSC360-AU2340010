

# Reflection — 15 September 2026

## Group 1 Project Implementation

In this class, Group 1 worked on a JavaFX project based on coordinate geometry and linear equations.

The main tasks were:

1. Check if three points form a triangle.
2. Find the intersection of two lines.
3. Represent three line equations as `Ax = b`.
4. Create a JavaFX interface for entering values and showing results.

---

## Checking if Three Points Form a Triangle

Suppose we have three points:

```text
P₁ = (x₁, y₁)
P₂ = (x₂, y₂)
P₃ = (x₃, y₃)
````

Three points form a triangle only if they are **not on the same straight line**.

We can use the area formula:

```text
D = x₁(y₂ − y₃) + x₂(y₃ − y₁) + x₃(y₁ − y₂)
```

Then:

```text
Area = |D| / 2
```

* If `D = 0`, the points are collinear, so they do not form a triangle.
* If `D ≠ 0`, they form a triangle.

With `double` values, a small tolerance should be used instead of checking exactly for zero.

```java
private static final double EPSILON = 1.0e-9;

boolean formsTriangle(
        double x1, double y1,
        double x2, double y2,
        double x3, double y3) {

    double d =
        x1 * (y2 - y3)
        + x2 * (y3 - y1)
        + x3 * (y1 - y2);

    return Math.abs(d) > EPSILON;
}
```

---

## Finding the Intersection of Two Lines

Two lines can be written as:

```text
a₁x + b₁y = c₁
a₂x + b₂y = c₂
```

The determinant is:

```text
D = a₁b₂ − a₂b₁
```

If `D` is not zero, the lines have one intersection point:

```text
x = (c₁b₂ − c₂b₁) / D

y = (a₁c₂ − a₂c₁) / D
```

If `D = 0`, the lines may be:

* **Parallel** — no intersection.
* **Coincident** — infinitely many intersection points.

A line with both `a = 0` and `b = 0` is invalid.

Java records can represent the lines and points:

```java
record Line(double a, double b, double c) {}

record Point(double x, double y) {}
```

---

## Representing Three Lines as `Ax = b`

Three equations can be written as:

```text
a₁x + b₁y = c₁
a₂x + b₂y = c₂
a₃x + b₃y = c₃
```

They can be represented as:

```text
A = [ a₁  b₁ ]     x = [ x ]     b = [ c₁ ]
    [ a₂  b₂ ]         [ y ]         [ c₂ ]
    [ a₃  b₃ ]                       [ c₃ ]
```

So:

```text
Ax = b
```

Here:

* `A` is a `3 × 2` matrix.
* `x` contains the unknowns `x` and `y`.
* `b` contains the constants.

Three lines do not always have one common intersection.

Possible cases are:

* All three meet at one point.
* Each pair has a different intersection.
* Some lines are parallel.
* Some lines are coincident.

To check if all three meet at one point, find the intersection of two lines and then check if that point satisfies the third equation.

---

## JavaFX Interface

A JavaFX `GridPane` can be used to create a simple input form.

Example:

| Line   | X Coefficient | Y Coefficient | Constant |
| ------ | ------------- | ------------- | -------- |
| Line 1 | `a₁`          | `b₁`          | `c₁`     |
| Line 2 | `a₂`          | `b₂`          | `c₂`     |
| Line 3 | `a₃`          | `b₃`          | `c₃`     |

The interface can contain:

* 9 `TextField` controls
* Labels
* Calculate button
* Clear button
* Result area
* Error messages

The input can be stored as:

```java
double[][] coefficients = {
    {a1, b1},
    {a2, b2},
    {a3, b3}
};

double[] constants = {c1, c2, c3};
```

---

## Input Validation

The program should check for:

* Empty fields
* Invalid numbers
* Infinite or `NaN` values
* Lines where both coefficients are zero

Example:

```java
private double readNumber(TextField field, String name) {
    String text = field.getText().trim();

    if (text.isEmpty()) {
        throw new IllegalArgumentException(name + " is required.");
    }

    try {
        double value = Double.parseDouble(text);

        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException(name + " must be finite.");
        }

        return value;
    } catch (NumberFormatException e) {
        throw new IllegalArgumentException(name + " must be a valid number.");
    }
}
```

The calculation button can then read the values, perform the calculations, and display the result.

---

## Possible Results

The program can display messages such as:

* `The three lines intersect at (x, y).`
* `Lines 1 and 2 are parallel.`
* `Lines 1 and 2 are coincident.`
* `The three lines do not have one common intersection.`
* `The three pairwise intersections form a triangle.`
* `Line 3 is invalid.`

---

## Suggested Project Structure

```text
src/main/java/
├── application/
│   └── GeometryApplication.java
├── controller/
│   └── GeometryController.java
├── model/
│   ├── Line.java
│   └── Point.java
└── service/
    └── GeometryService.java
```

* **Application:** Starts the JavaFX program.
* **Controller:** Handles user input and displays results.
* **Model:** Represents lines and points.
* **Service:** Performs the geometry calculations.

Unit tests should check cases such as:

* Points forming a triangle
* Collinear points
* Repeated points
* Intersecting lines
* Parallel lines
* Coincident lines
* Three lines with one common intersection
* Invalid lines

---

## Key Takeaways

* Three points form a triangle when their area is not zero.
* The determinant can be used to find the intersection of two lines.
* A zero determinant means the lines are parallel or coincident.
* Three lines in 2D do not always have one common intersection.
* JavaFX `GridPane` and `TextField` can be used to create the input interface.
* Input should be validated before performing calculations.
* Separating JavaFX code from mathematical logic makes the project easier to test and maintain.

```
```
