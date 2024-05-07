# Library Spring API
Welcome to the Library Spring API! This API provides endpoints to manage a collection of books within a library. With this API, you can seamlessly Add, List, and Remove books from your library inventory.

![Library](./book.jpg)

## Technologies

- Java: Primary backend programming language.

- Maven: Build automation and project management tool.

- Spring Boot: Framework for creating production-grade Spring-based applications.

- MySQL: Open-source relational database management system.

- Postman: Platform for API design, testing, and documentation.

## Features

1. Create: Add new books to your inventory by providing essential details such as title, author, genre, publication year and image.

2. Read: Access detailed information about each book in your collection.

3. Delete: Remove outdated or redundant entries from your inventory with ease.

## Getting Started

To start using the Library Spring API, follow these simple steps:

1. Install Necessary Tools:
Ensure you have the following tools installed:

- Java Development Kit (JDK)
- Maven
- Postman (for API testing)

2. Clone the Repository
Clone the repository containing the Library Spring API code to your local machine:

```bash
git clone https://github.com/tuchanski/library-spring-api.git
```

3. Configure Application Properties
- Open the application.properties file and configure the database connection properties according to your MySQL database setup.

5. Build and Run the Application

- Navigate to the Project Directory: Open your terminal or command prompt and navigate to the directory where the `LibraryApplication.java` file is located.

- Run the following Maven command:
```bash
mvn clean install
```

- Once the build is successful, execute the following command to run the application:
```bash
mvn spring-boot:run
```

6. Test API Endpoints
- Open Postman and import the provided collection of API requests.

- Set the request headers to include your API key for authentication.

- Use the imported requests to interact with the API endpoints for adding, listing, and removing books from the library.

Enjoy using the Library Spring API! 📚

## Contributing

Contributions are welcome! If you have any suggestions, feature requests, or bug reports, please open an issue or submit a pull request.
