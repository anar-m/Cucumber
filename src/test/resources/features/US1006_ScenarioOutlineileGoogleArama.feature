Feature: US1006 verilen listedeki urunleri google'da arama
  # veriilen lsitedeki her urunu google'da aratıp
  # arama sonuclarının aranan urun ismini içerdiğini test edin

  @wip
  Scenario Outline: TC10 google'da listedeki urunler aratilabilmeli

    Given kullanici "googleUrl" anasayfaya gider
    Then google'da "<istenenKelieme>" icin arama yapar
    And google arama sonuclarinin "istenenKelime" icerdigini test eder
    And sayfayi kapatir

    Examples:
      | istenenKelieme |
      |Nutella         |
      |Java            |
      |Apple           |
      |Samsung         |
      |Wisequaeter     |
