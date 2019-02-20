package com.github.johnnypark.webasyncscaling;

import com.hazelcast.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastConfig {

  @Bean
  public Config hazelcastConfiguration(){
    return new Config();
  }

}
