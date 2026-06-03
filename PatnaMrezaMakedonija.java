import java.util.*;

class Edge {//vrska pomegu dva grada
    String target;
    int weight; // rastojanie vo km

    Edge(String t, int w) {
        target = t; //grad
        weight = w; //rastojanie[km]
    }
}

public class PatnaMrezaMakedonija {
                                    //kreiranje na graf
    public static Map<String, List<Edge>> createGraph() {
        //grafot e HashMap koi sto kluc e imeto na gradot
                   // a vrednosta e lista od Edge objekti
        Map<String, List<Edge>> graph = new HashMap<>();

        // Gradovi vo Makedonija
String[] gradovi = {
            "Skopje", "Kumanovo", "Tetovo", "Gostivar", "Veles",
            "Stip", "Bitola", "Prilep", "Ohrid", "Strumica", "Gevgelija",
            "Kavadarci", "Debar", "Kicevo", "Kocani", "Vinica", "Radovis",
            "Sveti Nikole", "Kriva Palanka", "Kratovo", "Probistip",
            "Mavrovo", "Demir Hisar", "Krusevo", "Resen", "Struga",
            "Delcevo", "Makedonska Kamenica", "Berovo", "Pehcevo",
            "Valandovo", "Demir Kapija", "Negotino", "Dojran"
        };

        for (String g : gradovi) {//za sekoj grad-prazna lista na Edge vo grafot
            graph.put(g, new ArrayList<>());
        }

        // Direktni patista
        graph.get("Skopje").add(new Edge("Kumanovo", 42));
        graph.get("Skopje").add(new Edge("Tetovo", 43));
        graph.get("Skopje").add(new Edge("Veles", 55));
        graph.get("Skopje").add(new Edge("Stip", 77));
        graph.get("Skopje").add(new Edge("Sveti Nikole", 52));

        graph.get("Kumanovo").add(new Edge("Skopje", 42));
        graph.get("Kumanovo").add(new Edge("Veles", 61));
        graph.get("Kumanovo").add(new Edge("Stip", 67));
        graph.get("Kumanovo").add(new Edge("Kriva Palanka", 61));
        graph.get("Kumanovo").add(new Edge("Kratovo", 54));
        graph.get("Kumanovo").add(new Edge("Probistip", 71));

        graph.get("Kratovo").add(new Edge("Kumanovo", 54));
        graph.get("Kratovo").add(new Edge("Probistip", 19));

        graph.get("Probistip").add(new Edge("Kratovo", 19));
        graph.get("Probistip").add(new Edge("Sveti Nikole", 34));
        graph.get("Probistip").add(new Edge("Kocani", 35));
        graph.get("Probistip").add(new Edge("Stip", 34));
        graph.get("Probistip").add(new Edge("Kriva Palanka", 61));


        graph.get("Kriva Palanka").add(new Edge("Kumanovo", 61));
        graph.get("Kriva Palanka").add(new Edge("Probistip", 61));


        graph.get("Tetovo").add(new Edge("Skopje", 43));
        graph.get("Tetovo").add(new Edge("Gostivar", 25));
   
        graph.get("Gostivar").add(new Edge("Tetovo", 25));
        graph.get("Gostivar").add(new Edge("Kicevo", 46));
        graph.get("Gostivar").add(new Edge("Mavrovo", 31));

        graph.get("Mavrovo").add(new Edge("Gostivar", 31));
        graph.get("Mavrovo").add(new Edge("Debar", 49));
        graph.get("Mavrovo").add(new Edge("Kicevo", 51));

        graph.get("Veles").add(new Edge("Skopje", 55));
        graph.get("Veles").add(new Edge("Stip", 44));
        graph.get("Veles").add(new Edge("Kumanovo", 61));
        graph.get("Veles").add(new Edge("Kavadarci", 43));
        graph.get("Veles").add(new Edge("Negotino", 44));
        graph.get("Veles").add(new Edge("Prilep", 79));
        graph.get("Veles").add(new Edge("Sveti Nikole", 26));

        graph.get("Sveti Nikole").add(new Edge("Veles", 26));
        graph.get("Sveti Nikole").add(new Edge("Skopje", 52));
        graph.get("Sveti Nikole").add(new Edge("Stip", 30));
        graph.get("Sveti Nikole").add(new Edge("Kocani", 53));
        graph.get("Sveti Nikole").add(new Edge("Probistip", 34));

        graph.get("Stip").add(new Edge("Skopje", 77));
        graph.get("Stip").add(new Edge("Veles", 44));
        graph.get("Stip").add(new Edge("Radovis", 40));
        graph.get("Stip").add(new Edge("Kocani", 40));
        graph.get("Stip").add(new Edge("Kumanovo", 67));
        graph.get("Stip").add(new Edge("Negotino", 53));
        graph.get("Stip").add(new Edge("Sveti Nikole", 30));
        graph.get("Stip").add(new Edge("Probistip", 34));

        graph.get("Bitola").add(new Edge("Demir Hisar", 28));
        graph.get("Bitola").add(new Edge("Prilep", 35));
        graph.get("Bitola").add(new Edge("Resen", 33));

        graph.get("Demir Hisar").add(new Edge("Bitola", 28));
        graph.get("Demir Hisar").add(new Edge("Krusevo", 25));
        graph.get("Demir Hisar").add(new Edge("Kicevo", 52));
        
        graph.get("Krusevo").add(new Edge("Demir Hisar", 25));
        graph.get("Krusevo").add(new Edge("Prilep", 32));

        graph.get("Prilep").add(new Edge("Bitola", 35));
        graph.get("Prilep").add(new Edge("Krusevo", 32));
        graph.get("Prilep").add(new Edge("Kavadarci", 48));
        graph.get("Prilep").add(new Edge("Veles", 79));

        graph.get("Ohrid").add(new Edge("Resen", 36));
        graph.get("Ohrid").add(new Edge("Kicevo", 63));
        graph.get("Ohrid").add(new Edge("Struga", 15));

      
        graph.get("Strumica").add(new Edge("Gevgelija", 85));
        graph.get("Strumica").add(new Edge("Valandovo", 23));
        graph.get("Strumica").add(new Edge("Radovis", 31));
        graph.get("Strumica").add(new Edge("Berovo", 55));


        graph.get("Resen").add(new Edge("Ohrid", 36));
        graph.get("Resen").add(new Edge("Bitola", 33));

        graph.get("Gevgelija").add(new Edge("Dojran", 32));
        graph.get("Gevgelija").add(new Edge("Demir Kapija", 45));
        graph.get("Gevgelija").add(new Edge("Valandovo", 26));


        graph.get("Kavadarci").add(new Edge("Veles", 43));
        //graph.get("Kavadarci").add(new Edge("Skopje", 92));
        graph.get("Kavadarci").add(new Edge("Negotino", 11));
        graph.get("Kavadarci").add(new Edge("Prilep", 48));

        graph.get("Debar").add(new Edge("Mavrovo", 49));
        graph.get("Debar").add(new Edge("Struga", 53));

        graph.get("Struga").add(new Edge("Debar", 53));
        graph.get("Struga").add(new Edge("Ohrid", 15));        
        graph.get("Struga").add(new Edge("Kicevo", 59));


        graph.get("Kicevo").add(new Edge("Struga", 59));
        graph.get("Kicevo").add(new Edge("Gostivar", 46));
        graph.get("Kicevo").add(new Edge("Ohrid", 63));
        graph.get("Kicevo").add(new Edge("Mavrovo", 51));
        graph.get("Kicevo").add(new Edge("Demir Hisar", 51));

        graph.get("Kocani").add(new Edge("Stip", 40));
        graph.get("Kocani").add(new Edge("Vinica", 12));
        graph.get("Kocani").add(new Edge("Sveti Nikole", 51));
        graph.get("Kocani").add(new Edge("Probistip", 35));
        graph.get("Kocani").add(new Edge("Makedonska Kamenica", 29));
        

        graph.get("Vinica").add(new Edge("Kocani", 12));
        graph.get("Vinica").add(new Edge("Berovo", 44));
        graph.get("Vinica").add(new Edge("Pehcevo", 45));

        graph.get("Radovis").add(new Edge("Stip", 40));
        graph.get("Radovis").add(new Edge("Strumica", 31));
        graph.get("Radovis").add(new Edge("Negotino", 49));

        graph.get("Makedonska Kamenica").add(new Edge("Delcevo", 25));
        graph.get("Makedonska Kamenica").add(new Edge("Kocani", 29));

        graph.get("Berovo").add(new Edge("Pehcevo", 10));
        graph.get("Berovo").add(new Edge("Vinica", 44));
        graph.get("Berovo").add(new Edge("Strumica", 55));


        graph.get("Pehcevo").add(new Edge("Berovo", 10));
        graph.get("Pehcevo").add(new Edge("Delcevo", 28));
        graph.get("Pehcevo").add(new Edge("Vinica", 45));


        graph.get("Delcevo").add(new Edge("Pehcevo", 28));
        graph.get("Delcevo").add(new Edge("Makedonska Kamenica", 25));

        graph.get("Negotino").add(new Edge("Stip", 53));
        graph.get("Negotino").add(new Edge("Kavadarci", 11));
        graph.get("Negotino").add(new Edge("Radovis", 49));
        graph.get("Negotino").add(new Edge("Demir Kapija", 21));

        graph.get("Demir Kapija").add(new Edge("Negotino", 21));
        graph.get("Demir Kapija").add(new Edge("Gevgelija", 45));
        graph.get("Demir Kapija").add(new Edge("Valandovo", 37));

        graph.get("Valandovo").add(new Edge("Demir Kapija", 37));
        graph.get("Valandovo").add(new Edge("Gevgelija", 26));
        graph.get("Valandovo").add(new Edge("Dojran", 24));
        graph.get("Valandovo").add(new Edge("Strumica", 23));

        graph.get("Dojran").add(new Edge("Gevgelija", 32));
        graph.get("Dojran").add(new Edge("Valandovo", 24));

        
        return graph;
    }

    public static Map<String, Integer> dijkstra(Map<String, List<Edge>> graph, String start, Map<String, String> prev) {
        Map<String, Integer> dist = new HashMap<>(); //najkratko rastojanie od pocetniot grad do sekoj dr grad
        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.comparingInt(dist::get));//za prioriteten red

        for (String city : graph.keySet()) {
            dist.put(city, Integer.MAX_VALUE);//na pocetok sekoj grad +beskonecno nastojanie
            prev.put(city, null);
        }
        dist.put(start, 0);//nocetniot grad  rastojanie=0
        pq.add(start);//pocetniot grad se dodava vo prioritetnata redica

        while (!pq.isEmpty()) {//se dodeka ima gradovi za obrabotka
            String u = pq.poll(); //najmalo tekovno rastojanie
            for (Edge e : graph.get(u)) { //za site sosedi na tekovniot jazol
                int newDist = dist.get(u) + e.weight;//momentalnoto rastojanie sobrano so ona rastojanie do sosedniot jazol
                if (newDist < dist.get(e.target)) {//ako novata distanca e pomala
                    dist.put(e.target, newDist);
                    prev.put(e.target, u);//od kade sme dojdeni
                    pq.add(e.target);//sosed se dodava vo prioritetnata lista
                }
            }
        }
        return dist;
    }


        
    public static List<String> reconstructPath(String start, String end, Map<String, String> prev) {
        List<String> path = new ArrayList<>();
        String cur = end; //se pocnuva od krajniot
        while (cur != null) {
            path.add(cur);
            cur = prev.get(cur);
        }
        Collections.reverse(path);//pravime obratna lista
        if (!path.get(0).equals(start)) {//ako go nema pocetniot jazol =>ne postoi pat od krajniot do pocetniot
            return new ArrayList<>();
        }
        return path;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//za citanje gradovi
        Map<String, List<Edge>> graph = createGraph();//kreiranje graf
        Map<String, String> prev = new HashMap<>();//prethodnik

        System.out.println("Vnesi poceten grad:");
        String start = sc.nextLine();
        System.out.println("Vnesi kraen grad:");
        String end = sc.nextLine();

        if (!graph.containsKey(start) || !graph.containsKey(end)) {
            System.out.println("Gradovite ne se vo mreza.");
            return;
        }

        Map<String, Integer> dist = dijkstra(graph, start, prev);//za najkratko rastojanie
        List<String> path = reconstructPath(start, end, prev);//pat od pocetok do kraj

        if (path.isEmpty()) {
            System.out.println("Ne postoi dostapen pat od " + start + " do " + end);
        } else {
            System.out.println("Najkratka ruta: " + String.join(" -> ", path));//ja spojuva nizata i ja pretvara vo string so -> megu elementite
            System.out.println("Vkupno rastojanie: " + dist.get(end) + " km");
        }
    }
}
