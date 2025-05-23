# Restaurant Review App


# Project Setup Guide

This guide will walk you through the necessary steps to set up and run the project, including setting up the frontend, backend, Elasticsearch, Kibana, and Keycloak services.

## Running the Frontend

Once you have downloaded the frontend source code, you'll need to unzip the directory and navigate to it in a terminal.

### Installing Dependencies
To install the dependencies for the project, run:

```bash
npm install
```

### Run the Frontend
To run the frontend, execute the following command:

```bash
npm run dev
```

This will start the Next.js development server, and the app will be available at [http://localhost:3000](http://localhost:3000).

#### Summary:
- Downloaded the frontend source code.
- Installed the frontend dependencies with `npm install`.
- Ran the frontend project with `npm run dev`.

---

## Starting the Services

To start Elasticsearch, Kibana, and Keycloak, open your terminal in the project root directory and run:

```bash
docker-compose up -d
```

The `-d` flag runs the containers in the background. Wait about a minute for all services to start completely.

---

## Configuring Spring Boot

Now we need to configure Spring Boot to connect to Elasticsearch and Keycloak.

### Configuring Elasticsearch

In your `application.properties` file, add the following line to point to your local Elasticsearch instance:

```properties
spring.elasticsearch.uris=http://localhost:9200
```

### Configuring Keycloak

To configure Keycloak in Spring Boot, add the following property to your `application.properties`:

```properties
spring.security.oauth2.resourceserver.jwt.issuer-uri=http://localhost:9090/realms/restaurant-review
```

This tells Spring Security to validate JWT tokens from the Keycloak instance running at `localhost:9090`.

---

## Accessing Keycloak

Once Keycloak is up and running, you can access its administration console.

- Open your web browser and navigate to [http://localhost:9090](http://localhost:9090).
- Click on the **Administration Console** link and log in using the following credentials:
    - Username: `admin`
    - Password: `admin`

---

## Verifying the Setup

To verify that everything is working correctly:

1. Open your web browser and navigate to [http://localhost:9200](http://localhost:9200).
2. You should see a JSON response with Elasticsearch cluster information.
3. Visit [http://localhost:5601](http://localhost:5601) to access Kibana, a tool for managing and visualizing your Elasticsearch data.


