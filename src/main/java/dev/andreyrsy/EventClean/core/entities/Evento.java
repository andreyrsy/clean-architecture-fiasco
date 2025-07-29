package dev.andreyrsy.EventClean.core.entities;
import dev.andreyrsy.EventClean.core.enuns.TipoEvento;
import java.time.LocalDate;

public record Evento(
        Long id,
        String nome,
        String descricao,
        LocalDate dataInicio,
        LocalDate dataFim,
        String identificador,
        String localEvento,
        String organizador,
        TipoEvento tipo
) {}


