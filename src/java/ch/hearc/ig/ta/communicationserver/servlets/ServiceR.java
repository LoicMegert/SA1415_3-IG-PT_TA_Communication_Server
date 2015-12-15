package ch.hearc.ig.ta.communicationserver.servlets;

import ch.hearc.ig.ta.communicationserver.business.Personne;
import ch.hearc.ig.ta.communicationserver.dao.PersonneDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



public class ServiceR extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String id = null, nom = null, prenom = null, adresse = null, ville = null;
        try {
      
            if(request.getParameter("id")!=null)id = java.net.URLDecoder.decode(request.getParameter("id"),"UTF-8");
            if(request.getParameter("nom")!=null)nom = java.net.URLDecoder.decode(request.getParameter("nom"),"UTF-8");
            if(request.getParameter("prenom")!=null)prenom = java.net.URLDecoder.decode(request.getParameter("prenom"),"UTF-8");
            if(request.getParameter("adresse")!=null) adresse =java.net.URLDecoder.decode( request.getParameter("adresse"),"UTF-8");
            if(request.getParameter("ville")!=null)ville = java.net.URLDecoder.decode(request.getParameter("ville"),"UTF-8");
            //ATTENTION EXECUTION DE CROSS SITE SCRIPTING
            // out.println("recherche de "+ nom + " "+ prenom + " "+ adresse +" " + ville+"<br>");


            PersonneDAO pdao = new PersonneDAO();
            Personne ps = new Personne(nom, prenom, adresse, ville);
            if (id!=null && !"".equals(id)) ps = new Personne(new Long(id), null, null, null, null);
            Vector<Personne> v = pdao.research(ps);
            JSONArray users = new JSONArray();

            for (int i = 0; i < v.size(); i++) {
              //  out.print("nom:" + v.get(i).getNom() + ";" + "///"+ v.get(i).toJSONString());
                users.add(v.get(i));
            }
            out.print(users);
            
            
         

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