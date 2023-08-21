
@tag
Feature: Authentification
  en tant que admin je souhaite me connecter

  @tag1
  Scenario: Authentification valide
    Given ouvrir le navigateur
    And saisir URL
    When saisir username
    And saisir mdp
    And cliquer sur le bouton
    Then verifier le nom du profil


