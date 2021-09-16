public class Hero {
	private String name;

	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前がnull");
		}
		if (name.length() <= 1) {
			throw new IllegalArgumentException("名前が短い");
		}
		if (name.length() <= 8) {
			throw new IllegalArgumentException("名前が長い");
		}
		this.name = name;
	}

}
