public class Musica implements Comparable <Musica>{
    private String titulo;
    private int avaliacao;
    public Musica(String titulo) {
        this.titulo = titulo;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    @Override
    public int compareTo(Musica m) {
        if (this.avaliacao < m.getAvaliacao()) return -1;
        if (this.avaliacao > m.getAvaliacao()) return 1;
        return 0;
    }
    @Override
    public String toString() {
        return String.format("\nTítulo: %s, Nota: %d", this.titulo, this.avaliacao);
    }
}
