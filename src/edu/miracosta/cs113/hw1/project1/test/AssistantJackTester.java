package edu.miracosta.cs113.hw1.project1.test;

import edu.miracosta.cs113.hw1.project1.AssistantJack;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class AssistantJackTester {

	@Test
	public void testCheckAnswerIntIntInt() {
		AssistantJack aj = new AssistantJack(1);
		assertTrue(aj.checkAnswer(1, 1, 1) == 0);		
	}

	@Test
	public void testCheckAnswer2() {
		AssistantJack aj = new AssistantJack(2);
		assertTrue(aj.checkAnswer(6,10,6) == 0);
	}

}
