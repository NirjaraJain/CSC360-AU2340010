# Reflection — 17 September 2026
**Group 1 Project: TriangleFX**

During this class, I worked on the Group 1 project, TriangleFX, and contributed to finalizing its requirements, documentation, and overall implementation approach. The project focuses on developing a JavaFX desktop application that takes three linear equations as input, calculates their points of intersection, checks whether they form a valid triangle, and displays the resulting triangle graphically.

### Work Completed

My primary contribution during this session was working on the project's documentation and planning.

1. **Defining Project Requirements:** I helped establish the main objectives and functional requirements of TriangleFX. These included accepting three linear equations, supporting integer and decimal coefficients, calculating pairwise intersections, identifying parallel or coincident lines, and validating whether the resulting points form a proper triangle.

2. **Updating Project Documentation:** I worked on improving the repository's README file to clearly explain the project's purpose, proposed features, supported equation formats, and current development status. I ensured that the documentation reflected what had actually been completed rather than presenting planned features as implemented.

3. **Preparing the Implementation Plan:** I contributed to creating a structured eight-phase development plan, starting with documentation and JavaFX project setup, followed by equation parsing, geometry calculations, interface development, canvas rendering, testing, and finalization. This helped us establish clear milestones and understand the work that needs to be completed.

4. **Using Git and GitHub:** I worked with the branch and pull-request workflow by making changes on a separate branch, committing updates, and merging the finalized implementation plan into the main branch through a pull request. This gave me practical experience with collaborative version control and maintaining an organized project repository.

5. **Discussing Design Alternatives:** We explored and compared different approaches to the project design. These discussions helped us finalize the application structure and divide its functionality into separate modules for equation parsing, geometry calculations, user interaction, and graphical representation.

### Understanding of the Proposed Implementation

Through the planning process, I understood how the application would process user input step by step. First, the equation parser will convert the entered equations into the standard form Ax + By = C. The geometry component will then calculate the intersections between the three lines and check whether they produce three distinct, non-collinear points. Finally, the JavaFX interface will display the triangle on a canvas along with its vertex labels or appropriate error messages.

We also identified important edge cases, such as parallel lines, coincident lines, duplicate intersection points, and collinear vertices. Handling these situations will be necessary to ensure that the application works correctly for different inputs.

### What I Learned

This session helped me understand that proper planning and documentation are essential before starting the actual implementation of a software project. Clearly defining requirements and dividing the application into smaller components makes development more organized and manageable.

I also gained a better understanding of collaborative GitHub practices, particularly working with branches, commits, and pull requests. Additionally, comparing different design approaches helped me realize the importance of modular programming, where each component has a specific responsibility and can be developed and tested independently.

### Next Steps

Our next step is to set up the JavaFX project using Maven and ensure that the application can run successfully. Once the basic project structure is ready, we will begin implementing the equation parser and gradually integrate the geometry calculations, user interface, and canvas rendering.

### Overall Reflection

Overall, this session was productive because it helped us establish a clear foundation for TriangleFX. Although the actual application implementation is yet to begin, we made significant progress in defining the requirements, organizing the development process, and deciding on the application's architecture. I learned that having a well-defined plan before coding helps avoid confusion, improves teamwork, and makes it easier to track progress throughout the project.
