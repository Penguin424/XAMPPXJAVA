package com.MSJDB;
import com.cnx.Conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class MensajesDAO
{
    public static void crearMensajeDB(Mensajes mensajeService)
    {

        Conexion db_connect = new Conexion();

        try(Connection cnx = db_connect.get_connection())
        {
            PreparedStatement ps = null;

            try
            {

                String query = "INSERT INTO `mansajes` (`mensaje`, `autor_mensaje`) VALUES (?, ?);";
                ps = cnx.prepareStatement(query);
                ps.setString(1, mensajeService.getMensaje());
                ps.setString(2, mensajeService.getAutorMensaje());
                ps.executeUpdate();
                System.out.println("El mensaje fue creado exitosamente");

            }
            catch (SQLException ex)
            {
                System.out.println(ex);
            }

        }
        catch (SQLException e)
        {
            System.out.println(e);
        }

    }

    public static void leerMensajes()
    {
        Conexion db_conexion = new Conexion();

        try(Connection cnx = db_conexion.get_connection())
        {
            PreparedStatement ps = null;
            ResultSet rs = null;

            try
            {
                String query = "SELECT * FROM `mansajes`";

                ps = cnx.prepareStatement(query);

                rs = ps.executeQuery();

                while (rs.next())
                {
                    System.out.println("ID: " + rs.getInt("id_mensaje") + "");
                    System.out.println("MENSAJE: " + rs.getString("mensaje"));
                    System.out.println("AUTOR: " + rs.getString("autor_mensaje"));
                    System.out.println("FECHA MENSAJE: " + rs.getString("fecha_mensaje"));
                    System.out.println();
                }

            }
            catch (SQLException ex)
            {
                System.out.println(ex);
            }

        }
        catch (SQLException e)
        {
            System.out.println(e);
        }

    }

    public static void borrarMensajeDB(int id_mensaje)
    {

    }

    public static void actualizarMensajeDB()
    {

    }
}
