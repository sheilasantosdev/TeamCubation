import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Checklist {
    private LinkedList<Tarefa> listaDeTarefa = new LinkedList<>();

    public void addTarefa(Tarefa novaTarefa) {
        listaDeTarefa.add(novaTarefa);
    }

    public LinkedList<Tarefa> getTodasAsTarefas() {
        return listaDeTarefa;
    }

    public LinkedList<Tarefa> getTodasAsTarefasConcluidas() {
        LinkedList<Tarefa> listaDeTarefaConcluidas = new LinkedList<>();
        for (Tarefa t : listaDeTarefa) {
            if (t.isConcluida()) {
                listaDeTarefaConcluidas.add(t);
            }
        }
        return listaDeTarefaConcluidas;
    }

    public LinkedList<Tarefa> getTodasAsTarefasPendentes() {
        LinkedList<Tarefa> listaDeTarefasPendentes = new LinkedList<>();
        for (Tarefa t : listaDeTarefa) {
            if (!t.isConcluida()) {
                listaDeTarefasPendentes.add(t);
            }
        }
        return listaDeTarefasPendentes;
    }

    public void alterarStatusTarefa(int id, boolean status) {
        for (Tarefa t : listaDeTarefa) {
            if (t.getId() == id) {
                t.setConcluida(status);
                break;
            }
        }
    }

    public LinkedList<String> getTodasAsDescricoes() {
        LinkedList<String> listaDetodasDescricoes = new LinkedList<>();
        for (Tarefa t : listaDeTarefa) {
            listaDetodasDescricoes.add(t.getDescricao());
        }
        return listaDetodasDescricoes;

    }

}