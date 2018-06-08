|||
|--|--|
|Nombre:|Profile|
|Autor:|David García Oriol|
|Fecha:|17/05/2018|
|Descripción: |Permite al usuario rellenar su perfil con datos adicionales y cambiar su contraseña.|
|Actores: |Usuario/Cliente|
|Precondiciones: |El usuario debe estar autenticado en el sistema.|
---
**Flujo normal:**
1. El actor rellena su nombre de usuario, nombre real, apellidos, país de residencia y su ciudad.
2. El actor introduce una contraseña nueva en la primera casilla, y la repite en la segunda para cambiarla.
---
**Flujo alternativo:**

2.A. - El actor, a la hora de introducir la contraseña actual, la introduce errónaeamente, no permitiendo continuar con la operación.

---
**Postcondiciones:**
El usuario debe guardar los cambios en sus datos para que sean efectivos.
