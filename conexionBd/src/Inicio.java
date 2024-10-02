

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Inicio {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/proyectoBd";

        String usuario = "postgres";

        String contraseña = "Altair006";


        try {

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);


            if (conexion != null) {

                System.out.println("Conexión establecida con éxito.");

                conexion.close();

            }

        } catch (SQLException  e) {

            e.printStackTrace();

        }

    }

}