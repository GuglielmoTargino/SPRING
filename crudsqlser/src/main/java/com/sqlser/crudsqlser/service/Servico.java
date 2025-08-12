package com.sqlser.crudsqlser.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.sqlser.crudsqlser.entity.Usuario;

@Service
public class Servico {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=connec_test;encrypt=true;trustServerCertificate=true";
    private static final String USUARIO = "ght";
    private static final String SENHA = "4004";


    public List<Usuario> ListarUsuarios() { 
        List<Usuario> usu = new ArrayList<>();      

        try {
           
            // 1. Conectar ao banco de dados
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            // 2. Criar a consulta SQL
            PreparedStatement stmt = conn.prepareStatement("SELECT nome_usu, cargo, senha FROM usuario");
            // 3. Preparar e executar
            ResultSet rs = stmt.executeQuery();
         
            //varre o resultado
            while (rs.next()) {
                //int ano = rs.getInt("ano");
                String nome = rs.getString("nome_usu");
                String cargo = rs.getString("cargo");
                Long senh = rs.getLong("senha");
                

              //imprime o resultado
                System.out.println("Nome: " + nome+" Cargo:"+cargo+"Senha"+senh);
                usu.add(new Usuario(nome, cargo, senh));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        
    } 

    return usu;
    }


     //Salvar
    public void SalvarUsuarios(Usuario usa) {       

           String sql = "INSERT INTO usuario (nome_usu, cargo, senha) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usa.getNome_usu());           
            stmt.setString(2, usa.getCargo()); 
            stmt.setLong(3, usa.getSenha());          
            

                stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // DELETAR
    public void DeletarUsuario(Long sen) {
        String sql = "DELETE FROM usuario WHERE senha = ?";

        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, sen);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
























































}
