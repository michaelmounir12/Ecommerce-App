# Microservices Marketplace
### A Modern E-commerce Platform Built on Microservices

## About This Project

Micro Marketplace represents a scalable e-commerce solution architected using microservices principles and powered by Spring ecosystem technologies alongside industry-standard open-source tools.

The application harnesses Spring Boot for service development, Netflix Eureka for dynamic service discovery, Spring Cloud Gateway for intelligent request routing, and KeyCloak for enterprise-grade security. Communication between services is handled through two approaches: Resilience4j enables reliable synchronous interactions, while Apache Kafka provides robust event-driven asynchronous messaging capabilities.

Designed with scalability, resilience, and real-time capabilities at its core, Micro Marketplace delivers a solid foundation for building comprehensive online marketplace solutions.

## Architecture

Solution Architecture

## Core Services

**Product Service** - Manages the complete product lifecycle including creation, retrieval, and modification operations. Data persistence is handled via MongoDB.

**Order Service** - Orchestrates order processing workflows, encompassing order creation and retrieval functionality. Utilizes MySQL for data storage.

**Inventory Service** - Tracks and maintains product inventory levels. Built on MySQL database infrastructure.

**Notification Service** - Stateless service component dedicated to delivering user notifications about orders and system events.

## Infrastructure Components

**Discovery Server** - Implements Netflix Eureka to enable automatic service registration and dynamic discovery, allowing microservices to locate each other seamlessly.

**API Gateway** - Deploys Spring Cloud Gateway as the central entry point, intelligently routing external requests to appropriate backend microservices.

**Auth Server** - Leverages KeyCloak to implement comprehensive authentication and authorization, ensuring secure access control across all microservices.

**Circuit Breaker** - Integrates Resilience4j patterns to maintain system stability and prevent cascading failures through intelligent circuit-breaking mechanisms.

**Message Broker** - Utilizes Apache Kafka as the event streaming platform, enabling asynchronous communication and event-driven architecture for order notifications.

## Technology Stack

**Languages & Frameworks:** Java, Spring Boot, Spring Cloud

**Data Layer:** MongoDB, MySQL, Apache Kafka

**Gateway:** Spring Cloud Gateway

**Service Discovery:** Netflix Eureka

**Resilience:** Resilience4J

**Security:** KeyCloak

**Build Tools:** Maven, Docker, Jib

## Quick Start Guide

### Requirements

- Docker and Docker Compose installed on your system
- Docker daemon running

### Running the Application

Navigate to the project root:

```bash
cd ecommerce-microservices
```

Launch all services:

```bash
docker compose up -d
```

Verify containers are operational:

```bash
docker ps
```

## Application Usage

### Authentication Setup

**Obtain KeyCloak Credentials:**

1. Navigate to KeyCloak Admin Console: `http://localhost:8080/`
2. Select Realm: `spring-boot-microservices-realm`
3. Choose Client: `spring-cloud-client`
4. Access the 'Credentials' tab and copy the 'Client Secret'

**Configure Postman for API Access:**

Set up Authorization on your request:

- **Type:** OAuth 2.0
- **Token Configuration:**
  - Token Name: `token`
  - Grant Type: `Client Credentials`
  - Access Token URL: `http://keycloak:8080/realms/spring-boot-microservices-realm/protocol/openid-connect/token`
  - Client ID: `spring-cloud-client`
  - Client Secret: `<your-copied-secret>`

Generate token by clicking "Get New Access Token", then "Use Token"

> **Important:** To enable token retrieval from the keycloak container, add `127.0.0.1 keycloak` to your hosts file:
> - Windows: `C:\Windows\System32\drivers\etc\hosts`
> - Linux/Mac: `/etc/hosts`

### API Operations

**Create Product**

- **Method:** POST
- **URL:** `http://localhost:8181/api/product`
- **Auth:** OAuth 2.0 token (configured above)
- **Request Body:**
```json
{
   "name": "Iphone 15",
   "description": "Apple Iphone 15",
   "price": 1500
}
```

**Retrieve Products**

- **Method:** GET
- **URL:** `http://localhost:8181/api/product`
- **Auth:** OAuth 2.0 token (configured above)

**Place Order**

- **Method:** POST
- **URL:** `http://localhost:8181/api/order`
- **Auth:** OAuth 2.0 token (configured above)
- **Request Body:**
```json
{
   "orderLineItemsDtoList": [
     {
        "skuCode": "iphone_15_pro",
        "price": 2000,
        "quantity": 1
      }
   ]
}
```

## Management Interfaces

**KeyCloak Administration**

Access the admin console at `http://localhost:8080/`

- Realm: `spring-boot-microservices-realm`
- Client: `spring-cloud-client`

**Eureka Service Dashboard**

View registered services at `http://localhost:8761/`

## Cleanup

To stop all services and remove associated resources:

```bash
docker compose down -v
```
