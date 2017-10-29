package Controllero;

import Viewo.*;
import Modelo.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Azevedo
 */
public class ctrlFuncionario {
    
    
  
     public int autenticar(Funcionario func){
         String user=func.getLogin();
         String pass=func.getSenha();
        // func.setId(5);
         int rc=404;
        String sql="SELECT * FROM funcionario WHERE login='"+user+"'";
        Connection cn=Connecto.Conexao.getConnection();
       // System.out.println(func.getId());
        try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
          
            if(rs.next()){
            
               String word=(rs.getString(4));
                  if (pass.equals(word)){
                      //senha ok
                       func.setPerfil(rs.getString(2));
                       func.setId(rs.getInt(1));
                      // System.out.println("certim: "+func.getId());
                       rc=0;
                   }else{
                      JOptionPane.showMessageDialog(null,"Senha incorreta!", "Falha na autenticação", JOptionPane.ERROR_MESSAGE);
                      rc=99;
                    }
                  
                  cn.close();
            }
        }catch (SQLException E){
         System.out.println(E.getMessage());
        }
        return rc;
    }
     
     public void direcionar(Funcionario func, Solicitante solic){
         String perfil=func.getPerfil();
         if(perfil.equalsIgnoreCase("tecnico")){
         frmTecnico cli=new frmTecnico();
         cli.setVisible(true);
         }else
             if(perfil.equalsIgnoreCase("solicitante")){
                frmSolicitante prod=new frmSolicitante();
                prod.setVisible(true);
              
                
                
             
             }
     }
    
}
