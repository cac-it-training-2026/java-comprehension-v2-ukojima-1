package q01_basic.question05;

public class Member extends AbstMember {

	/**
	 * 
	 */
	public Member() {
	}

	/**
	 * @param id
	 * @param passwordString
	 * @param age
	 * @param rank
	 */
	public Member(int id, String name, String password, int age, int rank) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.rank = rank;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPasswordString(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	private int id;
	private String name;
	private String password;
	private int age;
	private int rank;

	@Override
	public void buyItem() {
		System.out.println(name + "　purchased the item at 50% off");
	}

	@Override
	public void showMember() {
		System.out.println("***MEMBER　DATA***");
		System.out.println("id:" + id);
		System.out.println("password:" + password);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("******************");
	}

}
