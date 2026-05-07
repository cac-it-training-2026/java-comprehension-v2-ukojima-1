package q02_advanced.question03;

import java.util.List;

public class LoginService {

	private List<Member> members;

	public LoginService(MemberStorage storage) {
		this.members = storage.getMembers();
	}

	public Member doLogin(int id, String password) {

		for (Member m : members) {
			if (m.getId() == id && m.getPassword().equals(password)) {
				return m;
			}
		}

		return null;
	}
}