package modelo;
import java.util.Date;

public class Actividad {
    int cod;
    String descripcion;
    Date fechaini;
    Date fechafin;

    public Actividad(int cod, String descripcion, Date fechaini, Date fechafin) {
        this.cod = cod;
        this.descripcion = descripcion;
        this.fechaini = fechaini;
        this.fechafin = fechafin;
    }

    public Actividad() {
        this.cod = 0;
        this.descripcion = "";
        this.fechaini = null;
        this.fechafin = null;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    
}
