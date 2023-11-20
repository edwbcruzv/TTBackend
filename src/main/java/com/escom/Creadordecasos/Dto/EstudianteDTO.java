package com.escom.Creadordecasos.Dto;

import lombok.*;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class EstudianteDTO implements Serializable {
        private Long id;
        private String username;
        private String password_hash;
        private String email;
        private String nombre;
        private String apellido_paterno;
        private String apellido_materno;
}
