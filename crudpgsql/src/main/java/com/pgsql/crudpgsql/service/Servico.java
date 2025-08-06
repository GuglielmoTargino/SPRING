package com.pgsql.crudpgsql.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.stereotype.Service;

@Service
public class Servico {
    private static final String URL = "jdbc:postgresql://localhost:5432/suabase";
    private static final String USUARIO = "ght";
    private static final String SENHA = "4004";

    public void listarCarros() {
       

        try {
           
            // 1. Conectar ao banco de dados
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            // 2. Criar a consulta SQL
            PreparedStatement stmt = conn.prepareStatement("SELECT ano, marca FROM carro");
            // 3. Preparar e executar
            ResultSet rs = stmt.executeQuery();
         
            //varre o resultado
            while (rs.next()) {
                int ano = rs.getInt("ano");
                String marca = rs.getString("marca");
              //imprime o resultado
                System.out.println("Ano: " + ano + ", Marca: " + marca);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        
    } 
    }

}
