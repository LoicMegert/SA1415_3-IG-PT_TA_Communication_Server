package ch.hearc.ig.ta.communicationserver.servlets;

/*

package services;

import DAO.PersonneDAO;
import Model.Personne;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServiceD extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String id = null;
        try {
          
                id = request.getParameter("id");
                if (id != null) {
                    if (!id.equals("")) {
                        PersonneDAO pdao = new PersonneDAO();
                        pdao.delete(new Personne(Long.parseLong(id), null, null, null, null));
                        out.println("OK");
                    }
                }else out.print("KO");
               
            
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
 rride
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}


 */