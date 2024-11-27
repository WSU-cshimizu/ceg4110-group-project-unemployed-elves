# Design Specification
### Table of Contents

1. **Data Flow Diagrams (R.1, R.2)**  
   Two different diagrams representing data flows on the first web page and the second, including the success page and interaction with it.

2. **Sequence Diagram (General)**  
   One diagram for the whole user-application interaction. Services represent actions on the backend, and repositories represent interactions between the backend and the database.

3. **UML Diagram (General)**  
   One class diagram representing classes and the interactions between them. Dependency interactions in code are represented in more than half of the cases by the `@Autowired` annotation. Therefore, it's a dependency interaction.

4. **UI Mock-ups (R.1, R.2)**  
   Mockups for both pages and error handling for UI2.
---
## General 


### Sequence Diagram: 
![sequence_diagram](https://github.com/user-attachments/assets/ea6d54c9-aacc-47c9-9f86-6ccaa03b5738)

## R.1. First Page: User Login Page

### Data-flow Diagram
![dfd_first](https://github.com/user-attachments/assets/558840c1-6c09-4b8a-b456-359e1506116f)

### UI Mockup
![UI_1_Wireframe](https://github.com/user-attachments/assets/a2a99a94-267e-41e7-8d73-b72ce78e07ad)
---
## R.2. Second Page: Van Issue Documenting Form

### Data-flow Diagram
![dfd-second-page](https://github.com/user-attachments/assets/d622bd1d-ac31-4b0e-92e6-e7c9bf67c199)
### UI Mockup
![2nd UI Page](https://github.com/user-attachments/assets/f10dd7cb-56b8-4694-9310-21fae30e4175)

### Custom HTML/CSS Error Styling
![UI2_ErrorHandling](https://github.com/user-attachments/assets/0889ed33-422f-494a-bc92-43bdd3a22638)
