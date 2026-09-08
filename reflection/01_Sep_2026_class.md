# Reflection — 1 September 2026

## Topics Covered

- Drawing a triangle from three coordinates
- Drawing circles on a JavaFX `Canvas` using mouse input
- Connecting circles with arrows
- Testing whether a point is inside a circle
- Trees and common tree terminology
- Binary trees and binary search trees

---

## What I Learned

In this class, I learned how coordinates and basic geometry can be used to create shapes in JavaFX. I learned how three non-collinear points can be connected to form a triangle using `strokePolygon()` or `fillPolygon()`.

I also learned how mouse events can be used to create circles dynamically on a JavaFX `Canvas`. Storing the circle information makes it easier to select, connect, and redraw the circles later.

For connecting circles, I learned how to calculate the direction between two circles and draw an arrow between their boundaries instead of through their centers.

I also learned how to check whether a point is inside a circle by comparing the squared distance from the point to the circle's center with the squared radius.

Finally, I learned the basic concepts of trees, binary trees, and Binary Search Trees (BST). I understood how a BST uses an ordering rule to make searching and insertion more efficient when the tree is balanced.

---

## Personal Learning Challenge

The main challenge for me was understanding how the mathematical calculations connect with the JavaFX drawing logic. Calculating distances and finding the correct positions for arrows was initially confusing. Breaking the calculations into smaller steps helped me understand how the formulas are used in the program.

---

## Specific Class Example

One example that helped me understand the concepts was creating a circle by right-clicking on the JavaFX `Canvas`. The mouse coordinates were used as the center of the circle. This helped me understand how mouse events, coordinates, and graphical elements work together.

---

## Personal Reflection

I found this class useful because it connected programming with mathematics and data structures. Instead of only learning JavaFX methods, I had to understand the logic behind the calculations and how they affect the graphical output.

This helped me realize that breaking a problem into smaller logical steps makes implementation easier. I also feel more comfortable now with using coordinates, mouse events, and basic geometry to create interactive JavaFX applications.

---

## Key Takeaways

- Three non-collinear points can be connected to create a triangle.
- JavaFX `Canvas` can be used for interactive drawing.
- Mouse events can be used to create and select graphical objects.
- Mathematical calculations can be used to position arrows and detect points inside circles.
- Trees represent hierarchical relationships between nodes.
- A binary tree can have at most two children per node.
- A Binary Search Tree follows an ordering rule and can provide efficient searching when balanced.
