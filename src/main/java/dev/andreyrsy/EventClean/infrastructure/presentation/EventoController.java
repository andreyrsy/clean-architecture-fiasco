package dev.andreyrsy.EventClean.infrastructure.presentation;
import dev.andreyrsy.EventClean.infrastructure.dtos.EventoDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class EventoController {

    @PostMapping("criarevento")
    public EventoDto criarEvento(@RequestBody EventoDto dto){
        return null;
    }
}