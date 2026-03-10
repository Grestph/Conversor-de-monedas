# 💱 Conversor de Monedas en Java

## 📌 Descripción

Este proyecto es un **conversor de monedas desarrollado en Java** que permite obtener tasas de cambio en tiempo real mediante el consumo de una API de tipos de cambio.

El programa consulta la API de ExchangeRate para obtener datos actualizados y realiza conversiones entre diferentes monedas.

Este proyecto fue desarrollado como parte del **Challenge Conversor de Monedas del programa Oracle Next Education (ONE)**.

---

## 🚀 Funcionalidades

El programa permite convertir entre las siguientes monedas:

* USD → ARS (Dólar a Peso argentino)
* ARS → USD
* USD → BRL (Dólar a Real brasileño)
* BRL → USD
* USD → COP (Dólar a Peso colombiano)
* COP → USD
* USD → PEN (Dólar a Sol peruano)
* PEN → USD

---

## 🛠️ Tecnologías utilizadas

* Java
* HttpClient
* Gson
* API de ExchangeRate

---

## ⚙️ Funcionamiento del programa

1. El usuario ejecuta la aplicación.
2. Se muestra un menú con las opciones de conversión disponibles.
3. El usuario selecciona una moneda de origen y destino.
4. Se ingresa la cantidad a convertir.
5. El programa consulta la API para obtener el tipo de cambio.
6. Se procesa la respuesta en formato JSON.
7. Se muestra el resultado de la conversión.
8. Se puede usar opciones como historial de conversiones
9. Si esta todo concluido, se usa la opcion salir

---

## 📂 Estructura del proyecto

```
src
 ├ ConsultaApi.java
 ├ Conversion.java
 ├ ConversordemonedasApp.java
 └ Moneda.java
```

**Descripción de las clases:**
* `ConsultaApi` → Realiza las solicitudes HTTP a la API de tasas de cambio.
* `Conversion` → Maneja la información de cada conversión realizada.
* `ConversordemonedasApp` → Clase principal con el menú interactivo.
* `Moneda` → Representa la respuesta JSON recibida de la API.
.

---

## 📊 Ejemplo de uso

```
Sea bienvenido al conversor de monedas

1) Dólar → Peso argentino
2) Peso argentino → Dólar
3) Dólar → Real brasileño
4) Real brasileño → Dólar
5) Dólar → Peso colombiano
6) Peso colombiano → Dólar
7) Sol Peruano → Dólar
8) Dólar → Sol Peruano
9) Historial de conversiones
10) Salir

Ingrese el valor que deseas convertir:
100

Tipo de cambio: 850.25
Resultado: 85025 ARS
```

---

## 📡 API utilizada

El proyecto utiliza la API:

ExchangeRate API

Esta API proporciona tasas de cambio actualizadas entre diferentes monedas.

---

## 👨‍💻 Autor

Proyecto desarrollado por Grecia Sanchez
Programa **Oracle Next Education (ONE)**

---
