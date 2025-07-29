package dev.andreyrsy.EventClean.infrastructure.persistence;

import dev.andreyrsy.EventClean.core.enuns.TipoEvento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Eventos")
public class EventoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String identificador;
    private String localEvento;
    private String organizador;
    @Enumerated(EnumType.STRING)
    private TipoEvento tipo;
}
