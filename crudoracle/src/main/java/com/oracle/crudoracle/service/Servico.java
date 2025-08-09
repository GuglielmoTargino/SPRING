package com.oracle.crudoracle.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.stereotype.Service;
import com.oracle.crudoracle.entity.Usuario;
import java.util.ArrayList;




@Service
public class Servico {

    //private static final String URL = "jdbc:mysql://localhost:3306/carro";
    private static final String URL="jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USUARIO = "ght";
    private static final String SENHA = "4004";

    public List<Usuario> ListarUsuarios(){
        List<Usuario> usu = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            PreparedStatement stmt = conn.prepareStatement("SELECT nome_usu, senha, cargo FROM usuario");
            ResultSet rs = stmt.executeQuery();
         
            while (rs.next()) {
                String nom = rs.getString("nome_usu");
                String cargo = rs.getString("cargo");
                Long senha = rs.getLong("senha");
                System.out.println("Nome: " + nom+"cargo"+cargo+"senha"+senha);
                usu.add(new Usuario(nom, senha, cargo));
            }
            
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return usu;

    }













}
