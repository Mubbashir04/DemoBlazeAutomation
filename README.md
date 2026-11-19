DemoBlaze Automation Framework

Project Overview
This project is an end-to-end Selenium Automation Framework developed for automating the DemoBlaze e-commerce application.

The framework is built using:
	Java
	Selenium WebDriver
	TestNG
	Cucumber BDD
	Apache POI
	Maven
	Git & GitHub

The project demonstrates data-driven testing, page object model implementation, screenshot capture for failed scenarios, and automated reporting.

Technology Stack
Technology			Purpose
Java				Programming Language
Selenium WebDriver	Browser Automation
TestNG				Test Execution Framework
Cucumber			BDD Framework
Apache POI			Excel Data Handling
Maven				Dependency Management
Git					Version Control
GitHub				Repository Hosting

Framework Features
Page Object Model (POM)
Page classes:
	HomePage
	LoginPage
	SignUpPage
	ProductPage
	CartPage
	PurchasePage

Cucumber Features
Implemented feature files:
	Login.feature
	Signup.feature
	Purchase.feature
	Data-Driven Testing
	Excel file used:

DemoblazeData.xlsx

Implemented with:
	ExcelReader.java
	ExcelDataProvider.java
	LoginExcelTest.java

Screenshot Capture
Automatic screenshot capture for failed test scenarios using:
	ScreenshotUtility.java

Integrated through:
	Hooks.java

Reporting
Generated Reports:
	Cucumber HTML Report
	Cucumber JSON Report

Location:
	target/

Project Structure
DemoBlazeAutomation
│
├── src/test/java
│ ├── hooks
│ ├── pages
│ ├── runners
│ ├── stepDefinitions
│ ├── tests
│ └── utilities
│
├── src/test/resources
│ ├── config
│ ├── features
│ └── testdata
│
├── pom.xml
└── README.md

Executed Test Scenarios
Login
	User launches application
	User enters credentials
	User clicks login

Signup
	User registers with user credentials
	Alert validation performed

Purchase
	Product selection
	Add to cart
	Place order
	Purchase confirmation validation

How To Run
Clone Repository
	git clone https://github.com/Mubbashir04/DemoBlazeAutomation.git
 
Import Project
Import the project as:
	Existing Maven Project in Eclipse.

Execute Cucumber Tests
Run:
TestRunner.java

Execute Excel Driven Test
Run:
LoginExcelTest.java

Author
Mubbashir M Khan

GitHub:
https://github.com/Mubbashir04