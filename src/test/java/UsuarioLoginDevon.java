import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UsuarioLoginDevon {

    @Test
    public void testeLogarNoSistema(){

        final String cromedriver = System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--test-type");
        options.addArguments("--ignore-certificate-errors");
        WebDriver navegador =  new ChromeDriver(options);
        navegador.get("http://localhost/devon/web/user-management/auth/login");

        /*WebElement formulariologin = ((ChromeDriver) navegador).findElementById("login-form");
        formulariologin.findElement(By.id("customloginform-cod_entidade")).sendKeys("Lar Das Crianças");
        formulariologin.findElement(By.id("customloginform-username")).sendKeys("hsacramento");
        formulariologin.findElement(By.id("customloginform-password")).sendKeys("eva212810-");
        formulariologin.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
        String bemVindo =  By.xpath("//*[@id=\"wrapper\"]/div[1]/div/div[1]/div/div/a").findElement((ChromeDriver) navegador).getText();
        //String telainicial = bemvindo.getText();
        System.out.println(bemVindo);
        //Assert.assertEquals("Bem vindo, Hildebrando ",telainicial);*/


    }

}
