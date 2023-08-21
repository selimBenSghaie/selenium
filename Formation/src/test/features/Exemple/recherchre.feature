
@tag
Feature: recherche google
  je veux rechercher via google

  @tag1
  Scenario: recherche pays
    Given ouvrir nnavigateur
    And ouvir url de google "https://www.google.com/"
    When saisir le mot "Algerie"
    And cliquer sur entre
    Then verifier que la phrase contient le mot "Environ"
    

