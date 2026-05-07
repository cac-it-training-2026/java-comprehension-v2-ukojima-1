package q02_advanced.question02;

import java.util.List;

public class MemberManager {

	private MemberManager() {

	}

	public static void showAllMembers(List<Member> members) {

		System.out.println("===会員情報を表示します=== ");
		for (Member m : members) {
			m.showMember();
		}
	}

	public static void updatePassword(List<Member> members, int targetId, String newPassword) {

		boolean isNotExistMember = false;

		for (Member member : members) {
			if (member.getId() == targetId) {
				member.setPassword(newPassword);
				isNotExistMember = true;
				break;
			}
		}
		if (!isNotExistMember) {
			System.out.println("該当者はいませんでした。");
		}
	}
}
