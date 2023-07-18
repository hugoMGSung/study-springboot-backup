# Spring Boot (Gradle) Start
스프링부트 그레이들로 시작하기 with VS Code

## ORM
```java
@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public List<Member> test() {
        memberRepository.save(new Member(2L, "Ashley Park"));

        Optional<Member> member = memberRepository.findById(2L);
        List<Member> allMembers = memberRepository.findAll();
        //memberRepository.deleteById(2L);
        return allMembers;
    }
}
```

### 실행결과
<img src="https://raw.githubusercontent.com/hugoMGSung/study-springboot/main/Images/springboot004.png" width="700" />
