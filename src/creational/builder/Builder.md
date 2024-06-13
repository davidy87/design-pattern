## Builder Pattern?

빌더 패턴은 복잡한 객체들을 단계별로 생성할 수 있도록 만드는 디자인 패턴이다. 이 패턴을 적용하면 다양한 유형과 표현을 가진 객체를 같은 제작 코드로 생성할 수 있다.

빌더 패턴을 적용하지 않았을 때, House라는 클래스를 통해 다양한 형태의 집을 제작하고 싶다면 아래의 그림과 같이 각 형태마다 생성자에 넣는 필드의 값이 달라지게 된다.

![problem.png](./problem.png)

하지만,  House 클래스에 필드가 많아질 수록 생성자 코드가 복잡해지고 지저분해진다는 문제가 생긴다.

이런 문제를 해결하기 위해서는 아래와 같은 방법들을 적용할 수 있다.

1. 점층적 생성자 패턴을 통해 여러 오버로딩된 생성자를 만든다.
    - 생성자만으로는 필드를 선택적으로 생략할 수 있는 방법이 없다. 그리고, 필드가 많아지고 선택지가 많아질 수록, 필요한 생성자는 더 많이 늘어나게 된다.
    - 결국, 생성에 대한 유연함이 떨어지게 되고, 코드의 가독성 및 유지 보수적인 측면에서 좋지 않다.
2. Java Bean property를 통해 객체를 매개변수가 없는 생성자로 생성 후, setter 메서드로 필요한 필드만 설정한다.
    - 생성자를 오버로딩하는 방식보다는 가독성 측면에서 뛰어나고 필드를 선택적으로 생략할 수 있게 되지만, 객체 생성 시에 모든 값들을 주입하지 않기 때문에 일관성이 떨어진다.
    - 또한, setter 메서드의 존재로 인하여 불변성이 깨지게 된다는 문제가 생긴다.

이러한 문제를 빌더 패턴을 통해 해결할 수 있다.

![solution.png](./solution.png)

위와 같이 객체 생성을 단계별로 나누어 정리하고, 객체를 생성하고 싶은 경우, 해당 단계들을 생성 시에 호출하면 된다.

여기서 중요한 점은, 모든 단계들을 호출할 필요없이, 요구 사항에 맞게 필요한 단계만 호출하여 다양한 형태의 객체를 생성할 수 있다는 것이다.

<br>

## 구조

빌더 패턴의 전체적인 구조는 아래와 같다.

![structure.png](./structure.png)

1. **Builder interface**: 모든 유형의 빌더들에 공통적인 기능을 선언한다.
2. **ConcreteBuilder**: 구현 빌더들은 구현화된 생성 단계들을 제공한다.
3. **Product**: 구현 빌더를 통해 생성된 객체
4. **Director class** : 생성 단계를 호출하는 순서를 정의하는 클래스이다. 객체들의 특정 설정을 만들고, 이를 재사용할 수 있다.
    - 생략 가능하다.
    - 생성 단계를 특정 순서로 정의하고 싶거나, 클라이언트 코드에서 이 생성에 관한 세부 정보를 숨기고 싶을 때 유용하다.
5. **Client**: 빌더를 사용하는 클라이언트이다.

<br>

## 장단점

### 장점

- 객체를 단계별로 생성하거나 생성 단계를 생략하는 작업이 가능하여 더 다양한 형태의 객체 생성이 가능하다.
- 간접적으로 기본 매개변수 값을 설정할 수 있다.
    - Java와 같이 기본 매개변수 값을 지원하지 않는 경우, 빌더 패턴을 적용하여 매개변수의 기본 값을 간접적으로 설정이 가능하다.
- 필수 멤버와 생략 가능한 멤버를 분리할 수 있다.
    - 필수로 지정해야 하는 필드를 빌더의 생성자를 통해 설정하도록 만들고, 나머지 생략이 가능한 필드들은 빌더 메서드를 통해 설정하게 만들어 필수 멤버와 선택적 멤버를 따로 구분하여 객체를 생성하도록 유도할 수 있다.
- 객체 생성 단계를 지연할 수 있다.
    - 빌더를 사용하여 객체 생성을 단계별로 구성하거나 구성 단계를 뒤로 미루어 객체의 최종 생성을 주도적으로 지연할 수 있다.
- 객체 멤버별로 초기화 검증이 가능하다.
    - 필드 초기화의 검증을 각 빌더 메서드에서 수행하도록 만들어 더 유지 보수하기 쉽도록 만들 수 있다.

### 단점

- 빌더 클래스를 따로 생성하고, 빌더 메서드를 생성해야 하므로 코드의 전반적인 복잡성이 증가한다.
- 일반적인 생성자를 활용한 방식보다는 성능이 더 떨어질 수 있다.
    - 매번 메서드를 호출하여 생성하기 때문에 당연하다. 물론, 생성 비용 자체는 큰 차이가 없지만, 어플리케이션의 
      성능을 극도로 중요시해야 하는 상황이라면 고려해야 할 부분이다.

<br>

## 출처
https://refactoring.guru/ko/design-patterns/builder