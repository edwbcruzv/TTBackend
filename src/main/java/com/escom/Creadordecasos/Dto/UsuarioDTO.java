package com.escom.Creadordecasos.Dto;

import lombok.*;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UsuarioDTO implements Serializable {
    private Long id;
    private String rol;
    private String username;
    private String password_hash;
    private String email;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
}
