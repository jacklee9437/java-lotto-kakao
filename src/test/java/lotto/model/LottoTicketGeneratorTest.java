package lotto.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

class LottoTicketGeneratorTest {
    @Test
    void 난수_값_6개_생성(){
        LottoTicketGenerator generator = new LottoTicketGenerator();
        assertThatCode(() -> generator.generate()).doesNotThrowAnyException();
    }
}