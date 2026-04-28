package q01_basic.question01;

/**
 * question01出力例
 * 詳細は問題ドキュメントを参照すること

---SHOW DATA---
***MEMBER DATA***
name:Miura Manabu
age:24
rank:1
*****************
***MEMBER DATA***
name:Sato Kensuke
age:36
rank:2
*****************

 * 
 */
public class SystemMain01 {

	public static void main(String[] args) {
		//TODO ここから実装する

		Member member = new Member();
		Member member2 = new Member();

		member.setData("Miura　Manabu", 24, 1);
		member2.setData("Sato　Kenshuke", 36, 2);

		member.showMember();
		member2.showMember();

	}

}
