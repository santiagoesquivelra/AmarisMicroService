# 📚 Microservicio PRUEBAESTUDIANTE

Microservicio desarrollado en **Java Spring Boot** con conexión a **PostgreSQL**, usando arquitectura por capas (Controlador, Servicio, Repositorio, DTOs, Mapper) y documentación automática con **Swagger**.

---

## 🚀 Requisitos

- Java 17+
- Maven 3.8+
- PostgreSQL 12+
- IDE recomendado: IntelliJ o VS Code

---

## ⚙️ Configuración de base de datos

1. Crea la base de datos:

```sql
CREATE DATABASE pruebaestudiante;
psql -U postgres -c "CREATE DATABASE PRUEBAESTUDIANTE;"