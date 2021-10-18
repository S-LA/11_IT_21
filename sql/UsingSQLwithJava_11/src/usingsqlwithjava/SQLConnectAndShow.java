/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package usingsqlwithjava;

import java.sql.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;

/**
 *
 *
 * @author kwhil
 */
public class SQLConnectAndShow
{

	public static void main(String[] args) throws ClassNotFoundException {
		// try surrounds the entire thing to not stop the program from running the catch part
		// is there to tell you what the error was.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String schemaName = "eleven_marks";
			String hostName = "localhost:3306";
			String pathToSQL = "jdbc:MySQL://" + hostName + "/" + schemaName;

			String username = "root";

//			String pass = JOptionPane.showInputDialog("What is you password");
//			String password = pass;
			String password = args[0];

			try ( Connection con = DriverManager.getConnection(pathToSQL, username, password)) {

				System.out.println("Getting info from the database");

				/**
				 * GET INFO FROM DATA BASE AND PLACE
				 */
				// this creates a statement using the data base it has connected to
				Statement stmt = con.createStatement();

				// we then set the statement in this case it fetches all values in the db.
				String statement = "select * from it_marks";

				// this then excecutes the statment provided above.
				// the result set is basicall a scanner and is used like one.
				ResultSet rs = stmt.executeQuery(statement);

				// find out the number of columns so that they can be used in the for
				// loop later and print each piece of data 
				ResultSetMetaData rsmd = rs.getMetaData();
				int columnsNumber = rsmd.getColumnCount();

				// loops through the resultset each line is a "next"	
				while (rs.next()) {
					// try catch looks if there is an issue in the SQL and mitigates the issue.
					try {
						// the ResultSet places each line in an array type this accessed with  
						// rs.getString(index)
						for (int i = 0; i < columnsNumber; i++) {
							System.out.print(rs.getString(i + 1) + "\t");
						}
						System.out.println();
						// just the inner catch for each line()
					} catch (SQLException ex) {
						System.out.println();
					}
				}

				/**
				 * INSERT VALUES
				 */
				
				

			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}
}
