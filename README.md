# Principios-Solid
SOLID es un acrónimo inventado por Robert C.Martin para establecer los cinco principios básicos de la programación orientada a objetos y diseño. Este acrónimo tiene bastante relación con los patrones de diseño, en especial, con la alta cohesión y el bajo acoplamiento.

### ¿Qué son los principios SOLID?

* Principios o convenciones de diseño de Software
* Ampliamente aceptados en la industria
* Código más mantenible y tolerante a cambios
* Aplicables en términos de diseño de clases (micro-diseño), y también a nivel de arquitectura de software y estructura de [micro]servicios (macro-diseño)

## Principio de Responsabilidad Única

* Una clase = Un concepto y responsabilidad
* Una clase debería tener sólo 1 razón para cambiar
* Clases pequeñas con objetivos acotados

## Principio de Abierto/Cerrado

* El Software debería estar abierto a extensión y cerrado a modificación.
* Evitando depender de implementaciones específicas, haciendo uso de clases abstractas o interfaces.
* Facilidad para añadir nuevos Casos de uso en nuestra aplicación.
* Interface -> Cuando desacoplemos entre capas.
* Abstract -> En determinados casos para modelos de dominio.
