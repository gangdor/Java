package sample3;

public class UserVo {
	private String userName;

	public UserVo(String userName) {
		super();
		this.userName = userName;
		System.out.println("UserVO ������ ȣ��");
	}

	public String getUserName() {
		return userName;
	}
}
