# User Stories - Van Documentation App
Sameer, Greg, Mariia, Dipesh

--- 

## Project Description
The project is a web application designed for Amazon delivery drivers to easily document van issues. Instead of registering, drivers can verify their identity using their AmazonID. Once verified, they can fill out a simple form to report problems with their vans, providing details such as the type of issue, a description, and its status. This tool helps drivers keep track of van conditions and communicate with management. 


### User Stories
 * As an Amazon delivery driver, I want to store pictures and descriptions of issues to mitigate employment risks.
 * As an Amazon delivery driver, I want a "remember-me" feature that keeps me logged in unless otherwise specified.
 * As an Amazon delivery driver, I want to quickly log in to the system using my ID, so I can access it without additional sign-up.
 * As an Amazon delivery driver, I want to include the exact date and time when I discovered the van issue, so my manager can see when it occurred.

 ### Developer Stories
* As a Frontend developer, I want to know which devices this product will be used on, so that I can determine if I need to implement responsive design features.
* As a Frontend developer, I want to know the precise features of the forms and what kind of inputs users will provide, so that I can implement the correct form functionality.
* As a backend developer, I want to be sure that driver data (Name/Surname/Driver ID) is pre-loaded into the database, so I can use this information for driver verification during login.
* As a backend developer, I want to return a message indicating wrong driver data was inputted if there was a partial match to the input so that we can make sure a correction process is happening.  

  
 ### Testing Stories
* As a testing developer, I want to test the user authorization form for different user inputs  so  I can be sure that only amazon delivery drivers can log in.
* As a testing developer, I want to verify that multiple users can use website simultaneously, so I can be sure that the system remains stable and does not collapse under concurrent usage.
