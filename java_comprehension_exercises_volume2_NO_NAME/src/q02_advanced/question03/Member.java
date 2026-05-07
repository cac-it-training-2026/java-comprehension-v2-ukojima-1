package q02_advanced.question03;

import java.util.ArrayList;
import java.util.List;

public class Member {

	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;
	private List<Coupon> coupons;

	// 7: 引数なし
	public Member() {
		this.coupons = new ArrayList<>();
	}

	// 8: コンストラクタ
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
		this.coupons = new ArrayList<>();
	}

	// getter（必要最低限）
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Coupon> getCoupons() {
		return coupons;
	}

	// 9
	@Override
	public String toString() {
		return "Member [id=" + id +
				", password=" + password +
				", name=" + name +
				", age=" + age +
				", rank=" + rank +
				", coupons=" + coupons + "]";
	}

	// 10
	public void showMember() {
		System.out.println(toString());
	}

	// 11（ここは必ず static）
	public static Member getInstance(int id, String password, String name, int age, int rank) {

		Member member = new Member(id, password, name, age, rank);

		member.getCoupons().add(Coupon.getInstance(1, 0.5, "最初の特典"));
		member.getCoupons().add(Coupon.getInstance(2, 0.25, "今月の特典"));

		return member;
	}
}