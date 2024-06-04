# Sistema de Agendamento de Transferências Financeiras

## Tecnologias Utilizadas

- Backend: Java 11, Spring Boot
- Frontend: Angular
- Banco de Dados: H2

## Configuração do Projeto

### Backend

1. Navegue até o diretório do projeto backend.
2. Execute o comando `mvn spring-boot:run` para iniciar o servidor backend.

### Frontend

1. Navegue até o diretório do projeto frontend.
2. Execute o comando `npm install` para instalar as dependências.
3. Execute o comando `ng serve` para iniciar o servidor frontend.

## Funcionalidades

- Agendar transferências financeiras.
- Visualizar o extrato de transferências agendadas.

## Endpoints da API

- `POST /api/transfers` - Agendar uma nova transferência.
- `GET /api/transfers` - Obter todas as transferências agendadas.

## Instruções para Execução

1. Inicie o backend conforme instruções acima.
2. Inicie o frontend conforme instruções acima.
3. Acesse o frontend em `http://localhost:4200`.

Obs. como o prazo de entrega é um critério de avaliação, optei por deixar o projeto o mais clean 
possível na questão visual, visto que no dia a dia entregar valor ao cliente com
o sistema 100% funcional é o mais importante


