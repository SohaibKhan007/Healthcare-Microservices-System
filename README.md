```markdown
# 🏥 Healthcare Microservices System

A scalable and modular Healthcare Management System built using a microservices architecture powered by **Spring Boot**, **gRPC**, **Kafka**, **PostgreSQL**, and **Docker Compose**.

---

![Project Screenshot](https://github.com/khan-sk-dev/Healthcare-Microservices-System/assets/your-image-id) <!-- Replace this with actual GitHub image link once uploaded -->

## 🔧 Tech Stack

| Layer              | Tech                                                  |
|--------------------|--------------------------------------------------------|
| **Backend**        | Java 17, Spring Boot                                  |
| **API Gateway**    | Spring Cloud Gateway                                  |
| **Inter-Service Communication** | gRPC                                  |
| **Asynchronous Messaging** | Apache Kafka                                 |
| **Database**       | PostgreSQL                                            |
| **Build Tool**     | Maven                                                 |
| **Containerization** | Docker, Docker Compose                            |
| **Testing**        | JUnit, Integration Tests                             |

---

## 📂 Project Structure

```

📁 analytics-service       → Tracks and logs analytics data
📁 api-gateway             → Handles routing and cross-cutting concerns
📁 api-requests            → Shared DTOs across microservices
📁 auth-service            → Handles user authentication and security
📁 billing-service         → Manages billing operations and payment records
📁 grpc-requests           → Protobuf contracts for gRPC communication
📁 infrastructure          → Kafka, DB configurations, Docker setup
📁 integration-tests       → System-wide integration tests
📁 patient-service         → Manages patient records and data
📁 .vscode, .gitignore     → Dev environment configurations
📄 docker-compose.yml      → Spin up the entire system locally

````

---

## 🚀 Getting Started

### ✅ Prerequisites

- Java 17+
- Docker & Docker Compose
- Maven 3.8+
- Kafka & PostgreSQL (auto-configured in Docker)

### 📦 Run Locally

```bash
# Clone the repository
git clone https://github.com/khan-sk-dev/Healthcare-Microservices-System.git
cd Healthcare-Microservices-System

# Start all services using Docker Compose
docker-compose up --build
````

---

## 🔄 Inter-Service Communication

### gRPC

Used for internal synchronous communication between microservices (e.g., `patient-service` ↔ `billing-service`).

Each service contains:

* Protobuf `.proto` definitions inside `grpc-requests`
* `protobuf-maven-plugin` setup in `pom.xml`
* gRPC server/client configurations

### Kafka

Used for asynchronous messaging (e.g., notifications, logging).

Kafka Topics Example:

```yaml
spring.kafka.bootstrap-servers=kafka:9092
spring.kafka.consumer.group-id=healthcare-group
spring.kafka.template.default-topic=healthcare-events
```

Kafka topics are produced and consumed in services like `notification-service` and `analytics-service`.

---

## 🔐 Security

* `auth-service` implements Spring Security
* JWT (assumed for token handling)
* Login and token verification endpoints
* Secured internal and public APIs

---

## 🧪 Testing

* Unit tests across microservices
* Integration tests using `integration-tests` module
* JUnit and Spring Boot Test used for coverage

---

## 📜 Environment Variables

Each microservice supports the following `.env` or system variables:

| Variable                  | Description                  |
| ------------------------- | ---------------------------- |
| `SPRING_DATASOURCE_URL`   | PostgreSQL DB URL            |
| `KAFKA_BOOTSTRAP_SERVERS` | Kafka broker location        |
| `JWT_SECRET`              | Secret key for token signing |
| `SERVER_PORT`             | Custom port per microservice |

---

## 📘 Useful Commands

```bash
# Clean and install all services
mvn clean install

# Compile Protobuf contracts
mvn protobuf:compile

# View running services
docker ps
```

---


## 🤝 Contributing

Contributions, issues, and feature requests are welcome!
Feel free to check the [issues page](https://github.com/khan-sk-dev/Healthcare-Microservices-System/issues).

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 💡 Author

**صہیب خان** – [GitHub](https://github.com/khan-sk-dev)

---

> Give this repo a ⭐ if you found it useful!

```

---
