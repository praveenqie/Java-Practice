package com.epam;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LeaderBoard {

    private Map<Integer,Integer> playerScores;

    public LeaderBoard(){
        playerScores = new HashMap<>();
    }

    public void addScore(int playerId,int score){
        playerScores.put(playerId,playerScores.getOrDefault(playerId,0)+score);
        System.out.print("null ");
    }
    public void top(int k){

        PriorityQueue<Integer> topScore = new PriorityQueue<>();

        for (int score:playerScores.values()){
            topScore.offer(score);
            if(topScore.size()>k){
                topScore.poll();
            }
        }
        int sum =0;
        while (!topScore.isEmpty()){
            sum = sum +topScore.poll();
        }
        System.out.print(sum+" ");
    }
    public void reset(int playerId){
        playerScores.put(playerId,0);
        System.out.print("null ");
    }
}
