[웹 개발 상식]

server : 기능을 제공하는 컴퓨터

Client : 기능을 요청하고 이용하는 고객 컴퓨터

        요청(Request) --->
Client                      server
        <--- 응답(Response)

-----------------------------------------------------

HTTP(Hyper Text Transfer Protocol)
- 서버 - 클라이언트 간의
  HTML 요청 - 응답 전송(전달)규약
  (인터넷에서 HTML을 주고 받을 때의 약속)

IP(Internet Protocol)
 : 인터넷/네트워크를 통해 데이터를 송수신하는 규약
  -> 인터넷/네트워크에 연결된 각종 통신기기를 구분하는 주소
     (컴퓨터, 휴대폰, 단말기 등등)

IPv6 주소 . . . . : fe80::29cf:6738:7e6c:a283%5
IPv4 주소 . . . . : 192.168.10.17

Port 번호 : 컴퓨터 내 프로그램을 구분하는 식별 번호

IP + Port 번호를 알아야
다른 컴퓨터(서버)에 요청을 할 수 있다
ex) http:// 192.168.10.5:8080


bin 에서 cmd 후 startup.bat
후 인터넷 에서 127.0.0.1:8080 or localhost:8080

제너럴 - show heap status
       - 아래 워크 스페이스 - refresh using native
font - 컬러 앤 폰트 - 베이직 - 맨 아래 text font

Runtime Environment -> Add -> Apache -> Apache Tomcat 10.1 선택 후 Next
압축 푼 아파치 선택


-------------------[Servlet]----------------------
클라이언트의 요청(Request)을 처리하고
그 결과를 다시 클라이언트에게 응답(Response)하는
Servlet클래스의 구현 규칙을 지킨 자바 프로그래밍 기술

브라우저 : HTML 해석 도구, 서버 요청

1. 클라이언트가 브라우저에 주소로 요청으로 보내면
2. 서버가 HTML로 응답을 해줘서
        - Servlet 이용
3. 클라이언트 브라우저가 이를 해석해서 화면에 출력해줌


[Servlet Container]
- 어떤 환경에서나 실행 하기 위해 필요한
  모든 요소를 포함 하는 소프트웨어 패키지

HTTP 포트 번호 중 80번
-http:/ / 요청시 80번 포트는 생략 가능!
  (참고 : jttps는 443번 생략 가능)

ex) http:/ /localhost:80
        == http:/ /localhost:

  - {Servlet 동작 방식(순서)}
  1.요청
  1. 객체 생성
  3. Servlet Class 찾기
  4. init() (initialize - 초기화)
  5. req, resp
  6. 응답

------------
vs 에
jsp , jstl 검색설치, 설정 - emmet 후 설정 include langueage jsp & html 추가
설정 - snippets - jsp 검색 후 복붙
---------------

[JSP(Java Server Page)] : Java 에서 html코드로 작성이 어려워
                        기본 작성법을 html로 바꿈

- 표기법은 HTML 이지만 컴파일 시 Servlet으로 변환되어짐
- (HTML 내부에 Java 코드를 작성하는 듯한 형태)

- scriptlet(<% %>, <%= %>), EL(${}), JSTL(<c:if>) 등으로 Java 코드를 표기

<%= %> = view 부분의 write 에서 "" 없이 표현 하게 하는것


- [JSP 동작 구조]
  jspFile.jsp ==> _jspFile.java ==> _jspFile.class

Servlet과 JSP 는 형태가 다르지만 같음




[작성 방법]
doGet, doPost 방식

// 1) 요청 위임할 JSP 경로 작성
//	  -> webapp 폴더를 "/" (최상위 폴더)로 생각하고 작성
String path = "/WEB-INF/views/sign_result.jsp";
		
// 2) 요청을 위임 시켜줄 객체 얻어오기
//     + 어디로 위임할지 매개 변수에 작성
//   -> RequestDispatcher(요청 발송자)
RequestDispatcher dispatcher = req.getRequestDispatcher(path);
		
// 3) HttpServletRequest/Response 두 객체를
//	  요청 위임(forward) 할 JSP 에서 넘기기
dispatcher.forward(req, resp);



 클라이언트가 서버로 요청을 하는 방법
      1) form 제출 (GET/POST)
      2) a 태그    (GET)
      3) JS - location.href = "주소"; (GET)
      4) JS - Ajax (GET/POST/PUT/DELETE)