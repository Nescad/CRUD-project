package control;

import java.sql.ResultSet;
import modelo.Proyecto;
import java.util.Date;

public class ControlProyecto {
    Proyecto objProyecto;

    public ControlProyecto(Proyecto objProyecto) {
        this.objProyecto = objProyecto;
    }

    public ControlProyecto() {
        this.objProyecto = null;
    }
    
    public void guardar(){
        int cod =objProyecto.getCod();
        String titulo = objProyecto.getTitulo();
        Date fechaini = objProyecto.getFechaini();
        Date fechafin = objProyecto.getFechafin();
        double costo= objProyecto.getCosto();
        String comandoSql="INSERT INTO proyecto VALUES('"+cod+"','"+titulo+"', '"+(new java.sql.Date(fechaini.getTime()))+"', '"+(new java.sql.Date(fechafin.getTime()))+"', '"+costo+"') ";
        ControlConexion objControlConexion= new ControlConexion();
        objControlConexion.abriBD("bdproyectos", "root", "");
        objControlConexion.ejecutarUpdate(comandoSql);
        objControlConexion.cerrarBd(); 
    }
    
    public Proyecto consultar(){
        ResultSet objResultSet;
        int cod =objProyecto.getCod();
        String titulo = "";
        Date fechaini = null;
        Date fechafin = null;
        double costo = 0;
        String comandoSql="SELECT * FROM proyecto WHERE cod = '"+cod+"' ";
        ControlConexion objControlConexion= new ControlConexion();
        objControlConexion.abriBD("bdproyectos", "root", "");
        objResultSet = objControlConexion.ejecutarSelect(comandoSql);
        try{
            if(objResultSet.next()){
                titulo = objResultSet.getString("titulo");
                fechaini = objResultSet.getDate("fechaini");
                fechafin = objResultSet.getDate("fechafin");
                costo = objResultSet.getDouble("costo");
                objProyecto.setTitulo(titulo);
                objProyecto.setFechaini(fechaini);
                objProyecto.setFechafin(fechafin);
                objProyecto.setCosto(costo);
            }
        }catch(Exception exp){
        System.out.println("ERROR:"+exp.getMessage());
        }
        objControlConexion.cerrarBd(); 
        return objProyecto;
    }
    
    public void borrar(){
        int cod=objProyecto.getCod();
        String comandoSql="DELETE FROM proyecto WHERE cod = '"+cod+"' ";
        ControlConexion objControlConexion= new ControlConexion();
        objControlConexion.abriBD("bdproyectos", "root", "");
        objControlConexion.ejecutarUpdate(comandoSql);
        objControlConexion.cerrarBd(); 
    }   
    
    public void modificar(){
        int cod=objProyecto.getCod();
        String titulo=objProyecto.getTitulo();
        Date fechaini =objProyecto.getFechaini();
        Date fechafin =objProyecto.getFechafin();
        double costo = objProyecto.getCosto();
        String comandoSql="UPDATE proyecto SET titulo = '"+titulo+"', fechaini = '"+(new java.sql.Date(fechaini.getTime()))+"', fechafin = '"+(new java.sql.Date(fechafin.getTime()))+"', costo = '"+costo+"'  WHERE cod = '"+cod+"' ";
        ControlConexion objControlConexion= new ControlConexion();
        objControlConexion.abriBD("bdproyectos", "root", "");
        objControlConexion.ejecutarUpdate(comandoSql);
        objControlConexion.cerrarBd(); 
    }
    
    
    
}
