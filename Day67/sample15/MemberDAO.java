package sample15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

public class MemberDAO {
	private DataSource dataSource;

	public MemberDAO() {
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void Res() throws ClassNotFoundException, SQLException {
		Connection conn = dataSource.getConnection();
		System.out.println("연결성공");
		conn.close();
	}

	public int getInsert(MemberDTO mdto) throws SQLException {
		Connection conn = dataSource.getConnection();
		String sql = "insert into springtest values(?, ?, ?)";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, mdto.getName());
		pstm.setString(2, mdto.getId());
		pstm.setString(3, mdto.getJoindate());
		int r = pstm.executeUpdate();
		pstm.close();
		conn.close();

		return r;
	}

}
