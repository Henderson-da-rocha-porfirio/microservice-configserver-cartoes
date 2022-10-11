package com.tuyo.cards;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.domain.*;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.*;

@SpringBootApplication
@ComponentScans({ @ComponentScan("com.tuyo.cards.controller") })
@EnableJpaRepositories("com.tuyo.cards.repository")
@EntityScan("com.tuyo.cards.model")
public class CardsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsConfigServerApplication.class, args);
	}

}
