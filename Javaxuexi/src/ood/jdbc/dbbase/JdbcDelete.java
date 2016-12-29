package ood.jdbc.dbbase;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class JdbcDelete {
	public static final String DBDRIVER="com.mysql.jdbc.Driver";
	public static final String DBURL="jdbc:mysql://localhost:3306/db_panpan";
	public static final String DBUSER="root";
	public static final String DBPSW="root";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName(DBDRIVER);
		Connection conn = (Connection) DriverManager.getConnection(DBURL,DBUSER,DBPSW);
		String sql = "delete from cv where id =?;";
		PreparedStatement st = (PreparedStatement) conn.prepareStatement(sql);
		st.setInt(1, 6);
		int i = st.executeUpdate();
		System.out.println(i);
		st.close();
		conn.close();
		/*Statement st = (Statement) conn.createStatement();
		int i = st.executeUpdate(sql);
		System.out.println("执行次数"+i);*/
		
	}

}
