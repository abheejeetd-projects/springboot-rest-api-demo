# Spring Boot REST API – Backend Demo

This repository demonstrates a clean and production-style **Spring Boot REST API** designed with best practices used in real backend projects.

It is intended to showcase how I approach **API development, validation, and error handling** in Java-based systems.

---

## 🔧 What This Project Demonstrates

✔ REST API design using Spring Boot  
✔ Request validation using Jakarta Validation  
✔ Global exception handling  
✔ Layered architecture (Controller, Service, Repository)  
✔ Clean and maintainable code structure  
✔ Database integration using JPA

---

## 🚀 API Endpoints

### Create User
**POST** `/api/users`

**Request Body**
```json
{
  "name": "John Doe",
  "email": "john@example.com"
}
