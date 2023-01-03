package lotto.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;

import static org.assertj.core.api.Assertions.*;

public class LottoTicketsTest {
    @Test
    void 여러장의_복권_당첨_결과_확인() {
        LottoTickets lottoTickets = new LottoTickets(
                Arrays.asList(
                        new LottoTicket(
                                Arrays.asList(
                                        new LottoValue(1),
                                        new LottoValue(2),
                                        new LottoValue(3),
                                        new LottoValue(4),
                                        new LottoValue(5),
                                        new LottoValue(6)
                                )
                        ),
                        new LottoTicket(
                                Arrays.asList(
                                        new LottoValue(1),
                                        new LottoValue(2),
                                        new LottoValue(3),
                                        new LottoValue(4),
                                        new LottoValue(5),
                                        new LottoValue(7)
                                )
                        )
                )
        );

        WinningNumbers winningNumbers = new WinningNumbers(
                "1, 2, 3, 4, 5, 6",
                "7"
        );

        assertThat(lottoTickets.getResults(winningNumbers)).isEqualTo(new Result(
                new HashMap<>() {{
                    put(Grade.SIX, 1);
                    put(Grade.FIVE_BONUS, 1);
                }}
        ));
    }
}