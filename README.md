# Algo que Pedir — Backend

[![Build](https://github.com/algo3-unsam/proyecto-base-tp/actions/workflows/build.yml/badge.svg)](https://github.com/algo3-unsam/tp-recetas-2020-gr-xx/actions/workflows/build.yml) ![Coverage](./.github/badges/jacoco.svg)

Este proyecto corresponde al backend de la aplicación **Algo que Pedir**, desarrollado en **Kotlin** con **Spring Boot**. Implementa una arquitectura REST completa, con controllers, servicios y repositorios, además de un conjunto de tests unitarios, de integración y end-to-end.

## Tecnologías principales

El backend está construido utilizando:

* **Kotlin**
* **Spring Boot**
* **Spring Web** para la definición de endpoints REST
* **Jackson** para serialización y deserialización JSON
* **JUnit 5** para tests unitarios e integración
* **Tests E2E** utilizando clientes HTTP reales
* **JaCoCo** para métricas de cobertura
* **Gradle (Kotlin DSL)** como herramienta de build
* **JDK 21**
* **Bootstrap** (solo para vistas mínimas utilizadas durante debugging o interfaces administrativas simples)

---

## Arquitectura

El proyecto implementa una arquitectura organizada en capas:

* **Controller**
  Expone endpoints REST, maneja requests y respuestas HTTP.

* **Service**
  Contiene la lógica de negocio de la aplicación.

* **Repository**
  Gestiona los datos en memoria o persistencia (dependiendo de la implementación utilizada durante el TP).

* **Domain**
  Modelos, entidades y lógica interna asociada.

Esta estructura permite mantener un backend modular, escalable y fácil de testear.

---

## Tests

El proyecto incluye distintos tipos de pruebas:

### Tests unitarios

Validan el comportamiento de clases individuales y lógica de negocio.

### Tests de integración

Ejecutan el contexto de Spring e interactúan con los servicios y repositorios reales para asegurar el correcto funcionamiento del sistema completo.

### Tests end-to-end (E2E)

Simulan el uso real de la API mediante solicitudes HTTP al servidor levantado.

JaCoCo genera automáticamente el reporte de cobertura de código.

---

## Ejecución del proyecto

Para iniciar el servidor:

```bash
./gradlew bootRun
```

El servidor se inicia en:

```
http://localhost:9000
```

---

## Estructura del repositorio

Dentro de `src/main/kotlin` encontrarás:

* `controller/` — Controladores REST
* `service/` — Lógica de negocio
* `repository/` — Repositorios
* `domain/` — Entidades y modelos
* `config/` — Configuraciones de Spring (si aplica)

Dentro de `src/test/kotlin` encontrarás:

* Tests unitarios
* Tests de integración
* Tests E2E

---

## Adaptación y uso

Este backend está diseñado para integrarse con los frontends desarrollados para:

* **Usuarios** (React + Vite)
* **Locales** (Svelte)

Ambas aplicaciones consumen los endpoints expuestos aquí mediante HTTP y JSON.
