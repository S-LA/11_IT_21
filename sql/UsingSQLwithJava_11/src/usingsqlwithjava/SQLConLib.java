/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package usingsqlwithjava;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kwhil
 *
 * The point of this class is to allow easy access to SQL databases.
 *
 * Once an object is created based on the class: the database, schema, user name and password will
 * be entered from there all methods are provided to add, delete, update etc.
 *
 */
public class SQLConLib
{

	/**
	 * FIELDS
	 */
	private Connection con;
	private String databasename;
	private String tablename;

	/**
	 * CONSTRUCTOR
	 *
	 * @param database the name of the database to be connected to.
	 * @param user the name of the user usually 'root'
	 * @param pass the users password.
	 */
	public SQLConLib(String database, String table, String user, String pass) {
		databasename = database;
		tablename = table;
		String tableAddress = "jdbc:MySQL://localhost:3306/" + databasename;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(tableAddress, user, pass);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}

	/**
	 * PRINT THE ENTIRE TABLE TO THE CONSOLE
	 *
	 * Method overloading is used to either input nothing or a String parameter. If no parameter is
	 * presented it will default to "*"
	 *
	 * @param condition the information from the table to be returned.
	 * @throws SQLException
	 *
	 */
	public void printSelectTable() throws SQLException {
		this.printSelectTable("*");
	}

	public void printSelectTable(String condition) throws SQLException {
		Statement stmt = con.createStatement();
		String statement = "select " + condition + " from " + tablename;
		ResultSet rs = stmt.executeQuery(statement);
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnsNumber = rsmd.getColumnCount();

		while (rs.next()) {
			try {
				for (int i = 0; i < columnsNumber; i++) {

					System.out.print(rs.getString(i + 1) + " ");
				}
				System.out.println();
//				System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			} catch (SQLException ex) {
				Logger.getLogger(SQLConLib.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	/**
	 * GETS THE ENTIRE TABLE BUT RETURNS IT AS A STRING INSTEAD OF JUST PRINTING
	 *
	 * @param condition
	 * @return
	 * @throws SQLException
	 */
	public String getSelectTable(String condition) throws SQLException {
		Statement stmt = con.createStatement();
		String statement = "select " + condition + " from " + tablename;
		ResultSet rs = stmt.executeQuery(statement);
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnsNumber = rsmd.getColumnCount();

		StringBuilder bob = new StringBuilder();

		while (rs.next()) {
			try {
				for (int i = 0; i < columnsNumber; i++) {
					String line = rs.getString(i + 1) + " ";
					bob.append(line);
				}
				bob.append("\n");
			} catch (SQLException ex) {
				Logger.getLogger(SQLConLib.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		String result = bob.toString();
		return result;
	}

	/**
	 * Adds row to database table using a String array
	 *
	 * @param inputVals
	 * @throws SQLException
	 */
	public void addRow(String[] inputVals) throws SQLException {
		// first bit of this will simply check now many fields there are in a specific row.
		Statement stmt = con.createStatement();
		String statement = "select * from " + tablename;
		ResultSet rs = stmt.executeQuery(statement);
		ResultSetMetaData rsmd = rs.getMetaData();
		int inputLen = rsmd.getColumnCount();

		// this will then compare the amount of fields in the row to the amount input and 
		// return an error is there is an issue.
		int len = inputVals.length;
		if (len != inputLen) {
			System.out.println("You have tried to input too many values");
		}
		// the makeStatement will create a string that will be sent to 
		// the prepared statement 
		String makeStatement = "insert into " + tablename + " values(";
		for (int i = 0; i < inputLen - 1; i++) {
			makeStatement = makeStatement + "?,";
		}
		makeStatement = makeStatement + "?)";
		PreparedStatement stmtA = con.prepareStatement(makeStatement);
		for (int i = 0; i < len; i++) {
			stmtA.setString(i + 1, inputVals[i]);
		}
		stmtA.executeUpdate();

	}

	/**
	 * DELETES A ROW BASED ON A CONDITION
	 *
	 * @param condition full condition including field to change "id=4"
	 * @throws SQLException
	 */
	public void deleteRow(String condition) throws SQLException {
		String statement = "delete from " + tablename + " where " + condition;
		Statement stmt = con.createStatement();
		stmt.executeUpdate(statement);
	}

	/**
	 * GETS A SINGLE VALUE FROM THE TABLE, BASED ON A CONDITION
	 *
	 * @param field the name of the column you want to get value from
	 * @param condition look in row with a specific value i.e "id=3"
	 * @return a string containing a single output
	 * @throws SQLException
	 */
	public String getValue(String field, String condition) throws SQLException {
		String statement = "select " + field + " from " + tablename + " where " + condition;
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(statement);
		String out = "";
		while (rs.next()) {
			out = rs.getString(1);
		}
		return out;

	}

	/**
	 * UPDATE A VALUE IN A SPECFIC ROW
	 *
	 * @param condField
	 * @param cond
	 * @param field
	 * @param newVal
	 * @throws SQLException
	 */
	public void updateRow(String condField, String cond, String field, String newVal) throws SQLException {
		// create the java mysql update preparedstatement
		String query = "update " + tablename + " set " + field + " = ? where " + condField + " = ?";
		PreparedStatement preparedStmt = con.prepareStatement(query);
		preparedStmt.setString(1, newVal);
		preparedStmt.setString(2, cond);
		preparedStmt.executeUpdate();
	}

	/**
	 * GETS THE MAXIMUM VALUE IN THE ID COLOUMN AND INCREMENTS IT USING <NEXTID()>
	 *
	 * @return incremented maximum value.
	 * @throws SQLException
	 */
	public int indexID() throws SQLException {
		String statement = "SELECT MAX(id) FROM " + tablename;
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(statement);
		String out = "";
		while (rs.next()) {
			out = rs.getString(1);
		}
		int numOut = Integer.parseInt(out);
		return numOut;
	}

	public int nextid() throws SQLException {
		int in = indexID();
		in++;
		return in;
	}

}
