package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		Member member = new Member(1, "PasswOrd", "Miura　Manabu", 28, 2);
		Member member2 = new Member(2, "aaaAAAA", "SatoKensuke", 43, 1);

		Member[] members = new Member[2];

		members[0] = member;
		members[1] = member2;

		MemberManager.showAllMember(members);

	}

}
