package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {

    public static void main(String[] args) {
        BreadthFirstSearch breadthFirst = new BreadthFirstSearch(); 
        List<List<Integer>> adjList = breadthFirst.adjacencyList();
        List<Integer> visitedListForBFS = breadthFirst.bfsAlgo(adjList);
        for (Integer visitedListElement : visitedListForBFS) {
            System.out.print(visitedListElement + " : ");
        }
    }

    private List<Integer> bfsAlgo(List<List<Integer>> graph) {
        List<Integer> visitedList = new ArrayList<Integer>();
        Queue<Integer> tempQueue = new ArrayDeque<Integer>();
        tempQueue.add(1);
        visitedList.add(1);
        Integer poll = null;
        while (!tempQueue.isEmpty()) {
            poll = tempQueue.poll();
            List<Integer> adjListForPoll = graph.get(poll - 1);
			
            for (Integer vertex : adjListForPoll) {
                if (!visitedList.contains(vertex)) {
                    visitedList.add(vertex);
                    tempQueue.offer(vertex);
                }
            }
        }

        return visitedList;
	}

    private List<List<Integer>> adjacencyList() {
    List<List<Integer>> graphAdjList = new ArrayList<List<Integer>>();

    List<Integer> adj1 = new ArrayList<Integer>(2);
    adj1.add(1);
    adj1.add(3);
    adj1.add(2);
    
    List<Integer> adj2 = new ArrayList<Integer>(3);
    adj2.add(2);
    adj2.add(5);
    adj2.add(6);

    List<Integer> adj3 = new ArrayList<Integer>(2);
    adj3.add(3);
    adj3.add(4);

    List<Integer> adj4 = new ArrayList<Integer>(3);
    adj4.add(4);
    adj4.add(5);
    adj4.add(7);

    List<Integer> adj5 = new ArrayList<Integer>(3);
    adj5.add(2);
    adj5.add(5);
    adj5.add(6);

    List<Integer> adj6 = new ArrayList<Integer>(3);
    adj6.add(6);
    adj6.add(7);
    adj6.add(8);

    List<Integer> adj7 = new ArrayList<Integer>(4);
    adj7.add(4);
    adj7.add(5);
    adj7.add(7);
    adj7.add(9);

    List<Integer> adj8 = new ArrayList<Integer>(2);
    adj8.add(6);
    adj8.add(8);
    adj8.add(9);

    graphAdjList.add(adj1);
    graphAdjList.add(adj2);
    graphAdjList.add(adj3);
    graphAdjList.add(adj4);
    graphAdjList.add(adj5);
    graphAdjList.add(adj6);
    graphAdjList.add(adj7);
    graphAdjList.add(adj8);

    return graphAdjList;
}
}