package ch.hearc.ig.ta.communicationserver.servlets;

/*
 
package services;

import DAO.PersonneDAO;
import MemoryUser.Utilisateur;
import Model.Personne;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utils.Action;


public class ServiceU extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String id = null, nom = null, prenom = null, adresse = null, ville = null;

        try {
            id = java.net.URLDecoder.decode(request.getParameter("id"),"UTF-8");
            nom = java.net.URLDecoder.decode(request.getParameter("nom"),"UTF-8");
            prenom = java.net.URLDecoder.decode(request.getParameter("prenom"),"UTF-8");
            adresse =java.net.URLDecoder.decode( request.getParameter("adresse"),"UTF-8");
            ville = java.net.URLDecoder.decode(request.getParameter("ville"),"UTF-8");
            if (nom != null && prenom != null) {
                if (!nom.equals("") && !prenom.equals("")) {
                    Personne p = new Personne(Long.parseLong(id), nom, prenom, adresse, ville);
                    PersonneDAO pdao = new PersonneDAO();
                    pdao.update(p);
                    out.print("OK");



                }
                else out.print("KO");
            } else {
                out.print("KO");
            }
            // Utilisateur.logAction(request.getSession(true), Action.UPDATE, p.toString());

            //request.getRequestDispatcher("/index.jsp").forward(request, response);


        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 /
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
