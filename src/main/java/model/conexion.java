package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
    private static final String bbdd="jdbc:mysql://localhost:3306/bolsillo";
    private static final String user="root";
    private static final String paswd="";
    private static Connection con;
    public static Connection conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(bbdd,user,paswd);
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Error de la conexion"+e.getMessage().toString());
        }
        return con;
    }
    public static void main(String[] args){
        conexion.conectar();
    }

}
