# Book App

A simple Book Management Application built using Spring Boot. This application demonstrates CRUD (Create, Read, Update, Delete) operations and interacts with the backend via RESTful APIs. Postman is used to test and manage the CRUD operations.

## Features

- Add a new book (with ID, Book Name, and Author)
- Retrieve book details
- Update existing book information
- Delete a book from the system
- RESTful API interaction using Postman

## Technologies Used

- **Java** - Backend development
- **Spring Boot** - Framework used to create a standalone, production-ready application
- **Postman** - Tool for API testing
- **Maven** - Dependency management
- **H2/MySQL** - Database (choose based on your project)

## Setup Instructions

### Prerequisites

- Java Development Kit (JDK) installed
- Maven installed
- Postman for API testing
- IDE (e.g., IntelliJ IDEA, Eclipse)

### Steps to Run the Project

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/book-app.git
   cd book-app
   ```

2. **Build the project**
   ```bash
   mvn clean install
   ```

3. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the API**
   - Use Postman or any other API testing tool to send HTTP requests to the following endpoints:
     - `GET /books` - Retrieve all books
     - `POST /books` - Add a new book
     - `GET /books/{id}` - Retrieve details of a book by ID
     - `PUT /books/{id}` - Update an existing book by ID
     - `DELETE /books/{id}` - Delete a book by ID

5. **Database Configuration**
   - The application uses an H2 in-memory database by default. To change the database to MySQL, update the `application.properties` file with your MySQL configuration.

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/bookdb
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   ```

## Testing with Postman

- Open Postman and create new requests for each CRUD operation.
- Use JSON format to pass the book details for creating and updating books.

Example for POST request to create a book:
```json
{
    "id": 1,
    "bookName": "Spring Boot Essentials",
    "author": "John Doe"
}
```

## Endpoints

- `GET /books`: Retrieve all books
- `POST /books`: Create a new book
- `GET /books/{id}`: Retrieve a specific book by ID
- `PUT /books/{id}`: Update an existing book by ID
- `DELETE /books/{id}`: Delete a book by ID

## Contributing

Feel free to fork this repository, create a branch, and submit a pull request if you want to contribute to the project.

---
