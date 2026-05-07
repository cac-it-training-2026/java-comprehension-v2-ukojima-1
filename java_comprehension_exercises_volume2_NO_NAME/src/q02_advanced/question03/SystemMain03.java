package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();
		MemberStorage storage = new MemberStorage();
		LoginService service = new LoginService(storage);

		System.out.println("ログイン情報を入力してください");

		Member loginUser = null;

		while (loginUser == null) {

			try {
				System.out.print("input id>>");
				int id = cr.inputNumber();

				System.out.print("input password>>");
				String pass = cr.inputString();

				loginUser = service.doLogin(id, pass);

				if (loginUser == null) {
					System.out.println("ID またはパスワードが違っています。再度入力してください。");
				} else {
					System.out.println("ログインに成功しました");
				}

			} catch (NumberFormatException e) {
				System.out.println("不正な入力です。再度入力してください");
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}

		System.out.println("ログインユーザ情報を表示します。");
		loginUser.showMember();
	}
}