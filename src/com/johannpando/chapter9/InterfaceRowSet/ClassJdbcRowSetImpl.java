package com.johannpando.chapter9.InterfaceRowSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import com.sun.rowset.JdbcRowSetImpl;

public class ClassJdbcRowSetImpl {

	public static void main(String[] args) {

		// Creando un objeto JdbcRowSet a través de JdbcRowSetImpl
		Connection conn = null;
		ResultSet resultSet = null;
		try {
			JdbcRowSet jdbcRowSet = new JdbcRowSetImpl(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			JdbcRowSet jdbcRowSet1 = new JdbcRowSetImpl(resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Creando un objeto JdbcRowSet a través de RowSetFactory
		JdbcRowSet jdbcRowSet2 = null;
		try {
			RowSetFactory rowSetFactory = RowSetProvider.newFactory();
			jdbcRowSet2 = rowSetFactory.createJdbcRowSet();

			// Estableciendo conexión

			jdbcRowSet2.setUrl("jdbc:mysql://localhost/BookLibrary");
			jdbcRowSet2.setUsername("test");
			jdbcRowSet2.setPassword("select");
			jdbcRowSet2.setCommand("select * from book");
			jdbcRowSet2.execute();

			while (jdbcRowSet2.next()) {
				System.out.println(jdbcRowSet2.getString("id"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
