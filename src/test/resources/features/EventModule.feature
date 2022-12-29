@event
Feature: EventModule

  Background: sayfaya gidis
    Given kullanici "assessmentUrl" sayfasina gider
    Then kullanici username ve password girer
    Then kullanici login butonuna tiklar
    And kullanici dashboard sayfasinda oldugunu kontrol eder
    And kullanici create event butonuna tiklar


  Scenario: TC_01 - User should view create event form if click the Create Event
  button on dashboard
    Given kullanici formu gorur


  Scenario: TC_02 – User should view validation errors if click the Create Event button
  without fill the event form
    Given kullanici create new event butonuna tiklar
    And kullanici formdaki errorlari gorur


  Scenario: TC_03 – User should be able to add new participant when click the Add
  Participant button
    Given kullanici formu doldurur
    And kullanici create new event butonuna tiklar


  Scenario: TC_04 – User should view error message if removes all participants
    Given kullanici formu doldurur
    And kullanici create new event butonuna tiklar
    And kullanici yeni event olusturdugunu gorur
    And kullanicci eventi siler
    And event bulunamadi yazisini gorur



  Scenario: TC_05 – User should be able to create new event if fills all required fields
  and redirect to dashboard page with create successful message
    Given kullanici formu doldurur
    And kullanici create new event butonuna tiklar
    And kullanici yeni event olusturdugunu gorur


  Scenario: TC_06 – User should be able to edit event. When user click the edit
  button all event fields must be filled according to editing event
    Given kullanici formu doldurur
    And kullanici create new event butonuna tiklar
    And kullanici yeni event olusturdugunu gorur
    And kullanici edit butonuna tiklar




  Scenario: TC_07 – User should be able to update event if required fields filled and
  redirect to dashboard page with update successful message
    Given kullanici formu doldurur
    And kullanici create new event butonuna tiklar
    And kullanici yeni event olusturdugunu gorur
    And kullanici edit butonuna tiklar
    And kullanici eventte degisiklikler yapar
    And kullanici update event butonuna tiklar
    And kullanici edit oldugunu gorur
    And kullanici sayfayi kapatir
