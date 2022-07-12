package com.dvs.fluxtest;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFilter2 implements Filter {
  private EventNotify eventNotify;

  public MyFilter2(EventNotify eventNotify) {
    this.eventNotify = eventNotify;
  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    eventNotify.add("새로운 데이터");
  }
}
