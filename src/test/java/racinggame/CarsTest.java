package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    @Test
    void 자동차_생성() {
        Cars cars = new Cars("one, two");
        assertThat(cars.getCars().size()).isEqualTo(2);

        //cars.play(1);
        //assertThat(cars.getWinner()).isInstanceOf(String.class);
    }
}
