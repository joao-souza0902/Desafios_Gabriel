/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentimentosjava;
import java.util.Scanner;
/**
 *
 * @author jonyg
 */
public class Principal {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome = s.nextLine();

		Ola ola = new Ola();
		String saudacao = ola.saudacao(nome);
		System.out.println(saudacao);
	}
}
