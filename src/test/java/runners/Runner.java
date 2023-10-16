package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target\\cucumber-report.html",
                    "json:target/json-report/cucumber.json",
                    "junit:target/xml-report/cucumber.xml"},
        features = "src\\test\\resources\\features",
        glue = "stepdefinitions",
        tags = "@wip",
        dryRun = false
)



public class Runner {

    /*
        Runner class'ı boş bir class'dır

        bu class'ta asıl işi

        Class'ta kullandığımız iki notasyon yapar

        druRun = true secildiginde
        Runner istenen featur/scenario'yu çalıştırmaya değil
        eksik adımları bulmaya odaklanır

        eğer eksik adım yoksa
        test PASSED der.
        Ama bu testin çalışıp tüm adımların geçtiğini göstermez.
        SADECE eksik adım olmadığını gösterir

        EĞER eksik adım bulam amacımız yoksa
        testlerimizi normal olarak ÇALIŞTIRMAK istiyorsak
        dryRun = false secilmelidir

     */
}
