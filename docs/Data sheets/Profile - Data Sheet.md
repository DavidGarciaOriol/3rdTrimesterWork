|||
|--|--|
|Nombre:|Profile|
|Autor:|David|
|Fecha:|17/05/2018|
|Descripción: Permite al usuario rellenar su perfil con datos adicionales y cambiar su contraseña.|
|Actores: Usuario/Cliente|
|Precondiciones: El usuario debe estar autenticado en el sistema.|
---
**Flujo normal:**
1. El actor rellena su nombre de usuario, nombre real, apellidos, país de residencia y su ciudad.
2. El actor introduce una contraseña nueva en la primera casilla, y la repite en la segunda para cambiarla.
---
**Flujo alternativo:**

2.A. - El actor, a la hora de repetir la nueva contraseña, introduce una que no coincide con la del primer campo.

---
**Precondiciones:**
La introducción de datos de usuario así como el cambio de contraseña solo serán posibles tras el usuario acceder al perfil de su cuenta ya creada y autenticada.
