package dev.andreyrsy.EventClean.infrastructure.mapper;
import dev.andreyrsy.EventClean.infrastructure.dtos.EventoDto;
import dev.andreyrsy.EventClean.infrastructure.persistence.EventoEntity;
import org.mapstruct.Mapper;

@Mapper // Não entendi muito bem como funciona o Mapper, e nem como conecto isso com uma camada service.
public class EventoDtoMapper {
    public EventoEntity toEntity(EventoDto dto){
        EventoEntity eventoEntity = new EventoEntity();
        eventoEntity.setNome(dto.nome());
        eventoEntity.setDescricao(dto.descricao());
        eventoEntity.setDataInicio(dto.dataInicio());
        eventoEntity.setDataFim(dto.dataFim());
        eventoEntity.setIdentificador(dto.identificador());
        eventoEntity.setLocalEvento(dto.localEvento());
        eventoEntity.setOrganizador(dto.organizador());
        return eventoEntity;
    }
}
