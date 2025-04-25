import org.example.commit2.Dog;
import org.example.commit3.Eagle;
import org.junit.Test;


public class AnimalTest {
    @Test
    public void testDogSwim() {
        Dog dog = new Dog("Бобик", 5);
        dog.swim(); // просто проверим, не кидает ли исключение
    }

    @Test
    public void testEagleFlySpeed() {
        Eagle eagle = new Eagle("Орел", 3);
        eagle.fly(); // можно переделать на возврат строки, если надо точнее тестировать
    }
}
