package eliel.prova.prova.alunoService;

import eliel.prova.prova.alunoModel.CursoModel;
import eliel.prova.prova.alunoRepository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {
    @Autowired
    private CursoRepository repository;

    public List<CursoModel> findCursos(){
        return repository.findAll();
    }

    public CursoModel createCurso(CursoModel cursoModel){
        return repository.save(cursoModel);
    }

    public Optional<CursoModel> findCursoById(Long id){
        return repository.findById(id);
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }

    public CursoModel updateCurso(Long id, CursoModel cursoModel){
        CursoModel novoCurso = repository.findById(id).get();
        novoCurso.setNome(cursoModel.getNome());
        novoCurso.setCargaHoraria(cursoModel.getCargaHoraria());
        return repository.save(novoCurso);
    }
}
