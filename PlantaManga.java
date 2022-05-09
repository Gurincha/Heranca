public class PlantaManga {

    public static void main(String[] args) {
        
        Mangueira mangueira = new Mangueira();

        mangueira.setFolhas("larga");
        mangueira.setPreco(25.325);
        mangueira.setTronco(1);
        mangueira.setRaizes("profunda");
        mangueira.setFruto("manga");

        System.out.println("folhas: "+ mangueira.getFolhas());
        System.out.println("preco: "+ mangueira.getPreco());
        System.out.println("tronco: "+ mangueira.getTronco());
        System.out.println("raizes: "+ mangueira.getRaizes());
        System.out.println("fruto: "+ mangueira.getFruto());
    }
}
