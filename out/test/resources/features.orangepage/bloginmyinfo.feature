Feature:Pruebas en la plataforma de Orange
  como probador de automatizacion
  necesito poner en practica las pruebas de automatizacion usando ScreenPlay
  para aprender sobre el marco BDD serenity

  Scenario Outline: Actualizar la informacion del usuario
    Given el empleado se encuentra en la sesion personal details de la plataforma
    When el empleado llene los campos requeridos
    And presione el boton save
      |firstName|<firstName>|
      |middleName|<middleName>|
      |lastName|<lastName>|
      |otherId|<otherId>|
      |numberLicense|<numberLicense>|
      |dateLicense|<dateLicense>|
      |ssNumber|<ssNumber>|
      |sinNumber|<sinNumber>|
      |gender   |<gender>|
      |maritialStatus|<maritialStatus>|
      |nationality|<nationality>|
      |dateBirthday|<dateBirthday>|
      |nickName|<nickName>|
      |militayService|<militayService>|

    Then el sistema guardara los cambios realizados
    Examples:
      |firstName|middleName|lastName|otherId|numberLicense|dateLicense |ssNumber|sinNumber|gender|maritialStatus|nationality|dateBirthday|nickName|militayService|
      |Carlos   |Lucas     |Zapata  |123    |12           |2021-09-13  |13      |14       |Male  |Single        |Colombian  |1988-09-12  |Luca    |89          |


