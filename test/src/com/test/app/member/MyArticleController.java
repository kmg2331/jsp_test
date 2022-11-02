package com.test.app.member;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.app.Execute;
import com.test.app.Result;

public class MyArticleController implements Execute{
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		
		Result result = new Result();
		
		result.setPath("/article/articleList.at");
		return result;
	}
}
