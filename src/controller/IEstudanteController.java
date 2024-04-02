package controller;

import model.Estudante;

public interface IEstudanteController {
    public abstract float percentualRendimento(Estudante est);
    public abstract float percentualProgressao(Estudante est);
}
