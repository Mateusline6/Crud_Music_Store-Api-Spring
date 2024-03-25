package music.store.apistoremusic.guitar;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import music.store.apistoremusic.modelo.DadosModelo;

public record DadosAtualizacaoGuitar(@NotNull Long id, String nome, DadosModelo modelo, String serie) {

}
