package com.ar.main_app;

import com.ar.model.models.User;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class MainAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainAppApplication.class, args);
		test();
	}

	public static void test(){
		User user = new User("ar", "1234");
		log.info(user);
	}

}
