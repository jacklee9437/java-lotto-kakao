package lotto.model;

import java.util.List;
import java.util.stream.Collectors;

public class LottoTicketsDto {
    private final List<LottoTicketDto> tickets;
    public LottoTicketsDto(LottoTickets lottoTickets) {
        tickets = lottoTickets.stream().map(
                LottoTicketDto::new
        ).collect(Collectors.toList());
    }

    public int size() {
        return tickets.size();
    }

    public List<LottoTicketDto> getTickets() {
        return tickets;
    }
}