package sample16;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import sample15.MemberDAO;

@Configuration
public class MemberDAOFactory {
	public DataSource getDataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriverClass(oracle.jdbc.driver.OracleDriver.class);
		dataSource.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:xe");
		dataSource.setUsername("bigdata");
		dataSource.setPassword("admin1234");
		return dataSource;
	}

	/* 메이커 측은 getMemberDAO()를 ID로 생각한다. */
	@Bean
	public MemberDAO getMemberDAO() {
		MemberDAO dao = new MemberDAO();
		dao.setDataSource(getDataSource());
		return dao;
	}
}
