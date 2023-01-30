Feature: DB
  @t2
  Scenario Outline: Companies Test

    Given Database baglantisi kurulur.
    And "Companies" tablosunun biligileri yazdirilir
    And "Companies" tablosundaki "company_name" tablosu yazdirilir.
    And "numberof_person" tablosunda personel sayisinin 100 den fazla oldugu test edilir
    And "<marka>" companylerin oldugu kontrol edilir.
    And Company idsi 1200 den fazla olan companyler yazdırılır
    Then Database baglantisikapatilir.
    Examples:
      |marka |
      |Honda  |
      |Toyota |
      |Ford   |
