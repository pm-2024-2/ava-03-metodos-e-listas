import java.util.Collections;
import java.util.List;

class Avaliacao {
    static void selecionaDuplasAleatoriamente(
                    List<String> nomes) {

        Collections.shuffle(nomes);

        System.out.println(nomes);
    }
}
