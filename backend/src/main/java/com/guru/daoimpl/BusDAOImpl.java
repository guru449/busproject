package com.guru.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.guru.dao.BusDAO;
import com.guru.dto.Bus;
@Repository("busDAO")
public class BusDAOImpl implements BusDAO {
	 private static List<Bus>listt=new ArrayList<>();
	 static {
		 Bus bus=new Bus();
		 bus.setBusid(0);
		 bus.setBusNo("401K");
		 bus.setCname("ramehs");
		 bus.setDname("suresh");
		 bus.setRating(0.0);
		 bus.setRoute("yesht-kengeri");
		 listt.add(bus);
	 }

	@Override
	public List<Bus> list() {
		// TODO Auto-generated method stub
		return listt;
	}

}
