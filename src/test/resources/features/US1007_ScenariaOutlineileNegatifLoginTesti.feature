Feature: US1007 liste olarak verilen kullanici adi ve sifrelerle giris yapilmadigini test edin


  Scenario Outline: TC11 qualiftdemy sayfasina yanlis bilgilerle giri yapilamaz

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk login linkine tiklar
    And username kutusuna examples'dan "<gecersizEmail"> yazar
    And password kutusuna examples'dan "<gecersizPassword>" yazar
    Then 2 saniye bekler
    And login butonuna basar
    Then basarili giris yapilamadigini test eder
    And sayfayi kapatir
    Examples:
    |gecesizEmail | gecersizPassword|
    |Suha         |12345            |
    |Mustafa      |25487            |
    |merve        |98745            |
    |Nergiz       |03254            |
