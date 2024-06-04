package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    // pode ser default
    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionar lanche natural hamburguer no balcao");
    }
    // pode ser default
    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionar suco no balcao");
    }
    // pode ser default
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche() {
        System.out.println("Preparando lanche tipo hamburguer");
    }
    private void prepararVitamina() {
        System.out.println("Preparando vitamini");
    }
    public void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredientesLanche() {
        System.out.println("Selecionado o pao, salada, ovo e carne");
    }
    private void selecionarIngredientesVitamina() {
        System.out.println("Selecionado o fruta, leite e suco");
    }
    private void lavarIngrediente() {
        System.out.println("lavando igredientes");
    }
    private void baterVitaminaLiquitificador() {
        System.out.println("batendo vitamina liquidificador");
    }
    private void fritarIngredientesLanches() {
        System.out.println("Fritando a carne e ovo para o hamburguer");
    }
    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }
    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }


}