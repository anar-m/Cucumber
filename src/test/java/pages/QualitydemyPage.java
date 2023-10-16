package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import utilities.Driver;

public class QualitydemyPage {


    public QualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='btn btn-sign-in-simple']")
    public WebElement ilkLoginLinki;

    @FindBy(id = "login-email")
    public WebElement emailKutusu;

    @FindBy(id = "login-password")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButonu;

    @FindBy(linkText = "My courses")
    public WebElement basariliGirisElementi;

}