import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion
{
    public Connection get_connection()
    {

        Connection connection = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root","");
        }
        catch(SQLException | ClassNotFoundException e)
        {
            System.out.println(e);
        }

        return connection;
    }
}
