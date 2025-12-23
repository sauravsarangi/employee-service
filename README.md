# employee-service

A simple Spring Boot REST microservice that exposes Employee APIs for other services to consume (e.g., **Feign client–based microservices**).

## What it does
- Runs on **port 8096**
- Provides endpoints to fetch employee details (used by downstream/client services via Feign)

## Run locally
```bash
mvn spring-boot:run
