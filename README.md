**Overview**

Automation for Amazon.de website prioritizing the purchase flow.
1. Login 
2. Search for TV
3. Select an item 
4. Add to cart & navigate to checkout

**Pre condition**
1. Intelliji IDE with Maven, selenium and testNG
2. JDK

**Technology used **
1. Maven
2. Java
3. Selenium
4. TestNG
5. Extent report

**Best practices**
1. Uses Page object model
2. Use Reusable Request
3. Failure screenshots can be found in screenshot folder
4. The Project is CI/CD friendly. Jobs can be scheduled using the TestNG XML file
5. Report are generated and stored in report folder with the test suite name

**Components**
Page objects are in the directory src/main/java/pages
Test classes are in the directory src/test/java/tests
Listener class is in the directory src/main/java/util

**How to Run**
1. Clone the repository from the branch
2. Run the TestNG.xml file in intellij OR
3. Run mvn test in intellj / terminal

Future improvement
1. Report can be made even more explanatory
2. Edge testcases and more scenarios can be added
3. Support for multiple browser coverage 
