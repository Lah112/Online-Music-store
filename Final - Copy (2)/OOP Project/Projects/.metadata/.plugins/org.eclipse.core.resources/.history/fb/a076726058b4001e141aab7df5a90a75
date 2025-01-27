package com.servlet.manager;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.manager.TrainSchedule;
import com.service.manager.ManagerDBUtil;


@WebServlet("/")
public class TrainScheduleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private ManagerDBUtil mdb;
   
    public TrainScheduleServlet() {
        super();
        
    }

	
	public void init() throws ServletException {
		mdb=new ManagerDBUtil();
	}
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertSchedule(request, response);
				break;
			case "/delete":
				deleteschedule(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateschedule(request, response);
				break;
			default:
				listts(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}
//default
	private void listts(HttpServletRequest request, HttpServletResponse response)throws SQLException, IOException, ServletException {
		try{List<TrainSchedule> listts = mdb.selectAllSchedule ();
		request.setAttribute("listts", listts);
		RequestDispatcher dispatcher = request.getRequestDispatcher("trainSchedList.jsp");
		dispatcher.forward(request, response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
//new
	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("managerAddTrainSchedule.jsp");
		dispatcher.forward(request, response);
	}
	
//edit
	private void showEditForm(HttpServletRequest request, HttpServletResponse response)throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		try {
		TrainSchedule existingUser = mdb.selectschedule(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("managerAddTrainSchedule.jsp");
		request.setAttribute("listts", existingUser);
		dispatcher.forward(request, response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	//insert schedule
	private void insertSchedule(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String station1 = request.getParameter("station1");
		String station2 = request.getParameter("station2");
		int km = Integer.parseInt(request.getParameter("km"));
		TrainSchedule ts = new TrainSchedule(station1,station2,km);
		mdb.insertSchedule(ts);
		response.sendRedirect("list");
	}

	//update schedule
	private void updateschedule(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String station1 = request.getParameter("station1");
		String station2 = request.getParameter("station2");
		int km= Integer.parseInt(request.getParameter("km"));;

		TrainSchedule ts = new TrainSchedule(id,station1,station2,km);
		mdb.updateschedule(ts);
		response.sendRedirect("list");
	}

	//delete schedule
	private void deleteschedule(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		try{
			mdb.deleteschedule(id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		response.sendRedirect("list");
	}
	
	

}
