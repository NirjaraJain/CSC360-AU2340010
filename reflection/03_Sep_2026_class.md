# Reflection — 3 September 2026

## Topics Covered

* Text terminals and graphical user interfaces
* Remote access using SSH
* Finding matching elements between lists
* Drawing arrows between matching elements
* Reproducing software failures
* JavaFX interfaces using FXML

---

## Text Terminals and Graphical User Interfaces

I learned about the difference between **text terminals** and **graphical user interfaces (GUIs)**. A terminal allows users to interact with a computer by entering commands, while a GUI uses visual components such as buttons, windows, menus, and icons.

Terminals are useful for automation, scripting, remote administration, and situations where low resource usage is important. GUIs are generally easier for beginners and are useful when visual interaction and feedback are important.

I understood that neither approach is always better. The choice depends on the task and the user's requirements.

---

## Remote Access Using SSH

I learned that **SSH (Secure Shell)** is used to securely connect to and work with another computer over a network.

A basic SSH command is:

```sh
ssh username@example.com
```

SSH encrypts communication between the local and remote machines. It can be used to run commands, manage servers, deploy applications, edit files, and transfer data.

This showed me why SSH is commonly used in software development and server administration, especially when a graphical interface is not necessary.

---

## Finding Matching Elements Between Lists

Another concept covered was finding common elements between two lists.

For example, if two lists contain:

```text
List 1: A, B, C
List 2: C, A, D
```

the program needs to identify that `A` and `C` are present in both lists.

A simple approach is to compare every element of the first list with every element of the second list. For larger datasets, a `HashMap` can be used to improve the lookup process.

I also learned that the matching rules should be clearly defined, especially when dealing with duplicate values, case sensitivity, whitespace, or `null` values.

---

## Drawing Arrows Between Matching Elements

After finding matching elements, the next step is to visually represent the relationships between them.

In JavaFX, the matching items can be displayed on opposite sides of a `Pane`, and `Line` objects can be used to draw arrows between them.

The general process is:

1. Find the position of an item in the first list.
2. Find the position of its matching item in the second list.
3. Draw a line between the two positions.
4. Add an arrowhead to indicate the direction.

I learned that it is better to keep the **matching logic separate from the graphical presentation**. This makes the program easier to understand, test, and maintain.

---

## Reproducibility of Software Failures

I learned that a software failure is much easier to fix when it can be **reproduced consistently**.

A useful bug report should describe:

* What went wrong
* Steps to reproduce the problem
* Expected behavior
* Actual behavior
* Error messages or logs
* Relevant environment information

Reproducing a problem allows developers to investigate its cause, test possible solutions, and verify that the issue has actually been fixed.

---

## FXML in JavaFX

I also learned about **FXML**, which is an XML-based language used to define JavaFX user interfaces.

FXML allows the structure of the interface to be separated from the Java code that controls its behavior. It can define components such as buttons, labels, text fields, and layouts.

For example:

```xml
<Button text="Continue" onAction="#handleContinue" />
```

The controller can then contain the corresponding method:

```java
@FXML
private void handleContinue() {
    // Handle button action
}
```

This separation makes larger JavaFX applications easier to organize and maintain. FXML can also be used with tools such as Scene Builder to design interfaces visually.

---

## Key Takeaways

* Terminals are useful for efficient command-line work, automation, and remote administration.
* GUIs provide visual and interactive ways to use applications.
* SSH provides secure remote access to computers.
* Lists can be compared to find matching elements, with maps helping improve lookup efficiency.
* JavaFX can visually represent relationships using lines and arrows.
* Reproducible failures make debugging and testing fixes easier.
* FXML separates JavaFX interface design from application logic.
