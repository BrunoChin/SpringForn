package br.edu.ifal.pweb2vesp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ControladorPrincipal{
    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index.html");
    }

    @RequestMapping("/formulario")
    public ModelAndView formulario(){
        return new ModelAndView("Form.html");
    }

    @RequestMapping("/cadastro_novo_aluno")
    public ModelAndView novoAluno(String nome, String idade){
        ModelAndView resposta =  new ModelAndView("Form.html");
        if(Integer.parseInt(idade) >= 18){
            resposta.addObject("mensagem", nome + " Cadastrado com sucesso");
        }
        else{
            resposta.addObject("mensagem", nome + " você não pode se cadastrar");
        }
        return resposta;
    }
}