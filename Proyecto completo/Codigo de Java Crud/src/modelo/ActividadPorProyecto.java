package modelo;

import java.util.Date;

public class ActividadPorProyecto {
    String codresp;
    int codactiv;
    int codproy;
    Date fecha_asig;

    public ActividadPorProyecto(String codresp, int codactiv, int codproy, Date fecha_asig) {
        this.codresp = codresp;
        this.codactiv = codactiv;
        this.codproy = codproy;
        this.fecha_asig = fecha_asig;
    }

    public ActividadPorProyecto() {
        this.codresp = "";
        this.codactiv = 0;
        this.codproy = 0;
        this.fecha_asig = null;
    }

    public String getCodresp() {
        return codresp;
    }

    public void setCodresp(String codresp) {
        this.codresp = codresp;
    }

    public int getCodactiv() {
        return codactiv;
    }

    public void setCodactiv(int codactiv) {
        this.codactiv = codactiv;
    }

    public int getCodproy() {
        return codproy;
    }

    public void setCodproy(int codproy) {
        this.codproy = codproy;
    }

    public Date getFecha_asig() {
        return fecha_asig;
    }

    public void setFecha_asig(Date fecha_asig) {
        this.fecha_asig = fecha_asig;
    }
    
    
    
    
}
