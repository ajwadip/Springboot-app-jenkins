package com.example.payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
      log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
      log.info("Preloading " + repository.save(new Employee("Aragorn", "Ranger")));
      log.info("Preloading " + repository.save(new Employee("Boromir", "Lord")));
      log.info("Preloading " + repository.save(new Employee("Legolas", "Archer")));
      log.info("Preloading " + repository.save(new Employee("Gimlli", "Sprinter")));
    };
  }
}