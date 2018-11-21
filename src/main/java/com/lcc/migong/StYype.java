package com.lcc.migong;

import lombok.Data;

/**
 * @author: lcc
 * @Date: 2018-11-21
 **/
@Data
public class StYype {

	Box[] data;
	int top;

	public StYype() {
		data = new Box[100];
	}
}