class Item {
	private int id;
	private String name;
	private double price;
	private char type;

	public Item(int id, String name, double price, char type) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public int getID() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public char getType() {
		return this.type;
	}

	public int setID(int id) {
		return this.id = id;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public double setPrice(double price) {
		return this.price = price;
	}

	public char setType(char type) {
		return this.type = type;
	}

	double taxReturn () {
		double tax = this.type == 'A' ? 0.18 : this.type == 'B' ? 0.05 : 0;
		return 0.15 * tax * this.price;
	}
}