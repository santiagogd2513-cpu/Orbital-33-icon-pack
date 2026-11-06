# Orbital 33 Icon Pack

Paquete de iconos 3D para Samsung Theme Park y launchers compatibles.

## Iconos dedicados incluidos
Chrome, Gmail, Google Maps, YouTube, Play Store, WhatsApp, Instagram, Spotify, Telegram, Discord, Netflix y Dolphin Emulator.

Cada aplicación mapeada usa su propio recurso vectorial superpuesto sobre una esfera con degradado y brillo. Las aplicaciones no incluidas conservan el icono de su sistema/launcher; no existe una forma universal de aplicar un icono a cualquier app sin conocer su componente launcher exacto.

## Instalar y probar
1. Instala el APK generado desde GitHub Actions.
2. Abre Theme Park y selecciona Orbital 33.
3. Comprueba las aplicaciones que coinciden con los paquetes y actividades de esta lista.
4. Si una app instalada no cambia, comparte su nombre y versión; algunas apps usan actividades distintas según región o versión.

## Compilar
Requiere JDK 17, Android SDK y Gradle 8.9:

```bash
gradle assembleDebug
```

## Verificación
GitHub Actions valida recursos y compila el APK. La aplicación real de todos los iconos debe verificarse en el dispositivo Samsung, ya que los componentes launcher pueden variar entre versiones.
