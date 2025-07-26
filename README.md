# 📚 deQuizApp - Spring Boot Quiz Management API

![Java](https://img.shields.io/badge/Java-24-blue)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.5.4-brightgreen)
![MySQL](https://img.shields.io/badge/Database-MySQL-blue)
![Status](https://img.shields.io/badge/Status-Active-green)

---

## 🚀 Overview

**deQuizApp** is a RESTful API backend built using **Spring Boot** to manage quiz questions and quizzes. It enables adding, updating, deleting, and filtering questions, as well as creating, fetching, submitting, and deleting quizzes dynamically.

---

## 📁 Project Structure

```plaintext
src/
├── main/
│   ├── java/com/sd133/deQuizApp/
│   │   ├── controller/
│   │   │   ├── QuestionController.java
│   │   │   └── QuizController.java
│   │   ├── model/
│   │   │   ├── Question.java
│   │   │   ├── Quiz.java
│   │   │   ├── QuizResponse.java
│   │   │   └── QuestionWrapper.java
│   │   ├── repository/
│   │   │   ├── QuestionRepository.java
│   │   │   └── QuizRepository.java
│   │   ├── service/
│   │   │   ├── QuestionService.java
│   │   │   └── QuizService.java
│   │   └── DeQuizAppApplication.java
│   └── resources/
│       └── application.properties

```
---

## 🧾 Features

### ✅ Question Module
- Add a new quiz question
- Fetch all questions or filter by category
- Update an existing question
- Delete a question by ID

### 🧠 Quiz Module
- Create quiz with random questions by category
- Fetch quiz questions (wrapper format)
- Submit quiz answers and get score
- Delete a quiz by ID


---

## 🛠️ Tech Stack

## 🛠️ Tech Stack

| Technology      | Description                          |
|-----------------|--------------------------------------|
| Java 24         | Core programming language            |
| Spring Boot     | Main framework for REST API          |
| Spring Web      | RESTful API support                  |
| Spring Data JPA | ORM layer for DB operations          |
| MySQL           | Relational database                  |
| Lombok          | Annotation-based boilerplate killer  |
| Maven           | Project management                   |
| IntelliJ IDEA   | Development IDE                      |


---

## 🧪 API Endpoints

### 📌 Question APIs

| Method | Endpoint                          | Description                        |
|--------|-----------------------------------|------------------------------------|
| POST   | `/question/add-question`          | Add a new question                 |
| GET    | `/question/all-questions`         | Get all questions                  |
| GET    | `/question/all-questions?category=java` | Filter by category         |
| PUT    | `/question/update-question`       | Update existing question           |
| DELETE | `/question/delete-question/{id}`  | Delete question by ID              |

### 📌 Quiz APIs

| Method | Endpoint                     | Description                              |
|--------|------------------------------|------------------------------------------|
| POST   | `/quiz/create`               | Create quiz by category & num of Qs      |
| GET    | `/quiz/get/{id}`             | Get quiz questions (without answers)     |
| POST   | `/quiz/submit/{id}`          | Submit quiz responses and get score      |
| DELETE | `/quiz/delete/{id}`          | Delete a quiz by ID                      |


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
## 🧠 Learning Outcomes

- ✅ Spring Boot REST API Development
- ✅ Layered MVC Architecture (Controller-Service-Repository)
- ✅ Integration with MySQL using Spring Data JPA
- ✅ Building DTOs and Wrapper models for clean API responses
- ✅ Exception Handling with appropriate HTTP status codes
- ✅ Quiz logic with scoring mechanism
- ✅ Efficient random question selection using native SQL
- ✅ Using Lombok to simplify boilerplate Java code

---
## 🧪 Future Enhancements

- 🔐 Add Spring Security and JWT-based authentication
- 👤 Implement User roles (Admin, Student)
- 📊 Track user quiz history and scoring records
- 🧾 Create quiz result reports/downloads
- 🖥️ Build a frontend with React or Angular
- 📦 Dockerize the application for easy deployment
- 🧪 Add Unit and Integration Testing using JUnit and Mockito
- 📜 Add Swagger/OpenAPI documentation for API testing

---

> Made with ❤️ by **Sayan De**  
> GitHub: [@sayande155](https://github.com/sayande155)

