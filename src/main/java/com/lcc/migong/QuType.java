package com.lcc.migong;

import lombok.Data;

/**
 * @author: lcc
 * @Date: 2018-11-21
 **/
@Data
public class QuType {
	Box[] data;
	int front;
	int rear;

	public QuType() {
		data = new Box[200];
	}
}