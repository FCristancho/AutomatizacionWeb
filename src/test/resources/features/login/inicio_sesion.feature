# language: es

Característica: Inicio de sesion exitoso
  Yo como analista de negocio necesito iniciar sesion
  en el sitio web con mis credenciales de acceso

  Escenario: Iniciar sesion exitosamente
    Dado que Sergey tiene una cuenta activa
    Cuando el envia sus credenciales validas
    Entonces deberia tener acceso para manejar su cuenta