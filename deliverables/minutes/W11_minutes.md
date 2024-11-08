# Meeting Minutes (11/4 - 11/10)
Week 11

##  Tuesday 11/5

### Administrivia
* Time: 11:00 AM - 12:20 PM
* Location: Fawcett Hall 204
* Scribe: Gregory Terrell

### Agenda
* Complete UI/UX group activity
* Discuss backend updates on GitHub

### Notes UI/UX Group Activity
* websites
  * https://careerfoundry.com/en/blog/ui-design/common-ui-design-mistakes/
  * https://blog.hubspot.com/website/bad-vs-good-design
* Notes:
Poor ui design typically incorporates inconsistent ui elements throughout the project. Some examples are using different colors for the same element types ie using orange for a submission button on page 1 but then using blue for the submission button on the second page. Additionally, try to avoid harsh and noisy design implementations like using dark black as the dropdown shadow of a button. Subtlety is key. Elements of the same type that perform different functions need to have different styles so the user can easily understand how to use the tool. Text used needs to follow hierarchal design where titles are big and emphasized while paragraph text is smaller. Unclear or poorly designed icons can confuse and discourage the user from continuing to use the tool. Bad icon designs use images instead of vectors and convey an unclear purpose. Any error messages displayed need to be clear about the encountered issue and give the user instructions on what to do next. For an example if a password doesn't match, don't print "Error". Instead, the form should say "Password is incorrect, if you don't remember your password, click here to reset it." Avoid using irrelevant or poor quality images. This can make the tool seem to be of lower quality. Keep the design clean and uncluttered. Every element should have a purpose. Ensure the instructions for the user is clear and easy to follow. The navigation system should be accessible and intuitive. However, try to avoid overly simplistic designs ie a page with just a title and a search bar.

### Action Items
* Mariia
  * Continue working on backend
* Sameer
  * Work on database
* Greg
  * Finish UI markup and html theming rough draft for 2nd UI page
* Dipesh
  * Update first UI page with Amazon theming  
### Signatures
After the notes and action items have been pushed, each person should take a time to review them. If everything is agreeable, push a single commit with your name as a signature. 
* Greg Terrell

# Meeting Minutes (11/4 - 11/10)
Week 11

##  Thursday 11/7

### Administrivia
* Time: 11:00 AM - 12:20 PM
* Location: Fawcett Hall 204
* Scribe: Gregory Terrell

### Agenda
* Mariia: I was able to create a local SQL database and connect the first UI page through the backend to authenticate users into the system
  * Mariia: Here is the code and a demonstration of how it works
  * Everyone: Looks good!
  * Greg: What about using MongoDB Atlas for hosting the database? It's hosted within the cloud and is easily accessible to anyone with the key.
    * Mariia: For now we will focus on an easier way to implement the system and come back to this idea if we have more time. 
    * Greg: Ok sounds good.
* Greg: I finished the theming for my 2nd UI page.
  * Dipesh: It looks good so far. However, I would recommend adding more user input restrictions, making the formatting adaptable to different resolution sizes, and adding checkbox restrictions (must select at least one checkbox).
  * Greg: Ok, I can do all of that but how do I go about resizing the html page so that I can see how the page will appear on different screen resolutions?
  * Dipesh: Right click the page, click "inspect element", click the device tool bar, then select the different technology options to see how the web page will appear.
  * Greg: Thank you, this will help a lot.
  * Dipesh: No problem.
* Sameer 



### Action Items
* Mariia
  * Continue working on backend
  * Work on guest lecture review
* Sameer
  * Work on database
* Greg
  * Finalize draft for 2nd UI page
    *  Update the embedded script within the HTML file
    *  Add indicators for required input fields
    *  Add more user input restrictions
    *  Add checkbox requirements (must have at least one box selected)
    *  Make page formatting flexible to different technology hosts
    *  Create custom datetime input type that is/has a
      * Easily clickable
      * Clear purpose
      * Visible calendar icon (the default color of the icon is black but the input field's background color is also black)
  * Work on meeting minutes
* Dipesh
  * Upload updated UI page code for the first page to github
### Signatures
After the notes and action items have been pushed, each person should take a time to review them. If everything is agreeable, push a single commit with your name as a signature. 
* Greg Terrell



