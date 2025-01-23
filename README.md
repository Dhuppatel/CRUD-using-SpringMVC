# To-Do List Manager Application  

A CRUD-based **To-Do List Manager Application** built with **Spring Boot**, **Spring MVC**, **Thymeleaf**, and **Bootstrap**. This project enables users to manage tasks efficiently with functionalities like creating, viewing, updating, and deleting tasks.

---

## Features  

- **Add New Tasks**: Create tasks to keep track of your to-do items.  
- **Update Tasks**: Modify task details whenever needed.  
- **Delete Tasks**: Remove completed or unnecessary tasks.  
- **View Tasks**: Display tasks in a responsive and user-friendly interface.  

---

## Tech Stack  

### Backend  
- **Spring Boot**  
- **Spring MVC**  
- **Java**  
- **Spring Data JPA**  

### Frontend  
- **Thymeleaf**  
- **Bootstrap**  

---

## Getting Started  

### Prerequisites  

- **Java Development Kit (JDK)** 11 or higher  
- **Maven**  
- **MySQL**  

---

### Installation  

1. **Clone the Repository**  
   ```bash
   git clone <repository-url>
   cd todo-list-manager
   ```

2. **Set Up the Database**  
   - Open the `application.properties` file in `src/main/resources`.  
   - Configure your database details:  
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
     spring.datasource.username=<your-username>
     spring.datasource.password=<your-password>
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Build the Project**  
   ```bash
   mvn clean install
   ```

4. **Run the Application**  
   ```bash
   mvn spring-boot:run
   ```

5. **Access the Application**  
   Open your browser and go to `http://localhost:8080`.  

---

## Folder Structure  

- `src/main/java`  
  - `controller/`: Handles HTTP requests and maps them to appropriate views.  
  - `model/`: Contains entity classes for tasks.  
  - `repository/`: Manages database operations using Spring Data JPA.  
  - `service/`: Includes business logic for the application.  

- `src/main/resources`  
  - `templates/`: Contains Thymeleaf HTML templates for rendering UI.  
  - `static/`: Stores CSS, JS, and other static assets.  
  - `application.properties`: Configures database and application settings.  

---

## Screenshots  

1. **Task List View**  
   ![image](https://github.com/user-attachments/assets/34a2847d-e002-4199-9ced-7cd67c7f5f52)


2. **Add Task Form**  
![image](https://github.com/user-attachments/assets/222f5732-5a3f-49f1-8116-a63ed552eb1a)
  

3. **Edit Task Form**  
   ![image](https://github.com/user-attachments/assets/a96e35f3-c2c8-4f69-b31b-430f15db21f0)


---

## Key Learnings  

- Implementing CRUD functionality using **Spring Boot** and **Spring MVC**.  
- Using **Thymeleaf** for dynamic rendering and integrating it with **Bootstrap** for responsive UI.  
- Managing relational databases with **Spring Data JPA**.  
- Understanding and applying the **MVC architecture** in a full-stack Java project.  

---

## Future Enhancements  

- Add **user authentication** and **role-based access control**.  
- Introduce **task categories** and **priority levels**.  
- Implement **reminders** for tasks with deadlines.  

---

## Contributing  

Contributions are welcome! Feel free to open an issue or submit a pull request to help improve this project.  

---



## Contact  

If you have any questions or feedback, feel free to reach out:  
- [LinkedIn](https://www.linkedin.com/in/dhup-patel-3b1565284?lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_contact_details%3BF3SZLUq2TeiciIFUgX31cA%3D%3D)  

---

Happy Coding! 🚀
