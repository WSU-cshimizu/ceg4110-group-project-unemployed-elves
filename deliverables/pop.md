# Project Overview Proposal
Unemployed Elves
Mariia L. Sameer B. Gregory T. Dipesh J

## 1 Proposed Project Name
Van Issue Documenting Website

## 2 Elevator Pitch
We’re working on an upgrade to improve communication between Amazon drivers
and management. A big issue drivers face is not being able to quickly report van
problems, which wastes time and causes delays. Our solution is a simple web app
where drivers can easily fill out a form to report and categorize the issue. This
way, problems get resolved faster, downtime is reduced, and losses are minimized.

## 3 Complexity of the Project
There are four students in the group, so there will be four components:

### 3.1 Frontend Development
Student will develop the web interface for user interaction, including forms for van
issue reporting and user authentication.
Technologies: HTML, CSS, JavaScript (React).

### 3.2 Backend Development
Manage the server-side functionality of the program, including processing form
submissions and data request to database.
Technologies: Java (Spring Boot), Node.js.

### 3.3 Database Management
Designing database schema, writing queries: manage data storage and retrieval.
Technologies: MongoDB

### 3.4 Authorization
Ensure that only certain users can access forms and manage user sessions.
Technologies: Spring Security

## 4 Predicted Architecture
!![System_Diagram](https://github.com/user-attachments/assets/61a47133-bd42-4cfe-9ca7-9370a2aa8d63)

### 4.1 Frontend
A web app using HTML/CSS for structure and styling, and JavaScript (React)
for client-side logic (form validaton, ui component state management etc)
### 4.2 Backend
A server app using Spring Boot to deal with API requests, and to send and receive
data from the database.
##$ 4.3 Database
MongoDB for storing users and issue data.


## 5 Why are we picking the tech stack?
- **Spring Boot, Node.js**: SpringBoot is a popular Java framework for building
web apps, lots of information about it on internet, built-in support for database
integration. Three team members use Java in their classes, and one has worked
with Spring Boot on a simple pet project. Node.js is also widely used, lots of
resources and usage examples.
- **HTML, CSS, React:** One of our team members has used HTML and CSS to
create several projects. He has also used JavaScript in his websites, so learning
React seems like a logical next step. React is also very popular for full-stack
applications.
- **MongoDB:** To provide flexibility in data structure, MongoDB offers a more
adaptable schema design and can easily scale up or down as needed, making it
simple to add or remove data if requirements change. Our team member worked
with it also.
- **Spring Security:** Since we decided to use Spring Boot, we found that Spring
Security is a good technology for user authentication, session management, and
overall user authorization.

## 6 Predicted Life Cycle/Methodology
Feature-driven development is the best fit for the software development methodology of our project. FDD caters towards our experience levels. We don’t have in
depth experience in creating full-stack projects and want to apply a method that
ensures individual features work before progressing. Moreover, with this methodology the simpler features can be targeted early to cultivate confidence and an
efficient group dynamic while satisfying the FDD construct. This project has
already started using this framework by briefly conceptualizing an overall model
with an accompanying feature list, granting us some momentum. Because we need
flexibility in the initial stages of development FDD is the best methodology for us.
