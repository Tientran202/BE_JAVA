package com.example.demo1Inteliij.demoSpring.database;
import com.example.demo1Inteliij.demoSpring.models.Product;
import com.example.demo1Inteliij.demoSpring.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/*Connect with mysql usingJPA

docker run -d --rm --name mysql-spring-boot-tutorial \
-e MYSQL_ROOT_PASSWORD=123456789 \
-e MYSQL_USER=tien \
-e MYSQL_PASSWORD=123456789 \
-e MYSQL_DATABASE=test_db \
-p 3309:3306 \
--volume mysql-spring-boot-tutorial-volume:/var/lib/mysql \
mysql:latest

*/



@Configuration
public class Database {
    //logger
    private static final Logger logger = LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
//                Product productA = new Product("may tinh 1", 100.0, 2001, "123");
//                Product productB = new Product("may tinh 2", 200.0, 2002, "123");
//                logger.info("insert product: " + productRepository.save(productA));
//                logger.info("insert product: " + productRepository.save(productB));
            }
        };
    }
}
