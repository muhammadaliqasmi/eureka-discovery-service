
package com.qasmi.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * This class is the main entry-point to run the application
 * 
 * @author Muhammad Ali Qasmi
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoveryApplication {

    /**
     * Protected constructor
     */
    EurekaDiscoveryApplication() {
    }

    /**
     * Main entry-point
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaDiscoveryApplication.class, args);
    }
}
