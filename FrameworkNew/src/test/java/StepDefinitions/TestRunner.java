package StepDefinitions;
import org.junit.runner.RunWith;   
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;  


@RunWith(Cucumber.class) 
@CucumberOptions(features="src//test//resources//Feature",
//@CucumberOptions(features="C:\\Users\\ASUS\\Downloads\\bddframework-main\\bddframework-main\\FrameworkNew\\src\\test\\resources\\Feature",
glue={"StepDefinitions"}, monochrome = true, plugin = { "pretty", "html:target/reports"},
tags = "@smoketest")
public class TestRunner {

}
    