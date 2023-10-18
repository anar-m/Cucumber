package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SaucedemoPage;

public class SaucedemoStepdefinitions {

    SaucedemoPage saucedemoPage = new SaucedemoPage();
    String ilkUrunIsmi;

    @Then("Username kutusuna {string} yazar")
    public void username_kutusuna_yazar(String gecerliUsername) {
        saucedemoPage.userNameBox.sendKeys(gecerliUsername);
    }
    @Then("Password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String gecerliPassword) {
        saucedemoPage.passwordBox.sendKeys(gecerliPassword);
    }
    @Then("Login tusuna basar")
    public void login_tusuna_basar() {
        saucedemoPage.loginButton.click();
    }
    @When("Ilk urunun ismini kaydeder ve bu urunun sayfasina gider")
    public void ilk_urunun_ismini_kaydeder_ve_bu_urunun_sayfasina_gider() {
       ilkUrunIsmi =saucedemoPage.ilkUrunElement.getText();
       saucedemoPage.ilkUrunElement.click();
    }
    @When("Add to Cart butonuna basar")
    public void add_to_cart_butonuna_basar() {
        saucedemoPage.addToCartButton.click();
    }
    @Then("Alisveris sepetine tiklar")
    public void alisveris_sepetine_tiklar() {
        saucedemoPage.alisverisSepeti.click();
    }
    @Then("Sectigi urunun basarili olarak sepete eklendigini kontrol eder")
    public void sectigi_urunun_basarili_olarak_sepete_eklendigini_kontrol_eder() {
        String actualUrunIsmi = saucedemoPage.sepetUrunElement.getText();

        Assert.assertEquals(ilkUrunIsmi, actualUrunIsmi);


    }

}
