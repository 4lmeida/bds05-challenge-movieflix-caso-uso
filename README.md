<h1 align="center"> :movie_camera: Movie Flix :tv: </h1>
<p align="center">
  <img src="https://img.shields.io/static/v1?label=spring&message=framework&color=blue&style=for-the-badge&logo=SPRING"/>
  <img src="https://img.shields.io/static/v1?label=Postman&message=API management&color=blue&style=for-the-badge&logo=postman"/>
  <img src="https://img.shields.io/static/v1?label=Apache&message=Dependency manager&color=blue&style=for-the-badge&logo=apache"/>
  <img src="http://img.shields.io/static/v1?label=License&message=MIT&color=green&style=for-the-badge"/>
  <img src="http://img.shields.io/static/v1?label=STATUS&message=CONCLUIDO&color=RED&style=for-the-badge"/>
</p>  

> Status do Projeto: :heavy_check_mark: (Concluído)

### Tópicos

:small_blue_diamond: [Sobre o projeto](#Sobre-o-projeto-open_file_folder)

:small_blue_diamond: [Funcionalidades](#Funcionalidades)

:small_blue_diamond: [Modelo Conceitual](#Modelo-conceitual-page_with_curl)

:small_blue_diamond: [Layout](#Layout-mag_right)

:small_blue_diamond: [Como rodar a aplicação](#como-rodar-a-aplicação-arrow_forward)

# Sobre o projeto :open_file_folder:

O MovieFlix é um dos desafios que a escola [DevSuperior](https://devsuperior.com.br/cursos), propõem para avançar no curso e, desta vez, o objetivo é continuar implementando funcionalidades nele.
As implementações da vez são alguns endpoints como listagem dos gêneros, bem como dos filmes paginados em ordem alfabetica por título, inserção de avaliação(MEMBER) e validação das informações.


<p>
O sistema MovieFlix consiste em um banco de filmes, os quais podem ser listados e avaliados
pelos usuários. Usuários podem ser visitantes (VISITOR) e membros (MEMBER). Apenas
usuários membros podem inserir avaliações no sistema.
</p>

## Funcionalidades

:heavy_check_mark: Testa componentes da aplicação.

:heavy_check_mark: Listagem de filmes paginada, ordenadas alfabeticamente.

:heavy_check_mark: Filtra os filmes  por gênero.

:heavy_check_mark: Obtém página detalhada e registra avaliação.

:heavy_check_mark: Autorização e autenticação.

:heavy_check_mark: Validação.

# Layout :mag_right:

- Layout:

  ![Login](/src/main/assets/login-movieflix.png)

  ![Listagem de filmes](/src/main/assets/list-movieflix.png)

  ![Filme selecionado por id](/src/main/assets/movieId-movieflix.png)

- Endpoints:

![](/src/main/assets/bds5-challenge-movieflix-caso-uso-endpoints.gif)

- Testes:

![](/src/main/assets/bds5-challenge-movieflix-caso-uso-test.gif)

# Modelo conceitual :page_with_curl:
![Modelo Conceitual](/src/main/assets/domain-model-movieflix.png)

![Padrão camadas](/src/main/assets/padrao-camadas.png)

## Linguagens, dependencias e libs utilizadas :books:
- [JAVA](https://www.java.com/pt-BR/)
- [JPA](https://spring.io/projects/spring-data-jpa) / [Hibernate](https://hibernate.org/)
- [Maven](https://maven.apache.org/)
- [H2](https://www.h2database.com/html/main.html)
- [JUnit](https://junit.org/junit5/)
- [Mockito](https://site.mockito.org/)
- [Jakarta Bean validation](https://beanvalidation.org)
- [JWT](https://jwt.io)
- [OAuth 2.0](https://oauth.net/2/)
- [Spring Security](https://docs.spring.io/spring-security/reference/index.html)
- [Spring Cloud](https://docs.spring.io/spring-cloud/docs/current/reference/html)
- [Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html)


## Casos de Uso

### Efetuar login
1. [IN] O usuário anônimo informa seu email e senha
2. [OUT] O sistema informa um token válido
### Listar filmes
1. [OUT] O sistema apresenta uma listagem dos nomes de todos gêneros, bem como uma
   listagem paginada com título, subtítulo, ano e imagem dos filmes, ordenada
   alfabeticamente por título.
2. [IN] O usuário visitante ou membro seleciona, opcionalmente, um gênero.
3. [OUT] O sistema apresenta a listagem atualizada, restringindo somente ao gênero
   selecionado.
###  Visualizar detalhes do filme
1. [IN] O usuário visitante ou membro seleciona um filme
2. [OUT] O sistema informa título, subtítulo, ano, imagem e sinopse do filme, e também
   uma listagem dos textos das avaliações daquele filme juntamente com nome do usuário
   que fez cada avaliação.
3. [IN] O usuário membro informa, opcionalmente, um texto para avaliação do filme.
4. [OUT] O sistema apresenta os dados atualizados, já aparecendo também a avaliação
   feita pelo usuário.
### Exceção 3.1 - Texto vazio
   3.1.1. O sistema apresenta uma mensagem de que não é permitido texto vazio na
   avaliação


## SQL :floppy_disk:

### Usuários:

| name | email           | password |
|------|-----------------|----------|
| Ana  | ana@hotmail.com | 123456   |
| Bob  | bob@hotmail.com | 123456   |

### Gênero:

| name    | 
|---------|
| Comédia |
| Terror  |
| Drama   |

### Papel:

| authority |
|-----------|
| MEMBER    |
| VISITOR   |

# Como rodar a aplicação :arrow_forward:

Pré-requisitos: Java 17

```bash
# clonar repositório
https://github.com/4lmeida/bds05-challenge-moveflix-caso-uso.git

# entrar na pasta do projeto bds05-challenge-moveflix-caso-uso
cd bds05-challenge-moveflix-caso-uso

# executar o projeto
./mvnw spring-boot:run
```
# Autores

| [<img src="https://avatars.githubusercontent.com/u/93017964?v=4" width=115><br><sub>Luís Almeida</sub>](https://github.com/4lmeida) | [<img src="https://avatars.githubusercontent.com/u/13897257?v=4" width=115><br><sub>Nélio Alves</sub>](https://github.com/acenelio) |
| :---: | :---:|



## Licença

The [MIT License](/LICENSE)(MIT)

Copyright :copyright: 2023 - Movie Flix

:top: [Voltar para o top](#Tópicos)