package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class CarsTest {
    @Test
    void 자동차_생성() {
        Cars cars = new Cars("one, two");
        assertThat(cars.getCars().size()).isEqualTo(2);
    }

    @Test
    void 자동차_이름_길이_체크(){
        assertThatIllegalArgumentException().isThrownBy(() -> new Cars("one, threeee"))
                .withMessageContaining("[ERROR]");
    }

    @Test
    void 시도_횟수_유효성_체크(){
        assertThatIllegalArgumentException().isThrownBy(() -> new Round("a"))
                .withMessageContaining("[ERROR]");
        assertThatIllegalArgumentException().isThrownBy(() -> new Round("0"))
                .withMessageContaining("[ERROR]");
    }

    @Test
    void 우승자_목록(){
        Cars cars = new Cars("one, two, thre");
        cars.play(3);
        assertThat(cars.getWinner()).isNotEmpty();
    }
}
