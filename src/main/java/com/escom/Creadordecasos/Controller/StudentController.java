package com.escom.Creadordecasos.Controller;

import com.escom.Creadordecasos.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST para los estudiantes
 */
@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    /**
     * Servicio de usuario
     */
    private final UserService userService;

    /**
     * Test para probar el rol de estudiante
     * @return
     */
    @GetMapping("/test")
    public ResponseEntity testStudent() {
        return ResponseEntity.ok().build();
    }
}
