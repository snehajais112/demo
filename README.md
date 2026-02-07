# Item Management REST API

This project is a simple Spring Boot REST API created as part of a sample task for a Freelance Java Developer role. The goal was to build a clean and easy-to-understand backend application that manages items using in-memory storage (ArrayList) and exposes REST APIs.

---

## What This Application Does

* Item model with required fields
* In-memory data storage using `ArrayList`
* REST APIs to:

    * Add a new item
    * Get an item by ID
    * Get all items
* Input validation with proper error messages
* Simple layered structure using Controller, Service, and Model for better readability

---

## Tech Stack

* Java
* Spring Boot
* Maven
* REST API
* JSON

---

## Project Structure

```
src/main/java
└── com.example.item
    ├── controller
    │   └── ItemController.java
    ├── service
    │   └── ItemService.java
    ├── model
    │   └── Item.java
    └── ItemApplication.java
```

---

## How to Run the Application

1. Clone the repository
2. Open the project in IntelliJ / Eclipse / VS Code
3. Make sure Maven dependencies are downloaded
4. Run the `ItemApplication.java` file
5. Application will start on:

```
http://localhost:8080
```

---

## API Endpoints

### 1. Add Item

* **URL:** `/items/add`
* **Method:** `POST`
* **Request Body (JSON):**

```json
{
  "id": 1,
  "name": "Shoes",
  "description": "Nike sports shoes",
  "price": 2500,
  "category": "Footwear",
  "quantity": 5
}
```

#### Validation Rules:

* `name` must not be null or empty
* `price` must be greater than 0
* `quantity` must be at least 1

---

### 2. Get Item by ID

* **URL:** `/items/{id}`
* **Method:** `GET`

**Example:**

```
/items/1
```

**Response:**

* Returns item if found
* Returns **404 – Item not found** if ID does not exist

---

### 3. Get All Items

* **URL:** `/items`
* **Method:** `GET`

**Description:**
Returns the list of all items stored in memory.

---

## Data Storage

* Items are stored using an **ArrayList** in memory
* No database is used
* Data will reset when the application restarts

---

## Hosting

This application is deployed on **Render** and can be accessed using the live URL provided in the submission email.

---

## Notes

* This application is intentionally kept simple to focus on core backend concepts
* In-memory storage is used as per the task requirement
* Data will reset whenever the application restarts
* The project can be easily extended with database support and additional APIs

---

## Author

Sneha Jaiswal



