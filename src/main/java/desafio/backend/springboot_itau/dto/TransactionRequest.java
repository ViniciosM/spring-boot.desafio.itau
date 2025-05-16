package desafio.backend.springboot_itau.dto;

import java.time.OffsetDateTime;

import jakarta.validation.constraints.NotNull;

public class TransactionRequest {

    @NotNull
    private Double value;

    @NotNull
    private OffsetDateTime dateTime;

    public OffsetDateTime getDateTime() {
        return dateTime;
    }

    public Double getValue() {
        return value;
    }

}
