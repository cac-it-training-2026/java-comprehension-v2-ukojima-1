package q02_advanced.question03;

import java.util.ArrayList;
import java.util.List;

public class MemberStorage {

	private List<Member> members;

	public MemberStorage() {
		members = new ArrayList<>();

		members.add(Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2));
		members.add(Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1));
	}

	public List<Member> getMembers() {
		return members;
	}
}