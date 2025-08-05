package com.mysql.crudmysql.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;





public class Servico {


    private static final String URL = "jdbc:mysql://localhost:3306/seu_banco";
    private static final String USUARIO = "root";
    private static final String SENHA = "sua_senha";


public void listarCarros() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // 1. Conectar ao banco de dados
            conn = DriverManager.getConnection(URL, USUARIO, SENHA);

            // 2. Criar a consulta SQL
            String sql = "SELECT ano, marca FROM carro";

            // 3. Preparar e executar
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            // 4. Percorrer os resultados
            while (rs.next()) {
                int ano = rs.getInt("ano");
                String marca = rs.getString("marca");
                System.out.println("Ano: " + ano + ", Marca: " + marca);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 5. Fechar recursos
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }
    }

}




