Feature: Octavo Caso de Prueba

  Scenario: Simular entrada Z y validar mensaje
    Given I am on the Z entry page
    When I simulate the Z entry
    Then I should see an error or confirmation message