package net.dmcloud.engine;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import net.dmcloud.engine.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@SpringBootApplication
public class Application {
	@Autowired
	private Environment _environment;

	private static Log log = LogFactory.getLog(Application.class);

	@PostConstruct
	public void init() {
		String[] activeProfiles = _environment.getActiveProfiles();
		log.debug("Active Profile[s]: " + Arrays.toString(activeProfiles));
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
