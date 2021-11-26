package br.edu.unifio.setimoprojeto.resource;


import br.edu.unifio.setimoprojeto.domain.Categoria;
import br.edu.unifio.setimoprojeto.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("categorias")
public class CategoriaResource {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public List<Categoria> Inserir() {
        List<Categoria> categorias = categoriaRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
        return categorias;
    }

    @GetMapping
    public List<Categoria> consultar() {
        List<Categoria> categorias = categoriaRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
        return categorias;
    }

    @GetMapping
    public List<Categoria> alterar() {
        List<Categoria> categorias = categoriaRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
        return categorias;
    }
    @GetMapping
    public List<Categoria> excluir() {
        List<Categoria> categorias = categoriaRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
        return categorias;
    }


}


