package server.service;

import server.domain.Info;
import server.service.dtos.InfoDto;

import java.util.List;

public interface RestService {

    List<InfoDto> getInfo();

    Info createOne(InfoDto dto);
}
