package br.edu.fatecpg.polimorfismo.view;
import br.edu.fatecpg.polimorfismo.model.PagamentoBoleto;
import br.edu.fatecpg.polimorfismo.model.PagamentoCartao;
import br.edu.fatecpg.polimorfismo.model.Pagamentos;

public class MainPagamentos {
   public void processarPagamento() {
	// TODO Auto-generated method stub
	   Pagamentos pagamentoGenerico = new Pagamentos();
       Pagamentos pagamentoCartao = new Pagamentos();
       Pagamentos pagamentoBoleto = new Pagamentos();
       pagamentoGenerico.processarPagamento();
       pagamentoCartao.processarPagamento();
       pagamentoBoleto.processarPagamento();
   }
}

