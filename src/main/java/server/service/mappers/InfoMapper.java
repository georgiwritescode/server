package server.service.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import server.domain.Info;
import server.service.dtos.InfoDto;

@Mapper(componentModel = "spring")
public interface InfoMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "message", target = "message")
    InfoDto toDto(Info info);

    Info toEntity(InfoDto dto);
}
