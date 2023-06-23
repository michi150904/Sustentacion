package controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bolsilloDAO;
import model.bolsilloVo;

public class Bolsillo extends HttpServlet{
    bolsilloDAO bd= new bolsilloDAO();
    bolsilloVo b= new bolsilloVo();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println ("Entro al doget");
    String action=req.getParameter("action");
    switch (action) {
        case "cons":
            mostrar(req,resp);       
            System.out.println("se abrio la consulta");
            break;

        default:
            break;
    }
    }
        private void mostrar (HttpServletRequest req,HttpServletResponse resp){
            bolsilloVo b=new bolsilloVo();
            bolsilloDAO bd=new bolsilloDAO();
            try{
                List<bolsilloVo>arraySaldos=bd.Listar();
                req.setAttribute("saldos",arraySaldos);
                req.getRequestDispatcher("views//bolsillo//consultar.jsp").forward(req, resp);
                System.out.println("Datos listados correctamente controlador");
            }
            catch(Exception e){
                System.out.println("No se pudo listar"+e.getMessage().toString());
            }
        }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println ("Entro al doget");
    String action=req.getParameter("action");
    switch (action) {
        case "Recargar":
            registrar(req, resp);
            break;
    
        default:
            break;
    }
    }

    private void registrar (HttpServletRequest req, HttpServletResponse resp){
            if (req.getParameter("nombre")!=null){
            b.setNombre(req.getParameter("nombre"));
        }
            if(req.getParameter("saldo")!=null){
            b.setSaldo(Integer.parseInt(req.getParameter("saldo")));
        }
            if(req.getParameter("estado")!=null){
                b.setEstado("Activo");
            }
            else{
                b.setEstado("Inactivo");
            }
            try{
                bd.crear(b);
                System.out.println("Se creo correctamente el saldo, bolsillo");
                req.getRequestDispatcher("views//bolsillo//consultar.jsp").forward(req, resp);;
            }
            catch (Exception e){
                System.out.println("Error, no se pudo crear saldo"+e.getMessage().toString());
            }
 


    }


}
