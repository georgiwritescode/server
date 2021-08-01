package server.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.domain.Info;
import server.repositories.InfoMessageRepository;
import server.service.RestService;
import server.service.dtos.InfoDto;
import server.service.mappers.InfoMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestServiceImpl implements RestService {

    private final Logger log = LoggerFactory.getLogger(RestServiceImpl.class);
    private final InfoMessageRepository infoMessageRepository;

    @Autowired
    InfoMapper infoMapper;

    @Autowired
    public RestServiceImpl(InfoMessageRepository infoMessageRepository) {
        this.infoMessageRepository = infoMessageRepository;
    }

    @Override
    public List<InfoDto> getInfo() {
        log.debug("Retrieve all messages from repo");

        return infoMessageRepository.findAll().stream().map(infoMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public Info createOne(InfoDto dto) {
        log.debug("create a single message!");
        Info info = infoMapper.toEntity(dto);
        return infoMessageRepository.save(info);
    }

}
