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

}
