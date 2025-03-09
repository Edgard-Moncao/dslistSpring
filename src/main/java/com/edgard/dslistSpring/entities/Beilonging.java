package com.edgard.dslistSpring.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_beilonging")
public class Beilonging {
	
	@EmbeddedId
	private BeilongingPK id = new BeilongingPK();
	private Integer position;
	
	public Beilonging() {		
	}

	public Beilonging(Game game, GameList list, Integer position) {		
		id.setGame(game);
		id.setList(list);
		this.position = position;
	}

	public BeilongingPK getId() {
		return id;
	}

	public void setId(BeilongingPK id) {
		this.id = id;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Beilonging other = (Beilonging) obj;
		return Objects.equals(id, other.id);
	}
}
