# Orbital 33 Icon Pack

Primera vista técnica del pack de iconos 3D para Samsung Theme Park.

## Diseño de la preview
- Esferas con color y sombreado adaptados al icono.
- Muestra inspirada en Dolphin Emulator (ilustración vectorial original, no logotipo oficial).
- Esfera genérica de respaldo.
- APK Android de prueba generado por GitHub Actions.

## Compilar
Requiere JDK 17, Android SDK y Gradle 8.9:

```bash
gradle assembleDebug
```

APK: `app/build/outputs/apk/debug/app-debug.apk`

## Estado de compatibilidad
Esta preview valida la compilación Android y los recursos. La importación real en Samsung Theme Park debe probarse en un dispositivo Samsung; la presencia de `appfilter.xml` por sí sola no garantiza compatibilidad con todas las versiones de Theme Park.
