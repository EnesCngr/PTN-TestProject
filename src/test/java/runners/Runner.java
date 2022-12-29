package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "StepDefinitions",
        tags = "@dashbord",
        dryRun = true
)
public class Runner {
    //bu bodyye bir kod yazılmayacak
    //bu class için önemli olan kullanacağımız 2 notasyon var onları kullancez

    // dryRun = false yazıldığında yukarıda belirlenen tagla etiketlenen tüm senaryoları sırasıyla çalıştırır
    // dryRun = true eksik stepler olup olmadığını kontrol eder ve eksikleri (varsa) rapor eder

    //features ve glue olarak spesifik bir class veya feature dosyasını değil
    //tüm klaasör ve package ı seçtik
    // dolayısıyla stepdefinitions packageı içerisinde hangi class'da olursa olsun
    // işimize yarayan bir stepdefinition varsa rahatlıkla kullanabiliriz.
}
