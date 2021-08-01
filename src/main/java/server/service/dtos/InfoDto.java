package server.service.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class InfoDto {
    public Long id;
    public String message;
}
