package com.oracle.crudoracle.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.stereotype.Service;




@Service
public class Servico {

    //private static final String URL = "jdbc:mysql://localhost:3306/carro";
    private static final String URL="jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USUARIO = "ght";
    private static final String SENHA = "4004";

    public void ListarUsuarios(){

        try {
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            PreparedStatement stmt = conn.prepareStatement("SELECT nome_usu FROM usuario");
            ResultSet rs = stmt.executeQuery();
         
            while (rs.next()) {
                //int ano = rs.getInt("ano");
                String nome = rs.getString("nome_usu");
                System.out.println("Nome: " + nome);
            }
            
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }



    }

}
