package com.lcc.tu;

import lombok.Data;

/**
 * @author: lcc
 * @Date: 2018-11-07
 **/
public class DFSyuBFS {
  public static void main(String[] args) {
    DFSyuBFS dFSyuBFS = new DFSyuBFS();
    Linjiebiao linjiebiao = dFSyuBFS.getShuJu();
    dFSyuBFS.dfs(linjiebiao, 2);
    System.out.println("--------");

    dFSyuBFS.bfs(linjiebiao, 2);

  }

  int[] visited = new int[100];

  void bfs(Linjiebiao linjiebiao, int v) {
    int changdu = linjiebiao.n;
    ArcNode p ;

    int[] queue = new int[changdu];
    int front = -1;
    int rear = 0;
    int[] visistedqueue = new int[changdu];
    visistedqueue[v] = 1;
    queue[rear] = v;
    System.out.println(v);
    while (front != rear) {
      front++;
      int w = queue[front];
      p = linjiebiao.getAdjlist()[w].fistarc;
      while (p != null) {
        if (visistedqueue[p.adjvex] == 0) {
          System.out.println(p.adjvex);
          visistedqueue[p.adjvex] = 1;
          rear++;
          queue[rear] = p.adjvex;
        }
        p = p.nextarc;
      }


    }


  }

  void dfs(Linjiebiao linjiebiao, int i) {
    ArcNode p;
    int w;
    visited[i] = 1;
    System.out.println(i);
    p = linjiebiao.adjlist[i].fistarc;
    while (p != null) {
      w = p.adjvex;
      if (visited[w] == 0) {
        dfs(linjiebiao, w);
      }
      p = p.nextarc;
    }
  }

  //临界表表示图
  Linjiebiao getShuJu() {
    Linjiebiao linjiebiao = new Linjiebiao();
    linjiebiao.e = 7;
    linjiebiao.n = 5;
    Vnode vnode = new Vnode();
    linjiebiao.adjlist[0] = vnode;
    vnode.data = "1";
    ArcNode arcNode = new ArcNode();
    ArcNode arcNode2 = new ArcNode();
    ArcNode arcNode3 = new ArcNode();
    vnode.fistarc = arcNode;
    arcNode.adjvex = 1;
    arcNode.nextarc = arcNode2;
    arcNode2.adjvex = 3;
    arcNode2.nextarc = arcNode3;
    arcNode3.adjvex = 4;
    arcNode3.nextarc = null;

    Vnode vnode11 = new Vnode();
    linjiebiao.adjlist[1] = vnode11;
    vnode11.data = "2";
    ArcNode arcNode11 = new ArcNode();
    ArcNode arcNode211 = new ArcNode();
    ArcNode arcNode311 = new ArcNode();
    vnode11.fistarc = arcNode11;
    arcNode11.adjvex = 0;
    arcNode11.nextarc = arcNode211;
    arcNode211.adjvex = 2;
    arcNode211.nextarc = arcNode311;
    arcNode311.adjvex = 3;
    arcNode311.nextarc = null;


    Vnode vnode22 = new Vnode();
    linjiebiao.adjlist[2] = vnode22;
    vnode22.data = "3";
    ArcNode arcNode22 = new ArcNode();
    ArcNode arcNode222 = new ArcNode();
    ArcNode arcNode322 = new ArcNode();
    vnode22.fistarc = arcNode22;
    arcNode22.adjvex = 1;
    arcNode22.nextarc = arcNode222;
    arcNode222.adjvex = 3;
    arcNode222.nextarc = arcNode322;
    arcNode322.adjvex = 4;
    arcNode322.nextarc = null;


    Vnode vnode33 = new Vnode();
    linjiebiao.adjlist[3] = vnode33;
    vnode22.data = "4";
    ArcNode arcNode33 = new ArcNode();
    ArcNode arcNode233 = new ArcNode();
    ArcNode arcNode333 = new ArcNode();
    ArcNode arcNode433 = new ArcNode();
    vnode33.fistarc = arcNode33;
    arcNode33.adjvex = 0;
    arcNode33.nextarc = arcNode233;
    arcNode233.adjvex = 1;
    arcNode233.nextarc = arcNode333;
    arcNode333.adjvex = 2;
    arcNode333.nextarc = arcNode433;
    arcNode433.adjvex = 4;
    arcNode433.nextarc = null;

    Vnode vnode44 = new Vnode();
    linjiebiao.adjlist[4] = vnode44;
    vnode44.data = "5";
    ArcNode arcNode44 = new ArcNode();
    ArcNode arcNode244 = new ArcNode();
    ArcNode arcNode344 = new ArcNode();
    vnode44.fistarc = arcNode44;
    arcNode44.adjvex = 0;
    arcNode44.nextarc = arcNode244;
    arcNode244.adjvex = 2;
    arcNode244.nextarc = arcNode344;
    arcNode344.adjvex = 3;
    arcNode344.nextarc = null;
    return linjiebiao;
  }






}
