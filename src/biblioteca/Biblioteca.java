package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    List <Livros> livro = new ArrayList <Livros>();

    String nomeLivro;
    String emprestimo;
    Scanner input = new Scanner(System.in);

    public void retirarLivro(){
        System.out.println("Funcionalidade - Retirar um livro ======================");
        System.out.println("Livro selecionado: ");
        nomeLivro = input.nextLine();

        for(int i = 0; i < livro.size(); i++) {

            if (livro.get(i).getTitulo().equals(nomeLivro) && livro.get(i).getStatus() == "Disponível") {
                System.out.println("- Número: " + livro.get(i).getNumero());
                System.out.println("- Título: " + livro.get(i).getTitulo());
                System.out.println("- Autor: " + livro.get(i).getAutor());
                System.out.println("- Ano: " + livro.get(i).getAno());
                System.out.println("- Status: " + livro.get(i).getStatus());
                System.out.println("- Emprestado para: " + livro.get(i).getDestinatario());

                System.out.print("Empréstimo concedido para: ");
                emprestimo = input.next();

                livro.get(i).setDestinatario(emprestimo);
                livro.get(i).setStatus("Indisponível");

                System.out.println(" - Após a retirada: ");

                System.out.println("- Número: " + livro.get(i).getNumero());
                System.out.println("- Título: " + livro.get(i).getTitulo());
                System.out.println("- Autor: " + livro.get(i).getAutor());
                System.out.println("- Ano: " + livro.get(i).getAno());
                System.out.println("- Status: " + livro.get(i).getStatus());
                System.out.println("- Emprestado para: " + livro.get(i).getDestinatario());
            }
        }
    }
    public void devolverLivro(){

        System.out.println("- Funcionalidade - Devolver um livro ======================");

        System.out.println("Selecionar livro emprestado: ");
        nomeLivro = input.nextLine();

        for(int i = 0; i < livro.size(); i++){

            System.out.println("- Número: " + livro.get(i).getNumero());
            System.out.println("- Título: " + livro.get(i).getTitulo());
            System.out.println("- Autor: " + livro.get(i).getAutor());
            System.out.println("- Ano: " + livro.get(i).getAno());
            System.out.println("- Status: " + livro.get(i).getStatus());
            System.out.println("- Emprestado para: " + livro.get(i).getDestinatario());

            if(livro.get(i).getTitulo().equals(nomeLivro) && livro.get(i).getDestinatario() != ""){
                livro.get(i).setStatus("Disponível");
                livro.get(i).setDestinatario("");

                System.out.println(" \n - Após a devolução: ");

                System.out.println("- Número: " + livro.get(i).getNumero());
                System.out.println("- Título: " + livro.get(i).getTitulo());
                System.out.println("- Autor: " + livro.get(i).getAutor());
                System.out.println("- Ano: " + livro.get(i).getAno());
                System.out.println("- Status: " + livro.get(i).getStatus());
                System.out.println("- Emprestado para: " + livro.get(i).getDestinatario());
            }
        }
    }
    public void doarLivro(){
        System.out.println("Campos para preenchimento de um novo livro: ======================");

        System.out.print("- Número: ");
        int numLivro = input.nextInt();

        System.out.print("- Título: ");
        nomeLivro = input.next();

        System.out.print("- Autor: ");
        String autorLivro = input.next();

        System.out.print("- Ano: ");
        int anoLivro = input.nextInt();

        System.out.print("- Status: ");
        String statusLivro = "Disponível";

        System.out.println("- Emprestado para: ");
        emprestimo = "";

        Livros novoLivro = new Livros(numLivro, nomeLivro, autorLivro, anoLivro, statusLivro, emprestimo);
        livro.add(novoLivro);

        for(int i = 0; i < livro.size(); i++) {
            System.out.println("\n Após o cadastro:");

            System.out.println("- Número: " + livro.get(i).getNumero());
            System.out.println("- Título: " + livro.get(i).getTitulo());
            System.out.println("- Autor: " + livro.get(i).getAutor());
            System.out.println("- Ano: " + livro.get(i).getAno());
            System.out.println("- Status: " + livro.get(i).getStatus());
            System.out.println("- Emprestado para: " + livro.get(i).getDestinatario());
        }
    }
}
