package StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AssessmentPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.text.SimpleDateFormat;

public class MyStepdefs {
    Faker faker = new Faker();
    AssessmentPage assessmentPage = new AssessmentPage();

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arg0) {

        Driver.getDriver().get(ConfigReader.getProperty("assessmentUrl"));
    }

    @Given("kullanici login sayfasinda oldugunu kontrol eder")
    public void kullaniciLoginSayfasindaOldugunuKontrolEder() {
        Assert.assertTrue(assessmentPage.loginText.isDisplayed());

    }

    @Given("kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        assessmentPage.loginButton.click();
    }

    @And("kullanici validation errorlari gorur")
    public void kullaniciValidationErrorlariGorur() {
        Assert.assertTrue(assessmentPage.usernameError.isDisplayed());
        Assert.assertTrue(assessmentPage.passwordError.isDisplayed());

    }

    @Given("kullanici username ve password girer")
    public void kullaniciUsernameVePasswordGirer() {
        assessmentPage.usernameBox.sendKeys(ConfigReader.getProperty("username"));
        assessmentPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("kullanici dashboard sayfasinda oldugunu kontrol eder")
    public void kullaniciDashboardSayfasindaOldugunuKontrolEder() {
        Assert.assertTrue(assessmentPage.dashbordText.isDisplayed());

    }

    @And("kullanici username passwoord ve login buttonun oldugunu kontrol eder")
    public void kullaniciUsernamePasswoordVeLoginButtonunOldugunuKontrolEder() {
        Assert.assertTrue(assessmentPage.usernameBox.isDisplayed());
        Assert.assertTrue(assessmentPage.passwordBox.isDisplayed());
        Assert.assertTrue(assessmentPage.loginButton.isDisplayed());

    }

    @Given("kullanici create event butonuna tiklar")
    public void kullaniciCreateEventButonunaTiklar() {
        assessmentPage.createEventButton.click();
    }

    @And("kullanici formu gorur")
    public void kullaniciFormuGorur() {
        Assert.assertTrue(assessmentPage.AddParticipantButton.isDisplayed());
    }

    @And("kullanici create new event butonuna tiklar")
    public void kullaniciCreateNewEventButonunaTiklar() {
        assessmentPage.createNewEventButton.click();
    }

    @And("kullanici formdaki errorlari gorur")
    public void kullaniciFormdakiErrorlariGorur() {
        Assert.assertTrue(assessmentPage.emailError.isDisplayed());
        Assert.assertTrue(assessmentPage.EventNameError.isDisplayed());
        Assert.assertTrue(assessmentPage.EventDateError.isDisplayed());
        Assert.assertTrue(assessmentPage.NameError.isDisplayed());
        Assert.assertTrue(assessmentPage.LastNameError.isDisplayed());

    }

    @Given("kullanici formu doldurur")
    public void kullaniciFormuDoldurur()  {

        assessmentPage.EventNameBox.click();
        assessmentPage.EventNameBox.sendKeys(faker.name().title());

        assessmentPage.calenderButton.click();

        assessmentPage.calenderDate.click();

        assessmentPage.firstNameBox.click();
        assessmentPage.firstNameBox.sendKeys(faker.name().firstName());

        assessmentPage.lastNameBox.click();
        assessmentPage.lastNameBox.sendKeys(faker.name().lastName());

        assessmentPage.contactBox.click();
        assessmentPage.contactBox.sendKeys(faker.internet().emailAddress());

    }

    @And("kullanici yeni event olusturdugunu gorur")
    public void kullaniciYeniEventOlusturdugunuGorur() {
        Assert.assertTrue(assessmentPage.firstEvent.isDisplayed());

    }

    @And("kullanicci eventi siler")
    public void kullanicciEventiSiler() {
        assessmentPage.EventDeleteButton.click();

    }

    @And("event bulunamadi yazisini gorur")
    public void eventBulunamadiYazisiniGorur() {
        Assert.assertTrue(assessmentPage.eventBulunamadiText.isDisplayed());

    }


    @And("kullanici edit butonuna tiklar")
    public void kullaniciEditButonunaTiklar() {
        assessmentPage.EventEditButton.click();
    }

    @And("kullanici eventte degisiklikler yapar")
    public void kullaniciEventteDegisikliklerYapar() {
        assessmentPage.DescriptionBox.click();
        assessmentPage.DescriptionBox.sendKeys(faker.job().title());
    }

    @And("kullanici update event butonuna tiklar")
    public void kullaniciUpdateEventButonunaTiklar() {
        assessmentPage.updateEventButton.click();
    }

    @And("kullanici edit oldugunu gorur")
    public void kullaniciEditOldugunuGorur() {
        Assert.assertTrue(assessmentPage.eventsSayfasi.isDisplayed());

    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("kullanici edit sayfasinda oldugunu gorur")
    public void kullaniciEditSayfasindaOldugunuGorur() {
        Assert.assertTrue(assessmentPage.editSayfasi.isDisplayed());

    }

    @And("kullanici delete butonuna tiklar")
    public void kullaniciDeleteButonunaTiklar() {
        assessmentPage.EventDeleteButton.click();
    }

    @And("kullanici eventin silindigini gorur")
    public void kullaniciEventinSilindiginiGorur() {
    }

    @And("kullanici Participants butonuna tiklar")
    public void kullaniciParticipantsButonunaTiklar() {
        assessmentPage.ParticipantsButton.click();
    }

    @And("kullanici Participants leri gorur")
    public void kullaniciParticipantsLeriGorur() {
        Assert.assertTrue(assessmentPage.participantsTable.isDisplayed());

    }
}
