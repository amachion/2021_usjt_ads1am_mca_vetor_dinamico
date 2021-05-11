public class VetorDinamicoGenerico <Tipo> {
    
    private int quantidade;
    private int capacidade;
    private Tipo[] elementos;
    
    public VetorDinamicoGenerico() {
        this.capacidade = 4;
        this.quantidade = 0;
        this.elementos = (Tipo[]) new Object[this.capacidade];
    }
    
    public void adicionar (Tipo elemento) {
        //if (this.estaCheio()) {
            //this.redimensionar(2);
            //this.aumentarCapacidade();
            //JOptionPane.showMessageDialog(null, "dobrou, capacidade = " + this.capacidade);
        //}
        this.elementos[this.quantidade] = elemento;
        this.quantidade++;
    }
    
}