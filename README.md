# Like Lion Sping Server Study
## 🧾규칙
- `커밋 컨벤션`
  - Feat: 새로운 기능 추가
  - Fix: 버그 수정
  - Docs: 문서 수정
  - Style: 코드 포맷팅, 세미콜론 누락, 코드 변경이 없는 경우
  - Refactor: 코드 리팩토링
  - Test: 테스트 코드, 리팩토링 테스트 코드 추가
  - Chore: 빌드 업무 수정, 패키지 매니저 수정
  
- `issue 규칙`
   -참고: <https://velog.io/@junh0328/협업을-위한-깃허브-이슈-작성하기>  
   -레이블 참고: <https://github.com/modolee/github-initial-settings>  
   -제목 참고: <https://doublesprogramming.tistory.com/256>  
    
   - 템플릿
      - issue 제목
        - 예시:[Feat] 이슈 정리
      - issue 템플릿 
      
        `## 🧾이슈 내용 `  
        `## ✅체크리스트`     
        `## 📚레퍼런스`  
      
      - 제목 예시
        - [Add] UI button 구현
      
- `branch 규칙`
  - 각자의 영어 이름을 딴 branch 명을 사용한다
  - 예시:
  ` git checkout -b <브랜치명>`  
  ` git checkout -b songhyeon`  
- `commit message 규칙`  
  - 참고 : <https://doublesprogramming.tistory.com/256>  
  - [종류] 메시지 - #이슈번호
  - 예시
    - [Feat] todo-list 회원 API 엔티티 구현 - #2
    - [Fix] todo-list 회원 단건 조회 서비스 에러 수정 - #2
    
  - PR 규칙
    - PR 템플릿
    ` 이슈번호`  
    ` 구현 사항`   
    `기타`
## 📚스터디 주제      
### todo-list ERD 설계 및 DB 연동
- 1주차 2023.01.16(월) - 2023.01.22(일)
    1. `todo-list 프로젝트 시작`
    1. tool: ERD cloud 등
    2. JDBC, MYSQL를 이용한 DB 연동
    3. JPA를 활용하기 전 DB(repository) 작성
    4. JPA를 활용한 DB(repository) 작성
    5. Entity 작성

***
### todo-list API 명세서 작성/로직 구현
- 3,4주차 2023.01.23(월) - 2023.02.05(일)
1.  todo-list API 명세서 작성
    1. 문서 작성(예시:노션)
    2. swagger 띄우기
2. service 구현
3. controller 구현
4. 구현한 서버 시현
    1. swagger
    2. postman
    3. 그 외
***
### todo-list Login API 구현
- 5,6,7주차 2023.02.06(월) - 2023.02.26(일)
  `5주차`
    - Access Token을 활용한 인증(JWT)
    - spring security + JWT
      `6주차`
    - Login API 명세서
    - Login 관련 구현
    - Login API 시현
***
### 유효성 검사와 예외처리
- 8주차 2023.02.27(월) - 2023.03.05(일)
- 유효성 검사
- 예외 처리
- todo-list 프로젝트에 적용하기
