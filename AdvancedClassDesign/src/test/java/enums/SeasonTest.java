package enums;

import org.junit.Test;

class SeasonTest {

	@Test
	void getExpectedVisitors() {
		Season s = Season.FALL;

		assert(s == Season.FALL);
		assert("Low".equals(Season.SUMMER.getExpectedVisitors()));
	}

}