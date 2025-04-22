Feature: Noveno Caso de Prueba - Proceso de actualización

  Scenario: Verificar el proceso de actualización
    Given the system is ready for an update
    When the update process is initiated
    Then the system should be updated correctly