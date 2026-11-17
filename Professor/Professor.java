public class Professor{
    private int matricula;
    private String nome;
    public float ValorHora;

    public Professor(){}
    public Professor(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public float salario(){
        return 0;
    }

    public static class ProfessorConcursado extends Professor{
        private float salario;

        public ProfessorConcursado(){}
        public ProfessorConcursado(int matricula, String nome){
            super(matricula, nome);
        }
        public ProfessorConcursado(int matricula, String nome, float salario){
            super(matricula, nome);
            this.salario = salario;
        }

        public float getSalario(){
            return salario;
        }
        public void setSalario(float salario){
            this.salario = salario;
        }
    }

    public static class ProfessorHorista extends Professor{
        private float valorHora;
        private float quantidadeHora;
        private float salario;

        public ProfessorHorista(){}
        public ProfessorHorista(int matricula, String nome){
            super(matricula, nome);
        }
        public ProfessorHorista(int matricula, String nome, float valorHora, float quantidadeHora, float salario){
            super(matricula, nome);
            this.valorHora = valorHora;
            this.quantidadeHora = quantidadeHora;
            this.salario = salario;
        }

        public float getValorHora(){
            return valorHora;
        }
        public void setValorHora(float ValorHora){
            this.ValorHora = ValorHora;
        }

        public void setSalario(float valorHora, float quantidadeHora){
            this.salario = valorHora * quantidadeHora;
        }
        public float getSalario(){
            return salario;
        }
    }

    public static void main(String[] arg){
        ProfessorConcursado profC = new ProfessorConcursado();
        ProfessorHorista profH = new ProfessorHorista();

        profC.setMatricula(1313);
        profC.setNome("Lorivaldo");
        profC.setSalario(15000);

        profH.setMatricula(3131);
        profH.setNome("Rose");
        profH.setSalario(50, 160);

        System.out.println("Matricula Professor Concursado: " + profC.getMatricula() + " - " + profC.getNome());
        System.out.println("Salario Professor Concursado: " + profC.getSalario());

        System.out.println("Matricula Professor Horista: " + profH.getMatricula() + " - " + profH.getNome());
        System.out.println("Salario Professor Horista: " + profH.getSalario());
    }
}