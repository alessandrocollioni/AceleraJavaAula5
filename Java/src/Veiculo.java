public class Veiculo {
    int quantidadeDeDias;
    Double valorDiaria;

    public Double getValorTotal() {
        Double total = (this.quantidadeDeDias * valorDiaria);
        Double taxa = 0.05;

        if(this.quantidadeDeDias > 10){
            taxa = 0.20;
        } else if(this.quantidadeDeDias > 5) {
            taxa = 0.10;
        }

        return total + total * taxa;
    }
}
