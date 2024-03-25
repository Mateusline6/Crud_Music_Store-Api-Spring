package music.store.apistoremusic.guitar;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import music.store.apistoremusic.modelo.ModeloGuitar;

@Table(name = "guitars")
@Entity(name = "Guitar")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Guitar {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nome;
    private ModeloGuitar modelo;
    private String serie;
    private boolean ativo;



    public Guitar(DadosGuitar dados){
        this.ativo =  true;
        this.Nome = dados.nome();
        this.modelo = new ModeloGuitar(dados.modelo());
        this.serie = dados.serie();
    }

    public void atualizaInformacoes(DadosAtualizacaoGuitar dados) {

        if(dados.nome() != null){
            this.Nome  = dados.nome();

        }if (dados.modelo() != null){
            this.modelo.atualizarInformacoes(dados.modelo());

        }if (dados.serie() != null){
            this.serie = dados.serie();

        }

    }
    //exclusao

    public void excluir() {
        this.ativo = false;
    }
}
