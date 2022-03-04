package br.com.factorymethod.factory;

import br.com.factorymethod.botoes.Botao;
import br.com.factorymethod.botoes.BotaoHtml;

public class DialogoHtml extends Dialogo {

	@Override
    public Botao createButton() {
        return new BotaoHtml();
    }
	
}
