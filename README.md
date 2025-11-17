## ▶️ Como Executar o Projeto

### 1. Clone o repositório
```bash
git clone https://github.com/brunoggarcia/desafio2.git
```

### 2. Acesse o diretório do projeto
```bash
cd SEU_REPO
```

### 3. Execute o projeto
```bash
mvn spring-boot:run
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
**GET /destinos/pesquisar?termo=xxx**
```bash
curl "http://localhost:8080/destinos/pesquisar?termo=praia"
```

---

### 📍 **Pesquisar por localização**
**GET /destinos/pesquisar?termo=xxx**
```bash
curl "http://localhost:8080/destinos/pesquisar?termo=natal"
```

---

### ⭐ **Avaliar destino**
**POST /destinos/{id}/avaliar?nota=xxx**
```bash
curl -X POST "http://localhost:8080/destinos/1/avaliar?nota=8"
```

### 🗑️ **Excluir destino**
**DELETE /destinos/{id}
```bash
curl -X DELETE "http://localhost:8080/destinos/1"
```

---

## 📄 Licença
Este projeto é livre para uso e modificação.
