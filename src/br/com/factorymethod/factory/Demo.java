package br.com.factorymethod.factory;

import br.com.factorymethod.factory.Dialogo;
import br.com.factorymethod.factory.DialogoHtml;
import br.com.factorymethod.factory.DialogoJanela;

public class Demo {

	    private static Dialogo dialog;

	    public static void main(String[] args) {
	        configure();
	        runBusinessLogic();
	    }

	    static void configure() {
	        if (System.getProperty("os.name").equals("Windows 10")) {
	            dialog = new DialogoJanela();
	        } else {
	            dialog = new DialogoHtml();
	        }
	    }


	    static void runBusinessLogic() {
	        dialog.renderWindow();
	    }
}
