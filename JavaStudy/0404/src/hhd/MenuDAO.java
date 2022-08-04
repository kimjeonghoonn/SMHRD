package hhd;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// �����ͺ��̽��� �����ϴ� ������ Ŭ����
public class MenuDAO {
	private String driverName = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String id = "hr";
	private String pw = "hr";
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	public ArrayList<MenuDTO> selectAll() {
		// �޴� ��ü���� �� �� ����Ʈ�� ����
		ArrayList<MenuDTO> list = new ArrayList<MenuDTO>();
		try {
			conn = getConnection();
			// 3. SQL�� �غ�
			String sql = "select * from menu";
			psmt = conn.prepareStatement(sql);
			// 4. SQL�� ����
			rs = psmt.executeQuery();
			// 5. ������ ó��
			while (rs.next()) {
				int menu_num = rs.getInt("menu_num");
				String menu_name = rs.getString("menu_name");
				int menu_price = rs.getInt("menu_price");

				MenuDTO dto = new MenuDTO(menu_num, menu_name, menu_price);
				list.add(dto);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

		return list;
	}
	
	
	
	private void close() throws SQLException {
		// 6. ���� ����
		if (rs != null)
			rs.close();
		if (psmt != null)
			psmt.close();
		if (conn != null)
			conn.close();
	}

	private Connection getConnection() throws ClassNotFoundException, SQLException {
		// 1. ����̹� �ε�

		Class.forName(driverName);
		// 2. �����ͺ��̽� ����

		Connection conn = DriverManager.getConnection(url, id, pw);
		return conn;
	}
}