
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class ListaDeMusicas {
    public static void main(String[] args) {
        List<Musica> musicas = new ArrayList<>();
        int opcao;
        do {
           opcao = Integer.parseInt(JOptionPane.showInputDialog(
                   "0 - sair\n1 - Inserir música nova\n2 - Avaliar música\n3 - Ver a lista ordenada")); 
           switch (opcao) {
               case 1:
                   String musicaNova = JOptionPane.showInputDialog("Qual é a música?");
                   musicas.add(new Musica(musicaNova));
                   JOptionPane.showMessageDialog(null, "nova música inserida com sucesso");
                   break;
               case 2:
                   String musicaAvaliar = JOptionPane.showInputDialog("Qual música deseja avaliar?");
                   int nota;
                   do{
                       nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota (0 a 5)"));
                   } while (nota < 0 || nota > 5);
                   int i;
                   for (i=0; i<musicas.size(); i++) {
                       if (musicas.get(i).getTitulo().equals(musicaAvaliar)) {
                           musicas.get(i).setAvaliacao(nota);
                           JOptionPane.showMessageDialog(null, "avaliação realizada");
                           break;
                       }
                   }
                   if (i==musicas.size()) {
                       JOptionPane.showMessageDialog(null, "música não encontrada");
                   }
                   break;
               case 3:
                   Collections.sort(musicas, Collections.reverseOrder());
                   JOptionPane.showMessageDialog(null, musicas);
                   break;
               case 0:
                   JOptionPane.showMessageDialog(null, ":( volte logo");
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Opção Inválida");
           }
        } while (opcao != 0);
    }
}
