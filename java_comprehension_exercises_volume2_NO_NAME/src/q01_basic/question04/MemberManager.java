package q01_basic.question04;

class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	//TODO showAllMembersメソッドを実装する
	public static void showAllMember(Member[] members) {
		Member[] member = new Member[2];

		for (Member mem : members) {

			mem.showMember();
		}
	}

}
