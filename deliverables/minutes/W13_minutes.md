# Meeting Minutes (11/18 - 11/24)
Week 13

##  Tuesday 11/19

### Administrivia
* Time: 11:00 AM - 12:20 PM
* Location: Fawcett Hall 204
* Scribe: Gregory Terrell

### Agenda
* Discuss progress on front and backend
* Talk about next steps
* Figure out when the deadlines are
* Discuss altered timeline
* Decide when to give presentation

### Notes
#### Project Management
* Mariia: I got the backend to work. The application can successfully extract the content from the form on the first UI page, query the database using the data,
then the db can hand off the reponse to the backend where the user can be authenticated in.
* Mariia: I've also completed most of the code for data extraction and db storing of the contents on the 2nd UI page. However, I did not get it to work with the
datetime element so I still need to work on that.
* Mariia: The backend relies on the HTML element names and ids so be careful in how you modify the html content of each page.
* Mariia: Additionally, we should be hesitant about adding new elements or features without planning because this will cause problems on the backend as well.
  * Greg: Ok, sounds good. Although there is one problem that might mess with the current backened code. I added a new feature to the 2nd UI page that handles errors with custom UI and I haven't added any of the updates to GitHub. I need to organize the files and then I can commit them.
  * Mariia: Ok, can you do that soon because I need to update the backend asap to handle the new changes.
  * Greg: No problem, I'll have it all done by this Thursday 11/21. 

#### Class Discussion
 * The coding and presentation freeze will be 11:59 PM on Monday 12/2.
   * We will no longer be allowed to write anymore code or edit our presentation slides
 * Within the next four weeks we will:
   * Finalize requirement and design specifications
   * Write group and personal retrospective
   * Create and give presentation
 * Don't worry too much about milestone grades
 * Presentation Notes
   * Our presentation date: 12/3 or 12/5
     * We will either present last on 12/3 or first on 12/5
   * Two total presentation days
   * **Will automatically get a C in class if you don't show up to all presentation days**
   * Ideal length: 12 minutes (11 mins talking, 1 min for questions)
     * Cogan will ask at least one question
   * Can get extra credit if we all dress up formally
 * We will NOT meet during finals week, 12/5 will be the last day of class

#### Presentation Structure
* Introduction Slide
  * Project name, team name, group members
* Elevator pitch (30 seconds)
* Overview slide
* For each unit of complexity include
  * 1 user story
  * 1 requirement
  * 1 design "thing"
  * Implementation details
    * Gif/video of feature working, figure, or code snapshot
* Conclusion slide
  * Include a statement regarding how this class went overall
### Action Items
* Mariia
  * Connect 2nd ui page with backend to the database
    * Handle data retrieval from datetime input field 
    * Handle connection establishment
    * Query processing
    * Form data extraction
    * DB response retrieval + formatting
* Sameer
  * 
* Greg
  * Commit work on 2nd UI page to GitHub
  * Complete formatting of 2nd UI page datetime element
  * Organize files
    * Separate html, css, and JavaScript code into separate files and directories
    * Briefly organize JavaScript code formatting
  * Complete UI handling of first page
    * If there is time, complete/start third page's ui as well
* Dipesh
  * 
### Signatures
After the notes and action items have been pushed, each person should take a time to review them. If everything is agreeable, push a single commit with your name as a signature. 
* Greg Terrell

