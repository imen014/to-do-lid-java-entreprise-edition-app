package com.task.first;



public class Task {

	private String description_tache;
	private String etat;
	
	
	public String getDescription_tache() {
		return description_tache;
	}


	public void setDescription_tache(String description_tache) {
		this.description_tache = description_tache;
	}


	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}


	public Task(String description_tache, String etat) {
	
		this.description_tache = description_tache;
		this.etat = etat;
	}
	
	
	

}
