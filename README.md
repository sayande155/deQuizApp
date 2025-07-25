# 📚 deQuizApp - Spring Boot Quiz Management API

![Java](https://img.shields.io/badge/Java-24-blue)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.5.4-brightgreen)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)
![Status](https://img.shields.io/badge/Status-Active-green)

---

## 🚀 Overview

**deQuizApp** is a RESTful API built using **Spring Boot** for managing quiz questions. It provides endpoints to **add**, **update**, **delete**, and **search** questions by category. This application uses a layered architecture with `Controller`, `Service`, `Repository`, and `Entity` classes following best practices.

---

## 📁 Project Structure
```
deQuizApp/
├── controller/
│ └── QuestionController.java
├── model/
│ └── Question.java
├── repository/
│ └── QuestionRepository.java
├── service/
│ └── QuestionService.java
└── resources/
└── application.properties
```
---

## 🧾 Features

- ✅ Add a new quiz question
- ✅ Fetch all quiz questions
- ✅ Filter questions by category
- ✅ Update an existing question
- ✅ Delete a question by ID
- 🧩 Built-in exception handling
- ⚙️ Uses Spring Data JPA for DB operations

---

## 🛠️ Tech Stack

| Technology      | Description                          |
|-----------------|--------------------------------------|
| Java 24         | Core programming language            |
| Spring Boot     | Main framework for REST API          |
| Spring Web      | For building RESTful APIs            |
| Spring Data JPA | For ORM and DB operations            |
| MySQL           | Database (configurable)              |
| Lombok          | Reduces boilerplate code             |

---

## 🧪 API Endpoints

| Method | Endpoint                         | Description                        |
|--------|----------------------------------|------------------------------------|
| POST   | `/question/add-question`         | Add a new question                 |
| GET    | `/question/all-questions`        | Get all questions                  |
| GET    | `/question/all-questions?category=java` | Filter questions by category |
| PUT    | `/question/update-question`      | Update an existing question        |
| DELETE | `/question/delete-question/{id}` | Delete question by ID              |

---

## 📌 Sample JSON for Question

```json
{
  "questionId": "Q123",
  "questionBody": "What is Spring Boot?",
  "option1": "A microservice framework",
  "option2": "An IDE",
  "option3": "A database",
  "option4": "A testing tool",
  "correctOption": "A microservice framework",
  "category": "Java"
}
```
---
