package ood.jdbc.dbbase;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class JdbcUpdate {
	public static final String DBDRIVER="com.mysql.jdbc.Driver";
	public static final String DBURL="jdbc:mysql://localhost:3306/db_panpan";
	public static final String DBUSER="root";
	public static final String DBPSW="root";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName(DBDRIVER);
		Connection conn = (Connection) DriverManager.getConnection(DBURL,DBUSER,DBPSW);
		String sql = "update cv set name='zhangwuji' where id = 5;";
		Statement st = (Statement) conn.createStatement();
		int i =	st.executeUpdate(sql);
		System.out.println("执行次数"+i);
		
	}

}
