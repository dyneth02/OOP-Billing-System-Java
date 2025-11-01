# 🧾 OOP Billing System – Java

A simple Java console-based billing application developed for the **SLIIT Object-Oriented Programming (OOP)** module.  
This project demonstrates **abstract classes, inheritance, and polymorphism** concepts in Java.

---

## 📚 Project Overview

The system models a small billing process where:

- A base abstract class **Customer** stores customer ID and name.
- A subclass **RegisteredCus** extends `Customer` to handle reward points, discounts, and final bill calculations.
- The program accepts user inputs for bill amounts and displays the calculated results using overridden methods.

---

## 🏗️ Class Structure

### **1️⃣ Customer.java**
- Abstract base class with:
  - Properties: `id`, `name`
  - Constructor for initialization
  - `display()` method to show base info
  - Abstract method `calculateBill()`

### **2️⃣ RegisteredCus.java**
- Subclass of `Customer` with:
  - Properties: `rewardPoints`, `netAmount`
  - Constructor that sets defaults for extra fields
  - `calculateBill()` method:
    - Accepts user-entered bill amount
    - Adds 15% as reward points if bill > Rs. 950.00
    - Applies a 7% discount to compute `netAmount`
  - Overridden `display()` method showing all fields

### **3️⃣ BillingApp.java**
- Contains `main()` method:
  - Creates an `ArrayList` of `RegisteredCus` objects
  - Calls `display()` for each object using a `for-each` loop

---

## ⚙️ How to Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/<your-username>/OOP-BillingSystem-Java.git
   cd OOP-BillingSystem-Java
