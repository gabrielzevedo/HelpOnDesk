package Controllero;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Modelo.*;
import Viewo.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author Azevedo
 */
public class ctrlTecnico {
    Solicitante solic=new Solicitante();
    Funcionario func=new Funcionario();
    Tecnico tec=new Tecnico();
    Chamado cham=new Chamado();
    int ultimoid;
    int idbd;
   
    
        public int setarDados(Modelo.Funcionario f){
        int rc=111;
        int ido=f.getId();
        //System.out.println(ido);
        String sql="SELECT * FROM tecnico WHERE id="+ido;
        Connection cn=Connecto.Conexao.getConnection();
        //System.out.println(sql);
        try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(rs.next()){
               tec.setNome(rs.getString(1));
               tec.setEmail(rs.getString(2));
                  cn.close();
                  rc=0;
            }
        }catch (SQLException E){
            System.out.println(E.getMessage());

        }
     
        return rc;
    }
        
    
}
