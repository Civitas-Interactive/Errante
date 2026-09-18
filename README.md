# Errante

Base inicial para Minecraft Java 26.3 y Fabric. Aun no incluye carretas.

## Abrir en Zed
Abre esta carpeta completa mediante File > Open Folder.

## Compilar
En la terminal de Zed:

```powershell
.\errante.bat build
```

## Probar

```powershell
.\errante.bat runClient
```

El mundo de desarrollo se guarda en run, separado de tus partidas habituales. Busca la frase "Errante cargado" en run/logs/latest.log para confirmar la carga.

La primera ejecucion descarga las herramientas y dependencias. Requiere internet. errante.bat usa la copia local de Java 25 incluida en .tools, sin cambiar el Java del sistema.

Siguiente etapa: colocar una carreta sencilla en un mundo creativo.

## Estado de verificacion
La compilacion con Java 27 fallo por incompatibilidad. Se descargo Temurin Java 25 desde Adoptium y se verifico su SHA-256. La compilacion con Java 25 quedo bloqueada por AccessDeniedException al leer conf/security/java.security dentro del entorno automatizado. Pendiente ejecutar build y runClient desde la terminal de Zed. No se ha generado ni validado un mod jugable.

