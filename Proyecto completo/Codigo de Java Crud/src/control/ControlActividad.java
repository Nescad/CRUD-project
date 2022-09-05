package control;

import java.sql.ResultSet;
import modelo.Actividad;
import java.util.Date;

public class ControlActividad {
    Actividad objActividad;
    
    public ControlActividad(Actividad objActividad){
        this.objActividad = objActividad;
    }

    public ControlActividad() {
        this.objActividad = null;
    }
    
    public void guardar(){
        int cod =objActividad.getCod();
        String desc = objActividad.getDescripcion();
        Date fechaini = objActividad.getFechaini();
        Date fechafin = objActividad.getFechafin();
        String comandoSql="INSERT INTO actividad VALUES('"+cod+"','"+desc+"', '"+(new java.sql.Date(fechaini.getTime()))+"', '"+(new java.sql.Date(fechafin.getTime()))+"') ";
        ControlConexion objControlConexion= new ControlConexion();
        objControlConexion.abriBD("bdproyectos", "root", "");
        objControlConexion.ejecutarUpdate(comandoSql);
        objControlConexion.cerrarBd(); 
    }
    
    public Actividad consultar(){
        ResultSet objResultSet;
        int cod =objActividad.getCod();
        String desc = "";
        Date fechaini = null;
        Date fechafin = null;
        String comandoSql="SELECT * FROM actividad WHERE cod = '"+cod+"' ";
        ControlConexion objControlConexion= new ControlConexion();
        objControlConexion.abriBD("bdproyectos", "root", "");
        objResultSet = objControlConexion.ejecutarSelect(comandoSql);
        try{
            if(objResultSet.next()){
                desc = objResultSet.getString("descripcion");
                fechaini = objResultSet.getDate("fechaini");
                fechafin = objResultSet.getDate("fechafin");
                objActividad.setDescripcion(desc);
                objActividad.setFechaini(fechaini);
                objActividad.setFechafin(fechafin);
            }
        }catch(Exception exp){
        System.out.println("ERROR:"+exp.getMessage());
        }
        objControlConexion.cerrarBd(); 
        return objActividad;
    }
    
    public void borrar(){
        int cod=objActividad.getCod();
        String comandoSql="DELETE FROM actividad WHERE cod = '"+cod+"' ";
        ControlConexion objControlConexion= new ControlConexion();
        objControlConexion.abriBD("bdproyectos", "root", "");
        objControlConexion.ejecutarUpdate(comandoSql);
        objControlConexion.cerrarBd(); 
    }   
    
    public void modificar(){
        int cod=objActividad.getCod();
        String desc=objActividad.getDescripcion();
        Date fechaini =objActividad.getFechaini();
        Date fechafin =objActividad.getFechafin();
        String comandoSql="UPDATE actividad SET descripcion = '"+desc+"', fechaini = '"+(new java.sql.Date(fechaini.getTime()))+"', fechafin = '"+(new java.sql.Date(fechafin.getTime()))+"'  WHERE cod = '"+cod+"' ";
        ControlConexion objControlConexion= new ControlConexion();
        objControlConexion.abriBD("bdproyectos", "root", "");
        objControlConexion.ejecutarUpdate(comandoSql);
        objControlConexion.cerrarBd(); 
    }
}
