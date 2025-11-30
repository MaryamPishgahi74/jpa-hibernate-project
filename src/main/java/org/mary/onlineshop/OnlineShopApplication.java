package org.mary.onlineshop;

import org.mary.onlineshop.Domain.Customer;
import org.mary.onlineshop.Domain.User;
import org.mary.onlineshop.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OnlineShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineShopApplication.class, args);
    }

    @Bean
    public ApplicationRunner runnerApplication(UserRepository userRepository){
        return exec -> {
            User customer = new Customer();
            customer.setFirstName("ziba");
            customer.setLastName("sarvari");
            customer.setMobileNumber("09925639564");

            User customer2 = new Customer();
            customer.setFirstName("mary");
            customer.setLastName("pishgahi");
            customer.setMobileNumber("09365642136");


            User savedUser = userRepository.save(customer);
            System.out.println(savedUser);
        };
    }

}
