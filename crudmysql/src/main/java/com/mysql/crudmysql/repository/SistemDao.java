package com.mysql.crudmysql.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SistemDao {

    private static final String URL = "jdbc:mysql://localhost:3306/carro";
    private static final String USUARIO = "ght";
    private static final String SENHA = "4004";

    public Connection conecta() throws SQLException {
        Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
        return conn;

    }

}
