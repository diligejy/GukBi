package com.board.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.board.vo.BoardVo;
import com.inter.SqlInter;
import com.member.vo.MemberVo;

@Repository
public class BoardDaoImpl implements BoardDao, SqlInter {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<BoardVo> getAll() {
		List<BoardVo> getAll = null;
		String sql = "select no, title, viewcount, regdate, subtitle, n_id, contentType, contents from boarder";

		getAll = jdbcTemplate.query(sql, new RowMapper<BoardVo>() {
			public BoardVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				BoardVo board = new BoardVo();

				board.setNo(rs.getInt("no"));
				board.setTitle(rs.getString("title"));
				board.setViewcount(rs.getInt("viewcount"));
				board.setRegdate(rs.getDate("regdate"));
				board.setSubtitle(rs.getString("subtitle"));
				board.setN_id(rs.getString("n_id"));
				board.setContentType(rs.getString("contentType"));
				board.setContents(rs.getString("contents"));

				return board;
			}
		});
		return getAll;
	}

	@Override
	public int getInsert(BoardVo boardVo) {
		String sql = "insert into boarder (no,title,viewcount,regdate,subtitle,n_id,contentType,contents) values (seq_boarder_no.nextval,?,0,sysdate,?,?,1,?)";
		Object[] obj = { boardVo.getTitle(), boardVo.getSubtitle(), boardVo.getN_id(), boardVo.getContents() };
		return jdbcTemplate.update(sql, obj);
// Date Çü½Ä yyyy-mm-dd , Int, 
	}

	@Override
	public int getDelete(int no) {
		String sql = "delete from boarder where no = ?";
		int result = jdbcTemplate.update(sql, new Object[] { no });
		return result;
	}

	@Override
	public int getUpdate(BoardVo boardVo) {
		String sql = "update boarder set title = ?, subtitle=?, contents = ? where no = ?";
		Object[] obj = { boardVo.getTitle(), boardVo.getSubtitle(), boardVo.getContents(), boardVo.getNo() };
		return jdbcTemplate.update(sql, obj);
	}

	@Override
	public List<BoardVo> getFind(String n_id) {
		return null;
	}

	@Override
	public BoardVo readContent(int no) throws Exception {
		String sql = "select no, title, viewcount, regdate, subtitle, n_id, contentType, contents from boarder where no = ?";

		BoardVo boardVo = (BoardVo) jdbcTemplate.queryForObject(sql, new Object[] { no }, new RowMapper<BoardVo>() {
			public BoardVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				BoardVo board = new BoardVo();

				board.setNo(rs.getInt("no"));
				board.setTitle(rs.getString("title"));
				board.setViewcount(rs.getInt("viewcount"));
				board.setRegdate(rs.getDate("regdate"));
				board.setSubtitle(rs.getString("subtitle"));
				board.setN_id(rs.getString("n_id"));
				board.setContentType(rs.getString("contentType"));
				board.setContents(rs.getString("contents"));
				return board;
			}
		});
		this.updateReadCount(boardVo.getNo());
		return boardVo;
	}

	@Override
	public int updateReadCount(int no) throws Exception {
		String sql = "update boarder set viewcount = nvl(viewcount,0)+1 where no =?";
		Object[] obj = { no };
		return jdbcTemplate.update(sql, obj);
	}
	
}
