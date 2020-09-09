package br.com.bandtec.EntregavelSprint01;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/testar")

public class Adicionar {

    private List<Instituicao> lista=new ArrayList<>();



    @GetMapping()
    public ResponseEntity getLista() {
       if(lista.isEmpty()){
           return ResponseEntity.status(404).build();
       }else{
           return ResponseEntity.ok(lista);
       }

    }

    @PostMapping("/faculdade")
    public ResponseEntity criarFaculdade(@RequestBody Faculdade novaInstituicao){
        lista.add(novaInstituicao);
        return ResponseEntity.status(201).build();
    }
    @PostMapping("/escola")
    public ResponseEntity criarEscola(@RequestBody Escola novaEscola){
        lista.add(novaEscola);
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteInstituicao(@PathVariable int id){
       if(lista.size()>=id){
           lista.remove(id-1);
           return ResponseEntity.status(200).build();
           }
            return ResponseEntity.status(404).build();

        }

    @Override
    public String toString() {
        return "Adicionar{" +
                "lista=" + lista +
                '}';
    }
}




