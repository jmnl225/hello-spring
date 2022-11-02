package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

	@GetMapping("hello-api")
	@ResponseBody
	public Hello helloApi(@RequestParam("name") String name){
		Hello hello = new Hello();
		hello.setName(name);

		return hello;
	}

	static class Hello{
		private String name = "";

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

}
