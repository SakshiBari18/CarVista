# 🚗 CarVista — Car Inventory Management System

A web-based car inventory management system built using **Java, Spring Boot, Thymeleaf, and MySQL**. CarVista helps users manage car records through a simple web interface.

## 📌 About the Project

CarVista is designed to make car inventory management easier by providing a centralized interface to organize and maintain vehicle information. It connects a Spring Boot backend with a MySQL database and uses Thymeleaf to render dynamic web pages.

## ✨ Features

- **Car Inventory Management** — View and manage vehicle records.
- **Add New Cars** — Enter car details such as name, brand, model, year, price, fuel type, and status.
- **Update Records** — Edit existing vehicle information.
- **Delete Records** — Remove car records from the inventory.
- **Database Integration** — Store and retrieve vehicle information using MySQL.
- **Login System** — Access the application through a login page.
- **Dashboard** — Navigate through the application's main interface.

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java 17 | Programming language |
| Spring Boot | Backend application framework |
| Spring MVC | Request handling and controllers |
| Thymeleaf | Server-side HTML templates |
| MySQL | Relational database |
| Maven | Build and dependency management |
| HTML & CSS | Web page structure and styling |
| Git & GitHub | Version control and source code hosting |

## 📂 Project Structure

```text
CarVista/
└── carinventory/
    ├── pom.xml
    ├── mvnw
    ├── mvnw.cmd
    └── src/
        ├── main/
        │   ├── java/com/example/carinventory/
        │   │   ├── controller/
        │   │   ├── model/
        │   │   ├── repository/
        │   │   ├── security/
        │   │   ├── service/
        │   │   └── CarinventoryApplication.java
        │   └── resources/
        │       ├── templates/
        │       └── application.properties
        └── test/
```

## ⚙️ Prerequisites

Before running CarVista, make sure you have:

- Java JDK 17
- MySQL Server
- Git
- A code editor such as Visual Studio Code

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/SakshiBari18/CarVista.git
cd CarVista/carinventory
```

### 2. Create the MySQL database

Open MySQL Workbench and execute:

```sql
CREATE DATABASE car_inventory;
```

### 3. Configure the database

Configure the following Spring Boot properties in `src/main/resources/application.properties` using your own local MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/car_inventory
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

Set `DB_USERNAME` and `DB_PASSWORD` as environment variables before starting the application.

**Security note:** Never commit real database passwords, API keys, or other secrets to a public repository.

### 4. Run the application

From the `carinventory` directory, execute:

```bash
mvn spring-boot:run
```

Alternatively, on Windows, use the Maven wrapper:

```powershell
.\mvnw.cmd spring-boot:run
```

### 5. Open CarVista

Once the application starts, visit:

http://localhost:8080

The car inventory page may be available at:

http://localhost:8080/cars

If login is enabled, sign in using your locally configured application credentials.

## 🖼️ Screenshots

Screenshots of the login page, dashboard, and car inventory interface can be added here to demonstrate the application's design and functionality.

<!-- Add screenshots after capturing them from the running application. -->

## 🔮 Future Enhancements

- Advanced search and filtering
- Vehicle image gallery
- Pagination and sorting
- Role-based access control
- Cloud deployment
- Responsive interface improvements

## 👩‍💻 Author

**Sakshi Bari**

- GitHub: [@SakshiBari18](https://github.com/SakshiBari18)

## 📄 License

This project is available for educational and portfolio purposes. A formal open-source license can be added if required.
