package sample3;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser(UserVo vo) {
		System.out.println("UserService : addUser()�޼ҵ� ȣ��");
		System.out.println("�̸� : " + vo.getUserName());
	}

	public UserServiceImpl() {
		System.out.println("UserService ������ ȣ��");
	}
}
