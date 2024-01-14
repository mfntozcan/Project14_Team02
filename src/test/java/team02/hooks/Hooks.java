package team02.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import team02.utilities.Driver;

import java.time.Duration;

public class Hooks {

    @Before("@UI")//Bu sadece ui teslerinde kullanilacak
    public void setup(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @After("@UI")
    public void tearDown(){
        Driver.closeDriver();
    }



}
