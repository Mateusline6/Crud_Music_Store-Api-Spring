package music.store.apistoremusic.guitar;

import music.store.apistoremusic.modelo.DadosModelo;

public record DadosListagemGuitar(Long id, String nome,  String serie) {

    public DadosListagemGuitar(Guitar guitar){

        this(guitar.getId(), guitar.getNome(), guitar.getSerie());;

    }

}
