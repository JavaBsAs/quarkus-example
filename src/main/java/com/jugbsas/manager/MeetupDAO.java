package com.jugbsas.manager;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import com.jugbsas.entity.Meetup;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class MeetupDAO implements PanacheRepository<Meetup> {

    @Transactional
	public void create(Meetup meetup) {
		persist(meetup);
	}
	
    @Transactional
	public List<Meetup> find() {
		return findAll().list();
	}
	
}
