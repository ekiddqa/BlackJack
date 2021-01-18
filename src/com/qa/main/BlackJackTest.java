package com.qa.main;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class BlackJackTest {
	BlackJackSimple test = new BlackJackSimple();
	@Test
	public void draw2222() {
	assertEquals("Expected: 0", 0, test.play(22, 22));
	}
	@Test
	public void draw2230() {
		assertEquals("Expected: 0", 0, test.play(22, 30));
	}
	@Test
	public void draw3022() {
		assertEquals("Expected: 0", 0, test.play(30, 22));
	}
	@Test
	public void draw2121(){	
		assertEquals("Expected: 21", 21, test.play(21, 21));
}	
	@Test
	public void dealer2021(){	
		assertEquals("Expected: 21", 21, test.play(20, 21));
}	
	@Test
	public void player2120(){	
		assertEquals("Expected: 21", 21, test.play(21, 20));
}	
	@Test
	public void dealer2014(){	
		assertEquals("Expected: 20", 20, test.play(20, 14));
}	
	@Test
	public void player1420(){	
		assertEquals("Expected: 20", 20, test.play(14, 20));
}	

}
