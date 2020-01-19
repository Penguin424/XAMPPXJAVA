package com.MSJDB;
import com.cnx.Conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class MensajesDAO
{

    private static Connection  cnn = Conexion.get_connection();

    public static void crearMensajeDB(Mensajes mensajeService)
    {

        PreparedStatement ps = null;

        try
        {

            String query = "INSERT INTO `mansajes` (`mensaje`, `autor_mensaje`) VALUES (?, ?);";
            ps = cnn.prepareStatement(query);
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

    public static void leerMensajes()
    {


        PreparedStatement ps = null;
        ResultSet rs = null;

        try
        {
            String query = "SELECT * FROM `mansajes`";

            ps = cnn.prepareStatement(query);

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

    public static void borrarMensajeDB(int id_mensaje)
    {
        PreparedStatement ps = null;
        String query = "DELETE FROM `mansajes` WHERE `id_mensaje` = ?";

        try
        {

            ps = cnn.prepareStatement(query);
            ps.setInt(1, id_mensaje);
            ps.executeUpdate();

            System.out.println("El mensaje fue borrado");
        }
        catch (SQLException e)
        {
            System.out.println(e);
            System.out.println("No se pudo borrar el mensaje");
        }
    }

    public static void actualizarMensajeDB(Mensajes mensaje)
    {
        PreparedStatement ps = null;
        String query = "UPDATE `mansajes` SET `mensaje` = ? WHERE `id_mensaje` = ?;";

        try
        {

            ps = cnn.prepareStatement(query);

            ps.setString(1, mensaje.getMensaje());
            ps.setInt(2, mensaje.getIdMensaje());

            ps.executeUpdate();

            System.out.println("El mensaje fue actulizado");

        }
        catch (SQLException e)
        {
            System.out.println(e);

        }
    }
}
