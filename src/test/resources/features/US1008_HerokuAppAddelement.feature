Feature: US1008 Kullanici herekuapp sayfasında beklemeleri yapar

  Scenario: TC12 kullanici bekleme islemlerini yapar

    Given kullanici "herokuappUrl" anasayfaya gider
    When Add Element butona basar
    And Delete butonu gorunur oluncaya kadar bekler
    Then Delete butonunun gorunur oldugunu test eder
    And Delete butonuna basarak butonu siler
    And Delete butonunun gorunmedigini test eder
    And sayfayi kapatir