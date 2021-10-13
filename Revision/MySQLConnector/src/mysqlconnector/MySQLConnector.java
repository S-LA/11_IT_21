/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package mysqlconnector;

import java.sql.*;

/**
 *
 * @author kwhil
 */
public class MySQLConnector {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try (
				 Connection con = DriverManager.getConnection(
					"jdbc:MySQL://localhost:3306/grade10_intro",
					"root",
					"******"
				)) {
				PreparedStatement stmt = con.prepareStatement("select * from studentlist");
				ResultSet rs = stmt.executeQuery("select * from emp");
				
				}
		} catch (Exception w) {
			System.out.println(w);
		}

	}

}
