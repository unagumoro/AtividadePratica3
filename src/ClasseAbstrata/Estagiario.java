package ClasseAbstrata;

public class Estagiario extends Funcionario implements Trabalhavel{

    private String supervisor;

    public Estagiario() {
    }

    public Estagiario(String nome, int matricula, float valorHora, int horasTrabalhadas,
            String supervisor){
        super(nome, matricula, valorHora, horasTrabalhadas);
        this.supervisor = supervisor;
    }
    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public float calcularSalario() {
        return (getHorasTrabalhadas() * getValorHora());
    }

    @Override
    public String toString() {
        return super.toString() +
        "\nCargo: Estagiário" +
        "\nGerente: " + supervisor +
        "\nSalário: R$:" + calcularSalario();
    }

    @Override
    public String trabalhar() {
        return"O estagiário " + getNome() + " está trabalhando e sendo supervisionado pelo " + getSupervisor();
    }

    @Override
    public String relatarProgresso() {
        return"Segundo " + getSupervisor() + ", o estagiário " + getNome() + " está desempenhando sua função com sucesso";
    }
}
