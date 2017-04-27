package io.github.lordviktor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.github.lordviktor.springbootshellsample.SampleCommands;
import io.github.lordviktor.springbootshellsample.SpringBootSheelSampleApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
@SpringBootTest(classes = { SampleCommands.class, SpringBootSheelSampleApplication.class })
// @SpringBootTest(classes = { CommonConfiguration.class, Application.class,
// StateMachineCommands.class })
public class SampleCommandsTest {

	@Test
	public void contextLoads() {
	}

}
