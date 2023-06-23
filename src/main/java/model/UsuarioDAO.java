package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.conexion;

public class UsuarioDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql=null;
    int r;

    public int registrar (UsuarioVo usuario) throws SQLException{
        sql="insert into usuario(idUsuario,nombreUsuario,correoUsuario,telefono,usuario,password,estado) values (null,?,?,?,?,?,?)";
        try {
            con=conexion.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1,usuario.getNombre());
            ps.setString(2, usuario.getCorreo());
            ps.setInt(3, usuario.getTelefono());
            ps.setString(4, usuario.getUsuario());
            ps.setString(5, usuario.getClave());
            ps.setBoolean(6, usuario.getEstado());

            System.out.println(ps);
            ps.executeUpdate();
            ps.close();
            System.out.println("se registro correctamente dao");
        }
        catch (Exception e){
            System.out.println("error en el registro dao"+e.getMessage().toString());
        }
        finally{
            con.close();//cerrando conexión
        }
    return r;
    }

}


