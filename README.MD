# Actividades

**i. Identifique las clases y lo que éstas representan. Luego, establezca una descripción 
textual breve del contexto problema.**
A partir del codigo se pueden identificar dos clases:
1. Calculadora: El proposito de esta clase es encapsular dos numeros(n1 y n2) y realizar
operaciones aritmeticas como sumar y multiplicar.
2. CarroCompra: Esta clase representa a un carrito de compra. Almacena una coleccion de productos, 
donde guarda una cantidad(0) y un precio (1) de 5 articulos. Su funcion principal es calcular el
costo total de estos productos y mostrarlo.

**Descripcion del contexto del problema:**
El sistema modela un `CarroCompra` que necesita calcular el costo total de los productos que 
almacena. Para determinar el subtotal de cada producto multiplica su cantidad por su precio, 
asi el `CarroCompra` utiliza los servicios de un objeto `Calculadora`.


**ii. Analice los atributos y métodos de cada clase, luego, identifique las relaciones existentes
entre las clases identificadas y establezca una descripción textual breve del contexto 
problema.**
La relacion existente entre las clases es "Uso". Se identifica esta relacion porque la clase 
`CarroCompra`, para poder ejecutar su metodo `subTotal(int cant, int precio)`, necesita crear una
instancia de `Calculadora`. Esta instancia de `Calculadora` no se guarda como un atributo en 
`CarroCompra`, solo se usa temporalmente dentro de ese metodo para llamar a `calc.multiplicar()`.

Por lo tanto la descripcion textual seria: La clase `CarroCompra` depende de la clase `Calculadora`
porque necesita utilizar su funcionalidad (especificamente el metodo `multiplicar()`) para poder
completar su propia operacion de calcular el subtotal de un producto.


iii. De lo anterior, establezca una representación detallada del código fuente, usando un diagrama de clases UML y la herramienta de modelado Visual Paradigm.

iv. Genere un código fuente Java a partir de su modelo de clases, de forma automática.