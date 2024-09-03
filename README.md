# Analizador Semántico

Este proyecto es un **analizador semántico** para un lenguaje de programación simplificado. Utiliza **JavaCC** para el análisis sintáctico y semántico de código, validando la coherencia de las expresiones y las declaraciones de variables en el código fuente.

## Repositorio

El código fuente del proyecto está disponible en GitHub: [Analizador Semántico](https://github.com/kelok3rik/Analisis-Semantico)

## Ejecución Inicial

**Importante**: Ejecutar solamente desde el CMD. Si se usa PowerShell, se pueden presentar errores debido a que `<` es un símbolo reservado.

1. **Compilar los archivos de las reglas**:

        javacc comp.jj

    Esto generará los archivos necesarios para el    análisis.

2. **Compilar todos los archivos Java generados**:
       
        javac *.java

Esto compilará los archivos Java generados por JavaCC.

3. **Ejecutar el análisis**:

        java comp < "NombreDelArchivo"
    
Por ejemplo:

        java comp < code.txt

Esto ejecutará el analizador sobre el archivo code.txt.

## Ejemplos de Uso
**Ejemplo 1**

    Programa test
    {
        inicio()
        {
            inum contador = 0;
            ien(contador < 10)
            {
                iescribir(contador);
                contador = contador + 1;
            }
        }
    }

**Ejemplo 2**

    Programa test
    {
        inicio()
        {
            inum a = 10;
            inum b = 5;
            inum c = a + b;
        }
    }

