#Central Bank of Argentina

Test Automation framework for Central Bank of Argentina  project. Tool set: Java, Maven, TestNG, Selenium.


Command to run all the tests via CLI:

e.g. mvn clean test
description - clears out the existing classes that were compiled from last compile


Run particular tests via CLI:

e.g. mvn clean -Dtest=CompareDirectorsWithAuditors test
where - CompareDirectorsWithAuditors is the test that should be run


Properties file:

serverUrl - gets from the app.properties file
driver - optional, if not given the test will run on chrome by default, otherwise you can change chrome to firefox from the app.properties file