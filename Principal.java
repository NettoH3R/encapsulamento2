public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Batata");
        pessoa.setIdade(17);

        System.out.println("Nome: " + pessoa.getNome() + "\n" + "Idade: " + pessoa.getIdade());
    }
}
