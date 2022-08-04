import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DTO {

	
	// �����ͺ��̽��� ������ �ϴ� ��ɵ��� �����ϴ� class
	// DataBase Transfer Object
	
	// 1. ���� ����̹� ����
	// 2. ������ ���̽� ����
	// 3. sql���� (insert, select, update, delete) - 
	// 4. ���� ����
	
	
	// �޼ҵ�� �����Ͽ� ���� !!
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	//����� Ȯ���� �� �ִ� ����
	int cnt = 0;
	
	
	public void getconn() {
		//����̹� ���� �� �����ͺ��̽� ���� �޼ҵ�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			conn = DriverManager.getConnection(ur1, db_id, db_pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	// ������ �����ϴ� �޼ҵ� ����
	public void close() {
		
		try {
			if(rs != null) {
				rs.close();
			}if(psmt != null) {
				psmt.close();
			}if(conn !=null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// insert ����� ���� �޼ҵ�
	public int insert(String id, String pw, String name, int age) {
		
		getconn();
		
		try {
			String sql = "insert into members values(?, ?, ?, ?)";
		
		psmt = conn.prepareStatement(sql);
		
		psmt.setString(1, id);
		psmt.setString(2, pw);
		psmt.setString(3, name);
		psmt.setInt(4, age);
		
		
		
		// sql���� ���� ��û�ϱ�
		int cnt = psmt.executeUpdate();
		
		
	} catch(SQLException e) {
		e.printStackTrace();
	}
	close();
	
	
	return cnt;
	}
}

