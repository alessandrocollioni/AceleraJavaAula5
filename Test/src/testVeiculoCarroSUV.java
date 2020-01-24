import org.junit.Assert;
import org.junit.Test;

public class testVeiculoCarroSUV {

    @Test
    public void testarSeValorTotalPara3DiasEstaCorreto(){
        //ENTRADA
        int dias = 3;
        Double valorTotal = 315.0;

        CarroSUV carro = new CarroSUV(dias);
        Double retorno = carro.getValorTotal();

        Assert.assertEquals(valorTotal, retorno);
    }

    @Test
    public void testarSeValorTotalPara6DiasEstaCorreto(){
        //ENTRADA
        int dias = 6;
        Double valorTotal = 660.0;

        CarroSUV carro = new CarroSUV(dias);
        Double retorno = carro.getValorTotal();

        Assert.assertEquals(valorTotal, retorno);
    }

    @Test
    public void testarSeValorTotalPara11DiasEstaCorreto(){
        //ENTRADA
        int dias = 11;
        Double valorTotal = 1320.0;

        CarroSUV carro = new CarroSUV(dias);
        Double retorno = carro.getValorTotal();

        Assert.assertEquals(valorTotal, retorno);
    }
}
