
# Employee Management System (OOP Project)

## 📌 Project Overview

This project is an **Employee Payment Management System** built using **Object-Oriented Programming (OOP)** principles in Java.
The system models different types of employees and calculates their earnings based on their employment type. It demonstrates **abstraction, inheritance, polymorphism, and interfaces**.

---

## 🏗️ Class Structure

### **Abstract Class: Employee**

* Serves as the base class for all employee types.
* Contains common attributes and methods for employees.

### **Subclasses**

1. **SalariedEmployee**

   * Represents employees with a fixed salary.
   * Includes **bonus** and **deductions** in salary calculations.

2. **HourlyEmployee**

   * Represents employees paid based on **hourly wage × hours worked**.

3. **CommissionEmployee**

   * Represents employees paid by **commission percentage × sales amount**.
   * **Superclass** for `BasePlusCommissionEmployee`.

4. **BasePlusCommissionEmployee**

   * Extends `CommissionEmployee`.
   * Adds a **base salary** in addition to commission.

---

## 🔗 Interface: Displayable

Implemented by:

* `SalariedEmployee`
* `HourlyEmployee`
* `CommissionEmployee`

### Methods

* `displayAllDetails()` → Displays all details of the employee.
* `displayEarning()` → Displays the earnings of the employee.

---

## ⚙️ Features

✔ Abstract classes and methods
✔ Inheritance & subclassing
✔ Interface implementation
✔ Method overriding (polymorphism)
✔ Clean separation of concerns

---

## 📂 Project Files Structure

```
EmployeeManagementSystem/
│-- Employee.java                 # Abstract class
│-- SalariedEmployee.java         # Fixed salary employees
│-- HourlyEmployee.java           # Hourly-based employees
│-- CommissionEmployee.java       # Commission-based employees
│-- BasePlusCommissionEmployee.java # Commission + base salary employees
│-- Displayable.java              # Interface
│-- Main.java                     # Entry point (program execution)
```

---

## 🚀 How to Run

1. Clone the project or copy the files into your Java IDE.
2. Compile all classes.
3. Run `Main.java`.
4. View employee details and earnings displayed on the console.

---

## 📖 Concepts Demonstrated

* **Abstraction** → `Employee` as an abstract class.
* **Inheritance** → `CommissionEmployee` → `BasePlusCommissionEmployee`.
* **Polymorphism** → Overriding methods in different employee types.
* **Interfaces** → `Displayable` for standard display behavior.

---

## 👨‍💻 Author

* Project created by *\[Abdullah Muhamed]* as part of **OOP practice in Java**.
