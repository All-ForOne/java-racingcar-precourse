package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {
    @Test
    void 자동차_생성() {
        assertThat(new Car("one").getName()).isEqualTo("one");
        assertThatIllegalArgumentException().isThrownBy(() -> new Car("oneone"))
                .withMessageContaining("[ERROR]");
        assertThatIllegalArgumentException().isThrownBy(() -> new Car(" "))
                .withMessageContaining("[ERROR]");
    }

    @Test
    void 자동차_전진() {
        Car carOne = new Car("one");
        carOne.goOrStop(4);
        Car carTwo = new Car("two");
        carTwo.goOrStop(3);
        assertThat(carOne.getStep().getCount()).isEqualTo(1);
        assertThat(carTwo.getStep().getCount()).isEqualTo(0);
    }

}
