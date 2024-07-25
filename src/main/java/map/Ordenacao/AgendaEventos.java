package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicioarEvetos(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);

    }

    public void obterProximoEvento(){
       // eventoMap.get()

        //pegando a data atual
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){//apartir do entrySet eu consigo retornar um set contendo a ligacao entre os elemntos
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próxmo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }

    }


    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

       agendaEventos.adicioarEvetos(LocalDate.of(2024, Month.APRIL, 24), "Evento-1", "Atracao-1");
       agendaEventos.adicioarEvetos(LocalDate.of(2024,  9, 7), "Evento-2", "Atracao-7");
       agendaEventos.adicioarEvetos(LocalDate.of(2024, Month.MAY, 10), "Evento-8", "Atracao-3");
       agendaEventos.adicioarEvetos(LocalDate.of(2024, 10, 11), "Evento-5", "Atracao-4");
        agendaEventos.adicioarEvetos(LocalDate.of(2024, Month.DECEMBER, 25), "Evento - Natal", "Presentes");

       agendaEventos.exibirAgenda();

       agendaEventos.obterProximoEvento();
    }
}
