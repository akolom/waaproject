///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package edu.mum.service.impl;
//
//import edu.mum.domain.Events;
//import edu.mum.domain.User;
//import edu.mum.repository.EventRepository;
//import edu.mum.service.EventService;
//import java.util.ArrayList;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
///**
// *
// * @author akolom
// */
//
//@Service
//@Transactional
//public class EventServiceImpl implements EventService {
//    
//    @Autowired
//    private EventRepository eventRepository;
//
//    @Override
//    public List<Events> findByDescription(String description) {
//return eventRepository.findByDescription(description);  
//    
//    }
//
//    @Override
//    public List<Events> findAll(Integer userId) {
//        
//        return null;
//    }
//
//    @Override
//    public void saveEvent(Events event) {
//eventRepository.save(event);
//
//    }
//
////    @Override
////    public List<Events> findAllByUser(User user) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////    }
////
////    @Override
////    public Events findById(Integer id) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////    }
//
//    @Override
//    public List<Events> findAllAppliedEvents(Integer userId) {
//List<Integer> eventId = eventRepository.findAllEventIdByUserId(userId);
//		List<Events> events = new ArrayList<>();
//		if(eventId==null || eventId.isEmpty() ){
//
//			return events;
//		}
//		
//		for (Integer eId : eventId) {
//			
//			events.add(eventRepository.findById(eId));
//			
//		}
//		return events;    }
//    
//   
//
//	
//
//	
//
//    @Override
//    public List<Events> findAllNotAppliedEvents(String key, Integer userId) {
//
//		List<Integer> ids = eventRepository.findAllNotAppliedEvents(userId);
//		List<Events> events = new ArrayList<>();
//		if(ids==null || ids.isEmpty() ){
//			System.out.println("null return --> findall");
//			return events;
//		}
//		return eventRepository.findByDescriptionByNotApplied(ids, key);    }
//
////    @Override
////    public Events getEventsById(Integer eventId) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////    }
//
//    @Override
//    public void updateEvent(Events event) {
//eventRepository.save(event);    }
//    
//}