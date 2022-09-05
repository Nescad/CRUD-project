package control;

import java.sql.ResultSet;
import modelo.Responsable;
import java.util.Date;

public class ControlResponsable {
    Responsable objResponsable;

    public ControlResponsable(Responsable objResponsable) {
        this.objResponsable = objResponsable;
    }

    public ControlResponsable() {
        this.objResponsable = null; 
    }
    
    public void guardar(){
        String cod =objResponsable.getCod();
        String nom = objResponsable.getNom();
        String telfijo = objResponsable.getTelfijo();
        String telmovil = objResponsable.getTelmovil();
        String comandoSql="INSERT INTO responsable VALUES('"+cod+"','"+nom+"', '"+telfijo+"' , '"+telmovil+"') ";
        ControlConexion objControlConexion= new ControlConexion();
        objControlConexion.abriBD("bdproyectos", "root", "");
        objControlConexion.ejecutarUpdate(comandoSql);
        objControlConexion.cerrarBd(); 
    }
    
    public Responsable consultar(){
        ResultSet objResultSet;
        String cod =objResponsable.getCod();
        String nom = "";
        String telfijo = "";
        String telmovil = "";
        String comandoSql="SELECT * FROM responsable WHERE cod = '"+cod+"' ";
        ControlConexion objControlConexion= new ControlConexion();
        objControlConexion.abriBD("bdproyectos", "root", "");
        objResultSet = objControlConexion.ejecutarSelect(comandoSql);
        try{
            if(objResultSet.next()){
                nom = objResultSet.getString("nom");
                telfijo = objResultSet.getString("telfijo");
                telmovil = objResultSet.getString("telmovil");
                objResponsable.setNom(nom);
                objResponsable.setTelfijo(telfijo);
                objResponsable.setTelmovil(telmovil);
            }
        }catch(Exception exp){
        System.out.println("ERROR:"+exp.getMessage());
        }
        objControlConexion.cerrarBd(); 
        return objResponsable;
    }
    
    public void borrar(){
        String cod=objResponsable.getCod();
        String comandoSql="DELETE FROM responsable WHERE cod = '"+cod+"' ";
        ControlConexion objControlConexion= new ControlConexion();
        objControlConexion.abriBD("bdproyectos", "root", "");
        objControlConexion.ejecutarUpdate(comandoSql);
        objControlConexion.cerrarBd(); 
    }   
    
    public void modificar(){
        String cod=objResponsable.getCod();
        String nom=objResponsable.getNom();
        String telfijo =objResponsable.getTelfijo();
        String telmovil =objResponsable.getTelmovil();
        String comandoSql="UPDATE responsable SET nom = '"+nom+"', telfijo = '"+telfijo+"', telmovil = '"+telmovil+"'  WHERE cod = '"+cod+"' ";
        ControlConexion objControlConexion= new ControlConexion();
        objControlConexion.abriBD("bdproyectos", "root", "");
        objControlConexion.ejecutarUpdate(comandoSql);
        objControlConexion.cerrarBd(); 
    }
    
    
    
    
}
