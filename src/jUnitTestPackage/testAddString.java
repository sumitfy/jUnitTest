package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitFunctions junitstring = new jUnitFunctions();
		String result = junitstring.addString("capston", "project");
		assertEquals("capstonproject",result);
	}

}
