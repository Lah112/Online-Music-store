package com.service.manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.manager.TrainSchedule;
import com.util.manager.DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ManagerDBUtil {

	private String URL = "jdbc:mysql://localhost:3306/onlinetrainreservationsystem";
	private String Username = "root";
	private String Password = "imasha@2001";
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	private static final String INSERT_schedule_SQL="INSERT INTO train_schedule"+"(station1, station2,km)Values"+"(?,?,?);";
	
	private static final String SELECT_schedule_by_station1 = "select id,station1,station2,km from train_schedule where id =?";
	private static final String SELECT_ALL_train_schedule = "select * from train_schedule";
	private static final String DELETE_schedule_SQL = "delete from train_schedule where id = ?;";
	private static final String UPDATE_schedule_SQL = "update train_schedule set station1 = ?,station2= ?, km=? where id = ?;";
	
	public ManagerDBUtil() {
		
	}

	public static boolean validateManager(String userName, String password){
		boolean adminLoginStatus;
		adminLoginStatus = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();			
			String sql = "select * from manager where username = '" + userName + "' and password = '" + password + "'";
			rs = stmt.executeQuery(sql);			
			if(rs.next()) {
				adminLoginStatus = true;
			}			
		}catch(Exception e){
			e.printStackTrace();
		}		
		return adminLoginStatus;
	}
	
	
	
	protected Connection getConnection()
	{
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL, Username, Password);
			} 
		catch (SQLException e) {
			
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		  }
		return connection;
	}
  //1)Manage train schedule(add,delete,update) 
	//insert train_schedule
	public void insertSchedule(TrainSchedule ts)throws SQLException {
		System.out.println(INSERT_schedule_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_schedule_SQL)) {
			preparedStatement.setString(1, ts.getStation1());
			preparedStatement.setString(2, ts.getStation2());
			preparedStatement.setInt(3, ts.getKm());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
	}

	//select schedule by id
	public TrainSchedule selectschedule(int id) {
		TrainSchedule ts = null;
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();
				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_schedule_by_station1);) {
			preparedStatement.setInt(1,id);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				String station01 = rs.getString("station1");
				String station02 = rs.getString("station2");
				int km = rs.getInt("km");
				ts= new TrainSchedule(id,station01,station02,km);
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return ts;
	}

	
	//select all users
	public List<TrainSchedule> selectAllSchedule() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<TrainSchedule> ts = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_train_schedule);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int id = rs.getInt("id");
				String station1 = rs.getString("station1");
				String station2 = rs.getString("station2");
				int km = rs.getInt("km");
				ts.add(new TrainSchedule(id,station1,station2,km));
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return ts;
	}

	//update train_schedule
	public boolean updateschedule(TrainSchedule ts) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_schedule_SQL);) {
			System.out.println("updated schedule:"+statement);
			statement.setString(1, ts.getStation1());
			statement.setString(2, ts.getStation2());
			statement.setInt(3, ts.getKm());
			statement.setInt(4, ts.getId());

			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}

	
	//delete train_schedule
	public boolean deleteschedule(int id) throws SQLException {
		boolean rowDeleted=false;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_schedule_SQL);) {
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate() > 0;
		}catch(SQLException e)
		{
			printSQLException(e);
		}
		return rowDeleted;
	}

private void printSQLException(SQLException ex) {
	for (Throwable e : ex) {
		if (e instanceof SQLException) {
			e.printStackTrace(System.err);
			System.err.println("SQLState: " + ((SQLException) e).getSQLState());
			System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
			System.err.println("Message: " + e.getMessage());
			Throwable t = ex.getCause();
			while (t != null) {
				System.out.println("Cause: " + t);
				t = t.getCause();
			}
		}}}}
	


