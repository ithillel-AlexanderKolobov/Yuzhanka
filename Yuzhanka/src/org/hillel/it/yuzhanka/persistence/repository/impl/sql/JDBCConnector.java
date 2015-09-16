package org.hillel.it.yuzhanka.persistence.repository.impl.sql;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.fabric.jdbc.FabricMySQLDriver;

public class JDBCConnector {

	public static void main(String[] args) {

		try {
			Driver driver = new FabricMySQLDriver();
			DriverManager.registerDriver(driver);

		} catch (SQLException e) {
			System.out.println("Не удалост стартануть драйвер");
		}
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/yuzjhanka", "root",
				"root"); Statement statement = connection.createStatement()) {
			statement.execute("INSERT INTO test_table VALUES(NULL,'Воронова');");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
