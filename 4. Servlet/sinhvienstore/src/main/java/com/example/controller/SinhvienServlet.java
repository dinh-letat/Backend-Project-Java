package com.example.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.example.entities.SinhVien;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addsv")
public class SinhvienServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("sinhvien.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArrayList<String> names = new ArrayList<>();
		
		String ten = req.getParameter("name");
		String tuoi = req.getParameter("age");
		names.add(ten);
		names.add(tuoi);
		
		
		req.setAttribute("username", names);
		
		req.getRequestDispatcher("list.jsp").forward(req, resp);
	}
}
