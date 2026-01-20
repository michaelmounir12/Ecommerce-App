# Microservices Marketplace
### A Modern E-commerce Platform Built on Microservices

![microservices-architecture](https://github.com/user-attachments/assets/0ea21b9c-7b8a-4fb6-985b-9585df85c08a)<svg viewBox="0 0 1400 1000" xmlns="http://www.w3.org/2000/svg">
  <!-- Define gradients and styles -->
  <defs>
    <linearGradient id="blueGrad" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#4A90E2;stop-opacity:1" />
      <stop offset="100%" style="stop-color:#357ABD;stop-opacity:1" />
    </linearGradient>
    <linearGradient id="greenGrad" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#5CB85C;stop-opacity:1" />
      <stop offset="100%" style="stop-color:#449D44;stop-opacity:1" />
    </linearGradient>
    <linearGradient id="orangeGrad" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#F0AD4E;stop-opacity:1" />
      <stop offset="100%" style="stop-color:#EC971F;stop-opacity:1" />
    </linearGradient>
    <linearGradient id="purpleGrad" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#9B59B6;stop-opacity:1" />
      <stop offset="100%" style="stop-color:#8E44AD;stop-opacity:1" />
    </linearGradient>
    <linearGradient id="redGrad" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#D9534F;stop-opacity:1" />
      <stop offset="100%" style="stop-color:#C9302C;stop-opacity:1" />
    </linearGradient>
    <filter id="shadow">
      <feDropShadow dx="2" dy="2" stdDeviation="3" flood-opacity="0.3"/>
    </filter>
  </defs>
  
  <!-- Background -->
  <rect width="1400" height="1000" fill="#F8F9FA"/>
  
  <!-- Title -->
  <text x="700" y="35" font-family="Arial, sans-serif" font-size="28" font-weight="bold" text-anchor="middle" fill="#2C3E50">
    Microservices Marketplace Architecture
  </text>
  
  <!-- Client Layer -->
  <rect x="50" y="70" width="200" height="80" rx="10" fill="url(#blueGrad)" filter="url(#shadow)"/>
  <text x="150" y="105" font-family="Arial, sans-serif" font-size="16" font-weight="bold" text-anchor="middle" fill="white">Client Applications</text>
  <text x="150" y="130" font-family="Arial, sans-serif" font-size="12" text-anchor="middle" fill="white">Web / Mobile / Desktop</text>
  
  <!-- API Gateway -->
  <rect x="450" y="70" width="500" height="80" rx="10" fill="url(#purpleGrad)" filter="url(#shadow)"/>
  <text x="700" y="100" font-family="Arial, sans-serif" font-size="18" font-weight="bold" text-anchor="middle" fill="white">API Gateway</text>
  <text x="700" y="125" font-family="Arial, sans-serif" font-size="13" text-anchor="middle" fill="white">Spring Cloud Gateway (Port: 8181)</text>
  <text x="700" y="143" font-family="Arial, sans-serif" font-size="11" text-anchor="middle" fill="white">Routing | Load Balancing | Rate Limiting</text>
  
  <!-- Arrow from Client to Gateway -->
  <path d="M 250 110 L 445 110" stroke="#2C3E50" stroke-width="3" fill="none" marker-end="url(#arrowhead)"/>
  
  <!-- Security Layer -->
  <rect x="1050" y="70" width="280" height="80" rx="10" fill="url(#redGrad)" filter="url(#shadow)"/>
  <text x="1190" y="100" font-family="Arial, sans-serif" font-size="18" font-weight="bold" text-anchor="middle" fill="white">Auth Server</text>
  <text x="1190" y="120" font-family="Arial, sans-serif" font-size="13" text-anchor="middle" fill="white">KeyCloak (Port: 8080)</text>
  <text x="1190" y="138" font-family="Arial, sans-serif" font-size="11" text-anchor="middle" fill="white">OAuth 2.0 | OpenID Connect</text>
  
  <!-- Arrow from Gateway to Auth -->
  <path d="M 950 110 L 1045 110" stroke="#E74C3C" stroke-width="2" fill="none" marker-end="url(#arrowhead)" stroke-dasharray="5,5"/>
  <text x="997" y="105" font-family="Arial, sans-serif" font-size="10" fill="#E74C3C">Auth</text>
  
  <!-- Discovery Server -->
  <rect x="50" y="200" width="280" height="80" rx="10" fill="url(#orangeGrad)" filter="url(#shadow)"/>
  <text x="190" y="230" font-family="Arial, sans-serif" font-size="18" font-weight="bold" text-anchor="middle" fill="white">Discovery Server</text>
  <text x="190" y="250" font-family="Arial, sans-serif" font-size="13" text-anchor="middle" fill="white">Netflix Eureka (Port: 8761)</text>
  <text x="190" y="268" font-family="Arial, sans-serif" font-size="11" text-anchor="middle" fill="white">Service Registration & Discovery</text>
  
  <!-- Arrow from Gateway to Discovery -->
  <path d="M 600 150 L 300 200" stroke="#F39C12" stroke-width="2" fill="none" marker-end="url(#arrowhead)" stroke-dasharray="5,5"/>
  
  <!-- Resilience Layer -->
  <rect x="1050" y="200" width="280" height="80" rx="10" fill="#34495E" filter="url(#shadow)"/>
  <text x="1190" y="230" font-family="Arial, sans-serif" font-size="18" font-weight="bold" text-anchor="middle" fill="white">Circuit Breaker</text>
  <text x="1190" y="250" font-family="Arial, sans-serif" font-size="13" text-anchor="middle" fill="white">Resilience4J</text>
  <text x="1190" y="268" font-family="Arial, sans-serif" font-size="11" text-anchor="middle" fill="white">Fault Tolerance | Retry | Rate Limiting</text>
  
  <!-- Microservices Layer Title -->
  <text x="700" y="330" font-family="Arial, sans-serif" font-size="20" font-weight="bold" text-anchor="middle" fill="#2C3E50">Core Microservices</text>
  
  <!-- Product Service -->
  <rect x="80" y="360" width="220" height="120" rx="8" fill="url(#greenGrad)" filter="url(#shadow)"/>
  <text x="190" y="390" font-family="Arial, sans-serif" font-size="16" font-weight="bold" text-anchor="middle" fill="white">Product Service</text>
  <text x="190" y="415" font-family="Arial, sans-serif" font-size="12" text-anchor="middle" fill="white">Product Management</text>
  <text x="190" y="435" font-family="Arial, sans-serif" font-size="11" text-anchor="middle" fill="white">• Create Products</text>
  <text x="190" y="453" font-family="Arial, sans-serif" font-size="11" text-anchor="middle" fill="white">• Retrieve Products</text>
  <text x="190" y="470" font-family="Arial, sans-serif" font-size="11" text-anchor="middle" fill="white">• Update Products</text>
  
  <!-- Order Service -->
  <rect x="340" y="360" width="220" height="120" rx="8" fill="url(#greenGrad)" filter="url(#shadow)"/>
  <text x="450" y="390" font-family="Arial, sans-serif" font-size="16" font-weight="bold" text-anchor="middle" fill="white">Order Service</text>
  <text x="450" y="415" font-family="Arial, sans-serif" font-size="12" text-anchor="middle" fill="white">Order Processing</text>
  <text x="450" y="435" font-family="Arial, sans-serif" font-size="11" text-anchor="middle" fill="white">• Place Orders</text>
  <text x="450" y="453" font-family="Arial, sans-serif" font-size="11" text-anchor="middle" fill="white">• Retrieve Orders</text>
  <text x="450" y="470" font-family="Arial, sans-serif" font-size="11" text-anchor="middle" fill="white">• Order Validation</text>
  
  <!-- Inventory Service -->
  <rect x="600" y="360" width="220" height="120" rx="8" fill="url(#greenGrad)" filter="url(#shadow)"/>
  <text x="710" y="390" font-family="Arial, sans-serif" font-size="16" font-weight="bold" text-anchor="middle" fill="white">Inventory Service</text>
  <text x="710" y="415" font-family="Arial, sans-serif" font-size="12" text-anchor="middle" fill="white">Stock Management</text>
  <text x="710" y="435" font-family="Arial, sans-serif" font-size="11" text-anchor="middle" fill="white">• Check Availability</text>
  <text x="710" y="453" font-family="Arial, sans-serif" font-size="11" text-anchor="middle" fill="white">• Update Stock</text>
  <text x="710" y="470" font-family="Arial, sans-serif" font-size="11" text-anchor="middle" fill="white">• Reserve Items</text>
  
  <!-- Notification Service -->
  <rect x="860" y="360" width="220" height="120" rx="8" fill="url(#greenGrad)" filter="url(#shadow)"/>
  <text x="970" y="390" font-family="Arial, sans-serif" font-size="16" font-weight="bold" text-anchor="middle" fill="white">Notification Service</text>
  <text x="970" y="415" font-family="Arial, sans-serif" font-size="12" text-anchor="middle" fill="white">Event Notifications</text>
  <text x="970" y="435" font-family="Arial, sans-serif" font-size="11" text-anchor="middle" fill="white">• Order Notifications</text>
  <text x="970" y="453" font-family="Arial, sans-serif" font-size="11" text-anchor="middle" fill="white">• System Events</text>
  <text x="970" y="470" font-family="Arial, sans-serif" font-size="11" text-anchor="middle" fill="white">• Stateless Design</text>
  
  <!-- Arrows from Gateway to Services -->
  <path d="M 550 150 L 190 360" stroke="#7F8C8D" stroke-width="2" fill="none" marker-end="url(#arrowhead)"/>
  <path d="M 650 150 L 450 360" stroke="#7F8C8D" stroke-width="2" fill="none" marker-end="url(#arrowhead)"/>
  <path d="M 750 150 L 710 360" stroke="#7F8C8D" stroke-width="2" fill="none" marker-end="url(#arrowhead)"/>
  
  <!-- Message Broker -->
  <rect x="450" y="540" width="500" height="80" rx="10" fill="#E67E22" filter="url(#shadow)"/>
  <text x="700" y="570" font-family="Arial, sans-serif" font-size="18" font-weight="bold" text-anchor="middle" fill="white">Apache Kafka</text>
  <text x="700" y="593" font-family="Arial, sans-serif" font-size="13" text-anchor="middle" fill="white">Event Streaming Platform</text>
  <text x="700" y="611" font-family="Arial, sans-serif" font-size="11" text-anchor="middle" fill="white">Asynchronous Messaging | Event-Driven Architecture</text>
  
  <!-- Arrows from Order to Kafka -->
  <path d="M 450 480 L 600 540" stroke="#E67E22" stroke-width="3" fill="none" marker-end="url(#arrowhead)"/>
  <text x="510" y="515" font-family="Arial, sans-serif" font-size="10" fill="#E67E22">Publish Events</text>
  
  <!-- Arrows from Kafka to Notification -->
  <path d="M 800 540 L 970 480" stroke="#E67E22" stroke-width="3" fill="none" marker-end="url(#arrowhead)"/>
  <text x="870" y="515" font-family="Arial, sans-serif" font-size="10" fill="#E67E22">Consume Events</text>
  
  <!-- Synchronous Communication -->
  <path d="M 560 420 L 600 420" stroke="#3498DB" stroke-width="2.5" fill="none" marker-end="url(#arrowhead)"/>
  <text x="580" y="410" font-family="Arial, sans-serif" font-size="9" fill="#3498DB" text-anchor="middle">Sync Call</text>
  <text x="580" y="440" font-family="Arial, sans-serif" font-size="9" fill="#3498DB" text-anchor="middle">Resilience4J</text>
  
  <!-- Data Layer Title -->
  <text x="700" y="670" font-family="Arial, sans-serif" font-size="20" font-weight="bold" text-anchor="middle" fill="#2C3E50">Data Persistence Layer</text>
  
  <!-- MongoDB for Product Service -->
  <rect x="80" y="700" width="220" height="70" rx="8" fill="#4DB33D" filter="url(#shadow)"/>
  <text x="190" y="730" font-family="Arial, sans-serif" font-size="16" font-weight="bold" text-anchor="middle" fill="white">MongoDB</text>
  <text x="190" y="753" font-family="Arial, sans-serif" font-size="12" text-anchor="middle" fill="white">Product Data</text>
  
  <!-- MySQL for Order Service -->
  <rect x="340" y="700" width="220" height="70" rx="8" fill="#00758F" filter="url(#shadow)"/>
  <text x="450" y="730" font-family="Arial, sans-serif" font-size="16" font-weight="bold" text-anchor="middle" fill="white">MySQL</text>
  <text x="450" y="753" font-family="Arial, sans-serif" font-size="12" text-anchor="middle" fill="white">Order Data</text>
  
  <!-- MySQL for Inventory Service -->
  <rect x="600" y="700" width="220" height="70" rx="8" fill="#00758F" filter="url(#shadow)"/>
  <text x="710" y="730" font-family="Arial, sans-serif" font-size="16" font-weight="bold" text-anchor="middle" fill="white">MySQL</text>
  <text x="710" y="753" font-family="Arial, sans-serif" font-size="12" text-anchor="middle" fill="white">Inventory Data</text>
  
  <!-- Arrows from Services to Databases -->
  <path d="M 190 480 L 190 700" stroke="#27AE60" stroke-width="2" fill="none" marker-end="url(#arrowhead)"/>
  <path d="M 450 480 L 450 700" stroke="#2980B9" stroke-width="2" fill="none" marker-end="url(#arrowhead)"/>
  <path d="M 710 480 L 710 700" stroke="#2980B9" stroke-width="2" fill="none" marker-end="url(#arrowhead)"/>
  
  <!-- Technology Stack Box -->
  <rect x="50" y="820" width="1280" height="150" rx="8" fill="white" stroke="#BDC3C7" stroke-width="2" filter="url(#shadow)"/>
  <text x="700" y="850" font-family="Arial, sans-serif" font-size="18" font-weight="bold" text-anchor="middle" fill="#2C3E50">Technology Stack</text>
  
  <text x="80" y="880" font-family="Arial, sans-serif" font-size="13" font-weight="bold" fill="#34495E">Languages & Frameworks:</text>
  <text x="80" y="900" font-family="Arial, sans-serif" font-size="12" fill="#7F8C8D">Java | Spring Boot | Spring Cloud</text>
  
  <text x="380" y="880" font-family="Arial, sans-serif" font-size="13" font-weight="bold" fill="#34495E">Data Layer:</text>
  <text x="380" y="900" font-family="Arial, sans-serif" font-size="12" fill="#7F8C8D">MongoDB | MySQL | Apache Kafka</text>
  
  <text x="650" y="880" font-family="Arial, sans-serif" font-size="13" font-weight="bold" fill="#34495E">Infrastructure:</text>
  <text x="650" y="900" font-family="Arial, sans-serif" font-size="12" fill="#7F8C8D">Netflix Eureka | Resilience4J | KeyCloak</text>
  
  <text x="980" y="880" font-family="Arial, sans-serif" font-size="13" font-weight="bold" fill="#34495E">DevOps:</text>
  <text x="980" y="900" font-family="Arial, sans-serif" font-size="12" fill="#7F8C8D">Docker | Maven | Jib</text>
  
  <text x="80" y="930" font-family="Arial, sans-serif" font-size="13" font-weight="bold" fill="#34495E">Gateway:</text>
  <text x="80" y="950" font-family="Arial, sans-serif" font-size="12" fill="#7F8C8D">Spring Cloud Gateway</text>
  
  <text x="380" y="930" font-family="Arial, sans-serif" font-size="13" font-weight="bold" fill="#34495E">Service Discovery:</text>
  <text x="380" y="950" font-family="Arial, sans-serif" font-size="12" fill="#7F8C8D">Netflix Eureka</text>
  
  <text x="650" y="930" font-family="Arial, sans-serif" font-size="13" font-weight="bold" fill="#34495E">Security:</text>
  <text x="650" y="950" font-family="Arial, sans-serif" font-size="12" fill="#7F8C8D">OAuth 2.0 | OpenID Connect</text>
  
  <text x="980" y="930" font-family="Arial, sans-serif" font-size="13" font-weight="bold" fill="#34495E">Messaging:</text>
  <text x="980" y="950" font-family="Arial, sans-serif" font-size="12" fill="#7F8C8D">Event-Driven Architecture</text>
  
  <!-- Arrow marker definition -->
  <defs>
    <marker id="arrowhead" markerWidth="10" markerHeight="10" refX="9" refY="3" orient="auto">
      <polygon points="0 0, 10 3, 0 6" fill="#2C3E50" />
    </marker>
  </defs>
  
  <!-- Legend -->
  <rect x="1120" y="360" width="200" height="150" rx="5" fill="white" stroke="#BDC3C7" stroke-width="1.5"/>
  <text x="1220" y="385" font-family="Arial, sans-serif" font-size="14" font-weight="bold" text-anchor="middle" fill="#2C3E50">Legend</text>
  
  <line x1="1135" y1="405" x2="1165" y2="405" stroke="#7F8C8D" stroke-width="2"/>
  <text x="1175" y="410" font-family="Arial, sans-serif" font-size="11" fill="#34495E">Synchronous</text>
  
  <line x1="1135" y1="430" x2="1165" y2="430" stroke="#E67E22" stroke-width="2"/>
  <text x="1175" y="435" font-family="Arial, sans-serif" font-size="11" fill="#34495E">Asynchronous</text>
  
  <line x1="1135" y1="455" x2="1165" y2="455" stroke="#E74C3C" stroke-width="2" stroke-dasharray="5,5"/>
  <text x="1175" y="460" font-family="Arial, sans-serif" font-size="11" fill="#34495E">Authentication</text>
  
  <line x1="1135" y1="480" x2="1165" y2="480" stroke="#F39C12" stroke-width="2" stroke-dasharray="5,5"/>
  <text x="1175" y="485" font-family="Arial, sans-serif" font-size="11" fill="#34495E">Service Discovery</text>
</svg>


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
