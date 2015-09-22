package com.intuit.quickbase;

import com.intuit.quickbase.devint.DBManagerImpl;

import java.sql.Connection;

/**
 * The main method of the executable JAR generated from this repository. This method should execute and print to the
 * console the solution to the problem described in the root README.md.
 */
public class Main {
    public static void main( String args[] ) {
        System.out.println("Starting.");
        System.out.print("Getting DB Connection...");

        DBManagerImpl dbm = new DBManagerImpl();
        Connection c = dbm.getConnection();
        if (null == c ) {
            System.out.println("failed.");
            System.exit(1);
        }

    }
}