package com.senai.teste;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private void opcaoIndisponivel() {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);

        alerta.setTitle("Academia Sul");
        alerta.setHeaderText("Funcionalidade em desenvolvimento");
        alerta.setContentText("Essa opção será conectada em breve.");

        alerta.showAndWait();
    }

    @FXML
    private TextField campoNome;

    @FXML
    private TextField campoCpf;

    @FXML
    private TextField campoContato;

    @FXML
    private TextField campoEndereco;

    @FXML
    private Label mensagem;

    @FXML
    private void cadastrarAluno() {

        String nome = campoNome.getText();
        String cpf = campoCpf.getText();
        String contato = campoContato.getText();
        String endereco = campoEndereco.getText();

        if (nome.trim().isEmpty() || cpf.trim().isEmpty() || contato.trim().isEmpty()|| endereco.trim().isEmpty()) {
            mensagem.setText("Preencha todos os campos!");
            
            return;
        }

        Aluno aluno = new Aluno(
                nome, cpf, contato, endereco
        );

        mensagem.setText("Aluno cadastrado com sucesso!\nNome: " + aluno.getNome()
        );

        campoNome.clear();
        campoCpf.clear();
        campoContato.clear();
        campoEndereco.clear();
    }
}
