package org.cursofinalgrado.uapa.java.servlet.controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpSession;
import org.cursofinalgrado.uapa.java.servlet.modelo.ModeloUsuario;
import org.cursofinalgrado.uapa.java.servlet.entidades.Usuario;


public class LoginServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String usuario = request.getParameter("usuario");
     String pass = request.getParameter("pass");


    //Hacer una consulta a la base de datos para determinar si el usuario esta registrado       
     ModeloUsuario m = new ModeloUsuario();
     Usuario  usu =  m.checkUsuario(usuario,pass);
         
    //Creando session    
    HttpSession session = request.getSession(true); 
        
     if(usu instanceof Usuario){
         System.out.println("Usuario registrado");
        
         
         session.setAttribute("currentSessionUser",usu); 
         response.sendRedirect("index.jsp");
         
     }else{
         
         System.out.println("Usuario no registrado");
        //Enviando mensaje a la pagina de login
         session.setAttribute("loginFailed","Usuario no registrado"); 
         response.sendRedirect("login.jsp");
         
     }
        
    }
}
