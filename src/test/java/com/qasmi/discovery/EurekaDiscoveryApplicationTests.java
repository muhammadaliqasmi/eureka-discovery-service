package com.qasmi.discovery;
import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qasmi.discovery.EurekaDiscoveryApplication;

/**
 * This class implements test cases for {@link EurekaDiscoveryApplication}.
 *   
 * @author Muhammad Ali Qasmi
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class EurekaDiscoveryApplicationTests {
    
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void contextLoads() {
    }

    @Test
    public void catalogLoads() {
        @SuppressWarnings("rawtypes")
        ResponseEntity<Map> entity = testRestTemplate.getForEntity("/eureka/apps",
                Map.class);
        assertEquals(HttpStatus.OK, entity.getStatusCode());
    }
}
