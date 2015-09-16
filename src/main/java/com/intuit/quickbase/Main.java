package com.intuit.quickbase;

import com.intuit.quickbase.devint.DBManagerImpl;

import java.sql.Connection;

public class Main {
    public static void main( String args[] )
    {
        System.out.print("Getting DB Connection...");
        DBManagerImpl dbm = new DBManagerImpl();
        Connection c = dbm.getConnection();
        if (c == null) {
            System.out.println("failed.");
            System.exit(1);
        }
    }
}