package com.robin.resultMap.custom;

import java.util.Map;

import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;

public class MyResultMapHandler<T> implements ResultHandler<T> {

	@Override
	public void handleResult(ResultContext<? extends T> ctx) {
		Map map = (Map) ctx.getResultObject();
		System.out.println(map);
	}

}
