package br.com.factorymethod.botoes;

public class BotaoHtml implements Botao {

	@Override
	public void render() {
		 System.out.println("<button>Test Button</button>");
	     onClick();
	}

	@Override
	public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
	}

}
