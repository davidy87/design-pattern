# Singleton Pattern

<br>

## Singleton Pattern?

싱글톤 패턴은 하나의 클래스에 **오직 하나의 인스턴스**만 가지는 패턴이다.

하나의 클래스를 기반으로 여러 개의 개별적인 인스턴스를 만들 수 있지만, 그렇게 하지 않고 하나의 클래스를 기반으로 단 하나의 인스턴스를 
만들어 이를 기반으로 로직을 만드는데 쓰인다.
- 대표적으로 DB 연결 모듈에 많이 쓰인다.

<br>

## 장단점

### 장점

1. 하나의 인스턴스를 만들어 놓고 해당 인스턴스를 다른 모듈들이 공유하며 사용하기 때문에 인스턴스를 생성할 때 드는 비용이 줄어든다.
    - 최초 한번의 new 연산자를 통해서 고정된 메모리 영역을 사용하기 때문에, 추후 해당 객체에 접근할 때 메모리 낭비를 방지할 수 
   있다. 뿐만 아니라 이미 생성된 인스턴스를 활용하니 속도 측면에서도 이점이 있다고 볼 수 있다.

2. 다른 클래스 간에 데이터 공유가 쉽다
   - 싱글톤으로 만들어진 인스턴스가 전역으로 사용되기 때문에, 다른 클래스의 인스턴스가 해당 인스턴스에 접근하여 사용이 가능하다.
   - 하지만, 이로 인해 동시성 문제가 발생할 수 있다.

### 단점

1. 싱글톤 패턴을 구현하기 위한 코드가 많이 필요하다.
   - 동시성 문제까지 고려한다면 더 많은 양의 코드가 필요하게 된다.

2. 인스턴스에 대한 의존성이 높아진다.
    - 의존 관계 상 해당 인스턴스를 사용하는 클라이언트가 구체 클래스에 의존하게 된다.
    - new 키워드를 통해 클래스 내부에서 인스턴스를 생성하므로, SOLID 원칙 중 DIP를 위반하게 되고, OCP 또한 위반할 가능성이
      매우 높아진다.

3. 테스트를 진행할 때 걸림돌이 된다.
   - 싱글톤 패턴은 미리 생성된 하나의 인스턴스를 기반으로 구현하는 패턴이므로, 각 테스트마다 “독립적인” 인스턴스를 만들기 어렵다.

그 외에도 자식 클래스를 만들 수 없다는 점, 내부 상태를 변경하기 어렵다는 점 등 여러가지 문제점들이 존재한다. 이러한 문제점들을 
종합해보면, 싱글톤 패턴은 유연성이 매우 낮은 디자인 패턴이라고 볼 수 있다.

<br>

## 의존성 주입

위에서 언급했듯이, 싱글톤 패턴은 모듈 간의 결합을 강하게 만들 수 있다는 단점이 있다.
- 이때, 의존성 주입(Dependency Injection)을 통해 모듈 간의 결합을 조금 더 느슨하게 만들어 해결할 수 있다.

> 의존성은 종속성이라고도 하며, A가 B에 의존성이 있다는 것은 B의 변경 사항에 대해 A 또한 변해야 된다는 것을 의미한다.

### 의존성 주입의 장점

- 모듈들을 쉽게 교체할 수 있는 구조가 되어 테스트하기 쉽고, 마이그레이션하기도 수월해진다.
- 구현할 때 추상화 레이어를 넣고, 이를 기반으로 구현체를 넣어 주기 때문에 어플리케이션 의존성 방향이 일관되고, 어플리케이션을 쉽게 
  추론할 수 있으며, 모듈 간의 관계들이 조금 더 명확해진다.

### 의존성 주입의 단점

- 모듈들이 더욱 더 분리되므로, 클래스 수가 늘어나 복잡성이 증가될 수 있으며, 약간의 런타임 패널티가 생길 수 있다.

### 의존관계 역전 원칙 (DIP)

의존성 주입은 “상위 모듈은 하위 모듈에서 어떠한 것도 가져오지 않아야 하며, 둘 다 추상화에 의존하고 구현체에 의존하지 않아야 
한다” 라는 의존관계 역전 원칙 (Dependency Inversion Principle)을 지켜주면서 만들어야 한다.