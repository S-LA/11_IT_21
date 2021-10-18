/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package usingsqlwithjava;

import java.sql.SQLException;

/**
 *
 * @author kwhil
 */
public class TestClass
{
	public static void mainA(String[] args) throws SQLException {
			SQLConLib sqldb = new SQLConLib("eleven_marks", "it_marks", "root", "ArduinoEsp8266!");
			sqldb.printSelectTable();
	}
	
}
