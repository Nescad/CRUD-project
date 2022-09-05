package modelo;


public class Responsable {
    String cod; 
    String nom; 
    String telfijo;
    String telmovil;

    public Responsable(String cod, String nom, String telfijo, String telmovil) {
        this.cod = cod;
        this.nom = nom;
        this.telfijo = telfijo;
        this.telmovil = telmovil;
    }

    public Responsable() {
        this.cod = "";
        this.nom = "";
        this.telfijo = "";
        this.telmovil = "";
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelfijo() {
        return telfijo;
    }

    public void setTelfijo(String telfijo) {
        this.telfijo = telfijo;
    }

    public String getTelmovil() {
        return telmovil;
    }

    public void setTelmovil(String telmovil) {
        this.telmovil = telmovil;
    }
    
    
}
