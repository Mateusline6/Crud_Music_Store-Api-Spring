package music.store.apistoremusic.modelo;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ModeloGuitar {

    private String marca;
    private String modelo;
    private String captador;
    private String cor;


    public ModeloGuitar(DadosModelo modelo) {
        this.marca = modelo.marca();
        this.modelo = modelo.modelo();
        this.captador = modelo.captador();
        this.cor = modelo.cor();
    }

    public void atualizarInformacoes(DadosModelo dados) {

        if(dados.marca() != null){
            this.marca  = dados.marca();

        }if (dados.modelo() != null){
            this.modelo = dados.modelo();

        }if (dados.captador() != null){
            this.captador = dados.captador();

        }if (dados.cor() != null){
            this.cor = dados.cor();

        }




    }
}
