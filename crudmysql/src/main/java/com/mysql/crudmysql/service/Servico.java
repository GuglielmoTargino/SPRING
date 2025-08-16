package com.mysql.crudmysql.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.mysql.crudmysql.entity.Carro;
import com.mysql.crudmysql.repository.SistemDao;





@Service
public class Servico { 

    // Listar
    public List<Carro> ListarCarros() { 
    List<Carro> car = new ArrayList<>();

        try {           
    
            // 2. Criar a consulta SQL
            SistemDao conec= new SistemDao();
            Connection conn = conec.conecta();
            PreparedStatement stmt = conn.prepareStatement("SELECT id, ano, marca, modelo, nome FROM carro");
            // 3. Preparar e executar
            ResultSet rs = stmt.executeQuery();
         
            //varre o resultado
            while (rs.next()) {                
                Long id = rs.getLong("id");
                Long ano = rs.getLong("ano");                
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String nome = rs.getString("nome");                
                
              //imprime o resultado
                System.out.println("Ano: " + ano + ", Marca: " + marca);
                car.add(new Carro(id,ano,marca,modelo,nome));
            }
        } catch (SQLException e) {
            e.printStackTrace();        
        } 
        return car;
    }




    //Salvar
    public void SalvarCarros(Carro car) {      

           String sql = "INSERT INTO carro (ano, marca, modelo, nome) VALUES (?, ?, ?, ?)";

        try 
            {
            SistemDao conec= new SistemDao();
            Connection conn = conec.conecta();
            PreparedStatement stmt = conn.prepareStatement(sql);               

            stmt.setLong(1, car.getAno());
            stmt.setString(2, car.getMarca());
            stmt.setString(3, car.getModelo());
            stmt.setString(4, car.getNome());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

     // ATUALIZAR
    public void atualizarCarro(Long idid, Carro carro) {
        String sql = "UPDATE carro SET ano = ?, marca = ?, modelo = ?, nome = ? WHERE id = ?";

        try
         {
            SistemDao conec= new SistemDao();
            Connection conn = conec.conecta();
            PreparedStatement stmt = conn.prepareStatement(sql); 

            stmt.setLong(1, carro.getAno());
            stmt.setString(2, carro.getMarca());
            stmt.setString(3, carro.getModelo());
            stmt.setString(4, carro.getNome());
            stmt.setLong(5, idid);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }    

    // DELETAR
    public void deletarCarro(Long idg) {
        String sql = "DELETE FROM carro WHERE id = ?";

        try
         {

            SistemDao conec= new SistemDao();
            Connection conn = conec.conecta();
            PreparedStatement stmt = conn.prepareStatement(sql); 

            stmt.setLong(1, idg);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }











































































































}


