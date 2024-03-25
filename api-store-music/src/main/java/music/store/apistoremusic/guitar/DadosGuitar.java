package music.store.apistoremusic.guitar;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import music.store.apistoremusic.modelo.DadosModelo;

public record DadosGuitar(
        @NotBlank
        String nome,
        @NotNull
        DadosModelo modelo,
        String serie) {
}
