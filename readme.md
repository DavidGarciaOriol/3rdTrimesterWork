# Coin$Tracker

## Integrantes

- *David García* 
- *Miguel Valiente*
- *Luis Adame*

## ¿En qué consiste?

Con esta aplicación, síguele siempre el rastro de precio
a las **criptomonedas.** Comparamos estadísticamente la **devaluación y auge** de las
monedas como _Bitcoin, Ripple, Litecoin, Dash..._
Además, nuestro sofisticado sistema puede seguirles la pista en **tiempo real.**
También podrás **calcular valores** de una moneda respecto a otra.

## Herramientas Usadas

 - **MockFlow.**  Sencillo de usar y gran variedad de elementos. Limita la cantidad de proyectos para usuarios gratuitos a uno, pero no resulta un inconveniente como tal en este trabajo.
 - **MarkDownPad 2.**  Diseño sencillo, fluído y fácil de comparar lo escrito en Markdown con el resultado final en tiempo real.
 - **Dia Diagram.** Estamos familiarizados con él por su anterior uso en BBDD. Tenemos cierta experiencia usándolo y nos resulta cómodo y rápido.

## MockUps

### Página Principal.
![Main](https://cdn.discordapp.com/attachments/382291738728988675/439443471225454612/Main_Page.jpg)

### Página de Registro.
![Log/Sign-In](https://cdn.discordapp.com/attachments/382291738728988675/439443464464367616/Login_In.jpg)

### Página de Estadísticas de la Moneda.
![CStats](https://cdn.discordapp.com/attachments/382291738728988675/439443470751367189/Coins_Stats.jpg)

### Página de Compra.
![Buy](https://cdn.discordapp.com/attachments/382291738728988675/439443475096928256/Buy_Menu.jpg)

### Página de Perfil de Usuario.
![UserProfile](https://cdn.discordapp.com/attachments/382291738728988675/439443474241159176/Profile_Management.jpg)

### Página de Información de la Moneda.
![CInfo](https://cdn.discordapp.com/attachments/382291738728988675/439443476514603018/Coins_Info.jpg)

 - Arriba un selector de monedas, una barra de búsqueda, un FAQ...
 - En la gráfica del centro, se puede ver la fluctuación de la moneda cada pocos segundos en tiempo real.
 - A la derecha, un conversor de valores entre monedas.
 - Se ha elegido este diseño porque es intuitivo y fácil de usar por el usuario, a pesar de ser un diseño simple cumple 
    con sus objetivos y es eficiente.

## Diagrama de clases

![Classes diagram](docs/Classes_Diagrams/coinstracker_uml.png)

### Desglose de clases

- **User**: es la clase de la que heredan las clases Admin y Client.
  - Atributos:
    - name: es el nombre real de la persona.
    - username: es el nombre que se vería en la web y usaría para el log in.
    - id: es un identificador para el usuario, compuesto por 32 dígitos hexadecimales divididos en 4 grupos seraparados por guiones. Se expresa de la siguiente manera: 550e8400-e29b-41d4-a716-446655440000.
    - email: es el email del usuario con el que tambien podría acceder en el log in.
  - Métodos:
    - touch():
    - save():

- **Admin**: son los administradores de la web.
	- Atributos: heredados de User.
	- Métodos: 
		- ban(user:User): banea a un usuario.

- **Client**: son los clientes de la web.
	- Atributos:
		- wallet: es la cartera del usuario que contendría sus criptomonedas.
		- network: la red por donde circulan las criptomonedas. 
	- Métodos: 
		- transfer(to:Client): llama al metodo makeTransfer(user:User) de la clase wallet para que cree una nueva transacción.     

- **Coin**: es una clase abstracta de la que heradan las clases MonedaFisica y Criptomoneda(Cambiar nombres).
	- Atributos:
  		- name: es el nombre completo de la moneda. Ej: Bitcoin.
  		- shortname: son las siglas por las que se reconoce la moneda. Ej: BTC.
  		- id: es un identificador propio de la moneda y sigue el mismo patrón que el id del User.
  		- network: la red por donde circulan las criptomonedas.
  	- Métodos:
  		- buy(): método para comprar monedas.
  		- exchange(): método para cambiar monedas por otras.
  		- transfer(user:User): método para intercambiar monedas con otros usuarios.

- **Wallet**: es el monedero del usuario, a cada usuario se le asigna un monedero cuando crea su perfil.
	- Atributos:
		- balance: es el balance de monedas que el usuario posee.
		- owner: el el dueño de la cartera.
		- payments: es un array en el que se guardan todos los pagos/transacciones realizadas con esa cartera.
		- fee: es la tarifa de conversión entre monedas.
	- Métodos:
		- makeTransfer(user:User): crea una nueva transacción.

- **Exchange**: son los intercambios que se llevan acabo a la hora de convertir una moneda en otra.
	- Atributos:
		- from: es el tipo de moneda que se desea cambiar.
		- to: es el tipo de moneda al que se desea cambiar.
	- Métodos:
		- calcFees(from:Coin,to:Coin): calcula la tarifa de conversión de monedas.
		- calcValue(from:Coin,to:Coin): calcula el valor final de la conversión.
		- getExchange(from:Coin,to:Coin): getter del intercambio.

- **Transaction**: son los intercambios que se realizan entre usuarios.
	- Atributos: 
		- from: es el usuario que ha iniciado la transacción.
		- to: es el usuario al que se le ha ofrecido la transacción.
		- createAt: es la fecha en la que se ha creado la transacción.
		- quantity: es la cantidad que se va a intercambiar.
	- Métodos:
		- calcFees(from:Coin,to:Coin):calcula la tarifa de conversión de monedas.
		- transfer(): método que realiza la transacción.

## Diagrama de objetos

![Objects Diagram](docs/Objects_Diagram/CoinStracker.png)


## CMS(Content Management System)
Hemos elegido Wordpress para realizar el blog para la página web.
Este cms tiene muchas ventajas para hacer un blog pero las principales por las que lo hemos elegido son:
- Eres el legitimo propietario del blog, es decir, puedes hacer lo que quieras con él, incluso llegar a venderlo. Otros cms no te dan esta opción y aunque tú puedas modificar el blog o la web éstos no son de tu propiedad.
- Tiene buen posicionamiento en buscadores.
- Tiene un gran catálogo de plugins de todo tipo.
- Es 100% responsive. Ésta es de las más importantes ya que amplía nuestro espectro de clientes no solo en PC, sino también en otros dispositivos.

## Conjunto de tecnologías elegidas

### Backend
|Tecnología|Descripción|
|--|--|
|[Docker](https://www.docker.com/)|Ayuda al mantenimiento de la aplicación y despliegue|
|[Laravel](https://laravel.com/)|PHP framework, será el nucleo de la aplicación, manejará usuarios, base de datos, etc... Laravel está basado en PHP que es un lenguaje diseñado para la web. Con la salida de la séptima version de php su rendimiento a mejorado muchísimo y se puede mejorar aún más con ciertas extensiones.|
|[Swoole](https://www.swoole.co.uk/)|Extensión de php que permitirá crear websockets directamente en php y transmitir datos en tiempo real. Mejora el rendimiento de php.|
|[PostgreSQL](http://postgresql.org/)|Base de datos. Tiene un mejor soporte del tipo de datos JSON sobre MySQL/MariaDB, y esta aplicación va a tratar mucho este tipo de datos. Tiene un mejor rendimiento.|
|[Redis](https://redis.io/)|Permite cachear datos eficientemente y envío de mensajes|
|[AWS S3](https://aws.amazon.com/s3/)|Servirá como cdn para transmitir los recursos estáticos más rápido|

### Frontend
|Tecnología|Descripción|
|--|--|
|HTML|Lenguage de marcado por defecto para la web|
|CSS|Diseño|
|[SCSS](http://sass-lang.com/)|Preprocesador de css que nos permitirá modularizar el css, crear funciones, usar bucles y funcionalidades muy útiles|
|[Webpack](https://webpack.js.org/)|Empaqueta los recursos estáticos, compila scss, corre los tests automaticamente, minimiza los archivos, etc...|
|[Vue.JS](https://vuejs.org)|JS Framework, nos permite realizar vistas dinamicas, resuelve problemas de compatibilidad entre navegadores. Se usaría para obtener los datos del backend proporcionados por su api. Vue es un framework con mucha comunidad, permite la modularización de las vistas y tiene muy buen rendimiento.|
|[Karma](http://karma-runner.github.io)|Test runner, realizaría todos los tests, fácil de integrar con vue y webpack. Vue recomienda karma.|
|[Mocha](https://mochajs.org/)|Test framework, fácil de integrar con karma. Con gran comunidad que lo apoya.|
|[Git](https://git-scm.com/)|Sistema de control de versiones para poder mantener un historial de cambios, organizar nuevas propuestas y bugs y mejora el trabajo colaborativo.|
|[Yarn](http://yarnpkg.com/)|Gestor de paquetes, permite añadir dependencias al proyecto más fácilmente, actualizarlas, etc.|
|[Babel](https://babeljs.io/)|Compilador de Javascript que asegura el correcto funcionamiento de las últimas funcionalidades de javascript en navegadores más antiguos.|
|[Lighthouse](https://github.com/GoogleChrome/lighthouse)|Analiza la aplicación web y recoje estadísticas del rendimiento y del uso de buenas prácticas.|
|[Tailwind](https://tailwindcss.com/)|CSS Framework que permite un desarrollo más ágil.|
|[Pug](https://pugjs.org/api/getting-started.html)|Template Engine|

![befemvc](docs/Backend_frontend_tools/mvc.jpg)

## Diagramas de casos de uso
### Página principal
![Diagrama de caso de uso de la página principal](docs/UC%20Diagrams/UC%20-%20Página%20principal.jpeg)
### Commerce
![Diagrma de caso de uso para la página commerce](docs/UC%20Diagrams/UC%20-%20Commerce.jpg)
### Profile
![Diagrma de caso de uso para la página profile](docs/UC%20Diagrams/UC%20-%20Profile.jpg)
### Coin Stats
![Diagrma de caso de uso para la página coinstats](docs/UC%20Diagrams/UC%20-%20CoinStats.jpg)
### Log-In
![Diagrma de caso de uso para la página login](docs/UC%20Diagrams/UC%20-%20LogIn.png)
### Coin Info
![Diagrma de caso de uso para la página coininfo](docs/UC%20Diagrams/UC%20-%20Coin%20Info.png)

## Diagramas de Flujo de Actividad.
### Profile
![Diagrama de Actividad de la Página de Perfil de Usuario](docs/Activity_Diagrams/Profile_Act_Diagram.png)

## Fichas técnicas de casos de uso
- [Ficha para la conversión de monedas en la página principal](docs/Data%20sheets/Coin%20converter%20-%20Data%20sheet.md)
- [Ficha para la compra de monedas en la página commerce](docs/Data%20Sheets/Buy%20Coin%20-%20Data%20Sheet.md)
- [Ficha para la compra de monedas en la página coininfo](docs/Data%20Sheets/Coin%20Info%20-%20Data%20Sheet.md)
- [Ficha para la compra de monedas en la página login](docs/Data%20Sheets/LogIn%20-%20Data%20Sheet.md)
- [Ficha para la compra de monedas en la página profile](docs/Data%20Sheets/Profile%20-%20Data%20Sheet.md)

## Bibliografía
 -  [MarkDownPad 2](http://markdownpad.com/) y [Typora](https://typora.io)
 -  [MockFlow](https://www.mockflow.com/)
 -  [.gitignore](http://aprendegit.com/tag/gitignore/)
 -	[Draw.io](https://www.draw.io): realización de los diagramas de casos de uso.
