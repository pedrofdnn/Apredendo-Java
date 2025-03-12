package Ex_da_Faculdade.Tipos_de_Relacoes;

class Escola {
    // Atributos
    private String nome, CNPJ;
    private Endereco endereco;
    private Departamento departamentos[];
    private Aluno discentes[];
    private int nr_discentes, nr_departamentos;
        private String nome_rua;
    
        public class Endereco {
            private String nome_rua, numero;
        }
    
        // Métodos
        public Escola(String nome, String CNPJ) {
            this.nome = nome;
            this.CNPJ = CNPJ;
            this.departamentos = new Departamento[10];
            this.discentes = new Aluno[1000];
            this.nr_departamentos = 0;
            this.nr_discentes = 0;
        }
    
        public void Endereco(String nome_rua, String numero){
            this.nome_rua = nome_rua;
        this.numero = numero;
    }

    public void criarDepartamento(String nomeDepartamento){
        if(nr_departamentos <= 10)
        {
            departamentos[nr_departamentos] = new Departamento ( nomeDepartamento);                
            nr_departamentos++;
        } else {
            System.out.println ( "Nao e possivel criar outro Departamento." );
       }

    public void matricularAluno(Aluno novoAluno) {
        discentes[nr_discentes] = novoAluno;
    }
}