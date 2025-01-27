
# 🛒 VentApp Online Project

<img src="https://github.com/user-attachments/assets/22fb7351-49eb-4dfd-810a-7fb757b6dd7a" alt="VentApp Online" width="700" />

This is a Java project developed to manage sales and inventory. It includes features such as:
- **PDF invoice generation**.
- **Connection to a MySQL database**.
- **External API integration for real-time currency conversion**.


---

## 🚀 Project Structure
- VentApp-Online/
- ├── 📁 lib/ # External libraries
- ├── 📁 src/ # Source code
- ├── 📄 build.xml # Apache Ant configuration file
- ├── 📄 README.md # Project documentation


---

## 🛠️ Prerequisites

Before running the project, ensure you have the following installed:

- **Java**: JDK 21 or higher.  
  ![Java](https://img.shields.io/badge/Java-21-orange?logo=java)
- **MySQL**: MySQL Server and MySQL Workbench for database management.  
  ![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?logo=mysql)
- **Libraries**: Ensure the libraries in `lib/` are correctly configured.

---

## ⚙️ Setup

### 1. **Database Setup**
   - Import the provided SQL file into MySQL Workbench.
   - Make sure the database is named `tienda`.

### 2. **Database Connection**
   - Modify the connection parameters in `ConexionBDVentApp.java`:
     - **Host**: `localhost`
     - **Username**: `your_username`
     - **Password**: `your_password`

### 3. **Libraries Configuration**
   - Add the libraries from `lib/` to the project in NetBeans:
     - Right-click on the project > Properties > Libraries > Add JAR/Folder.

---

## 🏃‍♂️ Execution

### **From NetBeans**
   - Open the project in NetBeans and run the main class.

### **From the Terminal**
   - Compile the project using Apache Ant:
     ```bash
     ant build
     ```
   - Run the project:
     ```bash
     ant run
     ```

---

## 🚨 Common Issues

### **Database Connection Error**
   - Ensure MySQL is running and the connection details are correct.

### **Library Issues**
   - Verify that all libraries in `lib/` are correctly added to the project.

---

## 📜 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

