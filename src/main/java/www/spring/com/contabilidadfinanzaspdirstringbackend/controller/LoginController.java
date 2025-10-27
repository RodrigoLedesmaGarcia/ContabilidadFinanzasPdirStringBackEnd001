package www.spring.com.contabilidadfinanzaspdirstringbackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import www.spring.com.contabilidadfinanzaspdirstringbackend.repository.UsuarioRepository;

import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {


    private final UsuarioRepository usuarioRepo;

    LoginController(UsuarioRepository usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }


    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> body) {
        String username = body.get("username");
        String password = body.get("password");

        var usuario = usuarioRepo.findByUsernameAndPassword(username, password);
        if (usuario.isPresent()) {
            return ResponseEntity.ok(Map.of(
                    "success", true,
                    "usuario", usuario.get().getUsername()
            ));
        } else {
            return ResponseEntity.status(401).body(Map.of(
                    "success", false,
                    "message", "Credenciales inválidas"
            ));
        }
    }
}
