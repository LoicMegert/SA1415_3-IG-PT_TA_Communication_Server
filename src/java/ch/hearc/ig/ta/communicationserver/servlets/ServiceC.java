package ch.hearc.ig.ta.communicationserver.servlets;

/*
package services;





public class ServiceC extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain;charset=UTF-8");
        String nom = null, prenom = null, adresse = null, ville = null;
        PrintWriter out = response.getWriter();
        try {
            nom = java.net.URLDecoder.decode(request.getParameter("nom"), "UTF-8");
            prenom = java.net.URLDecoder.decode(request.getParameter("prenom"), "UTF-8");
            adresse = java.net.URLDecoder.decode(request.getParameter("adresse"), "UTF-8");
            ville = java.net.URLDecoder.decode(request.getParameter("ville"), "UTF-8");

            if (nom != null && prenom != null) {
                if (!nom.equals("") && !prenom.equals("")) {

                    PersonneDAO p = new PersonneDAO();
                    Long id = p.create(new Personne(nom, prenom, adresse, ville));
                    String s = id + "/" + nom + "/" + prenom + "/" + adresse + "/" + ville;
                    System.out.println("creation de " + s);
                    out.print("OK");

                } else {
                    out.print("KO");
                }
            } else {
                out.print("KO");
            }

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


 */