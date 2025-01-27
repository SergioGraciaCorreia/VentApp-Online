package ventappOnline;

import java.sql.*;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

// Clase que se encarga de establecer la conexión con la base de datos MySQL y cargar la base de datos desde el archivo SQL si falla la conexión.
public class ConexionBDVentApp {

    // Método estático que devuelve una conexión a la base de datos.
    public static Connection getConexion() {
        Connection conexion = null; // Inicializa la variable conexión.

        try {
            // Intentar conectar con MySQL utilizando la URL, usuario y contraseña.
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda?serverTimezone=UTC", "root", "1234");
            System.out.println("Conexión a MySQL exitosa.");
        } catch (Exception ex) {
            // Mostrar un mensaje si no puede conectarse a MySQL.
            JOptionPane.showMessageDialog(null, "Error en la conexión con la base de datos MySQL: " + ex.getMessage() + "\nIntentando crear la base de datos desde el archivo SQL...");

            try {
                // Conectar sin especificar base de datos para crear la base de datos "tienda".
                conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/?serverTimezone=UTC", "root", "1234");
                Statement stmt = conexion.createStatement();

                // Leer y ejecutar el archivo BD.sql desde el paquete baseDatos.
                InputStream sqlFile = ConexionBDVentApp.class.getResourceAsStream("/baseDatos/BD.sql");
                if (sqlFile == null) {
                    throw new Exception("No se encontró el archivo BD.sql en el paquete baseDatos.");
                }

                // Leer el archivo SQL usando InputStreamReader.
                BufferedReader reader = new BufferedReader(new InputStreamReader(sqlFile));
                StringBuilder sql = new StringBuilder();
                String line;

                // Leer el archivo línea por línea.
                while ((line = reader.readLine()) != null) {
                    sql.append(line);
                }

                // Ejecutar el contenido del archivo SQL.
                stmt.executeUpdate(sql.toString());

                System.out.println("Base de datos creada exitosamente desde el archivo SQL.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cargar la base de datos desde el archivo SQL: " + e.getMessage());
                e.printStackTrace();
            }
        }

        return conexion; // Devolver la conexión (ya sea a la base de datos existente o a la recién creada).
    }
}



