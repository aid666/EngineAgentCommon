package net.dmcloud.engine.client;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.servlet.MultipartConfigElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.core.env.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import net.dmcloud.engine.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@SpringBootApplication
public class Application
{
    @Autowired
    private Environment _environment;

		@Autowired
		private IDMCloudEngine _engine;

   private static Log log = LogFactory.getLog(Application.class);

   @PostConstruct
   public void init() {
      String[] activeProfiles = _environment.getActiveProfiles();
      log.debug("Active Profile[s]: " + Arrays.toString(activeProfiles));
      log.debug("Max Task Count " + _engine.getMaxTaskCount());
   }

   public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
   }
}
