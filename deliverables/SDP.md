Sameer, Greg, Mariia, Dipesh 

## Administrative

* Meeting Locations:   
  * Wright State University, Fawcett Room 242  
  * Discord if meeting virtually  
* Meeting Times:  
  * 10-20 minutes at the end of class on Tuesday
  * 2-3 PM on Tuesday 
  * Thursdays 11-12:20 when there is no guest lecture  
  * Anytime virtually as needed Monday-Thursday.  
* Communication Plan:  
  * Discord for constant communication  
  * Github for sharing software progress  
* Project Management:  
  * *Absences on online meeting:*  
    We will inform everyone about the online meeting time at least 48 hours in advance. Make sure that everybody confirms attendance at least 24 hours before. If a person doesn’t come, they should briefly explain why. We will keep our meeting notes online, in Github, so they are available to everyone at all times. The person who missed the meeting should read the meeting minutes as soon as possible and ask any questions in Discord or at the next offline meeting (for example, the next day).  
  * *Meeting Minutes:*

    We will have one main person assigned  in a rotating cycle (e.g., Sameer \-\> Dipesh \-\> Mariia \-\> Greg \-\> Sameer) who will take all the necessary notes. Additionally, there will be a helper (also assigned for each meeting in the same cycle) who will take notes as backup to ensure nothing is missed.

  * *Learning:*  
    If a team member is unfamiliar with a tool or framework he/she should inform the group within 72 hours (sometimes it takes time to realize you cannot do something) after being assigned the task. If the person needs time to learn something, they should set how long it will take them. We should document this and reassign the deadline (adjust tasks).  
  * *Work Tracker/ online stand-up*:

    There should be an obligation to send a quick summary of what they’ve done and any current problems once every 48-72 hours during workdays. It can be done more frequently. 

  * *Communication*:  
    We set a team communication policy, such as responding to messages in a set time frame (24 hours, Monday \- Friday). It’s recommended to install Discord on your phone to get message notifications. If someone is unresponsive or does not complete the task at all, after 24 hours one of us can send them a message via email to make sure everything is okay. If the person is not available for more than two weeks, we will inform the teacher/TA about it.  
  * *Code merge/conflict resolving, code review:*

    Before starting work every day, we should pull changes from the develop branch. We will work with the GitFlow branching model. Every 2 weeks, we will assign a new person for code review/merge conflict resolution. Merging changes daily or every few days (at least once every 72 hours) helps ensure that conflicts are detected and resolved early.

  * *Task assignment:* 

    We will use Jira for task assignment in our meetings to set tasks for every group member and make sure that we know what each other is working on right now. Document it.

  * *Deadlines, reevaluation of the deadlines:* 

    Every week (or maybe every two weeks) we track progress and recheck whether we are meeting the deadline. If not, discuss with the team what is causing the delay and set a new deadline/milestone. Document problems.

  * *Documentation:* 

    Once a week, we will assign a person to document management details and check if everyone has documented their changes in technical details. Documentation or comments to team members about documentation (what they should add etc) should be ready on Friday. 

  * *Testing:* 

    As we use FDD, we rely on specific features within our lifecycle, so testing will be conducted alongside the development of each feature.

  * *Project management:* 

    We can change the timeline or some strategies to resolve problems that we mentioned above after group retrospectives or in case of some unpredictable situations. To change something requires the consent of all group members, except if a person is not available for more than 2 weeks.

---
## Timeline
![Timeline](https://github.com/user-attachments/assets/95a7fa07-e4bb-46af-8ea6-e12f6bb10e9c)

### Clarifications
 - Dates on the timeline Gantt chart indicate the start of the week when the check in deadlines are due. It is assumed that the deadline will be 5 pm on Fridays of the same week.
 - More specific milestones will be created once more specifics of the project are defined after completing the requirement specs, MVS, and design specs rough drafts

### Timeline Updates
 - Changed Requirement Specifications due date to 10/4
 - Changed MVS due date to 10/18
 - Changed Design Specifications due date to 10/18
 - Removed Milestones creation
---

## Deliverables Rough Draft

* Minimal Viable Specifications
  * 1 User Accounts
	  *  Users can create an account by signing up and/or logging in
	  *  Users can authenticate into the app via email and password

  * 2 Van Issue Documentation
    * Create new report
    * Add text descriptions to report
    * Ability to take photos
    * Edit previous reports
    * Delete reports

  * 3 User Interface
    * Intuitive and simple design
    * Photo and text input fields
    * Compatible with mobile and desktop viewing
    * UI is adaptive to different resolutions

  * 4 Database Implementation
    * Securely stores sensitive user login information
    * Stores report data
    * Fast data retrieval

* Milestones
  * Complete the rough HTML skeleton of form submission and viewing page
  * Design ER diagram for database implementation
  * Design initial UI template
  * Process form submissions on the back end
  * Set up MongoDB database system
  * Refine UI design template
  * Create user signup and login page with basic UI
  * Implement user authentication
  * Integrate database with back end
  * Finalize UI
  * Complete testing
  * Deploy project

* Requirement Specifications
  * The system shall allow users to signup and login with a unique email and password
  * The system shall allow users to logout
  * The system shall allow users to delete their account
  * Forms shall document van issues with text descriptions and photos collected by the user
  * The system shall allow users to create forms
  * The system shall allow users to edit forms
  * The system shallow allow users to delete forms
  * The system shall allow users to view previous forms
  * The system shall incorporate a database to store user data and sensitive login information
  * The system shall require user authentication when signing in
  * The system shall provide views based on the users granted permissions
  * The system shall prevent users from accessing information outside of their granted permissions
  * The database shall prevent SQL injections
  * The web page's load time shall fully load within three seconds
* Design Specifications
  * Architecture
    * front end
    * back end
    * database
  * Technology Stack
    * Front End: HTML, CSS, JavaScript, React
    * Back End: Java, Spring Boot, NodeJS
    * Database: MongoDB
    * Authorization: Spring Security
  * Features
    * Signup/login page
    * Form creation, submission, editing, and viewing capabilities
    * Secure login authentication
    * Sign out option


