import java.lang.*;
import java.util.*;

public class sae201 {
    public static void main(String[] args) {
        System.out.println("Hi! Do you want a cookie ?");
    }
}

abstract class Prestation {
    private String type_prestation;
    private final ArrayList <String> listePrestation = new ArrayList<>(List.of("Pressing", "Navette", "Petit-dejeuner en Chambre", "Petit-dejeuner au Bar", "Consomation en Chambre", "Consommation au Bar"));
    private int num_chambre;
    private Date date_prestation;
    public Prestation(String type_prestation, int num_chambre, Date date_prestation) {
        this.type_prestation = type_prestation;
        this.num_chambre = num_chambre;
        this.date_prestation = date_prestation;
    }
    public String getType_prestation() {
        return type_prestation;
    }
    public void setType_prestation(String type_prestation) {
        this.type_prestation = type_prestation;
    }
    public int getNum_chambre() {
        return num_chambre;
    }
    public void setNum_chambre(int num_chambre) {
        this.num_chambre = num_chambre;
    }
    public Date getDate_prestation() {
        return date_prestation;
    }
    public void setDate_prestation(Date date_prestation) {
        this.date_prestation = date_prestation;
    } 
}

class ConsomationBar extends Prestation {
    private double prix_prestation;
    private int quantite_prestation;
    private String libelle;
    public ConsomationBar(String nom_prestation, int num_chambre, Date date_prestation, double prix_prestation,
            int quantite_prestation, String libelle) {
        super(nom_prestation, num_chambre, date_prestation);
        this.prix_prestation = prix_prestation;
        this.quantite_prestation = quantite_prestation;
        this.libelle = libelle;
    }
    public double getPrix_prestation() {
        return prix_prestation;
    }
    public void setPrix_prestation(double prix_prestation) {
        this.prix_prestation = prix_prestation;
    }
    public int getQuantite_prestation() {
        return quantite_prestation;
    }
    public void setQuantite_prestation(int quantite_prestation) {
        this.quantite_prestation = quantite_prestation;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}

class ConsomationChambre extends Prestation {
    private double prix_prestation;
    private int quantite_prestation;
    private String libelle;
    public ConsomationChambre(String nom_prestation, int num_chambre, Date date_prestation, double prix_prestation,
            int quantite_prestation, String libelle) {
        super(nom_prestation, num_chambre, date_prestation);
        this.prix_prestation = prix_prestation;
        this.quantite_prestation = quantite_prestation;
        this.libelle = libelle;
    }
    public double getPrix_prestation() {
        return prix_prestation;
    }
    public void setPrix_prestation(double prix_prestation) {
        this.prix_prestation = prix_prestation;
    }
    public int getQuantite_prestation() {
        return quantite_prestation;
    }
    public void setQuantite_prestation(int quantite_prestation) {
        this.quantite_prestation = quantite_prestation;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}

class PetitDejChambre extends Prestation {
    private double prix_prestation;
    private int quantite_prestation;
    private String libelle;
    public PetitDejChambre(String nom_prestation, int num_chambre, Date date_prestation, double prix_prestation,
            int quantite_prestation, String libelle) {
        super(nom_prestation, num_chambre, date_prestation);
        this.prix_prestation = prix_prestation;
        this.quantite_prestation = quantite_prestation;
        this.libelle = libelle;
    }
    public double getPrix_prestation() {
        return prix_prestation;
    }
    public void setPrix_prestation(double prix_prestation) {
        this.prix_prestation = prix_prestation;
    }
    public int getQuantite_prestation() {
        return quantite_prestation;
    }
    public void setQuantite_prestation(int quantite_prestation) {
        this.quantite_prestation = quantite_prestation;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}

class PetitDejBar extends Prestation {
    private double prix_prestation;
    private int quantite_prestation;
    private String libelle;
    public PetitDejBar(String nom_prestation, int num_chambre, Date date_prestation, double prix_prestation,
            int quantite_prestation, String libelle) {
        super(nom_prestation, num_chambre, date_prestation);
        this.prix_prestation = prix_prestation;
        this.quantite_prestation = quantite_prestation;
        this.libelle = libelle;
    }
    public double getPrix_prestation() {
        return prix_prestation;
    }
    public void setPrix_prestation(double prix_prestation) {
        this.prix_prestation = prix_prestation;
    }
    public int getQuantite_prestation() {
        return quantite_prestation;
    }
    public void setQuantite_prestation(int quantite_prestation) {
        this.quantite_prestation = quantite_prestation;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}

class Navette extends Prestation {
    private double prix_prestation;
    private int quantite_prestation;
    public Navette(String nom_prestation, int num_chambre, Date date_prestation, double prix_prestation,
            int quantite_prestation, String libelle) {
        super(nom_prestation, num_chambre, date_prestation);
        this.prix_prestation = prix_prestation;
        this.quantite_prestation = quantite_prestation;
    }
    public double getPrix_prestation() {
        return prix_prestation;
    }
    public void setPrix_prestation(double prix_prestation) {
        this.prix_prestation = prix_prestation;
    }
    public int getQuantite_prestation() {
        return quantite_prestation;
    }
    public void setQuantite_prestation(int quantite_prestation) {
        this.quantite_prestation = quantite_prestation;
    }
}

class Pressing extends Prestation {
    private double prix_prestation;
    private int quantite_prestation;
    private String libelle;
    public Pressing(String nom_prestation, int num_chambre, Date date_prestation, double prix_prestation,
            int quantite_prestation, String libelle) {
        super(nom_prestation, num_chambre, date_prestation);
        this.prix_prestation = prix_prestation;
        this.quantite_prestation = quantite_prestation;
        this.libelle = libelle;
    }
    public double getPrix_prestation() {
        return prix_prestation;
    }
    public void setPrix_prestation(double prix_prestation) {
        this.prix_prestation = prix_prestation;
    }
    public int getQuantite_prestation() {
        return quantite_prestation;
    }
    public void setQuantite_prestation(int quantite_prestation) {
        this.quantite_prestation = quantite_prestation;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}