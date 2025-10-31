# 🏦 Online Banking Automation Testing using Selenium & Java

## 📘 Project Overview
This mini-project demonstrates the **automation of an online banking system** using **Selenium WebDriver** with **Java**.  
It automates the process of logging into a demo banking portal and performing **fund transfer operations**, verifying successful transactions, and capturing screenshots during execution.

This project was developed as part of the **Software Testing** academic mini-project.

---

## ⚙️ Tools & Technologies Used
- **Language:** Java  
- **Automation Framework:** Selenium WebDriver  
- **IDE:** Eclipse  
- **Build Tool:** (optional) Maven  
- **Browser:** Google Chrome  
- **Testing Type:** Functional Testing (Automation)

---

## 🧩 Project Structure
```
Bankingautomation/
 └── src/com/test/
      ├── SampleTest.java
      └── FundTransferTest.java
```

### 1️⃣ `SampleTest.java`
- Verifies Selenium WebDriver setup and browser connectivity.
- Opens the Guru99 Bank demo page.
- Performs a successful login to the Manager dashboard.
- Prints page titles and login status on console.

**Purpose:** To ensure environment setup and connectivity between Selenium, browser, and the demo site.

---

### 2️⃣ `FundTransferTest.java`
- Automates the **Fund Transfer** module of the Guru99 Bank demo website.
- Logs in with valid credentials.
- Navigates to the Fund Transfer page.
- Enters valid **payer ID**, **payee ID**, **amount**, and **description**.
- Verifies the success message and captures screenshots after major actions (login and fund transfer).

**Purpose:** To test and validate the fund transfer workflow using Selenium automation.

---

## 🧪 Test Scenarios Covered
| Test Case ID | Scenario Description | Expected Result |
|---------------|---------------------|-----------------|
| TC001 | Verify valid login credentials | User navigates to Manager Home Page |
| TC002 | Verify fund transfer page loads correctly | Page title displays "Fund Transfer" |
| TC003 | Validate successful fund transfer | Confirmation message appears |
| TC004 | Capture screenshots of key stages | Screenshots saved in project folder |

---

## 📂 Screenshot Capture
Screenshots are automatically captured and saved inside:
```
/screenshots/
```
Each screenshot is timestamped (e.g., `login_success_20251028.png`).

> 💡 **Tip:** You can change the screenshot save location in your Java code by editing the path in:
> ```java
> new File("D:/selenium/fundTransferSuccess.png");
> ```
> Replace `"D:/selenium/"` with your desired local folder path.

---

## 🚀 How to Run the Project

### Prerequisites
1. Install **Java JDK** (version 8 or higher)
2. Install **Eclipse IDE**
3. Download **Selenium WebDriver JARs**
4. Install **Chrome Browser**
5. Download and configure **ChromeDriver** (ensure version matches your Chrome browser)

---

### Steps
1. **Clone the repository:**
   ```bash
   git clone https://github.com/<your-username>/OnlineBanking-Automation-Testing.git
   ```
   > 🔁 Replace `<your-username>` with **your actual GitHub username**  
   > Example: `https://github.com/haripriya-03/OnlineBanking-Automation-Testing.git`

2. **Open the project in Eclipse.**

3. **Add Selenium JAR files** to the project build path.  
   - Right-click project → Properties → Java Build Path → Add External JARs  
   - Select all JAR files inside your Selenium folder.

4. **Run the tests:**
   - Run `SampleTest.java` to test browser setup & login.
   - Run `FundTransferTest.java` to perform the full fund transfer automation.

5. **Observe console logs and check screenshots folder.**

---

## 🧠 Learning Outcomes
- Understood Selenium WebDriver setup and element locators.
- Automated real-world web test scenarios.
- Practiced test validation and screenshot handling.
- Improved Java programming and debugging skills.

---

## 👩‍💻 Author
**Name:** [B Haripriya]  


**College:** Ballari Institute of Technology and Management (BITM), Karnataka  
**Subject:** Software Testing  
**Project Type:** Mini Project  
**Year:** 2025  

---

## 📎 References
- [Guru99 Bank Demo Site](https://demo.guru99.com/V4/)  
- [Selenium WebDriver Documentation](https://www.selenium.dev/documentation/)
