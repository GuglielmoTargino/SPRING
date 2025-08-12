package com.pgsql.crudpgsql.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.pgsql.crudpgsql.entity.Usuario;

@Service
public class Servico {
    private static final String URL = "jdbc:postgresql://localhost:5432/ventolest";
    private static final String USUARIO = "ght";
    private static final String SENHA = "4004";

    public List<Usuario> ListarUsuarios() {  
        List<Usuario> usu = new ArrayList<>();

        try {
           
            // 1. Conectar ao banco de dados
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            // 2. Criar a consulta SQL
            PreparedStatement stmt = conn.prepareStatement("SELECT nome_usu, id FROM usuario");
            // 3. Preparar e executar
            ResultSet rs = stmt.executeQuery();
         
            //varre o resultado
            while (rs.next()) {
                //int ano = rs.getInt("ano");
                String nome = rs.getString("nome_usu");
                Long iden = rs.getLong("id");
              //imprime o resultado
                System.out.println("Nome: " + nome+"ID; "+iden);
                usu.add(new Usuario(nome, iden));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        
    } 
    return usu;
    }

    public void SalvarUsuarios(Usuario usa) {       

           String sql = "INSERT INTO usuario (nome_usu, id) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usa.getNome_usu());
            stmt.setLong(2, usa.getId());            

                stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // DELETAR
    public void DeletarUsuario(Long sen) {
        String sql = "DELETE FROM usuario WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, sen);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ATUALIZAR
    public void AtualizarUsuario(Long sen, Usuario uso) {
        String sql = "UPDATE usuario SET nome_usu = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, uso.getNome_usu());
            //stmt.setLong(2, uso.getSenha());
            stmt.setLong(2, sen);   
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }















































}
