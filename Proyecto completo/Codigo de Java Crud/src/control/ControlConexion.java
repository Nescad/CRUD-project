package control;
import java.sql.*;


public class ControlConexion {
    ResultSet objResulSet; //Se utiliza cuando se hagan consultas
    Statement objStatement;//Para definir o crear una consulta SQL
    Connection objConnection;//Para abrir o cerrar la BDD
    
    
    
    public ControlConexion(){
        objResulSet=null;
        objStatement = null;
        objConnection = null;
    }
    
    public ResultSet ejecutarSelect(String sentencia){//esta la usamos cuando el comando sea un select(si quiero consultar, )
		try{
		objStatement = objConnection.createStatement();
		objResulSet=objStatement.executeQuery(sentencia);
		}
		catch(SQLException exp){
			System.out.println(exp.getMessage());		
	}
		return objResulSet;
    
    }
    
  public void ejecutarUpdate(String sentencia){//y esta cuando sea insert,update,delete
            try{
                objStatement=objConnection.createStatement();
                objStatement.executeUpdate(sentencia);
            }
            catch(SQLException exp){
                System.out.println(exp.getMessage());
            }
        }
	public void abriBD(String bd, String nomUsuario, String contrasena){
             String mx="";
		try
		{

		Class.forName("com.mysql.jdbc.Driver");

                 objConnection = DriverManager.getConnection("jdbc:mysql://localhost/"+ bd, nomUsuario, contrasena);
		}
		catch(SQLException | ClassNotFoundException exp){
                    mx=exp.getMessage();
			System.out.println("ERROR:"+exp.getMessage());
		}
	}
	public void cerrarBd(){
		try
		{
			objConnection.close(); //Cerrar Conexi�n
		}
		catch(SQLException exp){
			System.out.println(exp.getMessage());
		}
		catch(Exception exp){
			System.out.println(exp.getMessage());
		}
	}

    
}
