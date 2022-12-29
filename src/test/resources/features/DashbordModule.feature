@dashbord
Feature: DashborModule

  Scenario: TC_01 – User should view dashboard if authenticated
    Given kullanici "assessmentUrl" sayfasina gider
    Then kullanici username ve password girer
    Then kullanici login butonuna tiklar
    And kullanici dashboard sayfasinda oldugunu kontrol eder
    And kullanici create event butonuna tiklar
    And kullanici formu gorur


  Scenario: TC_02 – User should redirect to login page if not authenticated
    Given kullanici "assessmentUrl" sayfasina gider
    And kullanici login sayfasinda oldugunu kontrol eder


  Scenario: TC_03  – User should view list of events if any event created otherwise
  user should view notification message states no registered event found
    Given kullanici "assessmentUrl" sayfasina gider
    Then kullanici username ve password girer
    Then kullanici login butonuna tiklar
    And kullanici dashboard sayfasinda oldugunu kontrol eder
    And kullanici create event butonuna tiklar
    And kullanici formu doldurur
    And kullanici create new event butonuna tiklar
    And kullanici yeni event olusturdugunu gorur


  Scenario: TC_04 – User should be able navigate edit event when click the edit
  event button
    Given kullanici "assessmentUrl" sayfasina gider
    Then kullanici username ve password girer
    Then kullanici login butonuna tiklar
    And kullanici dashboard sayfasinda oldugunu kontrol eder
    And kullanici create event butonuna tiklar
    And kullanici formu doldurur
    And kullanici create new event butonuna tiklar
    And kullanici yeni event olusturdugunu gorur
    And kullanici edit butonuna tiklar
    And kullanici edit sayfasinda oldugunu gorur


  Scenario: TC_05 – User should be able to delete event when click the delete
  button
    Given kullanici "assessmentUrl" sayfasina gider
    Then kullanici username ve password girer
    Then kullanici login butonuna tiklar
    And kullanici dashboard sayfasinda oldugunu kontrol eder
    And kullanici create event butonuna tiklar
    And kullanici formu doldurur
    And kullanici create new event butonuna tiklar
    And kullanici yeni event olusturdugunu gorur
    And kullanici delete butonuna tiklar
    And kullanici eventin silindigini gorur


  Scenario: TC_06  – User should be able to view event participants
    Given kullanici "assessmentUrl" sayfasina gider
    Then kullanici username ve password girer
    Then kullanici login butonuna tiklar
    And kullanici dashboard sayfasinda oldugunu kontrol eder
    And kullanici create event butonuna tiklar
    And kullanici formu doldurur
    And kullanici create new event butonuna tiklar
    And kullanici yeni event olusturdugunu gorur
    And kullanici Participants butonuna tiklar
    And kullanici Participants leri gorur
    And kullanici sayfayi kapatir








