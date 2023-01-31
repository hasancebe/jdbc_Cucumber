

Feature: DB

@t1
  Scenario Outline: Id find Test

    Given Database baglantisi kurulur.
    Given Students tablosundaki "secondName" ler yazdırılır.
    Given Students tablosundaki "id" ler yazdırılır.
    Given Gelen listede "<id>"  dogrulanir.
    Then Database baglantisikapatilir.

    Examples:
    |id   |
    |456  |
    |769  |
    |741  |

@t1
Scenario Outline: güncellme testi

    Given Database baglantisi kurulur.
  And "<id>" numarasi verilen studentin "<city>" güncellenir.
  And  Students tablosundaki city ler yazdırılır.
  And "<city>" guncellendigi dogrulanir.
  Then Database baglantisikapatilir.

  Examples:
    |id   |   |city|
    |456  |   |ordu |
    |769  |   |erzincan|
    |985  |   |sivas|