package br.com.cadUser;

import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;

@Named
@ViewScoped
public class Pessoa implements Serializable {
    
	private static final long serialVersionUID = 1L;
	private String nome;
    private ArrayList<String> nomesDigitados = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String cadastrarNome() {
        nomesDigitados.add(nome);
        nome = "";  // Limpar o campo após cadastrar
        return "";
}

    public ArrayList<String> getNomesDigitados() {
        return nomesDigitados;
    }
}
