package ch.hearc.ig.ta.communicationserver.business;

import java.io.Serializable;
import org.json.simple.JSONAware;
import org.json.simple.JSONObject;

/**
 *
 * @author termine
 */
public class Personne implements Serializable, JSONAware {

    private Long id=null;
    private String nom=null;
    private String prenom=null;
    private String adresse=null;
    private String ville=null;

    public Personne() {
    }

    public Personne(Long id, String nom, String prenom, String adresse, String ville) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
    }
    public Personne( String nom, String prenom, String adresse, String ville) {

        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
    public void print(){
      System.out.println(this.id+ "-"+this.nom+"-"+this.prenom+"-"+this.adresse+"-"+this.ville);
    }

     public String toString(){
      return this.id+ "-"+this.nom+"-"+this.prenom+"-"+this.adresse+"-"+this.ville;
    }

     
    public String toJSONString() {
        JSONObject obj = new JSONObject();
        obj.put("id", new Integer(id.intValue()));
        obj.put("nom", nom);
        obj.put("prenom", prenom);
        obj.put("adresse", adresse);
        obj.put("ville", ville);
        return obj.toString();

    }
}
