  CloudCart – Cloud Native E-Commerce Backend

CloudCart is a scalable cloud-native backend built using Spring Boot.  
This project demonstrates modern backend engineering practices including:

- GraphQL APIs
- PostgreSQL integration
- Redis caching
- Docker containerization
- Kubernetes orchestration
- Cloud deployment readiness (GCP)
---
## Tech Stack
- Java 17
- Spring Boot 3
- Spring GraphQL
- PostgreSQL
- Redis
- Docker
- Kubernetes
- Google Cloud Platform (GCP)
---
## Features

- GraphQL API for product management
- PostgreSQL database integration using JPA/Hibernate
- Redis caching for improved performance
- Dockerized application
- Kubernetes deployment configuration
- Cloud-ready architecture
---
## Project Structure

cloudcart/
├── src/main/java/com/cloudcart
│ ├── controller/
│ ├── service/
│ ├── repository/
│ ├── model/
│ └── CloudCartApplication.java
├── src/main/resources/
│ ├── application.yml
│ └── schema.graphqls
├── Dockerfile
├── docker-compose.yml
├── k8s/
│ ├── deployment.yaml
│ └── service.yaml
└── pom.xml
---
## How to Run Locally

### Build the Application
mvn clean package
### Run with Docker Compose
docker-compose up --build
Application will start at:
http://localhost:8080/graphql
##Run container:
docker run -p 8080:8080 cloudcart
Kubernetes Deployment

Apply Kubernetes configuration:

kubectl apply -f k8s/
