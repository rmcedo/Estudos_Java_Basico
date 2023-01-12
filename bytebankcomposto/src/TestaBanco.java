public class TestaBanco {

    public static void main(String[] args) {
        Cliente paulo = new Cliente();

        paulo.setCpf("222.222.222-22");
        paulo.setNome("Paulo Silveira");
        paulo.setProfissao("Programador");
        
        
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);

        contaDoPaulo.setTitular(paulo);
        System.out.println(contaDoPaulo.getTitular().getNome());
    }
    
}
