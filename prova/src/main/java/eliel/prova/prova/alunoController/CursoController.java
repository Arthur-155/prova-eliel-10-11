package eliel.prova.prova.alunoController;

import eliel.prova.prova.alunoModel.CursoModel;
import eliel.prova.prova.alunoService.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/cursos")
@RestController
public class CursoController {
    @Autowired
    private CursoService service;

    @GetMapping
    public List<CursoModel>findAllCursos(){
        return service.findCursos();
    }
    @GetMapping("/{id}")
    public Optional<CursoModel> findCursosById(Long id){
        return  service.findCursoById(id);
    }
    @PostMapping
    public CursoModel createCurso(CursoModel cursoModel){
        return service.createCurso(cursoModel);
    }
    @DeleteMapping("/{id}")
    public void deleteById(Long id){
        service.deleteById(id);
    }

    @PutMapping("/{id}")
    public CursoModel updateCurso(@PathVariable Long id,@RequestBody CursoModel cursoModel){
        return service.updateCurso(id, cursoModel);
    }
}
