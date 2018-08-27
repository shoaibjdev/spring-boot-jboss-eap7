package io.apizone.jbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class JbAppApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(JbAppApplication.class, args);
	}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JbAppApplication.class);
    }

}


@RestController
class HelloController {

    @RequestMapping("/hello/{name}")
    String hello(@PathVariable String name) {
        return "Hi " + name + " !";
    }
}

