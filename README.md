# Blog Website

A full-stack blogging platform that allows users to create, view, edit, and manage blog posts. Built with **Spring Boot** for the backend and **React/JSP/Thymeleaf** for the frontend (choose the one you used).

---

## Features

- User authentication (Signup/Login)
- Create, edit, and delete blog posts (only by the author)
- View all blogs with pagination
- View individual blog details
- Responsive and user-friendly UI
- RESTful API for seamless frontend-backend integration

---

## Technologies Used

**Backend:**  
- Java 17  
- Spring Boot  
- Spring Security (for authentication)  
- Hibernate / JPA  
- MySQL Database  

**Frontend:**  
- ReactJS / JSP / Thymeleaf  
- HTML5, CSS3, JavaScript  

**Tools & Libraries:**  
- Maven / Gradle  
- Postman (for API testing)  
- Axios (for API requests in React)  

---

## Installation & Setup

### Backend
1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/blog-website.git
    cd blog-website
    ```
2. Configure MySQL database in `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/blog_db
    spring.datasource.username=root
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update
    ```
3. Run the Spring Boot application:
    ```bash
    mvn spring-boot:run
    ```
   The backend server will start at `http://localhost:8080`.

### Frontend (React)
1. Navigate to the frontend folder:
    ```bash
    cd frontend
    ```
2. Install dependencies:
    ```bash
    npm install
    ```
3. Start the development server:
    ```bash
    npm start
    ```
   The frontend will run at `http://localhost:3000`.

---

## API Endpoints

**Auth:**  
- `POST /api/auth/signup` – Register a new user  
- `POST /api/auth/login` – User login  

**Blogs:**  
- `GET /api/blogs` – Get all blogs (paginated)  
- `GET /api/blogs/{id}` – Get a blog by ID  
- `POST /api/blogs` – Create a new blog (auth required)  
- `PUT /api/blogs/edit/{id}` – Update a blog (auth & author only)  
- `DELETE /api/blogs/{id}` – Delete a blog (auth & author only)  

---

## Screenshots

_Add screenshots of your UI here (optional)_

---

## Future Enhancements

- Add image upload for blogs  
- Implement real-time comments and likes  
- Email notifications for new posts  
- Advanced filtering and search  

---

## License

This project is licensed under the MIT License.  

---

## Author

**Sourabh Sadalge**  
- GitHub: [https://github.com/your-username](https://github.com/your-username)  
- LinkedIn: [https://linkedin.com/in/your-profile](https://linkedin.com/in/your-profile)
