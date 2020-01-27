package mongodb;

public class NewMan {


/* 1. newman is basically a command line tool to execute the API , can run collection from command line 
	
	and can export the results in different formats(html, json, xml) and number of times.
	
	2. it is built on node.js
	
	3. Its created to keep cicd in mind.if we have to run collection more than one time in day.
	
	
	
	4. to install newMan : 
	npm install -g newman
	
	5. export the collection in json format and run by below command :
	
	newman run collection name in json format 
	
	newman run Collection2.postman_collection
	
	6. can execute collection by link 
	
	7. newman run -h // help command
	
	8. newman run mycollection.json -n 15 --bail// executing same collection for 15 min.
	
	9. newman run mycollection.json -d data.json // to pass in input json as input for collection .
	
	10. if we need to run API on server which does not UI then we can use NEWMAN.
	
	11. newman -v // to get version of newman
	
	12. get link of collection.json // click on collection, share, get public link. 
	newman run https://www.getpostman.com/collections/a06106442412d65b653a;
	
	13. 
	
	// difference in put and post : put can also create new resource and update
	 * 
	 * patch will update  existing resource partially
	 * 
	
	14. you can export the enviornment variable and can execute collection with env
	
	newman run collection.json -e environment.json
	
	15. generating reports in newman : 
	
	npm install -g newman-reporter-html
	
	newman run Collection2.postman_collection.json -r cli,html
	
	it will generate html report in same folder.
	
	
	======================*********************===============================
	
	JSON SCHEMA VALIDATION :
	
	JSON SCHEMA: Its contract for json documents about the data type of field and format of field.it defines the type for field.
	so response validation (field format and data type) should be as per json schema.
	
	json: java script object notation, simple , key value pair, use to store or transfer the data from web server to web pages.
	
	// if we create schema and validate the json response to make sure that response is returning the data as per it should be.
	 * JSON
	 [
	 		{"firstName": "Alok",
	 		"lastName" : "Shrivastava",
	 		"age" : 30
	 		}
	 ]
	 * JSON Schema
	 * https://jsonschema.net/
	 
	 https://reqres.in/api/users/2
	 
	 get the response in raw format and paste in json and get schema by https://jsonschema.net/
	 
	 make two changes : make object properties require, use number not integer.
	 
	 copy schema and paste in to test in postman 
	 
	var  schema = {
	 paste all schema here;
	 }
	 
pm.test('Schema is valid', function() {
  pm.expect(tv4.validate(pm.response.json(), schema)).to.be.true;

});

run API , test should pass .its validating the schema.

===================**********************************************========================================================================



	 
*/
	
}
