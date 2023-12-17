package com.Game.Iteration1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Iteration1Application {

	public static void main(String[] args) {
		//SpringApplication.run(Iteration1Application.class, args);
		Mario mario=new Mario();
		Contra contra=new Contra();
		PacMan pac=new PacMan();
	GameRunner runner=new GameRunner();
	runner.rungame(mario);
	}

}
