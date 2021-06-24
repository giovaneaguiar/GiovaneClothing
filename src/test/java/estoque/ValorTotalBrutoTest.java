package estoque;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class ValorTotalBrutoTest {

    @Test
    void mostrarValorBruto() {
        CamisaRetro cRetro = new CamisaRetro();
        cRetro.setPrecoCamisaRetro(49.0f);
        cRetro.setQuantidadeCamisaRetro(12);

        CamisaFlame cFlame = new CamisaFlame();
        cFlame.setPrecoCamisaFlame(59.0f);
        cFlame.setQuantidadeCamisaFlame(5);

        CamisaBlack cBlack = new CamisaBlack();
        cBlack.setPrecoCamisaBlack(69.0f);
        cBlack.setQuantidadeCamisaBlack(10);


        List<Estoque> estoqueGiovaneClothing = new ArrayList<Estoque>();
        //preenche a lista

        estoqueGiovaneClothing.add(cRetro);
        estoqueGiovaneClothing.add(cFlame);
        estoqueGiovaneClothing.add(cBlack);

        ValorTotalBruto estoque = new ValorTotalBruto();

        assertEquals(1573, estoque.mostrarTotalBruto(estoqueGiovaneClothing));
    }

}
