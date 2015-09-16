package com.intuit.quickbase.devint;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

/**
 * Created by ckeswani on 9/16/15.
 */
public class DBManagerImpl implements DBManager {
    public Connection getConnection() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "CREATE TABLE COMPANY " +
                    "(ID INT PRIMARY KEY     NOT NULL," +
                    " NAME           TEXT    NOT NULL, " +
                    " AGE            INT     NOT NULL, " +
                    " ADDRESS        CHAR(50), " +
                    " SALARY         REAL)";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch (ClassNotFoundException cnf) {
            System.out.println("could not load driver");
        } catch (SQLException sqle) {
            System.out.println("sql exception:" + sqle.getStackTrace());
        }
        return c;
    }
}
