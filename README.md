This is a mobilefood application build with SpringBoot ,hibernate ,restful API's and MySql database. technologies.

Below are the steps to build and run the application.

Step : 1 checkout codebase from git 

Step : 2 import the project in any of the IDE's available(Eclipse or SpringToolSuite recommended)

Step : 3 Open command prompt in project directory and run below commands 

		mvn clean install
		
		mvn spring-boot:run
		
Step : 4 Once application is in running stage, please access below API's to perform operations

		API 1 : To save csv data into MySql Database , call below API 
		
		GET - http://localhost:9090/foodMobile
		
		API 2 : To fetch all the available foods 
		
		GET - http://localhost:9090/getAllfood
		
		API 3 : To Update any of the available foods 
		
		PUT - http://localhost:9090/updateAll/{locationid}
		
		Example : http://localhost:9090/updateAll/50
		
		RequestBody :  
		
		{
        "locationid": 50,
        "applicant": "1336145",
        "facilityType": "Grill",
        "cnn": "Truck",
        "locationDescription": "11833000"
        }
		
		API 4 : To delete any of the available foods
		
		DELETE : http://localhost:9090/deleteAll/{locationid}
		
		Example : http://localhost:9090/deleteAll/50
		
		
	