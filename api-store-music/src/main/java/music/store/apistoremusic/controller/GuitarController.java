package music.store.apistoremusic.controller;


import jakarta.validation.Valid;
import lombok.Getter;
import music.store.apistoremusic.guitar.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/guitar")
public class GuitarController {
    @Autowired
    private GuitarRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarGuitar(@RequestBody @Valid DadosGuitar dados){
           repository.save(new Guitar(dados));
    }

    @GetMapping
    public Page<DadosListagemGuitar> listarGuitar(@PageableDefault(size = 10, sort = {"id"})Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemGuitar::new);

    }

    @PutMapping
    @Transactional
    public void atualizarGuitar(@RequestBody @Valid DadosAtualizacaoGuitar dados){
        var guitar = repository.getReferenceById(dados.id());
        guitar.atualizaInformacoes(dados);

    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deletarGuitar(@PathVariable Long id){
        var guitar = repository.getReferenceById(id);
        guitar.excluir();
    }



}
