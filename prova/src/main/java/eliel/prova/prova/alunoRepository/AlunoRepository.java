package eliel.prova.prova.alunoRepository;

import eliel.prova.prova.alunoModel.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoModel,Long> {
}
