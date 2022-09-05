package modelo;

import java.util.Date;

public class Proyecto {
    int cod;
    String titulo;
    Date fechaini;
    Date fechafin;
    double costo;

    public Proyecto(int cod, String titulo, Date fechaini, Date fechafin, double costo) {
        this.cod = cod;
        this.titulo = titulo;
        this.fechaini = fechaini;
        this.fechafin = fechafin;
        this.costo = costo;
    }

    public Proyecto() {
        this.cod = 0;
        this.titulo = "";
        this.fechaini = null;
        this.fechafin = null;
        this.costo = 0;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaini() {
        return fechaini;
    }

    public void setFechaini(Date fechaini) {
        this.fechaini = fechaini;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
}
