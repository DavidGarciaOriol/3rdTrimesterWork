|||
|--|--|
|Nombre:|Log-In|
|Autor:|Miguel Ángel Valiente Vázquez|
|Fecha:|15/05/2018|
|Descripción: |Permite al cliente identificarse mediante su nombre de usuario|
|Actores: |Usuario/Cliente|
|Precondiciones: |El usuario debe haberse registrado en la página de COIN$TRACKER.|
---
**Flujo normal:**
1. El pulsa la opción Log In en la parte superior derecha de la página.
2. El actor introduce su nombre de usuario/correo electrónico y su contraseña.
3. El actor pulsa el botón que pone Login.
4. El sistema comprueba que ambos datos son correctos.
5. El sistema inicia la sesión del usuario.
---
**Flujo alternativo:**

4.A. Si los datos introducidos no son correctos el sistema informará de que los

---
**Postcondiciones:**
El usuario debe estar activo durante la sesión, si esta durante 15/20 minutos sin realizar ninguna petición este será desconectado por el sistema.
