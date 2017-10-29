package Controllero;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import Modelo.*;
import Viewo.*;

/**
 *
 * @author azevedo
 */
public class ctrlCadFuncionario {
    CadFuncionario cf=new CadFuncionario();
    int idbd;
    
        public int idFuncionario(){
         String sql="SELECT * FROM funcionario";
        Connection cn=Connecto.Conexao.getConnection();
        try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(rs.last()){
              idbd= (rs.getInt(1));
              cf.setId(rs.getInt(1)+1);
              cn.close();
            }
        }catch (SQLException E){
            System.out.println(E.getMessage());
        }
         return idbd+1;
        }
        
        public int loginFuncionario(String login){
        int rc=505;
        String sql="SELECT * FROM funcionario WHERE login='"+login+"'";
        Connection cn=Connecto.Conexao.getConnection();
        try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(rs.next()){
              rc=506;
            }
        }catch (SQLException E){
            System.out.println(E.getMessage());
        }
         return rc;
        }
       
        
    public int cadastrarTecnico(){
        int rc=111;
        String sql="INSERT INTO funcionario (id, perfil, login, senha) ";
        sql+="VALUES ("+cf.getId()+", 'tecnico', '"+cf.getLogin()+"', '"+cf.getSenha()+"');";
        String sql2="INSERT INTO tecnico (nome_Tec, email_Tec, id) ";
        sql2+="VALUES ('"+cf.getNome()+"', '"+cf.getEmail()+"', "+cf.getId()+")";
        Connection cn= Connecto.Conexao.getConnection();
        // System.out.print(sql);
        try{
            Statement st=cn.createStatement();
            st.executeUpdate(sql);
            st.executeUpdate(sql2);
            rc=0;
            cn.close();
        }catch(SQLException  E){
            rc=111;
            E.printStackTrace();
        }
        return rc;
    }
    
    public int cadastrarSolicitante(){
        int rc=111;
        String sql="INSERT INTO funcionario (id, perfil, login, senha) ";
        sql+="VALUES ("+cf.getId()+", 'solicitante', '"+cf.getLogin()+"', '"+cf.getSenha()+"');";
        String sql2="INSERT INTO solicitante (matricula_Solic, nome_Solic, email_Solic, setor_Solic, ramal_Solic, andar_Solic, id) ";
        sql2+="VALUES ('"+cf.getMatricula()+"', '"+cf.getNome()+"', '"+cf.getEmail()+"', '"+cf.getSetor()+"', "+cf.getRamal()+", "+cf.getAndar()+", "+cf.getId()+");";
        Connection cn= Connecto.Conexao.getConnection();
        // System.out.print(sql);
        try{
            Statement st=cn.createStatement();
            st.executeUpdate(sql);
            st.executeUpdate(sql2);
            rc=0;
            cn.close();
        }catch(SQLException  E){
            rc=111;
            E.printStackTrace();
        }
        return rc;
    }
    
}
