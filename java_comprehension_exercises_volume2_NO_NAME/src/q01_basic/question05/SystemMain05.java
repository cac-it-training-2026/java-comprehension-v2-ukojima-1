package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		NonMember nonMember = new NonMember("Sato　Kensuke");
		Member member = new Member(1, "Miura　Manabu", "passwOrd", 28, 2);

		members[0] = nonMember;
		members[1] = member;

		MemberManager.showAllMembers(members);
		System.out.println("---BUY　ITEM---");
		nonMember.buyItem();
		member.buyItem();

	}

}
