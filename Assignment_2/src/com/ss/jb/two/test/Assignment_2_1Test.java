package com.ss.jb.two.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ss.jb.two.Assignment_2_1;

class Assignment_2_1Test {

	@Test
	void test() {
		Assignment_2_1 assign = new Assignment_2_1();
		String[] args = {};
		Assignment_2_1.main(args);
		String [] args2 = {"2", "5"};
		Assignment_2_1.main(args2);
		String [] args3 = {"2", "a", "b5"};
		Assignment_2_1.main(args3);
		String [] args4 = {"2", "a", "5"};
		Assignment_2_1.main(args4);
	}

}
