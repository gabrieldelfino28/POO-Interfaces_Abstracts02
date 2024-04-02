package view;

import controller.EstudanteSuperiorController;
import controller.EstudanteTecnicoController;
import model.EstudanteSuperior;
import model.EstudanteTecnico;

public class Main {

    public static void main(String[] args) {
        EstudanteTecnico et = new EstudanteTecnico();
        et.setNome("Joãozinho");
        et.setRa("11104492023");
        et.setMediaNotas(8.5f);
        et.setEmail("joaozinho23@gmail.com");
        et.setQtdAprovacoes(9);

        EstudanteTecnicoController etc = new EstudanteTecnicoController();
        System.out.printf("%.2f%n", etc.percentualRendimento(et));
        System.out.printf("%.2f%n", etc.percentualProgressao(et));

        EstudanteSuperior es = new EstudanteSuperior();
        es.setNome("Cleyton");
        es.setRa("11103272024");
        es.setMediaNotas(9.5f);
        es.setEmail("cleyton24@gmail.com");
        es.setQtdAprovacoes(10);

        EstudanteSuperiorController esc = new EstudanteSuperiorController();
        System.out.printf("%.2f%n", esc.percentualRendimento(es));
        System.out.printf("%.2f%n", esc.percentualProgressao(es));
    }
}
