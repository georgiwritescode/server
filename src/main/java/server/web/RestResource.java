package server.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import server.domain.Info;
import server.service.RestService;
import server.service.dtos.InfoDto;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestResource {

    private final Logger log = LoggerFactory.getLogger(RestResource.class);

    private final RestService restService;

    public RestResource(RestService restService) {
        this.restService = restService;
    }

    @GetMapping("/info")
    public List<InfoDto> getInfo() {
        log.debug("GET info about app");
        return restService.getInfo();
    }

    @PostMapping("/create-info-message")
    public Info createInfoMessage(@RequestBody InfoDto dto) {
        log.debug("create single info message");
        return restService.createOne(dto);
    }

}
