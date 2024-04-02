package controller;

import model.Estudante;

public class EstudanteSuperiorController implements IEstudanteController{
    public EstudanteSuperiorController() {
        super();
    }
    @Override
    public float percentualRendimento(Estudante est) {
        return est.getMediaNotas() * est.getQtdAprovacoes() * 0.972f;
    }

    @Override
    public float percentualProgressao(Estudante est) {
        return (float) est.getQtdAprovacoes() / 6;
    }
}
