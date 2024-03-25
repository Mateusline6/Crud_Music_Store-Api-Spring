package music.store.apistoremusic.modelo;

import jakarta.validation.constraints.NotBlank;

public record DadosModelo(

        @NotBlank
        String marca,
        @NotBlank
        String modelo,
        @NotBlank
        String captador,
        @NotBlank
        String cor) {



}
