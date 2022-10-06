package google.drive.common;


import google.drive.IndexApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { IndexApplication.class })
public class CucumberSpingConfiguration {
    
}
