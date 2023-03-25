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

:heavy_check_mark: Obtém o perfil do usuário logado.

:heavy_check_mark: Listagem de filmes paginada, ordenadas alfabeticamente.

:heavy_check_mark: Filtra os filmes  por gênero.

:heavy_check_mark: Obtém página detalhada e registra avaliação .

:heavy_check_mark: Autorização e autenticação.

:heavy_check_mark: Validação.

# Layout :mag_right:

- Endpoints:

![](https://github.com/4lmeida/bds04-challenge-moveflix-dominio-autorizacao/blob/main/src/assets/bds4-challenge-movieflix-endpoint.gif)

- Testes:

![](https://github.com/4lmeida/bds04-challenge-moveflix-dominio-autorizacao/blob/main/src/assets/bds4-challenge-movieflix-tests.gif)

# Modelo conceitual :page_with_curl:
![Modelo Conceitual](https://github.com/4lmeida/bds04-challenge-moveflix-dominio-autorizacao/blob/main/src/assets/domain-model-movieflix.png)

![Padrão camadas](https://github.com/4lmeida/bds04-challenge-moveflix-dominio-autorizacao/blob/main/src/assets/padrao-camadas.png)

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


# Como rodar a aplicação :arrow_forward:

Pré-requisitos: Java 17

```bash
# clonar repositório
https://github.com/4lmeida/bds04-challenge-moveflix-dominio-autorizacao.git

# entrar na pasta do projeto bds04-challenge-moveflix-dominio-autorizacao
cd bds04-challenge-moveflix-dominio-autorizacao

# executar o projeto
./mvnw spring-boot:run
```
# Autores

| [<img src="https://avatars.githubusercontent.com/u/93017964?v=4" width=115><br><sub>Luís Almeida</sub>](https://github.com/4lmeida) | [<img src="https://avatars.githubusercontent.com/u/13897257?v=4" width=115><br><sub>Nélio Alves</sub>](https://github.com/acenelio) |
| :---: | :---:



## Licença

The [MIT License](https://github.com/4lmeida/bds04-challenge-moveflix-dominio-autorizacao/blob/main/License)(MIT)

Copyright :copyright: 2023 - Movie Flix