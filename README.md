# Orbital 33 Icon Pack

Paquete de iconos 3D para Samsung Theme Park y launchers compatibles.

## Catálogo actual

- 217 asociaciones de aplicaciones únicas en `appfilter.xml`.
- 1.600 iconos en el catálogo de selección manual.
- El catálogo incluye 1.500 diseños Orbital originales y 100 iconos personalizados para aplicaciones concretas.
- Se conservan los diseños especiales de ChatGPT y Grok, además de las esferas de aplicaciones y servicios populares.
- La cobertura automática depende de los nombres de paquete y actividades launcher reales de cada versión instalada.

## Instalar y probar

1. Instala el APK publicado en GitHub Releases.
2. Abre Theme Park y selecciona Orbital 33.
3. Comprueba las aplicaciones mapeadas. Si alguna no cambia, comparte su versión y el nombre de su actividad launcher para corregir la asignación.

## Compilar

Requiere JDK 17, Android SDK y Gradle 8.9: `gradle assembleDebug`.

## Verificación

GitHub Actions valida XML, componentes únicos, recursos de cada icono y el catálogo de 1.500 diseños antes de compilar. La aplicación muestra ahora los recuentos directamente desde los XML del paquete para evitar cifras desactualizadas. La apariencia y la aplicación real deben verificarse en el dispositivo.
