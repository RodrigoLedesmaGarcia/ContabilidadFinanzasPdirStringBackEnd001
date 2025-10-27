package www.spring.com.contabilidadfinanzaspdirstringbackend.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import www.spring.com.contabilidadfinanzaspdirstringbackend.entity.NotaCreditoReporte;

public interface NotaCreditoReporteService {

    Page<NotaCreditoReporte> listadoNotas (Pageable pageable);
}
