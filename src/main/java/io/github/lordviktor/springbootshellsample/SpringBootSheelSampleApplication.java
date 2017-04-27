package io.github.lordviktor.springbootshellsample;

import java.io.IOException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.Bootstrap;

@SpringBootApplication
public class SpringBootSheelSampleApplication {

	public static void main(String[] args) throws IOException {
		Bootstrap.main(args);
	}
}
