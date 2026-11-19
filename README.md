<div align="center">

# 📊 APE 6 · Arreglos en Java (Primera Parte)

**Tres programas, un solo objetivo: dominar los arreglos unidimensionales** 🚀

![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk&logoColor=white)
![Tema](https://img.shields.io/badge/Tema-Arreglos-blue)
![Estado](https://img.shields.io/badge/Estado-Completado-brightgreen)
![Licencia](https://img.shields.io/badge/Licencia-MIT-lightgrey)

</div>

---

## 📖 Descripción

Este repositorio contiene la **primera parte de la guía APE 6**: tres ejercicios en Java que ponen en práctica el uso de **arreglos**, **recorridos con ciclos**, **acumuladores**, **contadores**, **condicionales** y **formateo de salida**.

Cada ejercicio parte de un problema de la vida real (gastos, producción y notas) para que la lógica tenga sentido y no sea solo "sumar números porque sí" 😅.

---

## 🗂️ Contenido

| # | Ejercicio | Tipo de arreglo | Conceptos clave |
|---|-----------|-----------------|-----------------|
| 1 | 💸 [Control de gastos semanales y ajuste por inflación](#1--control-de-gastos-semanales-y-ajuste-por-inflación) | `double[]` | Suma, promedio, modificación condicional, recorrido inverso |
| 2 | 🏭 [Filtro y suma condicionada de producción](#2--filtro-y-suma-condicionada-de-producción) | `int[]` | Índices pares, condiciones compuestas, formato a 2 decimales |
| 3 | 🎓 [Análisis de asistencia y rendimiento](#3--análisis-de-asistencia-y-rendimiento) | `int[]` | Tamaño dinámico, validación, división no entera, listados |

---

## 1 · 💸 Control de gastos semanales y ajuste por inflación

El programa registra los gastos de **7 días** en un `double[]` y luego:

- ✅ Calcula el **gasto total** y el **promedio diario**.
- ✅ Aplica un **aumento del 10 %** *solo* a los días cuyo gasto superó el promedio.
- ✅ Muestra el arreglo actualizado en **orden inverso**.
- ✅ Indica **cuántos días** sufrieron el incremento.

**Ejemplo de ejecución**

```text
Gasto del día 1: 10
Gasto del día 2: 20
Gasto del día 3: 30
Gasto del día 4: 40
Gasto del día 5: 50
Gasto del día 6: 60
Gasto del día 7: 70

Total: 280.00 | Promedio: 40.00

Arreglo actualizado (orden inverso):
77.00  66.00  55.00  40.00  30.00  20.00  10.00

Días con aumento: 3
```

---

## 2 · 🏭 Filtro y suma condicionada de producción

El usuario ingresa por teclado la cantidad de piezas fabricadas en **10 turnos** (`int[]`). El programa calcula:

- ✅ La **suma de las piezas en índices pares** (0, 2, 4, 6, 8).
- ✅ Cuántos turnos produjeron una cantidad **impar y mayor a 15**.
- ✅ El **promedio general** de producción con **2 decimales**.



## 3 · 🎓 Análisis de asistencia y rendimiento

Se pide la cantidad `n` de estudiantes, se crea un `int[] notas` de tamaño `n` y se llena **solo con notas válidas (0 a 20)**. Luego se calcula:

- ✅ El **promedio general** del curso (sin caer en la trampa de la división entera 😉).
- ✅ Cantidad de **aprobados** (nota ≥ 14) y **reprobados**.
- ✅ Lista de estudiantes con nota **estrictamente por debajo del promedio**.

**Ejemplo de ejecución**

```text
Número de estudiantes: 5
Nota del estudiante 1: 18
Nota del estudiante 2: 12
Nota del estudiante 3: 15
Nota del estudiante 4: 9
Nota del estudiante 5: 16

Promedio del curso: 14.00
Aprobados: 3 | Reprobados: 2

Estudiantes por debajo del promedio:
- Estudiante 2
- Estudiante 4
```

---

## ⚙️ Requisitos

- ☕ **JDK 17** o superior (funciona también con versiones anteriores como Java 8+)
- Un IDE como **IntelliJ IDEA**, **NetBeans**, **Eclipse** o **VS Code**, o simplemente una terminal

---

## ▶️ Cómo ejecutarlo

1. **Clona** el repositorio:

   ```bash
   git clone https://github.com/tu-usuario/ape6-arreglos.git
   cd ape6-arreglos
   ```

2. **Compila** el ejercicio que quieras probar:

   ```bash
   javac Ejercicio1.java
   ```

3. **Ejecútalo**:

   ```bash
   java Ejercicio1
   ```

> 💡 Cambia `Ejercicio1` por `Ejercicio2` o `Ejercicio3` según el programa que quieras correr.

---

## 📁 Estructura del proyecto

```text
ape6-arreglos/
├── Ejercicio1.java   # Gastos semanales + ajuste por inflación
├── Ejercicio2.java   # Producción: suma y conteo condicionado
├── Ejercicio3.java   # Notas, aprobados y estudiantes bajo el promedio
└── README.md
```

---

## 🧠 Lo que se practica

- Declaración, llenado y recorrido de **arreglos** (`double[]`, `int[]`)
- Lectura de datos con **`Scanner`**
- **Acumuladores** y **contadores**
- Condicionales simples y compuestas (`&&`, `%`, `>`, `>=`)
- **Casting** para evitar la división entera
- Formato de salida con `printf` / `String.format("%.2f")`
- Recorrido de arreglos en **orden inverso**
- **Validación** de entradas con `while` / `do-while`

---



⭐ Si te sirvió, ¡dale una estrella al repo! ⭐

</div>
