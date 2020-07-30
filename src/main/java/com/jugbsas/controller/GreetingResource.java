package com.jugbsas.controller;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.logging.Logger;

import com.jugbsas.entity.Meetup;
import com.jugbsas.manager.MeetupDAO;

@Path("/")
public class GreetingResource {

	private Logger logger = Logger.getLogger(GreetingResource.class);
	
	@Inject
	private GreetingService greetingService;
	
	@Inject
	private MeetupDAO meetupDAO;
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/hello")
    public String hello() {
        return greetingService.getMessage();
    }
    
    @POST
    @Path("/meetup")
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response meetup(@Valid Meetup meetup) {
    	logger.info(meetup);
    	//meetupDAO.create(meetup);
    	meetup.persist();
        return Response.ok().build();
    }
    
    @GET
    @Path("/meetup")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Meetup> meetup() {
    	return Meetup.findAll().list();
        //return meetupDAO.find();
    }
}