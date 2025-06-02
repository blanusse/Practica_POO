package Practicas.Practica7.ej10;

import java.util.*;

public class HelpDesk {
    private final Map<ClientType, Queue<HelpTicket>> desk = new TreeMap<>(Comparator.reverseOrder());


    public HelpDesk openTicket(ClientType clientType, String name, String question) {
        desk.putIfAbsent(clientType, new LinkedList<>());
        desk.get(clientType).add(new HelpTicket(name, question));
        return this;
    }

    public HelpTicket getNextTicket(ClientType clientType){
        if(desk.get(clientType).isEmpty()){
            throw new IllegalArgumentException();
        }
        HelpTicket toReturn =  desk.get(clientType).peek();
        desk.get(clientType).remove();
        return toReturn;

    }

    public HelpTicket getNextTicket(){
        for(ClientType clientType : desk.keySet()){
            if(!desk.get(clientType).isEmpty()){
                return getNextTicket(clientType);
            }
        }
        return null;
    }

    public boolean hasTickets(){
        for(Queue<HelpTicket> queue : desk.values()){
            if(!queue.isEmpty()){
                return true;
            }
        }
        return false;
    }






    public static class HelpTicket{
        private final String name;
        private final String question;


        public HelpTicket(String name, String question) {
            this.name = name;
            this.question = question;
        }


        public String toString(){
            return "HelpTicket for %s asking %s".formatted(name, question);
        }

    }

}
