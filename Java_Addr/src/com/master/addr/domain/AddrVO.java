package com.master.addr.domain;
/*
 * domain 객체
 * 주로 1개의 데이터를 담아서 이동, 처리하는 용도로 사용하는 클래스(객체)
 * 
 * 클래스를 객체로 선언하고 초기화 할때 호출하는 생성자는
 * 
 * 매겨변수가 없는 기본 생성자와 
 * 필드변수 리스트를 매개변수로 받아서 필드변수 값을 지정하는 필드생성자를 만들수있다.
 */

public class AddrVO {
	/*
	 * 
	 * 
	 * 변수? 말뜻 그대로 풀이하자면 변하는 수 사용자에의해 값이 변화되는 수이다.
	 * 
	 * 
	 * 변수에대해 알기전에 JVM과 JVM에서 사용되는 메모리에대해 알아야한다. 메모리가 왜중요하냐?? 자 메모리는 쉽게말해 용량이라고
	 * 표현가능하다. 동일한 기능을 하는 프로그램 인데 메모리 차이가2배라고해보자 지금같이 대용량메모리가 나온시대에서는 크게 상관이 없을수도있다
	 * 하지만 약15년 전만해도 프로그램에서 사용되는 메모리의 크기에따라 개발을 하는데 드는 비용이 많이 차이가 났었다. 지금도 큰 프로젝트를
	 * 하게 됬을시 메모리 관리는 엄청 중요한 것중에 하나이다. 여기서는 이해를 위한 개괄적 설명일뿐 더깊게 알고싶으면 구글링하자
	 * 
	 * 
	 * 
	 * JVM? 자바라는 프로그램이 어떤환경에 서도 돌아가도록 만들어주는 실제 운영체제(ms,Linux, ios) 위에 Java에서 가상으로 만든
	 * 운영체제를 뜻한다. JVM에서 메모리를 관리하는 방법이있는데 힙(Heap)과 스택(Stack)이다.
	 * 
	 * 
	 * 
	 * 힙(Heap)영역, 스택(Stack)영역, 메소드(method)영역
	 * 
	 * 메소드 영역 자바 프로그램에서 사용되는 클래스에 대한 정보와 함께 클래스 변수가 저장되는 영역
	 * 
	 * 
	 * 힙은 >> 동적할당영역 스택은 >> 정적할당영역이라고하는데 어렵게 생각하지말고 필자의 설명을 따라오길바란다. 1. 힙은 연필로 적어놓고
	 * 언제든 지우개로 지울수있는영억 스택은 볼펜으로 적어서 한번적으면 지워지지않는 영역이라 생각을해보고 구체적인 설명은 밑에서하기로한다. 개념을
	 * 이해할때는 너무 딱딱한 자세보다는 유연하게 생각을 해라 또이렇게 이야기하면 볼펜으로적어도 지울수있다 라고 말하는 사람이있지만 스택에
	 * 저장되어있는 메모리도 코드가 지워지면 당연히 할당된 영역이 없어지기마련이다. 유연한 생각을하자. 중요한점은 값을 저장하는 방식이다.
	 *
	 * 2. 힙영역 >> 값에대한 주소 값을 저장함 New 키워드 연산자로 생성된 객체 또는 인스턴스와 배열을 저장한다. 힙영역에서 생성된 객체와
	 * 배열을 스택 영역의 변수나 다른 객체의 필드 에서 참조한다. 참조하는 변수나 필드가 없다면 의미 없는 객체가 되어 GC(Garbage
	 * Collection)의 대상이된다.
	 * 
	 * 
	 * 스택영역 >> 실제 값을 저장함 메소드가 호출될때마다 값을 추가하고 매소드가 종료시 값을 제거하는 동작을 수행한다. FILO(First
	 * in Last Out)구조로 Push 와 pop기능 사용한다.
	 * 
	 * 
	 * 쉽게말해서 힙은 집주소 스택은 집에살고있는 구성원의 수라고 생각해도 될듯하다. 집주소는 한번 지정되면 바뀌지 않는다. ex) ~아파트
	 * 106동 1118호 하지만 구성원은 언제든지 바뀔수있는 개념이다. 자식이 독립을 한다던지, 이사를 간다던지 다양하게 바뀔수있다.
	 * 
	 * 변수의 종류는 총7가지가있다. 기본형변수, 참조변수, 멤버변수, 클래스변수, 인스턴스변수, 지역변수, 매개변수
	 * 
	 * 필자는 이개념을 이해하는데 상당히 오랜시간이 걸렸다. 대가리가 돌이였나보다. 하지만 쉽게 간단하게 할수있는것만 생각하라 당신은 나보다
	 * 똑똑하다. data에대해 서두에 적은 이유가 여기서 나오게된다. data type에 따른 변수를 분류해보자면 2가지로 줄어든다.
	 * 
	 * 기본형변수 >> 자료의 "실제 값" 을 저장한다. boolean >> 논리형 char >> 문자형 byte >> 숫자형 short >>
	 * 숫자형 int >> 숫자형 long >> 숫자형 float >> 숫자형 double >> 숫자형
	 * 
	 * 참조형변수 >> 자료의 "주소 값" 을 저장한다. 8가지 기본형 변수를 제외한 나머지 모든 변수를뜻한다.
	 * 이점에대해 이해가 끝났으면 개괄적으로 코딩을할 준비가 됬다고 생각이 든다
	 * 마지막으로 정말 중요한 개념이 나온다 생성자라는 개념인데
	 * 필자는 위에서 언급했다 시피 돌대가리 이므로 진짜 고생했다. 우리가 전에 공부했단
	 * 상속성, 다형성, 추상성, 캡슐화라는 개념까지 전부이해를 마치고난 후 세부적 개념들에대해 
	 * 명확하게 알고있다고 확신이들면 생성자개념을 들어가도 좋다고 본다
	 * 이개념들을 다 이해했으면 생성자라는 개념을 이해후 한단계 더 발전한 자신을 볼수있을 것이다.
	 */

	/* 인스턴스변수
	 * 
	 * 인스턴스변수란?
	 * 말그대로 인스턴스를 생성해야지만 쓸수있는 변수들이다.
	 * 이런식으로 접근 제한자를 걸어둔 변수는 바로 
	 * 변수에 접근을 하지 못하기때문에 
	 * 다른방식이 필요하다. (캡슐화와 밀접한 관련성이 있다.)
	 *
	 * 
	 * 그래서 나온것이 생성자이다.
	 * 
	 * Class 이름과 같고 형식은 매서드 형식으로
	 * 이루어져있다. 그리고 가장큰 특징중 하나는
	 * return값을 갖지 않는다.
	 *  
	 * 
	 * 
	 * 
	 */
	private String name;
	private String tel;
	private String addr;
	private int age;
	private String net;

	/*
	 * 객체생성시 인스턴스변수들 에게 특별히 값을 만들어주고 싶을때 임의로 기본생성자를 만들고 ctrl + space 필드변수들에 값을 Setting
	 * 할수 있다.
	 */
	public AddrVO() {
		this.name = "이름을 입력하세요";
		this.tel = "전화번호를 입력하세요";
		this.addr = "주소를 입력하세요";
		this.age = 0;
		this.net = "관계를 입력하세요";
	}

	public AddrVO(String name, String tel, String addr, int age, String net) {
		//this.name이 가리키는것은 인스턴스변수를 뜻하고 
		//  = name이 뜻하는것은 AddrVO 매서드의 매개변수를뜻한다.
		this.name = name;
		this.tel = tel;
		this.addr = addr;
		this.age = age;
		this.net = net;

	}

	/*
	 * 필드(변수) 생성자 객체를 초기화 하면서 동시에 데이터를 Setting 하고자할때 호출하는 생성자
	 */

	public AddrVO(String name, String tel) {

		this.name = name;
		this.tel = tel;

	}

	public AddrVO(String name, int age) {

		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNet() {
		return net;
	}

	public void setNet(String net) {
		this.net = net;
	}

}
