package controller;

import model.Estudante;

public class EstudanteTecnicoController implements IEstudanteController{
    public EstudanteTecnicoController() {
        super();
    }
    @Override
    public float percentualRendimento(Estudante est) {
        return est.getMediaNotas() * est.getQtdAprovacoes() * 0.931f;
    }

    @Override
    public float percentualProgressao(Estudante est) {
        return (float) est.getQtdAprovacoes() / 3;
    }
}
