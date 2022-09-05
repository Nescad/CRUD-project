package control;

import java.sql.ResultSet;
import modelo.ActividadPorProyecto;
import java.util.Date;

public class ControlActividadPorProyecto {
    ActividadPorProyecto objActividadPorProyecto;

    public ControlActividadPorProyecto(ActividadPorProyecto objActividadPorProyecto) {
        this.objActividadPorProyecto = objActividadPorProyecto;
    }

    public ControlActividadPorProyecto() {
        this.objActividadPorProyecto = null;
    }
    
    public void guardar(){
        String codresp =objActividadPorProyecto.getCodresp();
        int codactiv = objActividadPorProyecto.getCodactiv();
        int codproy = objActividadPorProyecto.getCodproy();
        Date fecha_asig = objActividadPorProyecto.getFecha_asig();
        String comandoSql="INSERT INTO resp_act_proy VALUES('"+codresp+"','"+codactiv+"','"+codproy+"' , '"+(new java.sql.Date(fecha_asig.getTime()))+"') ";
        ControlConexion objControlConexion= new ControlConexion();
        objControlConexion.abriBD("bdproyectos", "root", "");
        objControlConexion.ejecutarUpdate(comandoSql);
        objControlConexion.cerrarBd(); 
    }
    
    public ActividadPorProyecto consultar(){
        ResultSet objResultSet;
        String codresp =objActividadPorProyecto.getCodresp();
        int codactiv = 0;
        int codproy = 0;
        Date fecha_asig = null;
        String comandoSql="SELECT * FROM resp_act_proy WHERE codresp = '"+codresp+"' ";
        ControlConexion objControlConexion= new ControlConexion();
        objControlConexion.abriBD("bdproyectos", "root", "");
        objResultSet = objControlConexion.ejecutarSelect(comandoSql);
        try{
            if(objResultSet.next()){
                codactiv = objResultSet.getInt("codactiv");
                codproy = objResultSet.getInt("codproy");
                fecha_asig = objResultSet.getDate("fecha_asig");
                objActividadPorProyecto.setCodactiv(codactiv);
                objActividadPorProyecto.setCodproy(codproy);
                objActividadPorProyecto.setFecha_asig(fecha_asig);
            }
        }catch(Exception exp){
        System.out.println("ERROR:"+exp.getMessage());
        }
        objControlConexion.cerrarBd(); 
        return objActividadPorProyecto;
    }
    
    public void borrar(){
        String codresp=objActividadPorProyecto.getCodresp();
        String comandoSql="DELETE FROM resp_act_proy WHERE codresp = '"+codresp+"' ";
        ControlConexion objControlConexion= new ControlConexion();
        objControlConexion.abriBD("bdproyectos", "root", "");
        objControlConexion.ejecutarUpdate(comandoSql);
        objControlConexion.cerrarBd(); 
    }   
    
    public void modificar(){
        String codresp=objActividadPorProyecto.getCodresp();
        int codactiv =objActividadPorProyecto.getCodactiv();
        int codproy =objActividadPorProyecto.getCodproy();
        Date fecha_asig =objActividadPorProyecto.getFecha_asig();
        String comandoSql="UPDATE resp_act_proy SET codactiv = '"+codactiv+"',codproy = '"+codproy+"' , fecha_asig = '"+(new java.sql.Date(fecha_asig.getTime()))+"'  WHERE codresp = '"+codresp+"' ";
        ControlConexion objControlConexion= new ControlConexion();
        objControlConexion.abriBD("bdproyectos", "root", "");
        objControlConexion.ejecutarUpdate(comandoSql);
        objControlConexion.cerrarBd(); 
    }
}
