package bdd.management.data;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bdd.connection.ClassConnection;
import com.task.first.Task;



public class InsertData {
	Connection connection;
	PreparedStatement preparedStatement;
	

	

	public void insertion_donnes(Task task){
		ClassConnection connect = new ClassConnection();
		connection = connect.open_connection();
		
		
		try {
			
			String monrequete = "INSERT INTO tasks_infos (description_tache, etat) VALUES ( ?, ?)";
			preparedStatement = connection.prepareStatement(monrequete);
			preparedStatement.setString(1, task.getDescription_tache());
			preparedStatement.setString(2, task.getEtat());
			
			System.out.println("données insereés avec succés ! ");

			
		}catch(SQLException e) {
			System.out.println("insertion non aboutie à cause : " + e.getMessage());
			
		}finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                connect.closeConnection(); //
            }
        }
    }

}

