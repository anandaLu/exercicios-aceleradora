package biblioteca;

import java.util.Scanner;

public class Principal {
    public static void main (String[] args){

        Livros livro1 = new Livros(0001, "Como fazer sentido e bater o martelo", "Alexandro Aolchique", 2017, "Disponível", "");
        Livros livro2 = new Livros(0002, "Código Limpo", "Tio Bob", 2001, "Disponível", "");
        Livros livro3 = new Livros(0003, "Basquete 101", "Hortência Marcari", 2010, "Disponível", "");

        Biblioteca bib = new Biblioteca();

        bib.livro.add(livro1);
        bib.livro.add(livro2);
        bib.livro.add(livro3);

        Scanner input = new Scanner(System.in);

        System.out.println("Escolha uma das opções a seguir");
        System.out.println("===================================");
        System.out.println("1 = Retirar Livros \n2 = Devolver livros \n3 = Doar livros:");

        int escolha = input.nextInt();

        if (escolha == 1){
            bib.retirarLivro();
        }
        else if (escolha == 2){
            bib.devolverLivro();
        }
        else if (escolha == 3){
            bib.doarLivro();
        }
        else{
            System.out.println("Escolha uma opção válida.");
        }
    }
}
