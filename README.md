# 🛒 Mini E-Commerce Web Application

A simple full-stack e-commerce web application that allows users to browse products, add them to a cart, and place orders.

---

## 📖 Overview
This project demonstrates a mini e-commerce platform with a **JavaScript** frontend and a **Spring Boot** backend.  
It implements basic online shopping features including product listing, cart management, and order placement.  
The backend is connected to a MySQL database for storing products, users, and orders.

---

## ⚙️ Tools & Technologies

### **Frontend**
- HTML5, CSS3
- JavaScript
- Bootstrap 5

### **Backend**
- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

---

## 🛠 Methods & Features
- **Product Listing** – Display products with name, price, and details.
- **Shopping Cart** – Add, remove, and update product quantities.
- **Order Placement** – Place orders and store them in the database.
- **REST APIs** – Backend services for products, cart, and orders.
- **Responsive Design** – Works on desktop and mobile devices.

---

## 📸 Output
- **Home page**
---

<img width="1919" height="1001" alt="Screenshot 2025-08-11 132205" src="https://github.com/user-attachments/assets/2596e53c-5583-4663-a64f-a6e63e08fee5" />

- **Categories**
---
<img width="1919" height="999" alt="Screenshot 2025-08-11 132249" src="https://github.com/user-attachments/assets/ad848fda-4cde-426a-988a-ffd6083a0950" />
<img width="1918" height="997" alt="Screenshot 2025-08-11 132228" src="https://github.com/user-attachments/assets/30654ac1-22e8-4652-b08a-5012b8807f1a" />

- **Footer**
---
<img width="1919" height="993" alt="Screenshot 2025-08-11 132315" src="https://github.com/user-attachments/assets/c0198ba3-6320-471d-a1ae-49912eb82593" />

- **Empty Cart**
---
<img width="1919" height="1017" alt="Screenshot 2025-08-11 132403" src="https://github.com/user-attachments/assets/f3263b54-3a48-450c-849e-1fb0755a7fac" />

- **Items in Cart**
---
<img width="1919" height="1012" alt="Screenshot 2025-08-11 132326" src="https://github.com/user-attachments/assets/6d04ab39-a883-473c-9859-92fb073ee71f" />

- **Removed items in Cart**
---
<img width="1919" height="1012" alt="Screenshot 2025-08-11 132345" src="https://github.com/user-attachments/assets/7f8d702a-c7a8-40df-b875-382b62d0c124" />

## 🚀 How to Run This Project

### **1️⃣ Create Backend with Spring Boot**
1. Create a new Spring Boot project with dependencies:
   - **Spring Web**
   - **Spring Data JPA**
   - **MySQL Driver**
2. Place the backend files from this repo into your Spring Boot project.
3. Configure `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
   spring.datasource.username=your_db_username
   spring.datasource.password=your_db_password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true

## 📌 Notes
- Backend must be running before starting the frontend.
- Database name must be ecommerce.
- Tables are auto-created by JPA based on entity classes.





 




