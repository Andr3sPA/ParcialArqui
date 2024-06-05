# Una API Básica para consultar el clima

## Descripción

Esta API tiene las siguientes funcionalidades:

- Obtener clima de una ciudad según su nombre y país
- Actualizar el clima de una ciudad según su nombre
- Operaciones CRUD para ciudades y climas en formato HATEOAS

> El backend se encuentra desplegado usando [supabase](https://supabase.com) como base de datos
> en la siguiente instancia de AWS [EC2](http://ec2-3-15-171-131.us-east-2.compute.amazonaws.com/swagger-ui/index.html#/).

## Requisitos para compilar y ejecutar

Para compilar y ejecutar es necesario contar con:

- [Maven](https://maven.apache.org/) para el manejo de las dependencias
- [Java OpenJDK](https://openjdk.org/) >= 17

Luego de configurar todo correctamente se pueden correr los siguientes comandos:

- Para ejecutar directamente

```console
mvn spring-boot:run
```

- Para compilar y enpaquetar

```console
mvn package -DskipTests
```
