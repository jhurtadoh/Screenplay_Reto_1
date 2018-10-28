#Author:jhurtadoh@choucairtesting.com

Feature: Registro de usuario en la página Web Automation Demo Site
  Como usuario
  Quiero ingresar a la página Web Automation Demo Site
  Para realizar el registro en la página

  @registrar
  Scenario Outline: Realizar registro en la página
    Given que Johan quiere acceder a la Web Automation Demo Site
    When el realiza el registro en la página
    |firstName|lastName|address|emailAddress|phone|gender|hobbies1|hobbies2|hobbies3|languages1|languages2|languages3|skills|country|selectCountry|year|month|day|password|confirmPassword|
 		|<firstName>|<lastName>|<address>|<emailAddress>|<phone>|<gender>|<hobbies1>|<hobbies2>|<hobbies3>|<languages1>|<languages2>|<languages3>|<skills>|<country>|<selectCountry>|<year>|<month>|<day>|<password>|<confirmPassword>|
    Then el verifica que se carga la pantalla con texto - Double Click on Edit Icon to EDIT the Table Row.
    Examples:
    |firstName|lastName|address|emailAddress|phone|gender|hobbies1|hobbies2|hobbies3|languages1|languages2|languages3|skills|country|selectCountry|year|month|day|password|confirmPassword|
    ##@externaldata@./src/test/resources/datadriven/dtDatos.xlsx@Datos
   |lucia   |cano   |cra 45a #85-33   |lucy@hot.com   |3201559863   |Female   |Cricket   |Movies   |Hockey   |German   |Italian   |Japanese   |Analytics   |Germany   |Japan   |1990   |July   |31   |Abc123   |Abc123|

    
