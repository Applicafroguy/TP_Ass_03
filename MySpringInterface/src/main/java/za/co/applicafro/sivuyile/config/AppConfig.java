package za.co.applicafro.sivuyile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.co.applicafro.sivuyile.services.StudentInterface;
import za.co.applicafro.sivuyile.services.impl.StudentImpl;

@Configuration
public class AppConfig {
    @Bean(name="stud")
    public StudentInterface getStudent(){
        return new StudentImpl();
    }
}
