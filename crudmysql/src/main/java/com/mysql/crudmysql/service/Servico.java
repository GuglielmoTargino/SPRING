package com.mysql.crudmysql.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Service;




@Service
public class Servico {
    private static final String URL = "jdbc:mysql://localhost:3306/carro";
    private static final String USUARIO = "ght";
    private static final String SENHA = "4004";


public void listarCarros() {
       

        try {
            // 1. Conectar ao banco de dados
            //conn = DriverManager.getConnection(URL, USUARIO, SENHA);

            // 2. Criar a consulta SQL
            //String sql = "SELECT ano, marca FROM carro";

            // 3. Preparar e executar
            //stmt = conn.prepareStatement(sql);
            //rs = stmt.executeQuery();

            // 4. Percorrer os resultados
            //while (rs.next()) {
               // int ano = rs.getInt("ano");
               // String marca = rs.getString("marca");
               // System.out.println("Ano: " + ano + ", Marca: " + marca);
            //}

            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            PreparedStatement stmt = conn.prepareStatement("SELECT ano, marca FROM carro");
            ResultSet rs = stmt.executeQuery();
         
            while (rs.next()) {
                int ano = rs.getInt("ano");
                String marca = rs.getString("marca");
                System.out.println("Ano: " + ano + ", Marca: " + marca);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        
    } 
    }



}


