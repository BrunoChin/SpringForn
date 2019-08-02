package br.edu.ifal.tarde.formularioweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ControlerPrincipal{
    
    private AlunoRepositorio alunoRepositorio;

    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("FormularioWeb.html");
    }

    @RequestMapping("/novo_aluno")
    public ModelAndView cadastroNovoAluno(Aluno aluno){

        alunoRepositorio.save(aluno);

        ModelAndView reposta = new ModelAndView("FormularioWeb.html");
        reposta.addObject("mensage", "O Aluno " + aluno.getNome() + " Foi cadastrado co sucesso");
        return reposta;
    }
}