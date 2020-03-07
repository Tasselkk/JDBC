import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 */

/**
 * @author KING
 *
 */
public class ConnectionTest {

	/**
	 * @param args
	 */
	Connection con;
	public Connection connect(String url,String user,String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("驱动加载成功！");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection(url,user,password);
			System.out.println("数据库连接成功！");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC";
		String user="root";
		String password ="671112";
		new ConnectionTest().connect(url, user, password);

	}

}
