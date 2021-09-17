# Happeo App Test Automation Framework

## Getting Started

Below is the project structure
- src/test/java : This directory is the heart of framework and it has some major component of framework like
-   Pages : In this package all the application pages and their respective actions are written
-   Utils : In this package contains different utility which we can use while we are writing our auomation test like wait function, Different file operation
-   resources : This consist of config.properties file where all the application url and test user are present and testng.xml file which we use to run our automation test

- src/test      : This directory where we write our test.
### Prerequisites

Please download below applications and jar before we run our framework

```
-   JDK 1.8 or higher
-   maven
```


## Running the tests

To Run from IDE
-   Simply navigate to "src/main/resources/testng.xml".
    Right click on the file and select option Run to the test

To Run from command-line
-   In the project directory use "mvn clean test" command to start execution

### Break down into end to end tests

Below are the scenarios which I have tried to cover and present in "ApplicationPracticeTest.java" file

```
-   Verify Application Login Functionality
-   Verify Search functionality
-   Verify Logout Functionality

```

### And coding style tests

I have used testNG and its annotation to write the automation test


## Authors

* **Vinaykumar Gupta**

