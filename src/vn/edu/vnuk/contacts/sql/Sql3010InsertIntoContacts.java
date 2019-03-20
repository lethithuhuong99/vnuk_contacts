package vn.edu.vnuk.contacts.sql;

import java.sql.Connection;
import java.sql.SQLException;

public class Sql3010InsertIntoContacts {
	private final Connection connection;
	private final String sqlQuery;
	
	public Sql3010InsertIntoContacts(Connection connection) {
		this.connection = connection;
		
		this.sqlQuery = "INSERT INTO contacts (name, email, address, date_of_register) "
				+ 	"values "
				
				+ 	"('Le Huong', 'huong.le170205@vnuk.edu.vn', '634-Trung Nu Vuong-Da Nang', '2019-03-20' ), "
				+ 	"('Hoang Thuy', 'thuy.hoang@gmail.com', '634-Trung Nu Vuong-Da Nang', '2019-03-20' )"
				+ ";"
			;
	}
	
	public void run() throws SQLException {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(">  Sql3010InsertIntoContacts started");
		
		try {
	        connection.prepareStatement(sqlQuery).execute();
	        System.out.println("   DATA successfully loaded in \'contacts\'");
		
		}
		
		catch (Exception e) {
	        e.printStackTrace();
	        connection.close();
		}
		
		finally {
			System.out.println("<  Sql3010InsertIntoContacts ended");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
		}
			
	}
}
