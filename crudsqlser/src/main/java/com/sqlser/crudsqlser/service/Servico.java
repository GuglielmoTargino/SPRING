package com.sqlser.crudsqlser.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.stereotype.Service;

@Service
public class Servico {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=connec_test;encrypt=true;trustServerCertificate=true";
    private static final String USUARIO = "ght";
    private static final String SENHA = "4004";


    public void listarCarros() {       

        try {
           
            // 1. Conectar ao banco de dados
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            // 2. Criar a consulta SQL
            PreparedStatement stmt = conn.prepareStatement("SELECT nome_usu, cargo FROM usuario");
            // 3. Preparar e executar
            ResultSet rs = stmt.executeQuery();
         
            //varre o resultado
            while (rs.next()) {
                //int ano = rs.getInt("ano");
                String nome = rs.getString("nome_usu");
                String cargo = rs.getString("cargo");
              //imprime o resultado
                System.out.println("Nome: " + nome+" Cargo:"+cargo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        
    } 
    }

}
