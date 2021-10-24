Feature: Pruebas en el login de la plataforma
  como empleado de recursos humanos
  necesito loguearme a la plataforma orangeHRM
  para realizar la gestión adecuada de recursos humanos de la empresa

  Background:
    Given el empleado se encuentra en la pagina login de la plataforma
  @ignore
  Scenario: inicio de sesion exitoso
    When el empleado ingrese contraseña y usuario valido
    Then el sistema deberá mostrar un mensaje de Welcome con el nombre del usuario
  @ignore
  Scenario: inicio de sesion usuario invalido
    When el empleado ingrese contraseña valida y usuario invalido
    Then el sistema deberá mostrar un mensaje de invalid credentials
  @ignore
  Scenario: inicio de sesion password invalido
    When el empleado ingrese contraseña invalida y usuario valido
    Then el sistema deberá mostrar un mensaje de error
  @ignore
  Scenario: inicio de sesion no se introducen credenciales
    When el empleado no introduce el UserName ni el Password
    Then el sistema deberá mostrar un mensaje de Username cannot be empty

