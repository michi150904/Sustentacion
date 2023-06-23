package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UsuarioDAO;
import model.UsuarioVo;

public class Usuario extends HttpServlet {
    UsuarioVo u= new UsuarioVo();
    UsuarioDAO ud= new UsuarioDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println ("Entro al doget");
    String action=req.getParameter("action");
    switch (action) {
        case "iniciar":
        req.getRequestDispatcher("index.jsp").forward(req, resp);
        System.out.println("se abrio el formulario de inciar sesion");
            break;
        case "regis":
        req.getRequestDispatcher("views//usuario//formLogin.jsp").forward(req, resp);
        System.out.println("se abrio el formulario de registrar usuario");
            break;
case "Ingresar":
        req.getRequestDispatcher("views//usuario//dashboard.jsp").forward(req, resp);
        System.out.println("se abrio el dashboard");

        default:
            break;
    }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println ("Entro al dopost");
    String action=req.getParameter("action");
        switch (action){
            case "Ingresar":
        req.getRequestDispatcher("views//usuario//dashboardBol.jsp").forward(req, resp);
        System.out.println("se abrio el dashboard");
break;
            case "Registrar":

        if (req.getParameter("nombre")!=null){
            u.setNombre(req.getParameter("nombre"));
        }
        if(req.getParameter("correo")!=null){
            u.setCorreo(req.getParameter("correo"));
        }
        if(req.getParameter("telefono")!=null){
            u.setTelefono(Integer.parseInt(req.getParameter("telefono")));
        }
        if(req.getParameter("usuario")!=null){
            u.setUsuario(req.getParameter("usuario"));
        }
        if(req.getParameter("clave")!=null){
            u.setClave(req.getParameter("clave"));
        }
        if(req.getParameter("estado")!=null){
            u.setEstado(true);
        }
        else{
            u.setEstado(false);
        }
        try {
            ud.registrar(u);
            System.out.println("Se registro correctamente usuario");
            req.getRequestDispatcher("index.jsp").forward(req, resp);

        } catch (Exception e) {
            System.out.println("error en el registro usuario"+e.getMessage().toString());
        }
        break;
        }
    }
}
