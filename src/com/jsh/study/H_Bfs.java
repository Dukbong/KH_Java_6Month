package com.jsh.study;

import java.util.LinkedList;
import java.util.Queue;

public class H_Bfs {
    public int solution(int[][] maps) {
        int answer = -1;
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        
        boolean[][] vistied = new boolean[maps.length][maps[0].length];
        int[][] check = new int[maps.length][maps[0].length];
        for(int i = 0; i < check.length; i++){
            System.arraycopy(maps[i],0,check[i],0,check[0].length);
        }
        Queue<int[]> q = new LinkedList<>();
        
        q.offer(new int[]{0,0});
        vistied[0][0] = true;
        
        while(!q.isEmpty()){
            int[] now = q.poll();
            
            for(int i = 0; i < 4; i++){
                int nextX = now[0] + dx[i];
                int nextY = now[1] + dy[i];
                if(nextX < 0 || nextY < 0 || nextX >= maps.length || nextY >= maps[0].length){
                    continue;
                }
                if(vistied[nextX][nextY] || maps[nextX][nextY] == 0){
                    continue;
                }
                
                q.offer(new int[]{nextX, nextY});
                vistied[nextX][nextY] = true;
                check[nextX][nextY] = check[now[0]][now[1]] + 1;
            }
        }
        if(check[maps.length - 1][maps[0].length -1] == 1){
            return answer;
        }else{
            answer = check[maps.length -1][maps[0].length -1];
            return answer;
        }
    }
}
