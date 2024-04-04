# Aplicativo de Clínica Médica (Back-End)

Bem-vindo ao repositório do aplicativo de uma clínica médica fictícia. Este aplicativo foi desenvolvido como parte de um curso na plataforma Alura, para demonstrar o desenvolvimento de uma API RESTful com Spring Boot.

## Sobre o projeto!

O objetivo deste aplicativo é fornecer uma plataforma para gerenciar o cadastro de médicos e pacientes de uma clinica Médica ele oferece as seguintes funcionalidades principais:

- Cadastro, visualização, atualização e exclusão de médicos.
- Cadastro, visualização, atualização e exclusão de pacientes.
- Validações de dados para garantir a integridade das informações.
- Paginação e ordenação dos resultados para facilitar a navegação.

## Tecnologias e ferramentas Utilizadas!

- Spring Boot 3: Utilizado para desenvolvimento do back-end da aplicação.
  
- Java 17: fornecendo recursos modernos.
  
- Lombok: Biblioteca utilizada para reduzir a verbosidade do código, gerando automaticamente getters, setters, construtores e outros métodos repetitivos. Isso torna o código mais limpo e legível.

- DTO (Data Transfer Object): Utilizado para transferir dados entre os controladores da API e os serviços. Esses objetos são usados para encapsular os dados enviados ou recebidos em requisições HTTP, facilitando o controle sobre quais dados são expostos pela API.

- Records: Utilizados para representar dados imutáveis e sem comportamento adicional, como as informações retornadas pela API em formato de registros simples.

- MySQL: Banco de dados utilizado para armazenar informações sobre médicos, pacientes e consultas (ainda não implementado).
  
- Flyway: Utilizado para controle de versão e migração do banco de dados, garantindo que todas as alterações de esquema sejam aplicadas de forma consistente.
  
- JPA/Hibernate: Camada de persistência utilizada para interagir com o banco de dados MySQL.
  
- Maven: Gerenciador de dependências utilizado para configurar e construir o projeto.
  
- Insomnia: Ferramenta de teste de API utilizada para simular requisições e verificar o funcionamento da API.


## Funcionalidades do Projeto!

O projeto consiste em uma API RESTful que fornece endpoints para realizar operações CRUD (Create, Read, Update, Delete) em médicos, pacientes. Além disso, inclui validações de entrada de dados, paginação e ordenação dos resultados.

## Estrutura do Projeto!

A estrutura do projeto está organizada da seguinte forma:

- `src/main/java`: Contém os pacotes Java do projeto.
  - `br.com.med.voll.api.controller`: Controladores da API, responsáveis por receber as requisições HTTP e encaminhá-las para o serviço apropriado.
  - `br.com.med.voll.api.medico`: Classes relacionadas aos médicos, incluindo entidades, DTOs e serviços para operações relacionadas aos médicos.
  - `br.com.med.voll.api.paciente`: Classes relacionadas aos pacientes, incluindo entidades, DTOs e serviços para operações relacionadas aos pacientes.
  - `br.com.med.voll.api.endereco`: Classes relacionadas aos endereços, incluindo entidades e utilitários para manipulação de endereços.
  - `br.com.med.voll.api.repository`: Interfaces dos repositórios JPA, responsáveis por fornecer acesso aos dados no banco de dados.
  
- `src/main/resources`: Recursos do projeto, como arquivos de configuração e scripts SQL.
  - `application.properties`: Arquivo de configuração do Spring Boot, onde são definidas as configurações da aplicação, como a conexão com o banco de dados e as propriedades do servidor..

## Execução do Projeto!

Para executar o projeto localmente, siga as instruções abaixo:

1. Certifique-se de ter o Java 17 e o Maven instalados em sua máquina.
2. Clone este repositório em sua máquina local.
3. Configure o banco de dados MySQL e atualize as informações de conexão no arquivo `application.properties`.
4. Execute o comando `mvn spring-boot:run` na raiz do projeto para iniciar a aplicação.
5. O aplicativo estará disponível em `http://localhost:8080`.

## Testando o Aplicativo!

Você pode testar o aplicativo usando a ferramenta Insomnia ou qualquer outra ferramenta de teste de API. As rotas disponíveis estão documentadas na seção de funcionalidades do projeto.

## Contribuição!

Se encontrar algum problema ou tiver alguma sugestão de melhoria são muito be vindas, sinta-se à vontade para enviar um pull request.

