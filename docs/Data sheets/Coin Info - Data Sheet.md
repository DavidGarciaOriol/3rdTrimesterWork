|||
|--|--|
|Nombre:|Ver información criptomonedas|
|Autor:|Miguel Ángel Valiente Vázquez|
|Fecha:|15/05/2018|
|Descripción: |El usuario podrá ver la información de las criptomonedas como la
historia de esta y otros datos|
|Actores: |Usuario/BBDD|
|Precondiciones: |El usuario debe tener una cuenta en la página.|
---
**Flujo normal:**
1. El usuario selecciona una moneda para ver su información.
2. La BBDD recibe la petición del usuario.
3. La BBDD devuelve los datos de la moneda seleccionada.
4. El usuario recibe la información.
---
**Flujo alternativo:**

3.A. Si los datos de la moneda están siendo modificados por un
Administrador, la BBDD mostrará un mensaje para que el 
Usuario lo intente en unos minutos.


---
**Postcondiciones:**
El usuario verá los datos de la criptomoneda seleccionada.
