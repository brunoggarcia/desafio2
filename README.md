## ▶️ Como Executar o Projeto

### 1. Clone o repositório
```bash
git clone https://github.com/SEU_USUARIO/SEU_REPO.git
```

### 2. Acesse o diretório do projeto
```bash
cd SEU_REPO
```

### 3. Execute o projeto
```bash
mvn spring-boot:run
```

A API iniciará em:
```
http://localhost:8080
```

---

## 📌 Endpoints da API — Exemplos Completos

### 📍 **Criar um destino**
**POST /destinos**
```bash
curl -X POST "http://localhost:8080/destinos" ^
 -H "Content-Type: application/json" ^
 -d "{ \"nome\": \"Praia Azul\", \"localizacao\": \"Natal\", \"descricao\": \"Lugar paradisíaco\" }"
```

---

### 📍 **Listar todos os destinos**
**GET /destinos**
```bash
curl "http://localhost:8080/destinos"
```

---

### 📍 **Buscar destino por ID**
**GET /destinos/{id}**
```bash
curl "http://localhost:8080/destinos/1"
```

---

### 📍 **Pesquisar por nome**
**GET /destinos/pesquisar?nome=xxx**
```bash
curl "http://localhost:8080/destinos/pesquisar?nome=praia"
```

---

### 📍 **Pesquisar por localização**
**GET /destinos/pesquisar?localizacao=xxx**
```bash
curl "http://localhost:8080/destinos/pesquisar?localizacao=natal"
```

---

### ⭐ **Avaliar destino**
**POST /destinos/{id}/avaliar?nota=xxx**
```bash
curl -X POST "http://localhost:8080/destinos/1/avaliar?nota=8"
```

Resposta esperada:
```
Nova média: 8.0
```

---

## 📄 Licença
Este projeto é livre para uso e modificação.
