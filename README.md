# Gardening Project (Hobby project)

## Specification
The objective we were given was to create a CRUD application with the utilisation of supporting tools, methodologies and technologies that encapsulate all core modules covered during training.

## Planning
Once I had decided that I wanted to make an application to keep track of all the different seeds I have for gardening, the first stage of planning was to create User Stories and add them to a Jira board. I used the specification of CRUD functionality to help write my user stories and then I expanded on them, adding child issues to each story, breaking them down into smaller, more manageable tasks. I also added story point estimates to each of the child tasks and used MoSCow prioritisation on the user stories themselves (under 'Label') to decide which order to tackle them in once I started. 

![image](https://user-images.githubusercontent.com/93250564/146367943-4ee08496-7743-4245-9e71-f9bbcfce5274.png)


![image](https://user-images.githubusercontent.com/93250564/146367781-5a1bce41-55bf-40c1-ae39-486ea9f5ce78.png)


<img width="523" alt="child issues" src="https://user-images.githubusercontent.com/93250564/146367511-9b570a48-d742-4b67-b893-ee0223a7acb8.PNG">

Next I decided to quickly draw up a basic plan of how I wanted the front end to look. Using knowledge of the 'card' features that Bootstrap has, I came up with this basic outline:

<img width="457" alt="plan" src="https://user-images.githubusercontent.com/93250564/146368154-0d9656e2-6ebd-49f7-8137-a93efdeb2e36.PNG">

I think I was able to stick well to this design, except I couldn't get a pop up to work exactly how I wanted it to, so for the 'edit seed' button, a form popped up under the 'create' form for editing instead of over the page. I was also able to go in and add a further search field and button to add the extra functionality to be able to search by name of the seed.

<img width="955" alt="webpage" src="https://user-images.githubusercontent.com/93250564/146369975-dca05f21-2aae-4e06-b42c-8f650925358f.PNG">


![image](https://user-images.githubusercontent.com/93250564/146369840-ad664afa-3dcb-47a7-9f21-df0d3190daa2.png)


## Technologies used
As mentioned previously, I used a Jira board to manage the project and keep track of my progress:

<img width="749" alt="sprint1" src="https://user-images.githubusercontent.com/93250564/146372319-be068f88-1e78-4e92-a37f-c637449ed32a.PNG">


<img width="484" alt="sprint2" src="https://user-images.githubusercontent.com/93250564/146368829-b129c53c-2a32-4af5-a48d-82715426f008.PNG">

<img width="478" alt="new readmap" src="https://user-images.githubusercontent.com/93250564/146368878-345cec1f-b6e2-4d9b-8936-70fd16891abc.PNG">

As you can see from the roadmap above, I was succesful in completing everything I set out to and was even able to add an extra feature due to finishing both planned sprints earlier than expected.

I also integrated my GitHub and Jira so that when making commits to GitHub using GitBash I could make them smart commits to help keep track of what was happening with my Jira.

<img width="431" alt="smart commit git" src="https://user-images.githubusercontent.com/93250564/146369320-55d74e6f-f6e4-40b1-9a0d-c138ec95a1c6.PNG">

<img width="712" alt="smart commit jira" src="https://user-images.githubusercontent.com/93250564/146369273-3587693f-054a-4aca-bfc6-4098fedbe702.PNG">

I made regular commits to my GitHub using the feature branch model for the two separate repositories (one for frontend and one for backend)

![image](https://user-images.githubusercontent.com/93250564/146376725-8d4a214c-7626-4cfd-b0cb-addc60d6236e.png)



I also used MySQL Workbench to create the database, however that was all I needed to do with that application because Spring created the table for me after linking to the database in the application.properties file.

<img width="159" alt="create database" src="https://user-images.githubusercontent.com/93250564/146372476-c94050c0-f8d3-43b7-9dd1-1d0894da9618.PNG">

<img width="317" alt="spring table create" src="https://user-images.githubusercontent.com/93250564/146372588-3e516b46-2ccd-47ca-9995-165af5073b4a.PNG">

<img width="380" alt="seed table sql" src="https://user-images.githubusercontent.com/93250564/146372648-09a03f98-6921-4a61-8fd5-691f895d5f92.PNG">


## Testing
During testing I used a loal h2 database to avoid changing the data in the "live" database.

<img width="590" alt="test db" src="https://user-images.githubusercontent.com/93250564/146389138-555f9c94-a53f-4b36-b2d1-021004c65f93.PNG">

I used sql data and schema files to drop the table and create a new one before each test, inserting one entry into it each time. This meant that I knew exactly what to expect from each test including id's of each record.


For testing I used MockMVC to integration test the controller class. I did 6 of these tests to test the 6 methods in the controller class.

<img width="546" alt="mockMVC" src="https://user-images.githubusercontent.com/93250564/146370932-4f771ff6-9c0c-469b-8b5e-cdb67cbd2838.PNG">

<img width="223" alt="6 tests" src="https://user-images.githubusercontent.com/93250564/146371652-d08814c2-d8f2-42f6-9918-4bf679f3c167.PNG">


Through these integration tests I achieved over 80% test coverage. However this is a false reading due to the fact that they are integration tests. We had a stretch goal to use Mockito to unit test the service class, however as using Mockito with Spring was not covered I think I was missing a piece or two to be able to get the tests to work, and due to time restraints I decided against using Mockito. This was also due to the fact that the majority of the methods in the service class were just one line long and so using Mockito to mock the one method inside them would be functionally pointless.

<img width="194" alt="test coverage" src="https://user-images.githubusercontent.com/93250564/146371722-71fad325-3292-4e50-97b8-42e5759e5407.PNG">

![image](https://user-images.githubusercontent.com/93250564/146371866-f7a31e47-0e62-40ee-82af-d04b5758b9f0.png)


## Links
GitHub Frontend: https://github.com/JennyE7/GardeningProjFrontend
GitHub Backend: https://github.com/JennyE7/GardeningProjBackend
Jira Board: https://jennyestlin.atlassian.net/jira/software/projects/GH/boards/2/roadmap
