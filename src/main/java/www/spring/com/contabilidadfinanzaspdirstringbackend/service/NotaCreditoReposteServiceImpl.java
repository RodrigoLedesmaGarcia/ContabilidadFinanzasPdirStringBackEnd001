package www.spring.com.contabilidadfinanzaspdirstringbackend.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import www.spring.com.contabilidadfinanzaspdirstringbackend.entity.NotaCreditoReporte;
import www.spring.com.contabilidadfinanzaspdirstringbackend.repository.NotaCreditoReporteRepository;

@Service
public class NotaCreditoReposteServiceImpl implements NotaCreditoReporteService{

    private final NotaCreditoReporteRepository repository;

    public NotaCreditoReposteServiceImpl(NotaCreditoReporteRepository repository) {
        this.repository = repository;
    }

    @Override
    public Page<NotaCreditoReporte> listadoNotas(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
