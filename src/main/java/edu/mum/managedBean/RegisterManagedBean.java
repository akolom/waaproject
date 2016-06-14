/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.managedBean;

import edu.mum.bean.RegisterBean;
import edu.mum.domain.Event;
import edu.mum.service.EventService;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author mewael
 */
@Named(value = "registerManagedBean")
@Dependent
public class RegisterManagedBean {

    /**
     * Creates a new instance of RegisterManagedBean
     */
    @Inject
    private RegisterBean registerBean;

    @Inject
    private LoginManagedBean loginManagedBean;
    
    @Autowired
    private EventService eventService;
    public RegisterBean getRegisterBean() {
        return registerBean;
    }

    public void setRegisterBean(RegisterBean registerBean) {
        this.registerBean = registerBean;
    }
    
    
    public RegisterManagedBean() {
    }
    public List<Event> regisgerEvent(){
        
       
       return eventService.findEventsByUserId(loginManagedBean.getUserLogin().getId());
       // return "registerEvent.jsf";
    }
    
}
