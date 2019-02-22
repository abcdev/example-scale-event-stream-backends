package com.github.johnnypark.webasyncscaling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

  private static Logger LOG = LoggerFactory.getLogger(HealthCheckController.class);

  @GetMapping("/healthcheck")
  public String healthcheck() {
    LOG.info("healthcheck()");
    return "OK";
  }

}
