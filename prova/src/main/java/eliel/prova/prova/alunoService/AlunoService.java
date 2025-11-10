package eliel.prova.prova.alunoService;

import eliel.prova.prova.alunoModel.AlunoModel;
import eliel.prova.prova.alunoRepository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    public List<AlunoModel>findAluno(){
        return alunoRepository.findAll();
    }

    public AlunoModel createAluno(AlunoModel alunoModel){
        return alunoRepository.save(alunoModel);
    }

    public Optional<AlunoModel> findAlunoById(Long id){
        return alunoRepository.findById(id);
    }

    public void deleteById(Long id){
        alunoRepository.deleteById(id);
    }

    public AlunoModel atualizarAluno(Long id, AlunoModel alunoModel){
        AlunoModel novoAluno = alunoRepository.findById(id).get();
        novoAluno.setNome(alunoModel.getNome());
        novoAluno.setMatricula(alunoModel.getMatricula());
        return alunoRepository.save(novoAluno);
    }

}
