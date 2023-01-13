# test

## How to start the project

##### 1. Import the project in your IDE
##### 2. Run Script present in Database folder make sure database name is test
##### 4. Run Spring project
##### 5. Open PostMan and use following request
	
	a) for saving data
		path = http://localhost:2626/savingData
		json data = {
					"fname":"user1",
					"lname":"user2
				
				}
	b) for getting data
		path = http://localhost:2626/gettingData

	c) for updating data
		path = http://localhost:2626/updatingData
           json data = 

		{	"id":"{enter id here which you want to update}"
					"fname":"user1",
					"lname":"user2
				
		}
