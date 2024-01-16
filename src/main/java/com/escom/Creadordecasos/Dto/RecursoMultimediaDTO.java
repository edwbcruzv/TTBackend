package com.escom.Creadordecasos.Dto;

import com.escom.Creadordecasos.Entity.CasoEstudio;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RecursoMultimediaDTO {
    private Long id;
    private String nombre;
    private String path_src;
}
