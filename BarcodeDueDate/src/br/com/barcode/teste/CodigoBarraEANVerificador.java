package br.com.barcode.teste;

import java.util.Scanner;

import br.com.barcode.ean13.CodigoBarraEAN;

public class CodigoBarraEANVerificador {
	public static void main(String[] args){
        System.out.println("Informa o código de barra: ");
        @SuppressWarnings("resource")
		String codigo = new Scanner(System.in).nextLine();

        CodigoBarraEAN codigoBarra = new CodigoBarraEAN(codigo);
        System.out.println("Codigo de barra: " + codigoBarra.validar(codigoBarra));
        System.out.println("Numero do codigo de barras: " + codigoBarra.getCodigoBarra());
    }
}
