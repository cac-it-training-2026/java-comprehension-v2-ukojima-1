package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		ConsoleReader consoleReader = new ConsoleReader();

		Member member1 = Member.getInstance(1, "PasswOrd", "Miura Manabu", 28, 2);
		Member member2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		List<Member> members = new ArrayList<>();
		members.add(member1);
		members.add(member2);

		// 19.3 現在の会員情報表示
		MemberManager.showAllMembers(members);

		try {

			// 19.4.1 会員ID入力
			System.out.print("会員IDを入力してください：");
			int id = consoleReader.inputNumber();

			// 19.4.2 パスワード入力
			System.out.print("新しいパスワードを入力してください：");
			String newPassword = consoleReader.inputString();

			// 19.4.2.1 例外処理
			// ※このtry内でIOException / NumberFormatExceptionをcatch

			// 19.5 パスワード更新
			MemberManager.updatePassword(members, id, newPassword);

			// 19.6 更新後表示
			System.out.println("更新後の会員情報：");
			MemberManager.showAllMembers(members);

		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
			return;
		}
	}

}
