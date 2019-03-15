package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import data.MemberDTO;

@Scope()
@Repository
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private DataSource dataSource;
	
	/*public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
*/
	@Override
	public int insertMember(MemberDTO dto) throws Exception {
		Connection conn = dataSource.getConnection();
		String sql = "";
		sql += "insert into springtest(name, id, joindate) \n";
		sql += "values(?, ?, sysdate)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, dto.getName());
		pstmt.setString(2, dto.getId());
		int cnt = pstmt.executeUpdate();
		pstmt.close();
		conn.close();
		return cnt;
	}

	@Override
	public List<MemberDTO> getList(Map<String, String> map) {
		return null;
	}

	@Override
	public MemberDTO getMember(String member) {
		return null;
	}

	@Override
	public int updateMember(MemberDTO dto) {
		return 0;
	}

	@Override
	public int deleteMember(String member) {
		// TODO Auto-generated method stub
		return 0;
	}

}
