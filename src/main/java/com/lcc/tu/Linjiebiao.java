package com.lcc.tu;

import lombok.Data;

/**
 * @author: lcc
 * @Date: 2018-11-21
 **/
@Data
public class Linjiebiao {
	Vnode[] adjlist;

	public Linjiebiao() {
		adjlist = new Vnode[100];
	}

	int e;
	int n;

}