package eliel.prova.prova.alunoController;

import eliel.prova.prova.alunoModel.AlunoModel;
import eliel.prova.prova.alunoService.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/alunos")
@RestController
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<AlunoModel>findAllAlunos(){
        return alunoService.findAluno();
    }

    @PostMapping
    public AlunoModel createAluno(@RequestBody AlunoModel alunoModel){
        return alunoService.createAluno(alunoModel);
    }

    @GetMapping("/{id}")
    public Optional<AlunoModel> findAlunoById(@PathVariable Long id){
        return alunoService.findAlunoById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAlunoById(@PathVariable Long id){
        alunoService.deleteById(id);
    }

    @PutMapping("/{id}")
    public AlunoModel atualizarAluno(@PathVariable Long id, @RequestBody AlunoModel alunoModel){
        return alunoService.atualizarAluno(id,alunoModel);
    }
}
