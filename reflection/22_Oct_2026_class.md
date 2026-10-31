# Reflection — 22 October 2026
**Core Essentials of a High-Quality Software Project**

During this session, I learned about the important practices that contribute to developing a well-structured, reliable, and maintainable software project. We discussed how writing code is only one part of software development and how proper documentation, project organization, version control, and testing are equally important in producing a professional application.

### 1. Importance of Project Documentation

I learned that the README file is one of the most important parts of a software repository because it provides an overview of the project to users, evaluators, and developers.

A well-prepared README should include:
- A brief explanation of the project's purpose and functionality.
- Important features and technologies used.
- Screenshots or demonstrations of the application's interface.
- Software requirements and installation instructions.
- Commands required to build, test, and run the application.
- Information about the application architecture, limitations, and possible improvements.

I understood that proper documentation makes it easier for someone new to the project to understand its functionality without having to examine the entire source code.

### 2. Maintaining a Proper Project Structure

Another important topic covered was the importance of following a standardized folder structure, particularly when working with Java and Maven.

I learned how a typical Maven project separates source code, resources, and test files into different directories. For example, `src/main/java` contains the application's Java classes, `src/main/resources` stores resources such as CSS files and images, and `src/test/java` contains automated test cases.

Following this structure makes the project easier to navigate and allows development tools such as IntelliJ IDEA and Eclipse to recognize and manage files properly. It also makes the application easier to build and maintain.

### 3. Writing Meaningful Git Commit Messages

We also discussed how maintaining a clear Git history is important when working collaboratively on software projects.

I learned that commit messages should explain the changes made rather than using general descriptions. Different commit types can be used depending on the purpose of the change, such as:

- `feat` for introducing new functionality.
- `fix` for resolving errors.
- `docs` for documentation-related changes.
- `refactor` for improving existing code structure.
- `test` for adding or modifying test cases.
- `chore` for configuration and maintenance tasks.

I understood that making smaller and more focused commits helps team members review changes, identify problems, and understand how the project has developed over time.

### 4. Understanding the Importance of Javadocs

Another concept I learned was the role of Javadocs in documenting Java applications. While a README explains the project at a broader level, Javadocs provide more detailed information about individual classes and methods.

I understood that useful Javadocs should explain the purpose of a method, its parameters, expected return values, and possible exceptions. Tags such as `@param`, `@return`, `@throws`, and `@see` help provide this information in a structured manner.

I also learned that Javadocs can be converted into HTML documentation using Maven commands, making it easier for developers to understand and use the code.

### 5. Importance of Automated Testing

We discussed how testing should be included throughout the development process rather than being performed only after the application is completed.

I learned about three major types of testing:

- **Unit Testing:** Used to check individual methods and classes independently.
- **Integration Testing:** Ensures that multiple components work correctly when connected.
- **System and UI Testing:** Checks the complete application and verifies how it behaves when users interact with it.

I also learned about the Arrange-Act-Assert (AAA) pattern, which organizes test cases into three stages: preparing the required inputs, executing the functionality, and checking whether the expected result is obtained.

JUnit 5 is one of the tools used for writing automated tests in Java applications. Automated testing helps identify errors early, prevent existing functionality from breaking, and improve confidence when making changes to the code.

### What I Learned

This session helped me understand that developing a good software application involves much more than implementing its features. I learned the importance of maintaining proper documentation, organizing files systematically, writing meaningful commit messages, documenting Java methods, and testing different parts of the application.

I also understood how these practices are connected. A standardized project structure makes development easier, clear documentation helps other developers understand the code, and automated tests ensure that changes do not affect existing functionality.

### Application to My Project

These concepts are relevant to my JavaFX Master-Detail application as well. Maintaining a proper Maven structure, organizing Java classes and packages, documenting important methods using Javadocs, and writing appropriate test cases can make the project easier to understand and maintain. Clear Git commit messages and an informative README would also help present our work more professionally.

### Overall Reflection

Overall, this session helped me understand the engineering practices required to develop software that is not only functional but also well-organized and maintainable. I realized that documentation, code organization, version control, and testing are essential parts of the software development lifecycle. These practices will help me improve the quality of my current JavaFX project and will also be useful when working on larger software projects in the future.
