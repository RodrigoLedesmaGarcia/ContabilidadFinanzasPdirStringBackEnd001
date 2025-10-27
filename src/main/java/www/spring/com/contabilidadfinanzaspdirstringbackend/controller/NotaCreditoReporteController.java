package www.spring.com.contabilidadfinanzaspdirstringbackend.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import www.spring.com.contabilidadfinanzaspdirstringbackend.entity.NotaCreditoReporte;
import www.spring.com.contabilidadfinanzaspdirstringbackend.service.NotaCreditoReposteServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/NotasCredito")
@RestController
public class NotaCreditoReporteController {

    private final NotaCreditoReposteServiceImpl service;

    NotaCreditoReporteController(NotaCreditoReposteServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/notas")
    public ResponseEntity<?> listar (Pageable pageable){
        Page<NotaCreditoReporte> lista = service.listadoNotas(pageable);
        return lista.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(lista);
    }
}
