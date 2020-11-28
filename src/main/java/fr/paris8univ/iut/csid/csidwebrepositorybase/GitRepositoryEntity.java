package fr.paris8univ.iut.csid.csidwebrepositorybase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "repository")
public class GitRepositoryEntity {
	@Id
	@Column(name = "name", unique = true)
	private String name;
	
	@Column(name = "owner")
	private String owner;
	
	@Column(name = "issues")
	private int issues;
	
	@Column(name = "fork")
	private int fork;
	
	@Column(name= "lastupdate")
	private long lastUpdate;
	
	public GitRepositoryEntity() {}
	
	public GitRepositoryEntity(String name,String owner, int issues,int fork,long lastUpdate) {
		this.name=name;
		this.owner=owner;
		this.issues=issues;
		this.fork=fork;
		this.lastUpdate=lastUpdate;
	}
	
	public int getIssues() {
		return issues;
	}

	public void setIssues(int issues) {
		this.issues = issues;
	}

	public int getFork() {
		return fork;
	}

	public void setFork(int fork) {
		this.fork = fork;
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public void setOwner(String owner) {
		this.owner=owner;
	}
	
	public long getlastUpdate() {
		return this.lastUpdate;
	}
	
	public void setlastUpdate(long lastUpdate) {
		this.lastUpdate=lastUpdate;
	}
}
