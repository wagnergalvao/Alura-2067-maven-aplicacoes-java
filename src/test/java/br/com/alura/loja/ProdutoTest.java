package br.com.alura.loja;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class ProdutoTest {

	private Produto produto;

	@Test
	public void test() {
		produto = new Produto("teste", BigDecimal.TEN);
		assertEquals("teste", produto.getNome());
		assertEquals(BigDecimal.TEN, produto.getPreco());
	}

}
