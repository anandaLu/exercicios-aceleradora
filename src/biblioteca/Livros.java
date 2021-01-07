package biblioteca;

public class Livros {

    private int numero;
    private String titulo;
    private String autor;
    private int ano;
    private String status;
    private String destinatario;

    public Livros(int numero, String titulo, String autor, int ano, String status, String destinatario){
        this.ano = ano;
        this.autor = autor;
        this.destinatario = destinatario;
        this.numero = numero;
        this.status = status;
        this.titulo = titulo;
    }

    public String getDestinatario() {

        return destinatario;
    }

    public void setDestinatario(String destinatario) {

        this.destinatario = destinatario;
    }

    public int getNumero() {

        return numero;
    }


    public String getTitulo() {

        return titulo;
    }

    public String getAutor() {

        return autor;
    }

    public int getAno() {

        return ano;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }
}
