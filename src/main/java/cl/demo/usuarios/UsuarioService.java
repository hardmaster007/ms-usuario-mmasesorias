package cl.demo.usuarios;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public List<Usuario> obtenerTodosUsuarios() {
        // Datos mockeados
        return Arrays.asList(
                new Usuario(1L, "Juan Pérez", "juan.perez@example.com", "555-1234"),
                new Usuario(2L, "María García", "maria.garcia@example.com", "555-5678"),
                new Usuario(3L, "Carlos López", "carlos.lopez@example.com", "555-9012"),
                new Usuario(4L, "Ana Martínez", "ana.martinez@example.com", "555-3456"),
                new Usuario(5L, "Luis Rodríguez", "luis.rodriguez@example.com", "555-7890")
        );
    }
}