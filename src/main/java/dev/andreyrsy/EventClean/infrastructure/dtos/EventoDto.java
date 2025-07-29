package dev.andreyrsy.EventClean.infrastructure.dtos;
import dev.andreyrsy.EventClean.core.enuns.TipoEvento;

import java.time.LocalDate;
public record EventoDto(
        Long id,
        String nome,
        String descricao,
        LocalDate dataInicio,
        LocalDate dataFim,
        String identificador,
        String localEvento,
        String organizador,
        TipoEvento tipo
){}
