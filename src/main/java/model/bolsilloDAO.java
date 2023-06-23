package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import model.conexion;
public class bolsilloDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql=null;
    int r;

    public int crear (bolsilloVo bol) throws SQLException{
        sql="insert into bolsillo(idBolsillo,nombreBolsillo,saldoBolsillo,estadoBolsillo) values (null,?,?,?)";
        try {
            con=conexion.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1,bol.getNombre());
            ps.setInt(2,bol.getSaldo());
            ps.setString(3,bol.getEstado());
            System.out.println(ps);
            ps.executeUpdate();
            ps.close();
            System.out.println("se creo el saldo dao");
        }
        catch(Exception e){
            System.out.println("error al crear saldo"+e.getMessage().toString());
        }
        finally {
            con.close();
        }
        return r;
    }
        public List<bolsilloVo>Listar() throws SQLException{
        List<bolsilloVo> ListarSaldos= new ArrayList<>();
        sql="select * from bolsillo";
        try {
            con=conexion.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);
            while (rs.next()) {
                bolsilloVo row= new bolsilloVo();
                row.setId(rs.getInt("idBolsillo"));
                row.setNombre(rs.getString("nombreBolsillo"));
                row.setSaldo(rs.getInt("saldoBolsillo"));
                row.setEstado(rs.getString("estadoBolsillo"));
                ListarSaldos.add(row);
            }
            ps.close();
            System.out.println("consulta exitosa dao");
        } catch (Exception e) {
            System.out.println("No se pudo realizar la consulta dao"+e.getMessage().toString());
        }
        finally{
            con.close();
        }
        return ListarSaldos;
    }


}
