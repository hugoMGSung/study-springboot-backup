# Spring Boot (Gradle) Start
스프링부트 그레이들로 시작하기 with VS Code

## 최초 설정 방법
1. VS Code에서 Ctrl + Shift + p
2. Spring initializer: Gradle 선택
3. Spring Boot version 선택: 3.1.1 (버전은 3.0.8 이상)
4. Project language 선택: Java
5. Group Id 등록: com.hugo83 (Default는 com.example)
6. Artifact Id 등록: sb-gradle-start
7. Packaging type 선택: JAR
8. Java Version 선택: 17
9. Search for dependencies: Spring Web

### Test
TestController.java
```java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "Hello, Spring Boot!";
    }
}
```

### 실행결과
<img src="https://raw.githubusercontent.com/hugoMGSung/study-springboot/main/Images/springboot000.png" width="700" />