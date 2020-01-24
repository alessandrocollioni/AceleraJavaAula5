import org.junit.Assert;
import org.junit.Test;

public class testVeiculoCarroComum {

    @Test
    public void testarSeValorTotalPara3DiasEstaCorreto(){
        //ENTRADA
        int dias = 3;
        Double valorTotal = 126.0;

        CarroComum carro = new CarroComum(dias);
        Double retorno = carro.getValorTotal();

        Assert.assertEquals(valorTotal, retorno);
    }

    @Test
    public void testarSeValorTotalPara6DiasEstaCorreto(){
        //ENTRADA
        int dias = 6;
        Double valorTotal = 264.0;

        CarroComum carro = new CarroComum(dias);
        Double retorno = carro.getValorTotal();

        Assert.assertEquals(valorTotal, retorno);
    }

    @Test
    public void testarSeValorTotalPara11DiasEstaCorreto(){
        //ENTRADA
        int dias = 11;
        Double valorTotal = 528.0;

        CarroComum carro = new CarroComum(dias);
        Double retorno = carro.getValorTotal();

        Assert.assertEquals(valorTotal, retorno);
    }
}
