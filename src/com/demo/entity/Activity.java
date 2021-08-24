package com.demo.entity;

public class Activity {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((activityName == null) ? 0 : activityName.hashCode());
		result = prime * result + activityid;
		result = prime * result + ((actor == null) ? 0 : actor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Activity other = (Activity) obj;
		if (activityName == null) {
			if (other.activityName != null)
				return false;
		} else if (!activityName.equals(other.activityName))
			return false;
		if (activityid != other.activityid)
			return false;
		if (actor == null) {
			if (other.actor != null)
				return false;
		} else if (!actor.equals(other.actor))
			return false;
		return true;
	}

	public int getActivityid() {
		return activityid;
	}

	public void setActivityid(int activityid) {
		this.activityid = activityid;
	}

	public String getActivityName() {
		return activityName;
	}

	@Override
	public String toString() {
		return "Activity [activityid=" + activityid + ", activityName="
				+ activityName + ", actor=" + actor + "]";
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public Activity(int activityid, String activityName, String actor) {
		super();
		this.activityid = activityid;
		this.activityName = activityName;
		this.actor = actor;
	}

	private int activityid;
	
	private String activityName;
	
	private String actor;

}
