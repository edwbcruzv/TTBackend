package com.escom.Creadordecasos.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data // genera setters y getters
@AllArgsConstructor // genera constructor con todos los atributos
@NoArgsConstructor // Constructor sin parametros
@Entity
@Builder
public class CasoEstudio {

    @Id// lo define como el  Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // es como el autoincrement
    private Long id;
    @ManyToOne(targetEntity = Profesor.class, fetch = FetchType.LAZY)
    private Profesor profesor;
    @Column
    private String titulo;

    @Column
    private String introduccion;

    @Column
    private String resumen;

    @OneToMany(targetEntity = RecursoMultimedia.class,fetch = FetchType.EAGER,mappedBy = "caso_estudio")
    private List<RecursoMultimedia> resumen_multimedia_list;
    @Column
    private String objetivos;

    @OneToMany(targetEntity = RecursoMultimedia.class,fetch = FetchType.EAGER,mappedBy = "caso_estudio")
    private List<RecursoMultimedia> objetivos_multimedia_list;
    @Column
    private String clasificacion;

    @OneToMany(targetEntity = RecursoMultimedia.class,fetch = FetchType.EAGER,mappedBy = "caso_estudio")
    private List<RecursoMultimedia> clasificacion_multimedia_list;
    @Column
    private String lugar;

    @OneToMany(targetEntity = RecursoMultimedia.class,fetch = FetchType.EAGER,mappedBy = "caso_estudio")
    private List<RecursoMultimedia> lugar_multimedia_list;
    @Column
    private String temporalidades;

    @OneToMany(targetEntity = RecursoMultimedia.class,fetch = FetchType.EAGER,mappedBy = "caso_estudio")
    private List<RecursoMultimedia> temporalidades_multimedia_list;
    @Column
    private String protagonistas;

    @OneToMany(targetEntity = RecursoMultimedia.class,fetch = FetchType.EAGER,mappedBy = "caso_estudio")
    private List<RecursoMultimedia> protagonistas_multimedia_list;
    @Column
    private String organizaciones;

    @OneToMany(targetEntity = RecursoMultimedia.class,fetch = FetchType.EAGER,mappedBy = "caso_estudio")
    private List<RecursoMultimedia> organizaciones_multimedia_list;

    @Column
    private String preguntas;

    @OneToMany(targetEntity = RecursoMultimedia.class,fetch = FetchType.EAGER,mappedBy = "caso_estudio")
    private List<RecursoMultimedia> preguntas_multimedia_list;
    @Column
    private String riesgos;

    @OneToMany(targetEntity = RecursoMultimedia.class,fetch = FetchType.EAGER,mappedBy = "caso_estudio")
    private List<RecursoMultimedia> riesgos_multimedia_list;
    @Column
    private String resultados;

    @OneToMany(targetEntity = RecursoMultimedia.class,fetch = FetchType.EAGER,mappedBy = "caso_estudio")
    private List<RecursoMultimedia> resultados_multimedia_list;
    @Column
    private String anexos;

    @OneToMany(targetEntity = RecursoMultimedia.class,fetch = FetchType.EAGER,mappedBy = "caso_estudio")
    private List<RecursoMultimedia> anexos_multimedia_list;

    @Column
    private String conclusion;

    @Column
    private String comentarios;

    @Column
    private Date fecha_creacion;

    @Temporal(TemporalType.DATE)
    private Date fecha_vencimiento;

    @ManyToMany(mappedBy = "casos_estudio_compartidos")
    private List<Profesor> profesores;

    @ManyToMany(mappedBy = "casos_estudio")
    private List<Equipo> equipos;

}
