# Reflexión sobre lo realizado

## Descripción general

Este documento recoge mi reflexión sobre el desarrollo del software "Saludador": una aplicación de escritorio en Java/JavaFX que solicita al estudiante su nombre, edad y hora (AM/PM), y luego lo saluda por su nombre mencionando su edad. El código fue generado con ayuda de Cursor (IDE con IA), siguiendo la secuencia de prompts guardada en la carpeta `prompts`.

## Retos

- **No conocía la estructura de los archivos del proyecto.** Al abrir el proyecto que generó Cursor, no tenía claro para qué servía cada archivo ni carpeta (por ejemplo, dónde va el código fuente, los archivos de configuración del proyecto, las dependencias, etc.), ni cómo se relacionaban entre sí. Esto hizo difícil saber por dónde empezar a leer o modificar el código.
- **No conocía la mayoría de las funciones de Java que utilizó Cursor.** El código generado usa clases, métodos y funciones de Java y JavaFX que no había visto antes, por lo que al principio no entendía qué hacía cada una ni por qué se usaba en ese lugar.
- Depender de la IA para generar el código sin entender del todo el resultado fue un reto en sí mismo: funcionaba, pero yo no podía explicar con seguridad cómo.

## Descubrimientos

- Descubrí que un proyecto de Java/JavaFX tiene una estructura organizada en varios archivos y carpetas, cada uno con una responsabilidad específica, y que entender esa estructura es clave antes de modificar nada.
- Descubrí que Cursor puede generar una aplicación completa y funcional a partir de prompts bien descritos, pero que el resultado depende mucho de qué tan claro sea el requerimiento.
- Aprendí que puedo pedirle a la propia IA que me explique el código que generó, línea por línea o función por función.

## Sorpresas

- Me sorprendió la cantidad de funciones y librerías de Java que se utilizaron para una aplicación aparentemente tan simple (solicitar datos y mostrar un saludo).
- Me sorprendió lo rápido que Cursor generó el software completo y que funcionara casi desde el primer intento.

## Estructura del software

No entendí completamente la estructura de los archivos del proyecto. Sé que hay archivos de código fuente en Java y archivos de configuración, pero no tengo claro el papel exacto de cada uno ni cómo se conectan. Es algo que debo estudiar con más calma.

## Comandos, librerías y otros elementos que no he comprendido

- La mayoría de las **funciones de Java** que Cursor utilizó en el código (métodos de clases de JavaFX para crear la interfaz, manejar eventos de clic, leer los datos ingresados, etc.).
- Las **librerías/dependencias** del proyecto y cómo se configuran.
- Los **comandos** necesarios para compilar y ejecutar la aplicación.

## Aprendizajes y próximos pasos

- Antes de aceptar código generado por la IA, debo tomarme el tiempo de entenderlo.
- Repasar la estructura de un proyecto Java/JavaFX y qué hace cada archivo.
- Estudiar las funciones y clases principales de Java y JavaFX que aparecen en el código, y pedirle a Cursor que me las explique con ejemplos sencillos.
- Practicar modificando pequeñas partes del código (por ejemplo, el texto del saludo) para comprobar que entiendo cómo funciona.
