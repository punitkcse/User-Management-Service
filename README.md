# User Management Service

This is a simple user management service built with Spring Boot, providing user registration and authentication functionalities.

## Prerequisites

Before you begin, ensure you have the following installed:

*   Java Development Kit (JDK) 17 or higher
*   Apache Maven 3.6.0 or higher

## How to Run the Application

1.  **Clone the repository (if not already cloned):**

    ```bash
    # Assuming you are in the parent directory of user-management
    # git clone <repository-url>
    ```

2.  **Navigate to the project directory:**

    ```bash
    cd C:/Users/P K/Desktop/Typing/user-management-service/user-management
    ```

3.  **Build the project using Maven:**

    ```bash
    mvn clean install
    ```

4.  **Run the Spring Boot application:**

    ```bash
    mvn spring-boot:run
    ```

The application will start on `http://localhost:8080` (or the port configured in `src/main/resources/application.yml`).

## API Endpoints

The service exposes the following REST API endpoints:

### 1. User Registration

*   **URL:** `/api/auth/register`
*   **Method:** `POST`
*   **Content-Type:** `application/json`
*   **Description:** Registers a new user with a unique username and password.
*   **Request Body Example:**

    ```json
    {
      "username": "testuser",
      "password": "password123"
    }
    ```

### 2. User Login

*   **URL:** `/api/auth/login`
*   **Method:** `POST`
*   **Content-Type:** `application/json`
*   **Description:** Authenticates an existing user and returns a JWT token.
*   **Request Body Example:**

    ```json
    {
      "username": "testuser",
      "password": "password123"
    }
    ```

## How to Test APIs

You can test the APIs using tools like `curl`, Postman, or Insomnia.

### Example using `curl`:

#### 1. Register a new user:

```bash
curl -X POST \
  http://localhost:8080/api/auth/register \
  -H 'Content-Type: application/json' \
  -d '{
    "username": "newuser",
    "password": "newpassword"
  }'
```

#### 2. Log in with the registered user:

```bash
curl -X POST \
  http://localhost:8080/api/auth/login \
  -H 'Content-Type: application/json' \
  -d '{
    "username": "newuser",
    "password": "newpassword"
  }'
```

Upon successful login, the response will include a JWT token. You can then use this token in the `Authorization` header for any protected endpoints (if any exist beyond authentication).

```
Authorization: Bearer <YOUR_JWT_TOKEN>
```

