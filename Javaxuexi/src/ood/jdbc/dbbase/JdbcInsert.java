package ood.jdbc.dbbase;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class JdbcInsert {
	public static final String DBDRIVER="com.mysql.jdbc.Driver";
	public static final String DBURL="jdbc:mysql://localhost:3306/db_panpan";
	public static final String DBUSER="root";
	public static final String DBPSW="root";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName(DBDRIVER);
		Connection conn = (Connection) DriverManager.getConnection(DBURL,DBUSER,DBPSW);
		/*String sql = "insert into cv (name,age) values('zhangsan',20) ";
		
		
		Statement st = (Statement) conn.createStatement();
		int i = st.executeUpdate(sql);
		System.out.println(i);
		st.close();
		conn.close();*/
		String sql = "insert into cv (name,age) values(?,?) ";
		PreparedStatement st = (PreparedStatement) conn.prepareStatement(sql);
		st.setString(1,"网页");
		st.setInt(2, 30);
		int rs = st.executeUpdate();
		System.out.println(rs);
	} 

}
