package com.devsuperior.dslist.dto;

import java.util.Objects;

public class ReplacementDTO {
	
	private Integer sourceIndex;
	private Integer destinationIndex;
	
	public ReplacementDTO() {
		
	}

	public ReplacementDTO(Integer sourceIndex, Integer destinationIndex) {
		super();
		this.sourceIndex = sourceIndex;
		this.destinationIndex = destinationIndex;
	}

	public Integer getSourceIndex() {
		return sourceIndex;
	}

	public void setSourceIndex(Integer sourceIndex) {
		this.sourceIndex = sourceIndex;
	}

	public Integer getDestinationIndex() {
		return destinationIndex;
	}

	public void setDestinationIndex(Integer destinationIndex) {
		this.destinationIndex = destinationIndex;
	}

	@Override
	public int hashCode() {
		return Objects.hash(destinationIndex, sourceIndex);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReplacementDTO other = (ReplacementDTO) obj;
		return Objects.equals(destinationIndex, other.destinationIndex)
				&& Objects.equals(sourceIndex, other.sourceIndex);
	}
	
	
}
