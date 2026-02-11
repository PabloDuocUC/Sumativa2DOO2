![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Evaluación Formativa Semana 5 – Sincronizando procesos en sistemas concurrentes

## 👤 Autor del proyecto
- **Nombre completo:** Pablo Nicolás Alonso Gallardo Gallardo
- **Sección:** 002A
- **Carrera:** Analista Programador
- **Sede:** Online

---

## 📘 Descripción general del sistema

Este proyecto corresponde a la Evaluación Formativa de la Semana 5 de la asignatura *Desarrollo Orientado a Objetos II*. 

El sistema simula la coordinación de entregas en la empresa **SpeedFast**, donde múltiples repartidores trabajan en paralelo retirando pedidos desde una zona de carga compartida.

El objetivo principal es aplicar conceptos de **programación concurrente en Java**, utilizando:

- Threads
- Implementación de `Runnable`
- Sincronización con `synchronized`
- Control de acceso a recursos compartidos
- Manejo de estados mediante `enum`

El sistema garantiza que cada pedido sea retirado y entregado por un único repartidor, evitando condiciones de carrera y asegurando la integridad de los datos.

---

## ⚙️ Requisitos
- Java 8 o superior
- Terminal/Consola para ejecutar

---

### 1. Clonar el repositorio
```bash
git clone https://github.com/TU_USUARIO/TU_REPOSITORIO.git
cd TU_REPOSITORIO
```
### 2. Compilar
```bash
javac src/duoc/speedfast/*.java
```
### 3. Ejecutar
```bash
java duoc.speedfast.Main
```

## 📂 Estructura del proyecto
```plaintext
src/
└── duoc/
    └── speedfast/
        ├── EstadoPedido.java
        ├── Pedido.java
        ├── ZonaDeCarga.java
        ├── Repartidor.java
        └── Main.java
```

## Agradecimientos
Principalmente agradecer por la gran paciencia, además de la calidad con la que explica cada contenido. Nunca puedo estar en las clases ya que por el trabajo me tengo que levantar a las 5am Pero, en cada grabación
siento como realmente le gusta este mundo y domina los temas. Muy agradecido por todo lo enseñado profesor.

---
**Repositorio GitHub:** https://github.com/PabloDuocUC/Sumativa2DOO2

**Fecha de entrega:** 11/02/2026
---
© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Formativa Semana 5
