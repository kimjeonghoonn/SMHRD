import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_insert {

	public static void main(String[] args) {
		// JDBC ���� ���� (4�ܰ�)
		// 0. (�����۾�) ojdbc6.jar ���� �����ϱ�
		// C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
		// 1. JDBC ����̹� �ε�
		// 2. �����ͺ��̽� ����
		// 3. SQL�� ����(����)
		// 4. ���� ����
		
		// �ڹ��� ����
		// 1.������ ���� : �������� ����
		// 2.��Ÿ�� ���� : ���������� ������ �߻����� ������ ����� ������ �߻��ϴ� ��
		//				-->�ٿ�ĳ����, ����̹� ��ġ
		
		// ��ü ������ ���� �������� �����ϱ�
		PreparedStatement psmt = null;
		Connection conn = null;
		Scanner sc = new Scanner(System.in);
		
		
		
		// 1. ����̹� �ε� -> Class.forName()
		try { //������ ������ �� �� �ִ� ���, ����ó���� �ʿ��� ���
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			// 2. ������ ���̽� ���� 
			//->DriverManager.getConnection(�����ͺ��̽� �ּ�, ���̵�, ��й�ȣ)
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			
//			if(conn != null) {
//				System.out.println("���� �����Դϴ�!");
//			}
			System.out.print("���� ���̵� : ");
			String id = sc.next();
			System.out.print("���� ��й�ȣ : ");
			String pw = sc.next();
			System.out.print("���� �̸� : ");
			String name = sc.next();
			System.out.print("���� ���� : ");
			int age = sc.nextInt();
			
			
			
			// 3. sql ����
			// csm, 0117, ä����, 22
//			String sql = "insert into members values('"+ id +"', '"+ pw +"', '"+ name +"', '"+ age +"') ";
			
			String sql = "insert into members values(?, ?, ?, ?)";
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);
			
			
			
			// sql���� ���� ��û�ϱ�
			int cnt = psmt.executeUpdate();
			
			if(cnt > 0) {
				System.out.println("insert ����!");
			}
			
		} catch (ClassNotFoundException e) {
			// try �������� ����� �߻��Ǵ� ������ ���� ó���� �� �ִ� ���
			System.out.println("����̹� ���� ����");
			e.printStackTrace();
			
		} catch (SQLException e) {
			System.out.println("�����ͺ��̽� ����");
			e.printStackTrace();
		}
		
		
		// 4. ���� ����
		// try, catch ��ô��� ������� ����� �ƴٸ�
		// �ݵ�� �������� ���� �����ϱ�!
		finally {
			
				try {
					if(psmt != null) {
						psmt.close();
					} if(conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		
		


	} //main

}//class
