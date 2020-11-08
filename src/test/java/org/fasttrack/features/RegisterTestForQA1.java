package org.fasttrack.features;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.RegisterStepsQA1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterTestForQA1 {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private RegisterStepsQA1 registerStepsQA1;

    @Test
    public void VerifyValidRegisterTest(){
     registerStepsQA1.navigateToMyAccount();
     registerStepsQA1.enterCredentials("sebastian.ognean@yahoo.com", "Parola.123456");
     registerStepsQA1.clickRegister();
    }






}
