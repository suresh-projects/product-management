# Textile Product Management – Backend

## 📌 Project Overview
This is the backend service for the **Textile Product Management System**.  
It is built using **Spring Boot** and provides REST APIs to manage products and orders.

The backend uses an **H2 in-memory database** (NO MySQL) for simplicity and fast setup, making it ideal for demos and academic evaluation.

---

## 🏗️ Architecture
Client (React Frontend)
|
| REST API
v
Spring Boot Backend
|
v
H2 Database

---

## 🛠️ Tech Stack
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 In-Memory Database
- Docker
- Maven

---

## 🗄️ Database Used
- **H2 Database (In-Memory)**
- No external database required
- Data resets on application restart

### H2 Console
- URL: `http://localhost:8081/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: *(empty)*

---

## 🚀 API Endpoints

### Products
| Method | Endpoint | Description |
|------|---------|------------|
| GET | `/api/products` | Get all products |
| POST | `/api/products` | Add new product |
| PUT | `/api/products/{id}` | Update product |
| DELETE | `/api/products/{id}` | Delete product |

### Orders
| Method | Endpoint | Description |
|------|---------|------------|
| POST | `/api/orders` | Place an order |
| GET | `/api/orders` | View order history |

---

## ⚙️ Running Locally (Without Docker)

```bash
mvn clean install
#Docker
<img width="1919" height="1017" alt="image" src="https://github.com/user-attachments/assets/56d67b90-e12f-454d-bdc9-c5e5a765d2df" />
#Deployment

Dockerized backend

Deployed using container-based hosting (Render / Docker runtime)
mvn spring-boot:run

