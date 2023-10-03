package domain.dto;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
public class Person implements Serializable {
    private String name;
    private String cpf;
    private Instant birthDate;
}
