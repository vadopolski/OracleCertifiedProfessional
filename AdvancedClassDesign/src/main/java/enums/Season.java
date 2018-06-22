package enums;

public enum Season {
	WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");

	public String getExpectedVisitors() {
		return expectedVisitors;
	}

	private final String expectedVisitors;

	Season(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}

	public void printExpectedVisitors(){
		System.out.println(expectedVisitors);
	}
}

