@login
Feature: LoginModule

  Background: sayfaya gidis
    Given kullanici "assessmentUrl" sayfasina gider

  Scenario: TC_01 User should see login form if not authenticated. Login Form
  should contain username password and login button
    Given kullanici login sayfasinda oldugunu kontrol eder
    And kullanici username passwoord ve login buttonun oldugunu kontrol eder



  Scenario: TC_02 User should see validation errors if click the login button without
  fill the login form
    Given kullanici login butonuna tiklar
    And kullanici validation errorlari gorur


  Scenario: TC_03 User should navigate to the dashboard and see welcome
  message if authenticate successfully
    Given kullanici username ve password girer
    Then kullanici login butonuna tiklar
    And kullanici dashboard sayfasinda oldugunu kontrol eder
    And kullanici sayfayi kapatir









