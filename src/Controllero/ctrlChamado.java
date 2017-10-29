/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
 * @author aluno
 */
public class ctrlChamado {
    Solicitante solic=new Solicitante();
    Funcionario func=new Funcionario();
    Chamado cham=new Chamado();
    int idbd;
    
        public int idChamado(){
         String sql="SELECT * FROM chamado";
        Connection cn=Connecto.Conexao.getConnection();
        try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(rs.last()){
              idbd= (rs.getInt(1));
              cham.setId(rs.getInt(1)+1);
              cn.close();
            }
        }catch (SQLException E){
            System.out.println(E.getMessage());
        }
         return idbd+1;
        }
        
       
        
    public int solicitarChamado(String formatohora, DateFormat hora, Date hoje, String formatodata, DateFormat data){
        int rc=111;
        String sql="INSERT INTO chamado (id, situacao, urgencia, descricao, id_Solic, id_Tec, hora, data, obsFinal, horaFinal, dataFinal, custo) ";
        sql=sql+"VALUES ("+idChamado()+", 'aberto', '"+cham.getUrgencia()+"', '"+cham.getDescricao()+"', "+func.getId()+", null, '"+hora.format(hoje)+"', '"+data.format(hoje)+"', 'Nenhuma', '00:00:00', '0000-00-00', 0);";
        Connection cn= Connecto.Conexao.getConnection();
       // System.out.print(sql);
        try{
            Statement st=cn.createStatement();
            st.executeUpdate(sql);
            rc=0;
            cn.close();
        }catch(SQLException  E){
            rc=111;
            E.printStackTrace();
        }
        return rc;
    
}
    
}
