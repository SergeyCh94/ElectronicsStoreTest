# Приложение Магазин Электроники

Это пример приложения Магазин Электроники, разработанного с использованием Spring Boot.

## Зависимости

Для этого проекта используются следующие зависимости:

- Spring Boot Web
- PostgreSQL Driver
- Lombok
- Spring Data JPA
- Spring Boot Test
- Flyway

## Сборка и запуск приложения

Для сборки и запуска приложения следуйте следующим шагам:

1. Клонируйте репозиторий: `https://github.com/SergeyCh94/electronics-store.git`
2. Перейдите в директорию проекта: `cd electronics-store`
3. Соберите приложение с помощью Maven: `mvn clean install`
4. Запустите приложение: `mvn spring-boot:run`
5. Приложение будет запущено на `http://localhost:8080`.
6. Теперь вы можете открыть приложение в веб-браузере или протестировать его с помощью инструментов, таких как Postman.

## Сборка и запуск

### База данных

1. Установите Docker и Docker Compose на вашей системе.

2. В корневой папке проекта создайте файл `docker-compose.yml` и скопируйте в него следующий код:

```yaml
version: '3.8'
services:
  db:
    image: postgres:latest
    ports:
      - 5432:5432
    environment:
      - POSTGRES_DB=electronicsstore_db
      - POSTGRES_USER=postgres
      - POSTGRES_PASSWORD=160894Sveta
    volumes:
      - ./data:/var/lib/postgresql/data
Откройте терминал или командную строку, перейдите в корневую папку проекта и выполните команду: docker-compose up

Тестирование с помощью Postman
Установите Postman на вашей системе, если еще не установлено.

Откройте Postman и импортируйте коллекцию запросов из файла electronics-store.postman_collection.json.

Выполните запросы к различным эндпоинтам для тестирования функциональности приложения.