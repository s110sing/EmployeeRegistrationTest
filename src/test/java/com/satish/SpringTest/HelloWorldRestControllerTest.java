package com.satish.SpringTest;

import static org.junit.Assert.*;
import com.satish.SpringTest.*;

import org.junit.Test;

public class HelloWorldRestControllerTest {

	@Test
	public void test() {
		fail("Not yet implemented");
		HelloWorldRestController hwc = new HelloWorldRestController();
		assertEquals(hwc.listAllUsers(), null);
	}
	
	@Test
	public void getUserTest() {
		HelloWorldRestController hwc = new HelloWorldRestController();
		assertEquals(hwc.listAllUsers(), null);
	}
	
	

}
