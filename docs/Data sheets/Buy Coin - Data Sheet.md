|||
|--|--|
|Nombre:|Comprar monedas|
|Autor:|Luis Adame|
|Fecha:|17/05/2018|
|Descripción: Permite la compra de una moneda y añadirla a la cartera.|
|Actores: Usuario/Cliente|
|Precondiciones: El usuario debe estar autenticado en el sistema.|
---
**Flujo normal:**
1. El actor selecciona la cripto moneda que quiere comprar.
2. El actor selecciona la moneda física con la que quiere comprar.
3. El actor introduce la cantidad de cripto monedas que quiere comprar.
4. El actor visualiza cuantas monedas físicas equivaldrían la cantidad de cripto monedas introducidas anteriormente.
5. El actor visualiza el precio final (monedas físicas + un 2%).
6. El actor presiona el boton de comprar para realizar la transacción. 
---
**Flujo alternativo:**

3.A. - El actor introduce la cantidad de monedas físicas que quiere gastar.
4.A. - El actor visualiza cuantas cripto monedas equivaldrían la cantidad de monedas físicas introducidas.

---
**Poscondiciones:**
La transacción se realiza recogiendo los datos de pagos relacionas con la cuenta autenticada y las criptomonedas se añaden a la cartera del usuario.