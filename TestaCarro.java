public class TestaCarro {

    public static void main(String[] args) {
        
        Carro carro = new Carro();
        carro.setMarca("ford");
        carro.setModelo("Pampa");
        carro.setPlaca("sex-0800");
        carro.setRenavam(5425256);

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getPlaca());
        System.out.println(carro.getRenavam());

    }
    
}
