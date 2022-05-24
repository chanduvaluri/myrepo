package docker.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerMessage {

	@GetMapping(value="/endpoint")
	String Message() {
		return "This is my first docker";
		
	}
}
