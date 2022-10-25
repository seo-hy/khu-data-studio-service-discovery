package com.seoh.khudatastudioservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KhuDataStudioServiceDiscoveryApplication {

  public static void main(String[] args) {
    SpringApplication.run(KhuDataStudioServiceDiscoveryApplication.class, args);
  }

}
