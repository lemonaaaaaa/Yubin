package com.edu.api;

import java.util.Objects;

public class Member {

	public String id;
	private String name;

	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

//	@Override
//	public int hashCode() {
//		return 1111;
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}


	}

	
	
	
}
