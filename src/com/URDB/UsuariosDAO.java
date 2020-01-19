package com.URDB;

import com.cnx.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuariosDAO
{

    private static Connection cnn = Conexion.get_connection();

    public static void crearUsuarioDB(Usuarios usuario)
    {
        PreparedStatement ps = null;
        String query = "INSERT INTO Usuarios( correo_usuario, password_usuario, nombreC_usuario) VALUES (?, ?, ?);";

        try
        {

            ps = cnn.prepareStatement(query);
            ps.setString(1, usuario.getCorreo());
            ps.setString(2, usuario.getClave());
            ps.setString(3, usuario.getNombre_completo());
            ps.executeUpdate();

            System.out.println("Usuario registrado");

        }
        catch (SQLException e)
        {
            System.out.println(e);
            System.out.println("No se pudo registrar al usuario");
        }
    }
}
