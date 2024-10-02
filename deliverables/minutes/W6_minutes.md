# Meeting Minutes (9/30 - 10/6)
Week 6

## Meeting #3 - Tuesday 10/1

### Administrivia
* Time: 11:00 AM - 12:20 PM
* Location: Fawcett Hall 204
* Scribe: Greg Terrell

### Agenda
* Discuss requirement specifications rough draft
  * Revise and finalize the document before 5 PM Friday.
  * Need to complete the idea for the 2nd page and finish constraints
* Start to think about dependency management
  * Draw swim lane diagram and data flow diagram for 1 requirement
  * Get the diagrams confirmed by Cogan
  * Think about potential approaches to the remaining requirements
* Meeting minutes management
  * Create W6 meeting minutes
  * Post the swim lane diagram and data flow diagrams
* UI development
  * Create an initial UI markup design for the first page detailed in the requirements section
  * Once this design is finalized, the frontend can start to be developed

### Notes
#### Project Management
* Mariia: I worked on the design specifications rough draft. I just need a little bit more time and it should be close to done. Any feedback would be appreciated. Also, I would like to start working on the front end but need some UI markups created. Can anyone help?
  * Greg: I can create a UI markup for the first page by the end of the week. Does anyone have any tool recommendations?
    * Dipesh: Figma is a good tool for UI design. Once the initial UI markup for the first page is created, I can start working on the front end.
  * Everyone: Agrees

#### Classwork
* Mariia: We need to draw a data flow and swim lane diagram for a specific requirement. Which one should we choose?
  * Sameer: User authentication on the login UI page would be easy to work with.
  * Everyone: Agrees
* Sameer: Draws data flow diagram
  * ![1](https://github.com/user-attachments/assets/0d875cec-24f6-4652-8260-8a4246fae72e)
* Greg: Draws swim lane diagram
  * ![2](https://github.com/user-attachments/assets/efe248ad-cc5e-43e2-a013-32bc4bb6613c)
* Mariia: Okay, I like how everything looks so far but we need to get feedback from Cogan.
  * Everyone: Agrees
* Cogan: It looks mostly perfect. I would recommend changing the labeling on the data flow diagram of the UI pages to "First UI Page" and "Second UI Page".
  * Sameer: Thank you for the feedback. I have one quick question about our data flow diagram though. We represented the backend using two different blocks to illustrate it's specific function at different stages of the authentication process. However, when we implement our design, the backend will exist as a singular entity. How would you go about representing the backend within the data flow diagram given these two conflicting ideas?
  * Cogan: I would draw the backend as a large box with each individual function labeled inside of it instead of separated blocks. This way both ideas are represented in a cohesive way. Here's how I would visualize it (draws photo below)
    * ![3](https://github.com/user-attachments/assets/d066a2e8-f6da-4095-8d8e-c79b773d034e)
  * Sameer: Okay, that makes sense. Thank you.


### Action Items
These are generally distilled from the notes. Essentially, these are "by the next meetings, _this person_ will take _this action_."
* All
  * Start to think about minimum viable specifications (due next Friday)
  * Provide feedback on requirement specifications
  * Finalize requirement specifications
* Greg
  * Complete UI markup design of first page
  * Complete W6 day 1 meeting minutes

### Signatures
After the notes and action items have been pushed, each person should take a time to review them. If everything is agreeable, push a single commit with your name as a signature. 
* Gregory Terrell