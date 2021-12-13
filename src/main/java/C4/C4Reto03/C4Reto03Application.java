package C4.C4Reto03;

import C4.C4Reto03.CrudRepository.OrderCrudRepository;
import C4.C4Reto03.CrudRepository.UserCrudRepository;
import C4.C4Reto03.CrudRepository.SupplementCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class C4Reto03Application implements CommandLineRunner {

    @Autowired
    private SupplementCrudRepository supplementCrudRepository;
    @Autowired
    public UserCrudRepository userCrudRepository;
    @Autowired
    public OrderCrudRepository orderCrudRepository ;

    public static void main(String[] args) {
        SpringApplication.run(C4Reto03Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        supplementCrudRepository.deleteAll();
        userCrudRepository.deleteAll();
        orderCrudRepository.deleteAll();
    }

}
