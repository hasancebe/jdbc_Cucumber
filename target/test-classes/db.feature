

Feature: DB

@t1
  Scenario Outline: Id find Test

    Given Database baglantisi kurulur.
    Given Students tablosundaki "secondName" ler yazdırılır.
    Given Glen listede "<Id>"  nolu student kontrol edilir
    Then Database baglantisikapatilir.

    Examples:
    |Id   |
    |456  |
