package br.com.senai.infoa.backend.projeto_empreendedor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.infoa.backend.projeto_empreendedor.services.EmpreendedorService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping("/empreendedor")
public class EmpreendedorController {
    @Autowired 
    private EmpreendedorService empreendedorService;

    @GetMapping("/contar")
    public Long contar() {
        return empreendedorService.contar();
    }

    @GetMapping("/listar")
    public List<Empreendedor> listar() {
        return empreendedorService.listar();
    }

    @GetMapping("/buscar")
    public Empreendedor buscarPorId( Integer id) {
        return empreendedorService.buscarPorId(id);
    }
    
    
    public EmpreendedorController(EmpreendedorService empreendedorService) {
        this.empreendedorService = empreendedorService;
    }
}
