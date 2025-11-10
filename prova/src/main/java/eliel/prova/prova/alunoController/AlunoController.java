package eliel.prova.prova.alunoController;

import eliel.prova.prova.alunoModel.AlunoModel;
import eliel.prova.prova.alunoService.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<AlunoModel>findAllAlunos(){
        return alunoService.findAluno();
    }

    public
}
