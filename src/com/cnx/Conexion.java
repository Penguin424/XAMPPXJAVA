package com.cnx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion
{

    private static Connection connection = null;

    private Conexion()
    {


        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root","");
        }
        catch(SQLException | ClassNotFoundException e)
        {
            System.out.println(e);
        }


    }

    public static Connection get_connection()
    {

        if(connection == null)
        {
            new Conexion();
        }

        return connection;

    }
}
