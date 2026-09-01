# Reflection — 27 August 2026

## Topic: Maven, Java Compatibility, JUnit, and Testing

In this class, I learned more about Maven and how Java projects are built and tested. We also discussed Java versions, character encoding, compatibility, JUnit, and the difference between unit testing and integration testing.

## What I Learned

* Learned how the **Maven build lifecycle** works and how commands like `compile`, `test`, `package`, and `install` are used.
* Understood that Maven runs the required previous phases when a later phase is executed.
* Learned the difference between **Java source, target, and release versions**.
* Understood that newer Java versions can generally run older bytecode, but older Java versions cannot normally run newer bytecode.
* Learned why **UTF-8** is commonly used for handling text and characters.
* Understood the meaning of **backward and forward compatibility** in Java.
* Learned about **JUnit** and how it is used to create automated tests for Java programs.
* Understood that **unit testing** focuses on testing a small part of a program, such as a method or class.
* Learned that **integration testing** checks whether different parts of an application work correctly together.

## Maven Commands

I also learned the basic purpose of some commonly used Maven commands:

* `mvn compile` — compiles the source code.
* `mvn test` — compiles the code and runs the tests.
* `mvn package` — builds and packages the application.
* `mvn install` — packages the project and stores it in the local Maven repository.

This helped me understand how Maven manages different stages of a Java project.

## Unit Testing and Integration Testing

One important thing I learned was the difference between unit testing and integration testing.

**Unit testing** checks individual parts of the application separately. It is usually faster and helps find problems in specific methods or classes.

**Integration testing** checks whether multiple parts of the application work properly together. It can help identify problems with data flow, databases, or communication between different components.

Both types of testing are useful because they help improve the reliability of an application.

## Key Takeaways

* Maven provides an organized way to build and manage Java projects.
* Different Maven lifecycle phases perform different tasks.
* Choosing the correct Java version is important for compatibility.
* UTF-8 is a useful standard for handling text and characters.
* JUnit makes automated testing easier in Java.
* Unit testing checks individual components, while integration testing checks how components work together.
* Testing helps find problems early and makes applications more reliable.

Overall, this class helped me understand the connection between **Maven, Java versions, compatibility, and software testing**, and how these concepts are used together in a Java project.
