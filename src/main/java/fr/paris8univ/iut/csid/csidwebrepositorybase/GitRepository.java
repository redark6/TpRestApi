package fr.paris8univ.iut.csid.csidwebrepositorybase;

public class GitRepository {
	private String name;
	private String owner;
	private int issues;
	private int fork;
	private long lastUpdate;
	
	public GitRepository() {}
	
	public GitRepository(String name,String owner, int issues,int fork,long lastUpdate) {
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
	
	public long getLastUpdate() {
		return this.lastUpdate;
	}
	
	public void setLastUpdate(long lastUpdate) {
		this.lastUpdate=lastUpdate;
	}
}
