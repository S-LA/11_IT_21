/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package mysqlconnector;
import java.sql.*;
/**
 * 
 *
 * @author kwhil
 */
public class SQLConnect {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String pathToSQL = "jdbc:MySQL://localhost:3306/eleven_marks";
			String username = "root";
			String password = "";
			try(Connection con = DriverManager.getConnection(pathToSQL, username, password)){
				
			}
		} catch (Exception e) {
			

		}
	}
}
