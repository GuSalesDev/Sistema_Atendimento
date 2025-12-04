# Sistema de Atendimento – Java/Maven

Este projeto é um Sistema de Atendimento destinado a ambientes como ONG, clínica ou escola.  
A aplicação foi construída com foco em organização, modularidade e boas práticas de programação orientada a objetos.

## Funcionalidades
- Cadastro de pessoas para atendimento  
- Listagem de usuários cadastrados  
- Agendamento de atendimentos  
- Gerenciamento de fila (adição e atendimento do próximo)  
- Exibição da quantidade atual de atendimentos na fila  

## Tecnologias Utilizadas
- Java 21
- Maven  
- Git e GitHub  

## Estrutura do Projeto
- `model` – Entidades principais (Person, Atendimento, FilaAtendimento)  
- `service` – Regras de negócio (AtendimentoService)  
- `app` – Classe principal para execução  

## Como Executar
1. Certifique-se de ter o Java 21 instalado.  
2. Baixe o projeto ou clone o repositório:  
   ```bash
   git clone https://github.com/SEU_USUARIO/SEU_REPO.git
