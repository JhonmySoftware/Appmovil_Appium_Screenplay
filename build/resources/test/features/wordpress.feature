#Autor: Jhon Quiñones Arboleda
#language: es

@Requerimiento01
Característica: Autenticacion en la aplicacion Wordpress
Y Cuando se autentique en la aplicacion verificar las credenciales

  @Caso01
  Escenario: Autenticacion en la app Wordpress
    Dado que jhon ingresa a la aplicacion Wordpress
    Cuando Se logue con el usuario y contrasenia asignado
    Entonces Verifica el login correcto a la app