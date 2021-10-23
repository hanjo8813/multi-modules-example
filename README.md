# Spring Boot Multi Modules
> Spring Boot의 기본적인 멀티 모듈 구조 구현

<br>

## 환경

- Spring Boot : 2.5.6
- Gradle : 7.2
- Java : 11

<br>

## 프로젝트 구조

![img](https://user-images.githubusercontent.com/71180414/138574281-20536624-6ba5-4a6c-9b72-644bd698f43b.png)


- **root** : 최상위 프로젝트, java 사용시 관련 의존성
- **module-common** : 프로젝트 공통 설정 (config, utils, exception)
- **module-domain** : 프로젝트 공통 도메인 (Entity, DB Connection)
- **module-admin** : MVC Web(Thymeleaf) 서버 (port : `8081`)
- **module-api** : Rest API 서버 (port : `8082`)

<br>