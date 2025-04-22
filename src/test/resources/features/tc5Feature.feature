Feature: Verificación de seguridad

  Scenario: Verificar acceso basado en rol de usuario
    Given el usuario está en la página de inicio de sesión
    When el usuario intenta acceder a una sección segura
    Then el sistema verifica el rol del usuario
    And el acceso es denegado o permitido según el rol del usuario