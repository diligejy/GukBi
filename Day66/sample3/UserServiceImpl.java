package sample3;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser(UserVo vo) {
		System.out.println("UserService : addUser()메소드 호출");
		System.out.println("이름 : " + vo.getUserName());
	}

	public UserServiceImpl() {
		System.out.println("UserService 생성자 호출");
	}
}
