# Spring Boot Multi Modules

## 환경

- Spring Boot : 2.5.6
- Gradle : 7.2
- Java : 11

## 프로젝트 구조

- `root` : 최상위 프로젝트, java 사용시 관련 의존성 (Lombok)
- `module-common` : 프로젝트 공통 설정 (config, utils, exception)
- `module-domain` : 프로젝트 공통 도메인 (Entity, DB Connection)
- `module-api` : Rest API 서버
- `module-admin` : MVC Web(Thymeleaf) 서버