import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HistoricoTransacoes {
    private ArrayList<String> historico;

    public HistoricoTransacoes() {
        historico = new ArrayList<>();
    }

    public void adicionarTransacao(String tipo, double valor) {
        Date dataAtual = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        String dataFormatada = formatter.format(dataAtual);
        historico.add(dataFormatada + " - " + tipo + ": " + (valor >= 0 ? "+" : "") + "R$" + Math.abs(valor));
    }

    public ArrayList<String> getHistorico() {
        return historico;
    }
}
