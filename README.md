---
# Definiciones de Verbos HTTP

## GET
El verbo HTTP GET se utiliza para solicitar datos de un servidor. Este método recupera información y no tiene efectos secundarios en el servidor, es decir, no modifica el estado del recurso solicitado. Las solicitudes GET pueden ser almacenadas en caché y se pueden ver en el historial del navegador.

## POST
El verbo HTTP POST se utiliza para enviar datos al servidor para crear o actualizar un recurso. A diferencia de GET, POST puede modificar el estado del servidor o crear nuevos recursos. Los datos enviados a través de POST no son visibles en la URL y no se almacenan en caché de la misma manera que GET.

## DELETE
El verbo HTTP DELETE se utiliza para solicitar la eliminación de un recurso específico en el servidor. Al enviar una solicitud DELETE, se espera que el servidor elimine el recurso indicado en la URL. Este método debe ser idempotente, lo que significa que realizar la misma solicitud varias veces no debería tener efectos adicionales después de la primera eliminación.

## PATCH
El verbo HTTP PATCH se utiliza para aplicar modificaciones parciales a un recurso existente en el servidor. A diferencia de PUT, que reemplaza el recurso completo, PATCH solo actualiza los campos especificados en la solicitud. Este método permite realizar cambios específicos sin necesidad de enviar el recurso completo.

## PUT
El verbo HTTP PUT se utiliza para actualizar o reemplazar un recurso existente en el servidor. Si el recurso no existe, PUT puede crear uno nuevo en la ubicación especificada. Este método es idempotente, lo que significa que realizar la misma solicitud varias veces produce el mismo resultado sin efectos adicionales.

## HEAD
El verbo HTTP HEAD es similar a GET, pero solicita solo los encabezados de respuesta sin el cuerpo del mensaje. Se utiliza principalmente para obtener metadatos sobre un recurso, como la longitud del contenido o la última modificación, sin descargar el recurso completo. Esto puede ser útil para verificar la existencia de un recurso o para comprobar si ha cambiado.

---

# Anotaciones de Spring Boot Utilizadas en Este Proyecto

## @RestController
`@RestController` es una anotación que se utiliza para definir un controlador web en una aplicación Spring. Indica que la clase manejará solicitudes HTTP y devolverá los datos directamente en el cuerpo de la respuesta, generalmente en formato JSON o XML.

## @RequestMapping
`@RequestMapping` es una anotación utilizada para mapear solicitudes web a métodos específicos en un controlador. Permite definir la ruta (URL) y los métodos HTTP (GET, POST, etc.) que se aplican a la clase o al método anotado.

## @Autowired
`@Autowired` es una anotación que se utiliza para la inyección automática de dependencias en Spring. Permite que Spring gestione la creación e inyección de beans (objetos gestionados por Spring) en otros beans, facilitando así la gestión de dependencias en la aplicación.

---
# Método toString y Etiqueta @Override

## Método toString()

Este método es una sobrescritura de la función `toString()` de la clase `Object`. Su propósito es proporcionar una representación en forma de cadena (string) de un objeto de la clase `GroceryItem`. La implementación personalizada concatena los atributos del objeto (id, name, quantity y category) en un formato legible, lo que facilita la visualización y depuración del estado del objeto cuando se imprime o se registra en la consola.

## Etiqueta @Override

La etiqueta `@Override` indica que este método está reemplazando una implementación de un método de la clase padre (en este caso, la clase `Object`). Esto permite que el compilador verifique que realmente se está sobrescribiendo un método existente, ayudando a evitar errores y mejorando la claridad del código.

---
