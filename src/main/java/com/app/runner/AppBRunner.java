package com.app.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(1)
public class AppBRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("from runner-B");
		System.out.println(Arrays.asList(args));

	}

}
