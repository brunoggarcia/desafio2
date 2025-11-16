# Viagens API (em memória)

Projeto Spring Boot (Java 17) demonstrativo sem integração com banco de dados — todos os destinos ficam em memória.

## Rodar
- Build: `mvn clean package`
- Rodar: `mvn spring-boot:run` ou executar o jar em `target/viagens-api-0.0.1-SNAPSHOT.jar`

## Swagger UI
Ao rodar a aplicação, a documentação Swagger UI estará disponível em:
`http://localhost:8080/swagger-ui/index.html`

## Endpoints principais
- POST /destinos
- GET  /destinos
- GET  /destinos/{id}
- GET  /destinos/pesquisar/nome?nome=
- GET  /destinos/pesquisar/localizacao?localizacao=
- PUT  /destinos/{id}
- PATCH /destinos/{id}
- POST /destinos/{id}/reservar
- DELETE /destinos/{id}
