# 🚀 DemoBlaze Automation Framework

## 📌 Project Overview

This project is an end-to-end Selenium Automation Framework developed for automating the DemoBlaze e-commerce application.

### Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Cucumber BDD
- Apache POI
- Maven
- Git
- GitHub

---

## ✅ Framework Features

### 1. Page Object Model (POM)

Implemented page classes:

- HomePage
- LoginPage
- SignUpPage
- ProductPage
- CartPage
- PurchasePage

### 2. Cucumber Features

Implemented feature files:

- Login.feature
- Signup.feature
- Purchase.feature

### 3. Data-Driven Testing

Excel file:

```text
DemoblazeData.xlsx
```

Implemented using:

- ExcelReader.java
- ExcelDataProvider.java
- LoginExcelTest.java

### 4. Screenshot Capture

Automatic screenshot capture for failed scenarios.

Implemented using:

- ScreenshotUtility.java
- Hooks.java

### 5. Reporting

Generated reports:

- Cucumber HTML Report
- Cucumber JSON Report

---

## 📂 Project Structure

```text
DemoBlazeAutomation
│
├── hooks
├── pages
├── runners
├── stepDefinitions
├── tests
├── utilities
│
├── features
├── config
├── testdata
│
├── pom.xml
└── README.md
```

---

## 🧪 Automated Test Scenarios

### Login

1. Launch application
2. Click Login
3. Enter credentials
4. Verify login

### Signup

1. Open Signup dialog
2. Enter user details
3. Submit registration
4. Verify alert

### Purchase

1. Select product
2. Add product to cart
3. Place order
4. Enter details
5. Verify confirmation

---

## ▶️ How To Run

### Execute Cucumber Tests

Run:

```text
TestRunner.java
```

### Execute Excel Driven Test

Run:

```text
LoginExcelTest.java
```

---

## 👨‍💻 Author

**Mubbashir M Khan**

GitHub Profile:

https://github.com/Mubbashir04
