package enums;

public class TestEnum {

	public static void main(String[] args) {
		Season s = Season.FALL;

		System.out.println(Season.SUMMER);
		System.out.println(s == Season.FALL);

		for (Season season : Season.values()){
			System.out.println("Seasons name: " + season.name() + " seasons ordinal: " +  season.ordinal());
		}

		Season.SUMMER.printExpectedVisitors();
	}
}
