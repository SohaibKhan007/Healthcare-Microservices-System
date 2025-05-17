# 🏥 Healthcare Microservices System

<div align="center">

![Healthcare Microservices Banner](https://img.shields.io/badge/Healthcare-Microservices-0077B6?style=for-the-badge&logo=medical&logoColor=white)

[![Java](https://img.shields.io/badge/Java%2017-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](https://spring.io/projects/spring-boot)
[![gRPC](https://img.shields.io/badge/gRPC-244c5a?style=for-the-badge&logo=google&logoColor=white)](https://grpc.io/)
[![Kafka](https://img.shields.io/badge/Apache%20Kafka-231F20?style=for-the-badge&logo=apache-kafka&logoColor=white)](https://kafka.apache.org/)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)](https://www.postgresql.org/)
[![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)](https://www.docker.com/)

</div>

A scalable and modular Healthcare Management System built using a microservices architecture. This enterprise-grade solution enables seamless patient management, billing operations, analytics, and more, all while maintaining high security standards and performance.

---

## 📋 Table of Contents

- [Key Features](#-key-features)
- [Tech Stack](#-tech-stack)
- [Project Structure](#-project-structure)
- [Architecture](#-architecture)
- [Getting Started](#-getting-started)
- [Inter-Service Communication](#-inter-service-communication)
- [Security](#-security)
- [Testing](#-testing)
- [Environment Variables](#-environment-variables)
- [Useful Commands](#-useful-commands)
- [Contributing](#-contributing)
- [License](#-license)
- [Author](#-author)

---

## 🌟 Key Features

- **Microservices Architecture**: Modular, scalable, and maintainable services
- **API Gateway**: Centralized entry point with routing and cross-cutting concerns
- **Authentication & Authorization**: Secure user access control
- **Patient Management**: Comprehensive patient data management
- **Billing Operations**: Streamlined healthcare billing processes
- **Analytics**: Real-time and historical data analysis
- **Containerization**: Docker-based deployment for consistency across environments

---

## 🔧 Tech Stack

| Layer | Tech |
|-------|------|
| **Backend** | Java 17, Spring Boot |
| **API Gateway** | Spring Cloud Gateway |
| **Inter-Service Communication** | gRPC |
| **Asynchronous Messaging** | Apache Kafka |
| **Database** | PostgreSQL |
| **Build Tool** | Maven |
| **Containerization** | Docker, Docker Compose |
| **Testing** | JUnit, Integration Tests |

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
```

---

## 🏗 Architecture

<div align="center">
  
  <!-- Architecture diagram placeholder - Replace with actual diagram once available -->
  <i>Comprehensive architecture diagram coming soon!</i>
  
</div>

The system follows a clean microservices architecture with:

- **Bounded contexts**: Each service handles a specific business domain
- **API Gateway**: Single entry point for external clients
- **Service Discovery**: Automatic registration and discovery of services
- **Circuit Breaking**: Preventing cascading failures across services
- **Distributed Tracing**: Tracking request flows across services

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
```

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
* JWT for token handling
* Login and token verification endpoints
* Secured internal and public APIs
* Role-based access control

---

## 🧪 Testing

* Unit tests across microservices
* Integration tests using `integration-tests` module
* JUnit and Spring Boot Test used for coverage
* Continuous integration with automated test execution

---

## 📜 Environment Variables

Each microservice supports the following `.env` or system variables:

| Variable | Description |
|----------|-------------|
| `SPRING_DATASOURCE_URL` | PostgreSQL DB URL |
| `KAFKA_BOOTSTRAP_SERVERS` | Kafka broker location |
| `JWT_SECRET` | Secret key for token signing |
| `SERVER_PORT` | Custom port per microservice |

---

## 📘 Useful Commands

```bash
# Clean and install all services
mvn clean install

# Compile Protobuf contracts
mvn protobuf:compile

# View running services
docker ps

# View service logs
docker-compose logs -f [service-name]

# Run specific service
docker-compose up -d [service-name]
```

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!
Feel free to check the [issues page](https://github.com/khan-sk-dev/Healthcare-Microservices-System/issues).

1. Fork the project
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 👨‍💻 Author

**صہیب خان** – [GitHub](https://github.com/khan-sk-dev)

---

<div align="center">
  
  ⭐ **Star this repo if you find it useful!** ⭐
  
  <a href="https://github.com/khan-sk-dev/Healthcare-Microservices-System/stargazers">
    <img src="https://img.shields.io/github/stars/khan-sk-dev/Healthcare-Microservices-System?style=social" alt="Stars"/>
  </a>
  
</div>
