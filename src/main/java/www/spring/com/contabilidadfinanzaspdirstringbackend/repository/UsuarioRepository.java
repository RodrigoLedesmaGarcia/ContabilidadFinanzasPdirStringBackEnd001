package www.spring.com.contabilidadfinanzaspdirstringbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import www.spring.com.contabilidadfinanzaspdirstringbackend.entity.Usuario;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByUsernameAndPassword(String username, String password);
}
