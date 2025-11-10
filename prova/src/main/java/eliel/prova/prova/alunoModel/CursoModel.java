package eliel.prova.prova.alunoModel;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class CursoModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String nome;
    private Integer cargaHoraria;

    @OneToMany
    private List<AlunoModel> alunoModel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
