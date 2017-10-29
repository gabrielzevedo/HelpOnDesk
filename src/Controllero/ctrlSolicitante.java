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
public class ctrlSolicitante {
    Solicitante solic=new Solicitante();
    Funcionario func=new Funcionario();
    Chamado cham=new Chamado();
    int ultimoid;
    int idbd;
   
    
        public int setarDados(Modelo.Funcionario f){
        int rc=111;
        int ido=f.getId();
        //System.out.println(ido);
        String sql="SELECT * FROM solicitante WHERE id="+ido;
        Connection cn=Connecto.Conexao.getConnection();
        //System.out.println(sql);
        try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(rs.next()){
               solic.setMatricula(rs.getString(1));
               solic.setNome(rs.getString(2));
               solic.setEmail(rs.getString(3));
               solic.setSetor(rs.getString(4));
               solic.setRamal(rs.getInt(5));
               solic.setAndar(rs.getInt(6));
                  cn.close();
                  rc=0;
            }
        }catch (SQLException E){
            System.out.println(E.getMessage());

        }
     
        return rc;
    }
        
    
}
