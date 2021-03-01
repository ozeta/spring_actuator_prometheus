package dev.oz.prometheus_info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@EnablePrometheusMetrics
@SpringBootApplication
public class PrometheusInfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrometheusInfoApplication.class, args);
    }

}
