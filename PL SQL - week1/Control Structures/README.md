# PL/SQL Control Structures


This project demonstrates the implementation of **PL/SQL Control Structures** in a banking database system. It uses cursors, loops, conditional logic, and database updates to automate common banking operations.

The project consists of two tables:

* **Customers** – Stores customer details such as age, account balance, and VIP status.
* **Loans** – Stores loan information including interest rates and due dates.

## Database Schema

### Customers Table

| Column     | Data Type     | Description     |
| ---------- | ------------- | --------------- |
| CustomerID | NUMBER        | Primary Key     |
| Name       | VARCHAR2(100) | Customer Name   |
| Age        | NUMBER        | Customer Age    |
| Balance    | NUMBER(12,2)  | Account Balance |
| IsVIP      | VARCHAR2(5)   | VIP Status      |

### Loans Table

| Column       | Data Type   | Description        |
| ------------ | ----------- | ------------------ |
| LoanID       | NUMBER      | Primary Key        |
| CustomerID   | NUMBER      | Foreign Key        |
| InterestRate | NUMBER(5,2) | Loan Interest Rate |
| DueDate      | DATE        | Loan Due Date      |

---

## Scenarios Implemented

### Scenario 1: Senior Citizen Loan Interest Discount


Apply a 1% discount to loan interest rates for customers above 60 years of age.

**Output:**

```text
Discount applied to Loan ID: 1001 New Interest Rate: 8.5%
Discount applied to Loan ID: 1003 New Interest Rate: 7.75%
Discount applied to Loan ID: 1005 New Interest Rate: 8.25%
```

---

### Scenario 2: VIP Customer Promotion

Promote customers to VIP status if their account balance exceeds $10,000.


**Sample Output:**

```text
VIP status granted to Customer: John Smith (ID: 101)
VIP status granted to Customer: Robert Brown (ID: 103)
VIP status granted to Customer: Linda Davis (ID: 104)
```

---

### Scenario 3: Loan Due Reminder System


Generate reminders for customers whose loans are due within the next 30 days.


**Sample Output:**

```text
Reminder: Dear John Smith, your Loan ID 1001 is due on 15-JUL-2026
Reminder: Dear Robert Brown, your Loan ID 1003 is due on 20-JUL-2026
Reminder: Dear Linda Davis, your Loan ID 1004 is due on 10-JUL-2026
Reminder: Dear James Wilson, your Loan ID 1005 is due on 25-JUL-2026
```

---

## Technologies Used

* Oracle Database
* SQL
* PL/SQL
* DBMS_OUTPUT

