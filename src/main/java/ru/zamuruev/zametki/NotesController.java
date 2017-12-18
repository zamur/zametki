package ru.zamuruev.zametki;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.scene.control.TextField;
import javafx.fxml.*;


public class NotesController {
	private Connection conn;
	
	@FXML
	public TextField count;
	
	
	public NotesController() throws SQLException, ClassNotFoundException{
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost/postgres?user=postgres&password=zamuruev";
		conn = DriverManager.getConnection(url);
		
		
	}
	
	
	@FXML
	public void action() throws SQLException{
		
		PreparedStatement kolvo = conn.prepareStatement("select count(*) as countofrows from notes");
		ResultSet result = kolvo.executeQuery();
		result.next();
		count.setText(Integer.toString(result.getInt("countofrows")));
		
	}
}
