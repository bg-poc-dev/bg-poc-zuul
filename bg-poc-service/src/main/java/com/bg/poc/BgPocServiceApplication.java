package com.bg.poc;

import com.bg.poc.eventlog.config.EnableEventLog;
import com.bg.poc.model.User;
import com.bg.poc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EnableEventLog
@SpringBootApplication
public class BgPocServiceApplication {

    @Autowired
    private UserRepository userRepository;


    @Bean
    public CommandLineRunner commandLineRunner() {
        return strings -> userRepository.save(new User("John", "john@mail.com"));
    }

    public static void main(String[] args) {
        SpringApplication.run(BgPocServiceApplication.class, args);
    }
}
