# 📚 Simple Post Pagination Application

Welcome to the **Simple Post Pagination Application**! This project is a straightforward demonstration of how to implement pagination in a web application using Spring Boot. The main goal is to practice and showcase the ability to handle paginated data in a clean and efficient way.

## ✨ Features

- **Pagination:** Display posts in a paginated format, allowing users to navigate through different pages of content easily.
- **Simple and Clean Architecture:** The application follows a clean, modular design to make it easy to understand and extend.
- **Spring Boot Integration:** Leverages the power of Spring Boot to create a robust backend that handles paginated data seamlessly.

## 🚀 Getting Started

### Prerequisites

Before running the application, ensure you have the following installed:

- [JDK 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/)
- [Spring Boot](https://spring.io/projects/spring-boot)

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/SuellenMoreiraLima/SimplePostPagination.git
   cd SimplePostPagination
   ```

2. **Build the project:**

   Use Maven to build the project.

   ```bash
   mvn clean install
   ```

3. **Run the application:**

   Start the application using the following command:

   ```bash
   mvn spring-boot:run
   ```

4. **Access the application:**

   Open your web browser and go to `http://localhost:8080/posts` to see the paginated posts in action.

## 🛠️ Project Structure

The project is organized into the following main components:

- **Model:** Represents the structure of a post (Post.java).
- **Service:** Contains the business logic for fetching and paginating posts (PostService.java).
- **Controller:** Handles HTTP requests and returns paginated data to the client (PostController.java).
- **Repository:** Manages database interactions (PostRepository.java).

### Post Model

The `Post` model represents a simple post with the following attributes:

- `id`: Unique identifier for each post.
- `content`: The main text/content of the post.
- `author`: The author of the post.

### Pagination Implementation

Pagination is implemented using Spring Data's `Pageable` interface. The `PostService` class fetches posts in pages, which can be easily adjusted using the `PageRequest.of(page, size)` method.

Example of fetching paginated posts:

```java
Pageable pageable = PageRequest.of(0, 2);
Page<Post> pagePost = postService.listPost(pageable);
```

## 📄 API Endpoints

The application exposes the following RESTful API endpoint:

- **GET /posts?page={page}&size={size}**: Retrieves a paginated list of posts.

   Example:

   ```
   GET http://localhost:8080/posts?page=0&size=2
   ```

   This will return the first two posts.

## 📊 Database

The application uses an in-memory H2 database for simplicity. The data is initialized using the `data.sql` script located in the `src/main/resources` directory.

### Sample Data

The `data.sql` file contains sample data that is loaded into the H2 database at startup:

```sql
INSERT INTO post (content, author) VALUES ('Vamos aprender mais de paginação', '@suellenlima');
INSERT INTO post (content, author) VALUES ('Conhecendo mais de spring', '@suellenlima');
INSERT INTO post (content, author) VALUES ('Java é muito legal', '@suellenlima');
INSERT INTO post (content, author) VALUES ('Vamos ler Código Limpo?', '@suellenlima');
```

## 🧪 Testing

The project includes a simple unit test to verify the pagination functionality. The test is located in the `PaginationApplicationTests.java` file and ensures that the correct number of posts is returned for a given page.

To run the tests, use the following Maven command:

```bash
mvn test
```

## 🤝 Contributing

Contributions are welcome! If you have suggestions or improvements, feel free to create a pull request or open an issue.


## 📧 Contact

If you have any questions or need further assistance, feel free to contact me at [suellen.moreira.lima@gmail.com](mailto:developer.suellen.lima@gmail.com).
