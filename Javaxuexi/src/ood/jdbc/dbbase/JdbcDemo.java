package ood.jdbc.dbbase;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class JdbcDemo {
public static final String DBDRIVER="com.mysql.jdbc.Driver";
public static final String DBURL="jdbc:mysql://localhost:3306/db_panpan";
public static final String DBUSER="root";
public static final String DBPSW="root";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName(DBDRIVER);
		Connection conn = (Connection) DriverManager.getConnection(DBURL,DBUSER,DBPSW);
		Statement stmt = (Statement) conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from cv");
		while (rs.next()) {
	String name =rs.getString("name");
	
	int age =rs.getInt("age");
		System.out.println("name:"+name+"\t"+"age:"+age);
		System.out.println();
		System.out.println("*******");
		}
		
	}

}
