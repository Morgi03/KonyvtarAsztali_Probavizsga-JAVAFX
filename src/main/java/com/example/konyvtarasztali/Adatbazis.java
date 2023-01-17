package com.example.konyvtarasztali;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Adatbazis {
    private Connection conn;
    private static final String DB_DRIVER = "mysql";
    private static final String DB_HOST = "localhost";
    private static final String DB_PORT = "3306";
    private static final String DB_DBNAME = "probavizsga-konyvtar";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    public Adatbazis() throws SQLException {
        String url = String.format("jdbc:%s://%s:%s/%s", DB_DRIVER, DB_HOST, DB_PORT, DB_DBNAME);
        conn = DriverManager.getConnection(url, DB_USER, DB_PASS);
    }
}
