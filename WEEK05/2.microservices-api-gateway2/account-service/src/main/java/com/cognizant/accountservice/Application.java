
package com.cognizant.accountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
    }
}

@RestController
@RequestMapping("/accounts")
class AccountController {
    @GetMapping("/{number}")
    public Account getAccount(@PathVariable String number) {
        return new Account(number, "savings", 234343);
    }
}

record Account(String number, String type, double balance) {}
