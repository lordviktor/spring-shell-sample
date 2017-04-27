package io.github.lordviktor.springbootshellsample;

import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;

@Component
public class SampleCommands implements CommandMarker {

	@CliCommand(value = "say-hello", help = "Say hello world")
	public String sayHello() {
		return "Hello World!";
	}

	@CliCommand(value = "say-hello-to", help = "Say hello to given person")
	public String sayHelloTo(@CliOption(key = { "" }, help = "The greeting receiver") String receiver) {
		return "Hello " + receiver;
	}
}
