# Orbital 33 Icon Pack

Paquete de iconos 3D para Samsung Theme Park y launchers compatibles.

## Catálogo ampliado

- 60 asociaciones de aplicaciones conocidas en `appfilter.xml`.
- 1.500 diseños originales Orbital 33 adicionales, disponibles en el catálogo de selección manual mediante `res/xml/drawable.xml`.
- Cada diseño usa una esfera azul con brillo y un glifo geométrico vectorial propio. Estos 1.500 diseños son variantes artísticas originales; **no representan 1.500 marcas ni añaden 1.500 asociaciones automáticas de aplicaciones**.
- La cobertura automática depende del nombre de paquete y la actividad launcher reales de cada app instalada.

## Instalar y probar

1. Instala el APK generado desde GitHub Actions.
2. Abre Theme Park y selecciona Orbital 33.
3. Comprueba las aplicaciones mapeadas y revisa el catálogo de iconos disponibles.
4. Si una app instalada no cambia, comparte su nombre y versión; algunas apps usan actividades distintas según región o versión.

## Compilar

Requiere JDK 17, Android SDK y Gradle 8.9:

```bash
gradle assembleDebug
```

## Verificación

GitHub Actions valida los componentes, recursos gráficos, el catálogo de 1.500 diseños y compila el APK. La aplicación real de todos los iconos debe verificarse en el dispositivo Samsung, ya que los componentes launcher pueden variar entre versiones.
