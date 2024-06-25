package behavioral.observer.code;

public class ObserverTest {

    private static void test() {
        Topic topic = new Topic();
        Observer a = new TopicSubscriber("a", topic);
        Observer b = new TopicSubscriber("b", topic);
        Observer c = new TopicSubscriber("c", topic);

        topic.register(a);
        topic.register(b);
        topic.register(c);
        topic.postMessage("This is for test");
    }

    public static void main(String[] args) {
        test();
    }
}
