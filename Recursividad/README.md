# Taller de Recursividad — Estructura de Datos

**Estudiante:** Edwin Geovani Gomez Romero

## Descripción

Taller con 13 ejercicios resueltos mediante funciones recursivas, aplicando
Clean Code y POO: cada ejercicio separa sus responsabilidades en clases
(lectura/generación de datos, cálculo recursivo, impresión de resultados) y
una clase `Main` que orquesta el flujo.

## Ejercicios y sus clases correspondientes

### 1. Factorial de un número — Complejidad: O(n)

- `CalculadoraFactorial` — `calcular(n)`: caso base `n==0 → 1`; recursivo `n * calcular(n-1)`

### 2. Sumatoria de 1 hasta n — Complejidad: O(n)

- `CalculadoraSumatoria` — `calcular(n)`: caso base `n==0 → 0`; recursivo `n + calcular(n-1)`


### 3. Sumatoria armónica 1 + 1/2 + 1/3 + ... + 1/n — Complejidad: O(n)

- `CalculadoraSumatoriaArmonica` — `calcular(n)`: caso base `n==1 → 1.0`; recursivo `1.0/n + calcular(n-1)`


### 4. Invertir un número (123 → 321) — Complejidad: O(log n)

- `InversorNumero` — método recursivo privado que va extrayendo el último dígito (`% 10`) y recortando el número (`/ 10`), acumulando el resultado en un atributo


### 5. Suma de los dígitos de un número (123 → 6) — Complejidad: O(log n)

- `CalculadoraSumaDigitos` — `calcular(numero)`: caso base `numero==0 → 0`; recursivo `numero%10 + calcular(numero/10)`


### 6. Potencia (base elevada a exponente) — Complejidad: O(exponente)

- `CalculadoraPotencia` — `calcular(base, exp)`: caso base `exp==0 → 1`; recursivo `base * calcular(base, exp-1)`


### 7. M.C.D. con algoritmo de Euclides — Complejidad: O(log(min(M,N)))

- `CalculadoraMCD` — `calcular(m, n)`: caso base `n==0 → m`; recursivo `calcular(n, m % n)`
- `Main` — orquesta; intercambia M y N si el usuario los da al revés (se requiere M ≥ N)

### 8. Cociente de división entera por restas sucesivas — Complejidad: O(dividendo / divisor)

- `CalculadoraCociente` — `calcular(dividendo, divisor)`: caso base `dividendo < divisor → 0`; recursivo `1 + calcular(dividendo-divisor, divisor)`


### 9. Multiplicación por sumas sucesivas — Complejidad: O(b)

- `CalculadoraMultiplicacion` — `multiplicar(a, b)`: caso base `b==0 → 0`; recursivo `a + multiplicar(a, b-1)`


### 10. Suma de los elementos de un arreglo (leído por teclado) — Complejidad: O(n)

- `CalculadoraSumaArreglo` — `sumar(datos, indice)` recursivo (con sobrecarga `sumar(datos)` que inicia en 0)


### 11. Suma de los elementos de una matriz m×n — Complejidad: O(m × n)


### 12. Serie de Fibonacci hasta un límite — Complejidad: O(2ⁿ)

- `CalculadoraFibonacci` — `calcular(n)`: casos base `n==0→0`, `n==1→1`; recursivo `calcular(n-1)+calcular(n-2)`


### 13. Función de Ackermann — Complejidad: No elemental (crece más rápido que cualquier exponencial)

- `CalculadoraAckermann` — los 3 casos de la definición (m==0; n==0; caso general con doble recursión)


###  Copiar una cadena en otra — Complejidad: O(n)

- `CopiadorCadena` — copia carácter por carácter de forma recursiva, usando un `char[]` auxiliar (los `String` son inmutables en Java)


## Cómo ejecutar cada ejercicio

Ninguna de estas clases usa `package`, así que puedes compilar y ejecutar
directamente desde dentro de cada carpeta:

```bash
cd Ej07_MCD
javac *.java
java Main
```

(El ejercicio 1 vive en la carpeta `FactorialRecursivo/`, con el mismo patrón.)
